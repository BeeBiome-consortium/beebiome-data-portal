import org.beebiome.dataportal.pipeline.NCBIImporter;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.util.Collections;

public class NCBIImporterTest {
    
    @Test
    public void testNcbiImporter() throws JAXBException {
        NCBIImporter importer = new NCBIImporter();
        importer.importData(
                Collections.singleton(NCBIImporterTest.class.getResource("Bombus_impatiens_bioproject.xml").getPath()),
                Collections.singleton(NCBIImporterTest.class.getResource("Bombus_impatiens_biosample.xml").getPath()),
                Collections.singleton(NCBIImporterTest.class.getResource("Bombus_impatiens_sra.xml").getPath()),
                Collections.singleton(NCBIImporterTest.class.getResource("Bombus_impatiens_taxonomy.xml").getPath()));
    }
}
