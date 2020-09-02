package org.beebiome.dataportal.pipeline;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.beebiome.dataportal.api.repository.dt.BiosamplePackageTO;
import org.beebiome.dataportal.api.repository.dt.ExperimentTO;
import org.beebiome.dataportal.api.repository.dt.GeoLocationTO;
import org.beebiome.dataportal.api.repository.dt.ProjectTO;
import org.beebiome.dataportal.api.repository.dt.ProjectToPublicationTO;
import org.beebiome.dataportal.api.repository.dt.ProjectToSampleTO;
import org.beebiome.dataportal.api.repository.dt.PublicationTO;
import org.beebiome.dataportal.api.repository.dt.SampleTO;
import org.beebiome.dataportal.api.repository.dt.SampleToExperimentTO;
import org.beebiome.dataportal.api.repository.dt.SampleToNucleotideTO;
import org.beebiome.dataportal.api.repository.dt.SpeciesTO;
import org.beebiome.dataportal.api.repository.dt.SpeciesToNameTO;
import org.beebiome.dataportal.api.repository.dt.TaxonTO;
import org.beebiome.dataportal.pipeline.ncbi.bioproject.DocumentSummary;
import org.beebiome.dataportal.pipeline.ncbi.bioproject.Project;
import org.beebiome.dataportal.pipeline.ncbi.bioproject.RecordSet;
import org.beebiome.dataportal.pipeline.ncbi.bioproject.TypePublication;
import org.beebiome.dataportal.pipeline.ncbi.bioproject.TypeSubmission;
import org.beebiome.dataportal.pipeline.ncbi.biosample.AttributeType;
import org.beebiome.dataportal.pipeline.ncbi.biosample.BioSampleSetType;
import org.beebiome.dataportal.pipeline.ncbi.biosample.BioSampleType;
import org.beebiome.dataportal.pipeline.ncbi.sra.ExperimentPackageSet;
import org.beebiome.dataportal.pipeline.ncbi.sra.ExperimentPackageType;
import org.beebiome.dataportal.pipeline.ncbi.sra.LibraryDescriptorType;
import org.beebiome.dataportal.pipeline.ncbi.sra.PlatformType;
import org.beebiome.dataportal.pipeline.ncbi.taxonomy.TaxaSetType;
import org.beebiome.dataportal.pipeline.ncbi.taxonomy.TaxonType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NCBIImporter {

    private final static Logger log = LogManager.getLogger(NCBIImporter.class.getName());

    public static void main(String[] args) throws JAXBException {
        log.entry((Object[]) args);

        int expectedArgLength = 1;
        if (args.length != expectedArgLength) {
            throw log.throwing(new IllegalArgumentException(
                    "Incorrect number of arguments provided, expected " + expectedArgLength + " arguments, "
                    + args.length + " provided. Arguments must be:" +
                            "- path to the input directory containing all XML files"));
        }

        Set<String> bioprojectFiles = new HashSet<>();
        Set<String> biosampleFiles = new HashSet<>();
        Set<String> sraFiles = new HashSet<>();
        Set<String> taxonomyFiles = new HashSet<>();

        final File folder = new File(args[0]);
        for (final File f : folder.listFiles()) {
            if (f.getName().matches(".*_bioproject\\.*[0-9]*\\.xml")) {
                bioprojectFiles.add(f.getAbsolutePath());
            } else if (f.getName().matches(".*_biosample\\.*[0-9]*\\.xml")) {
                biosampleFiles.add(f.getAbsolutePath());
            } else if (f.getName().matches(".*_sra\\.*[0-9]*\\.xml")) {
                sraFiles.add(f.getAbsolutePath());
            } else if (f.getName().matches(".*_taxonomy\\.*[0-9]*\\.xml")) {
                taxonomyFiles.add(f.getAbsolutePath());
            }
        }

        NCBIImporter importer = new NCBIImporter();
        importer.importData(bioprojectFiles, biosampleFiles, sraFiles, taxonomyFiles);
        
        log.exit();
    }
    
    public void importData(Set<String> bioProjectXMLFiles, Set<String> bioSampleXMLFiles,
                           Set<String> sraXMLFiles, Set<String> taxonomyXMLFiles) throws JAXBException {
        log.entry(bioProjectXMLFiles, bioSampleXMLFiles, sraXMLFiles, taxonomyXMLFiles);

        log.info("Start parsing of XML files...");

        RecordSet recordSet = readBioproject(bioProjectXMLFiles);

        BioSampleSetType bioSampleSet = readBiosample(bioSampleXMLFiles);

        ExperimentPackageSet experimentPackageSet = readSra(sraXMLFiles);

        TaxaSetType taxaSet = readTaxonomy(taxonomyXMLFiles);

        log.info("Done parsing of XML files.");

        log.info("Start converting data...");

        // Convert data from NCBI objects to Beebiome objects
        Set<SpeciesToNameTO> speciesToNameTOs = new HashSet<>();
        Map<Integer, SpeciesTO> speciesTOs = new HashMap<>();
        Set<TaxonTO> taxonTOs = new HashSet<>();
        for (TaxonType taxon : taxaSet.getTaxon()) {
            int parentTaxonId = taxon.getParentTaxId();
            Integer parentSpeciesId = null;
            if ("subspecies".equals(taxon.getRank()) ) {
                parentSpeciesId = parentTaxonId;
                parentTaxonId = taxon.getLineageEx().getTaxon()
                        .get(taxon.getLineageEx().getTaxon().size() - 2).getTaxId();
            }
            
            SpeciesTO speciesTO = new SpeciesTO(taxon.getTaxId(), taxon.getScientificName(),
                    parentTaxonId, parentSpeciesId, true);
            speciesTOs.put(speciesTO.getId(), speciesTO);

            speciesToNameTOs.add(new SpeciesToNameTO(taxon.getTaxId(), taxon.getScientificName()));
            
            if (taxon.getOtherNames() != null) {
                if (taxon.getOtherNames().getCommonName() != null) {
                    speciesToNameTOs.add(
                            new SpeciesToNameTO(taxon.getTaxId(), taxon.getOtherNames().getCommonName()));
                }
                if (taxon.getOtherNames().getGenbankCommonName() != null) {
                    speciesToNameTOs.add(
                            new SpeciesToNameTO(taxon.getTaxId(), taxon.getOtherNames().getGenbankCommonName()));
                }
                if (taxon.getOtherNames().getSynonym() != null) {
                    speciesToNameTOs.add(
                            new SpeciesToNameTO(taxon.getTaxId(), taxon.getOtherNames().getSynonym()));
                }
            }
            taxonTOs.addAll(taxon.getLineageEx().getTaxon().stream()
                    .filter(t -> !"species".equals(t.getRank()))
                    .map(t -> new TaxonTO(t.getTaxId(), t.getScientificName()))
                    .collect(Collectors.toSet()));
        }

        Set<SampleTO> sampleTOs = new HashSet<>();
        Set<GeoLocationTO> geoLocationTOs = new HashSet<>();
        Set<BiosamplePackageTO> biosamplePackageTOs = new HashSet<>();
        Set<String> rejectedHost = new HashSet<>();
        Set<String> severalSpeciesHost = new HashSet<>();
        for (BioSampleType bioSample : bioSampleSet.getBioSample()) {
            Integer hostSpeciesId = null;
            String geoLocName = null;
            String latitudeLongitude = null;
            String collectionDate = null;
            for (AttributeType attribute : bioSample.getAttributes().getAttribute()) {
                if ("Not applicable".equals(attribute.getValue())) {
                    continue;
                }
                switch (attribute.getAttributeName()) {
                    case "host":
                        String host = attribute.getValue();
                        Set<SpeciesToNameTO> snTOs = speciesToNameTOs.stream()
                                .filter(to -> to.getName() != null && to.getName().equalsIgnoreCase(host))
                                .collect(Collectors.toSet());
                        if (snTOs.size() > 1) {
                            severalSpeciesHost.add(host);
                            continue;

                        } else if (snTOs.size() == 1) {
                            hostSpeciesId = snTOs.stream().findAny().get().getSpeciesId();
                        } else {
                            rejectedHost.add(host);
//                            log.debug("Reject BioSample " + bioSample.getAccession()
//                                    + " due to its host (" + host + ")");
                            continue;
                        }
                        break;
                    case "geo_loc_name":
                        geoLocName = attribute.getValue();
                        break;
                    case "lat_lon":
                         latitudeLongitude = attribute.getValue();
                        break;
                    case "collection_date":
                        collectionDate = attribute.getValue();
                        break;
                }
            }

            geoLocationTOs.add(new GeoLocationTO(latitudeLongitude, null, null, geoLocName));

            Integer orgId = bioSample.getDescription().getOrganism().getTaxonomyId();
            SpeciesTO speciesTO = speciesTOs.get(orgId);
            if (speciesTO == null) {
                speciesTOs.put(orgId, new SpeciesTO(orgId,
                        bioSample.getDescription().getOrganism().getTaxonomyName(), null, null, false));
            }
            biosamplePackageTOs.add(new BiosamplePackageTO(bioSample.getPackage().getValue(),
                    bioSample.getPackage().getDisplayName()));
            
            sampleTOs.add(new SampleTO(
                    bioSample.getAccession(),
                    bioSample.getPackage().getValue(),
                    latitudeLongitude, // locationId
                    bioSample.getDescription().getOrganism().getTaxonomyId(),
                    hostSpeciesId,
                    collectionDate));
        }
        log.debug("Rejected hosts: " + rejectedHost.stream().sorted().collect(Collectors.joining(", ")));
        log.debug("Host mapping several species: " + severalSpeciesHost.stream().sorted().collect(Collectors.joining(", ")));

        Set<String> validSampleAccs = sampleTOs.stream()
                .map(SampleTO::getBiosampleAcc)
                .collect(Collectors.toSet());
        
        Set<ProjectToSampleTO> projectToSampleTOs = new HashSet<>();
        Set<SampleToExperimentTO> sampleToExperimentTOs = new HashSet<>();
        Set<ExperimentTO> experimentTOs = new HashSet<>();
        for (ExperimentPackageType experiment : experimentPackageSet.getExperimentPackages()) {
            Set<String> biosampleAccs = experiment.getSampleType().getIDENTIFIERS().getEXTERNALID().stream()
                    .filter(id -> id.getNamespace().equals("BioSample"))
                    .map(id -> id.getValue())
                    .collect(Collectors.toSet());

            if (biosampleAccs.stream().noneMatch(validSampleAccs::contains)) {
                log.debug("Reject experiment [" + experiment.getExperimentType().getAccession() +
                        "] due to the absence of valid BioSampleAcc");
                continue;
            }

            PlatformType platform = experiment.getExperimentType().getPLATFORM();
            String platformName = null;
            if (platform.getLS454() != null) {
                platformName = platform.getLS454().getINSTRUMENTMODEL();
            } else if (platform.getILLUMINA() != null) {
                platformName = platform.getILLUMINA().getINSTRUMENTMODEL().value();
            } else if (platform.getHELICOS() != null) {
                platformName = platform.getHELICOS().getINSTRUMENTMODEL().value();
            } else if (platform.getABISOLID() != null) {
                platformName = platform.getABISOLID().getINSTRUMENTMODEL().value();
            } else if (platform.getCOMPLETEGENOMICS() != null) {
                platformName = platform.getCOMPLETEGENOMICS().getINSTRUMENTMODEL().value();
            } else if (platform.getBGISEQ() != null) {
                platformName = platform.getBGISEQ().getINSTRUMENTMODEL().value();
            } else if (platform.getOXFORDNANOPORE() != null) {
                platformName = platform.getOXFORDNANOPORE().getINSTRUMENTMODEL().value();
            } else if (platform.getPACBIOSMRT() != null) {
                platformName = platform.getPACBIOSMRT().getINSTRUMENTMODEL().value();
            } else if (platform.getIONTORRENT() != null) {
                platformName  =platform.getIONTORRENT().getINSTRUMENTMODEL().value();
            } else if (platform.getCAPILLARY() != null) {
                platformName = platform.getCAPILLARY().getINSTRUMENTMODEL().value();
            }

            LibraryDescriptorType libraryDescriptor = experiment.getExperimentType().getDESIGN().getLIBRARYDESCRIPTOR();

            String libraryLayout = null;
            if (libraryDescriptor.getLIBRARYLAYOUT().getSINGLE() != null) {
                libraryLayout = "SINGLE";
            } else if (libraryDescriptor.getLIBRARYLAYOUT().getPAIRED() != null) {
                libraryLayout = "PAIRED";
            } else {
                log.debug("Layout not defined for " + experiment.getExperimentType().getAccession());
            }

            ExperimentTO experimentTO = new ExperimentTO(
                    experiment.getExperimentType().getAccession(),
                    experiment.getExperimentType().getTITLE(),
                    platformName,
                    libraryDescriptor.getLIBRARYSTRATEGY().value(),
                    libraryLayout,
                    libraryDescriptor.getLIBRARYSOURCE().value());
            experimentTOs.add(experimentTO);
            
            Set<String> bioProjectAccs = experiment.getStudyType().getIDENTIFIERS().getEXTERNALID().stream()
                    .filter(id -> id.getNamespace().equals("BioProject"))
                    .map(id -> id.getValue())
                    .collect(Collectors.toSet());
            for (String biosampleAcc : biosampleAccs) {
                for (String bioProjectAcc : bioProjectAccs) {
                    projectToSampleTOs.add(new ProjectToSampleTO(bioProjectAcc, biosampleAcc));
                }
                sampleToExperimentTOs.add(new SampleToExperimentTO(biosampleAcc, experimentTO.getSraAcc()));
            }
        }

        Set<String> validBioProjectAccs = projectToSampleTOs.stream()
                .map(to -> to.getBioprojectAcc())
                .collect(Collectors.toSet());
        Set<SampleToNucleotideTO> sampleToNucleotideTOs = new HashSet<>();
        
        Set<ProjectTO> projectTOs = new HashSet<>();
        Set<PublicationTO> publicationTOs = new HashSet<>();
        Set<ProjectToPublicationTO> projectToPublicationTOs = new HashSet<>();
        for (DocumentSummary documentSummary : recordSet.getDocumentSummaries()) {
            Project p = documentSummary.getProject();
            String bioprojectAcc = p.getProjectID().getArchiveID().getAccession();
            if (!validBioProjectAccs.contains(bioprojectAcc)) {
                log.debug("Reject project [" + bioprojectAcc +"] due to the absence in samples");
                continue;
            }
            TypeSubmission s = documentSummary.getSubmission();
            List<Project.ProjectDescr.Grant> grant = p.getProjectDescr().getGrant();

            LocalDate submittedDate = getLocalDate(s.getSubmitted());
            LocalDate lastUpdateDate = getLocalDate(s.getLastUpdate());
            
            projectTOs.add(new ProjectTO(bioprojectAcc,
                    p.getProjectDescr().getTitle(),
                    p.getProjectDescr().getDescription(),
                    submittedDate,
                    lastUpdateDate,
                    s.getDescription().getOrganization().stream()
                            .map(o -> o.getName().getValue())
                            .collect(Collectors.joining(", ")),
                    grant.stream().map(g -> g.getGrantId()).collect(Collectors.joining(", ")),
                    grant.stream().map(g -> g.getTitle()).collect(Collectors.joining(", ")),
                    grant.stream().map(g -> g.getAgency().getAbbr()).collect(Collectors.joining(", "))));

            for (TypePublication pub : p.getProjectDescr().getPublication()) {
                publicationTOs.add(new PublicationTO(pub.getId(), pub.getDbType()));
                projectToPublicationTOs.add(new ProjectToPublicationTO(bioprojectAcc, pub.getId()));
            }
        }

        log.info("Done converting data...");
        log.debug("speciesToNameTOs: " + speciesToNameTOs.size());
        log.debug("speciesTOs: " + speciesTOs.size());
        log.debug("taxonTOs: " + taxonTOs.size());
        log.debug("sampleTOs: " + sampleTOs.size());
        log.debug("geoLocationTOs: " + geoLocationTOs.size());
        log.debug("biosamplePackageTOs: " + biosamplePackageTOs.size());
        log.debug("projectToSampleTOs " + projectToSampleTOs.size());
        log.debug("sampleToExperimentTOs: " + sampleToExperimentTOs.size());
        log.debug("experimentTOs: " + experimentTOs.size());
        log.debug("projectTOs: " + projectTOs.size());
        log.debug("publicationTOs: " + publicationTOs.size());
        log.debug("projectToPublicationTOs: " + projectToPublicationTOs.size());

        //        try {
        //            this.startTransaction();
        //            this.getDAO().insert(this.TOs);
        //            this.commit();
        //            log.info("Done inserting data");
        //        } catch (IllegalStateException e) {
        //            log.catching(e);
        //            throw log.throwing(new IllegalArgumentException("Error during insertion on db", e));
        //        } finally {
        //            this.closeDAO();
        //        }

        log.exit();
    }

    private LocalDate getLocalDate(XMLGregorianCalendar date) {
        LocalDate localDate = null;
        if (date != null) {
            localDate = LocalDate.of(date.getYear(), date.getMonth(), date.getDay());
        }
        return localDate;
    }

    private <T, U> Set<U> read(Set<String> files, Class<T> cls, Function<T, List<U>> func)
            throws JAXBException {
        log.entry(files, cls, func);

        JAXBContext context = JAXBContext.newInstance(cls);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Set<U> set = new HashSet<>();
        for (String file : files) {
            log.debug("Read " + file);
            File f = new File(file);
            if (f.length() > 0) {
                T r = (T) JAXBIntrospector.getValue(unmarshaller.unmarshal(f));
                set.addAll(func.apply(r));
            }
        }
        log.debug(cls.getName() + ": " + set.size());

        return log.exit(set);
    }

    private RecordSet readBioproject(Set<String> bioprojectXmlFiles) throws JAXBException {
        log.entry(bioprojectXmlFiles);
        
        Set<DocumentSummary> docSums = read(bioprojectXmlFiles, RecordSet.class, RecordSet::getDocumentSummaries);
        RecordSet set = new RecordSet();
        set.setDocumentSummaries(new ArrayList<>(docSums));
        
        log.debug(set.toString() + ": " + set.getDocumentSummaries().size());

//        return log.exit(set);
        return set;
    }

    private BioSampleSetType readBiosample(Set<String> biosampleXmlFiles) throws JAXBException {
        log.entry(biosampleXmlFiles);

        Set<BioSampleType> biosamples = read(biosampleXmlFiles, BioSampleSetType.class,
                BioSampleSetType::getBioSample);
        BioSampleSetType set = new BioSampleSetType();
        set.setBioSample(new ArrayList<>(biosamples));

        log.debug(set.toString() + ": " + set.getBioSample().size());

        //        return log.exit(set);
        return set;
    }

    private ExperimentPackageSet readSra(Set<String> sraXmlFiles) throws JAXBException {
        log.entry(sraXmlFiles);

        Set<ExperimentPackageType> experimentPackageTypes = read(sraXmlFiles, ExperimentPackageSet.class,
                ExperimentPackageSet::getExperimentPackages);
        ExperimentPackageSet set = new ExperimentPackageSet();
        set.setExperimentPackages(new ArrayList<>(experimentPackageTypes));

        log.debug(set.toString() + ": " + set.getExperimentPackages().size());

        //        return log.exit(set);
        return set;
    }

    private TaxaSetType readTaxonomy(Set<String>  taxonomyXmlFiles) throws JAXBException {
        log.entry(taxonomyXmlFiles);

        Set<TaxonType> taxonTypes = read(taxonomyXmlFiles,
                TaxaSetType.class, TaxaSetType::getTaxon);
        TaxaSetType set = new TaxaSetType();
        set.setTaxon(new ArrayList<>(taxonTypes));

        log.debug(set.toString() + ": " + set.getTaxon().size());

        return log.exit(set);
    }
}
