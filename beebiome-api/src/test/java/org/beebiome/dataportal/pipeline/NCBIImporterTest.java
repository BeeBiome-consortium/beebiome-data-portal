package org.beebiome.dataportal.pipeline;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Set;

public class NCBIImporterTest {

    @Test
    public void testNcbiImporter() throws JAXBException, IOException {
        NCBIImporter importer = new NCBIImporter();
        importer.importData(
                getInputStream("Bombus_impatiens_bioproject.xml"),
                getInputStream("Bombus_impatiens_biosample.xml"),
                getInputStream("Bombus_impatiens_sra.xml"),
                getInputStream("Bombus_impatiens_taxonomy.xml"));
    }

    private Set<InputStream> getInputStream(String s) {
        return Collections.singleton(NCBIImporterTest.class.getResourceAsStream(s));
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
}
