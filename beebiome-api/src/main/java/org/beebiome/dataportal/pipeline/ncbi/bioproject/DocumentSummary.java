package org.beebiome.dataportal.pipeline.ncbi.bioproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentSummary", propOrder = {
        "project",
        "submission"
})
public class DocumentSummary {

    @XmlElement(name = "Project", required = true)
    protected Project project;

    @XmlElement(name = "Submission", required = true)
    protected TypeSubmission submission;

    public Project getProject() {
        return project;
    }

    public TypeSubmission getSubmission() {
        return submission;
    }
}
