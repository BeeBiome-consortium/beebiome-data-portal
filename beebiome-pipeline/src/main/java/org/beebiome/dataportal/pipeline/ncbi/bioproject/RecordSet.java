package org.beebiome.dataportal.pipeline.ncbi.bioproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordSet", propOrder = {
        "documentSummaries"
})
@XmlRootElement(name = "RecordSet")
public class RecordSet {

    @XmlElement(name = "DocumentSummary", required = true)
    protected List<DocumentSummary> documentSummaries;

    public List<DocumentSummary> getDocumentSummaries() {
        if (documentSummaries == null) {
            documentSummaries = new ArrayList<>();
        }
        return documentSummaries;
    }
}
