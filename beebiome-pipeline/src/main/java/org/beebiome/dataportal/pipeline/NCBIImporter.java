package org.beebiome.dataportal.pipeline;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.beebiome.dataportal.pipeline.ncbi.bioproject.RecordSet;
import org.beebiome.dataportal.pipeline.ncbi.biosample.BioSampleSet;
import org.beebiome.dataportal.pipeline.ncbi.sra.ExperimentPackageSet;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class NCBIImporter {

    private final static Logger log = LogManager.getLogger(NCBIImporter.class.getName());

    public static void main(String[] args) throws JAXBException {
        log.entry((Object[]) args);

        int expectedArgLength = 3;
        if (args.length != expectedArgLength) {
            throw log.throwing(new IllegalArgumentException(
                    "Incorrect number of arguments provided, expected " +
                            expectedArgLength + " arguments, " + args.length + " provided."));
        }

        NCBIImporter importer = new NCBIImporter();

        String bioProjectXMLFile = args[0];
        RecordSet recordSet = importer.readBioproject(bioProjectXMLFile);

        String bioSampleXMLFile = args[1];
        BioSampleSet bioSampleSet = importer.readBiosample(bioSampleXMLFile);

        String sraXMLFile = args[2];
        ExperimentPackageSet experimentPackageSet = importer.readSra(sraXMLFile);

        log.info("Done parsing of XML file");

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

    private RecordSet readBioproject(String xmlFile) throws JAXBException {
        log.entry(xmlFile);
        
        JAXBContext bioprojectContext = JAXBContext.newInstance(RecordSet.class);
        Unmarshaller bioprojectUnmarshaller = bioprojectContext.createUnmarshaller();
        String bioprojectFile = NCBIImporter.class.getClassLoader().getResource(xmlFile).getFile();
        RecordSet recordSet = (RecordSet) JAXBIntrospector.getValue(
                bioprojectUnmarshaller.unmarshal(new File(bioprojectFile)));
        
        log.debug(recordSet.toString() + ": " + recordSet.getDocumentSummaries().size());
        
        return log.exit(recordSet);
    }
    
    private BioSampleSet readBiosample(String xmlFile) throws JAXBException {
        log.entry(xmlFile);
        
        JAXBContext biosampleContext = JAXBContext.newInstance(BioSampleSet.class);
        Unmarshaller biosampleUnmarshaller = biosampleContext.createUnmarshaller();
        String biosampleFile = NCBIImporter.class.getClassLoader().getResource(xmlFile).getFile();
        BioSampleSet bioSampleSet = (BioSampleSet) JAXBIntrospector.getValue(
                biosampleUnmarshaller.unmarshal(new File(biosampleFile)));
        
        log.debug(bioSampleSet.toString() + ": " + bioSampleSet.getBioSamples().size());
        
        return log.exit(bioSampleSet);
    }

    private ExperimentPackageSet readSra(String xmlFile) throws JAXBException {
        log.entry(xmlFile);
        
        JAXBContext sraContext = JAXBContext.newInstance(ExperimentPackageSet.class);
        Unmarshaller sraUnmarshaller = sraContext.createUnmarshaller();
        String sraFile = NCBIImporter.class.getClassLoader().getResource(xmlFile).getFile();
        ExperimentPackageSet sraExpPackageSet = (ExperimentPackageSet) JAXBIntrospector.getValue(
                sraUnmarshaller.unmarshal(new File(sraFile)));
        
        log.debug(sraExpPackageSet.toString() + ": " + sraExpPackageSet.getExperimentPackages().size());
        
        return log.exit(sraExpPackageSet);
    }
}
