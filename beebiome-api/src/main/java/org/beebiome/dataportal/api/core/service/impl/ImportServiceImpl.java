package org.beebiome.dataportal.api.core.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.beebiome.dataportal.api.core.exception.BeebiomeException;
import org.beebiome.dataportal.api.core.model.FileInfo;
import org.beebiome.dataportal.api.core.model.ImportResult;
import org.beebiome.dataportal.api.core.model.BeeBiomeVersion;
import org.beebiome.dataportal.api.core.service.ImportService;
import org.beebiome.dataportal.api.repository.dao.BiosamplePackageDAO;
import org.beebiome.dataportal.api.repository.dao.ExperimentDAO;
import org.beebiome.dataportal.api.repository.dao.GeoLocationDAO;
import org.beebiome.dataportal.api.repository.dao.ProjectDAO;
import org.beebiome.dataportal.api.repository.dao.ProjectToPublicationDAO;
import org.beebiome.dataportal.api.repository.dao.ProjectToSampleDAO;
import org.beebiome.dataportal.api.repository.dao.PublicationDAO;
import org.beebiome.dataportal.api.repository.dao.SampleDAO;
import org.beebiome.dataportal.api.repository.dao.SampleToExperimentDAO;
import org.beebiome.dataportal.api.repository.dao.SpeciesDAO;
import org.beebiome.dataportal.api.repository.dao.SpeciesToNameDAO;
import org.beebiome.dataportal.api.repository.dao.StatisticsDAO;
import org.beebiome.dataportal.api.repository.dao.TaxonDAO;
import org.beebiome.dataportal.api.repository.dt.ImportTO;
import org.beebiome.dataportal.pipeline.NCBIImporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Service
public class ImportServiceImpl implements ImportService {

    private final static Logger log = LogManager.getLogger(ImportServiceImpl.class.getName());

    @Autowired private TaxonDAO taxonDAO;
    @Autowired private SpeciesDAO speciesDAO;
    @Autowired private SpeciesToNameDAO speciesToNameDAO;
    @Autowired private GeoLocationDAO geoLocationDAO;
    @Autowired private PublicationDAO publicationDAO;
    @Autowired private ProjectDAO projectDAO;
    @Autowired private ProjectToPublicationDAO projectToPublicationDAO;
    @Autowired private BiosamplePackageDAO biosamplePackageDAO;
    @Autowired private SampleDAO sampleDAO;
    @Autowired private ProjectToSampleDAO projectToSampleDAO;
    @Autowired private ExperimentDAO experimentDAO;
    @Autowired private SampleToExperimentDAO sampleToExperimentDAO;
    @Autowired private StatisticsDAO statisticsDAO;

    @Override
    public ImportResult importData(MultipartFile[] files) {
        log.info("Start data import...");

        Set<FileInfo> fileInfos = new HashSet<>();
        for (MultipartFile file : files) {
            try {
                fileInfos.add(new FileInfo(file.getOriginalFilename(), file.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        NCBIImporter importer = new NCBIImporter();
        ImportTO importTO = null;
        try {
            importTO = importer.importData(fileInfos);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
            throw new BeebiomeException("Error while reading files: " + e.getMessage());
        }
        if (importTO == null) {
            throw new BeebiomeException("No data found in provided files");
        }
        taxonDAO.insertAll(importTO.getTaxonTOs());
        speciesDAO.insertAll(importTO.getSpeciesTOs());
        speciesToNameDAO.insertAll(importTO.getSpeciesToNameTOs());
        geoLocationDAO.insertAll(importTO.getGeoLocationTOs());
        publicationDAO.insertAll(importTO.getPublicationTOs());
        projectDAO.insertAll(importTO.getProjectTOs());
        projectToPublicationDAO.insertAll(importTO.getProjectToPublicationTOs());
        biosamplePackageDAO.insertAll(importTO.getBiosamplePackageTOs());
        sampleDAO.insertAll(importTO.getSampleTOs());
        projectToSampleDAO.insertAll(importTO.getProjectToSampleTOs());
        experimentDAO.insertAll(importTO.getExperimentTOs());
        sampleToExperimentDAO.insertAll(importTO.getSampleToExperimentTOs());

        log.info("Done data import.");

        return new ImportResult(importTO.getProjectTOs().size(),
                importTO.getSampleTOs().size(),importTO.getExperimentTOs().size());
    }

    @Override
    public BeeBiomeVersion addNewBeeBiomeVersion() {
        
        int rows = statisticsDAO.insertNewBeeBiomeVersion();
        if (rows == 1) {
            return statisticsDAO.findBeeBiomeVersion();
        }
        throw new BeebiomeException("Error during insertion of new version");
    }
}
