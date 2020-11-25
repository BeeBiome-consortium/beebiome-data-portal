package org.beebiome.dataportal.pipeline;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.beebiome.dataportal.api.repository.dt.ImportTO;
import org.beebiome.dataportal.api.repository.dt.ProjectToSampleTO;
import org.beebiome.dataportal.api.repository.dt.SampleTO;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class NCBIImporterTest {

    private final static Logger log = LogManager.getLogger(NCBIImporterTest.class.getName());

    @Test
    public void testNcbiImporter() throws JAXBException, IOException {
        NCBIImporter importer = new NCBIImporter();
        ImportTO importTO = importer.importData(
                this.getInputStream("Bombus_impatiens_bioproject.xml"),
                this.getInputStream("Bombus_impatiens_biosample.xml"),
                this.getInputStream("Bombus_impatiens_sra.xml"),
                this.getInputStream("Bombus_impatiens_taxonomy.xml"),
                this.getInputStream("Bombus_impatiens_biosample_nuccore.idx"),
                this.getInputStream("Bombus_impatiens_biosample_bioproject.idx"));

        Assert.assertFalse("Should not be saved because there is no host in attributes",
                isInBiosampleTOs(importTO, "SAMN02316836"));

        // SRX2655972 in sample SAMN05853372 and in project PRJNA344894
        Assert.assertFalse("Should not be saved because the host maps several species",
                isInBiosampleTOs(importTO, "SAMN05853372"));
        Assert.assertFalse("Should not be saved because related biosample has been rejected",
                isInExperimentTOs(importTO, "SRX2655972"));
        Assert.assertFalse("Should not be saved because related biosample has been rejected",
                isInBioprojectTOs(importTO, "PRJNA344894"));

        // Rejected BioSamples (and suddenly, the Bioproject) due to unknown host attribute
        Assert.assertFalse("Should not be saved because their host is unknown",
                isInBiosampleTOs(importTO, Arrays.asList("SAMN07634939", "SAMN07634944")));
        Assert.assertFalse("Should not be saved because both related biosamples has been rejected",
                isInBioprojectTOs(importTO, "PRJNA407112"));

        Set<SampleTO> sampleWithNucleotide = importTO.getSampleTOs().stream()
                .filter(sampleTO -> sampleTO.getNucleotideCount() > 0)
                .collect(Collectors.toSet());
        Assert.assertEquals("Should find only one sample with nucleotide", 1, sampleWithNucleotide.size());

        Assert.assertEquals("Should find only one sample with nucleotide",
                new HashSet<>(Arrays.asList(
                        new ProjectToSampleTO(224116,5179609),
                        new ProjectToSampleTO(323464, 5179609))), 
                importTO.getProjectToSampleTOs());

    }

    private boolean isInBiosampleTOs(ImportTO importTO, String biosampleAcc) {
        return isInBiosampleTOs(importTO, Collections.singleton(biosampleAcc));
    }

    private boolean isInBiosampleTOs(ImportTO importTO, Collection<String> biosampleAccs) {
        return importTO.getSampleTOs().stream().anyMatch(s -> biosampleAccs.contains(s.getBiosampleAcc()));
    }

    private boolean isInBioprojectTOs(ImportTO importTO, String bioprojectAcc) {
        return isInBioprojectTOs(importTO, Collections.singleton(bioprojectAcc));
    }
    private boolean isInBioprojectTOs(ImportTO importTO, Collection<String> bioprojectAccs) {
        return importTO.getProjectTOs().stream().anyMatch(s -> bioprojectAccs.contains(s.getBioprojectAcc()));
    }

    private boolean isInExperimentTOs(ImportTO importTO, String sraAcc) {
        return isInExperimentTOs(importTO, Collections.singleton(sraAcc));
    }
    private boolean isInExperimentTOs(ImportTO importTO, Collection<String> sraAccs) {
        return importTO.getExperimentTOs().stream().anyMatch(s -> sraAccs.contains(s.getSraAcc()));
    }

    private Set<InputStream> getInputStream(String s) {
        return Collections.singleton(this.getFileFromResourceAsStream(s));
    }
    
    /**
     * Gets a file from the resources folder.
     * <p>
     * It works everywhere, IDEA, unit test and JAR file.
     * 
     * @param fileName  the string of the file name
     * @return          the input stream for reading the file
     */
    private InputStream getFileFromResourceAsStream(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new IllegalArgumentException("File not found! " + fileName);
        } else {
            return inputStream;
        }
    }

    @Test
    public void testDateConverter() {
        NCBIImporter importer = new NCBIImporter();
        Assert.assertEquals("1986-08-01", importer.getLocalDate("01-Aug-1986"));
        Assert.assertEquals("1986-08-01", importer.getLocalDate("1986-08-01"));
        Assert.assertEquals("1986-08", importer.getLocalDate("1986-08"));
        Assert.assertEquals("1986-08", importer.getLocalDate("08-1986"));
        Assert.assertEquals("1986", importer.getLocalDate("1986"));
    }
    
    //    @Test
    //    public void testNcbiImporter_assemblyExistence() throws JAXBException, IOException {
    //        ClassLoader classLoader = getClass().getClassLoader();
    //        URL apoidea = classLoader.getResource("Apoidea");
    //        NCBIImporter importer = new NCBIImporter();
    //        ImportTO importTO = importer.importData(apoidea.getPath());
    //    }
}
