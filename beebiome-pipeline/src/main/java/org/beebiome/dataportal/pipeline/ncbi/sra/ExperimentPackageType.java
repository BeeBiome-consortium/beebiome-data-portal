package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentPackageType", propOrder = {
        "experimentType",
        "submissionType",
        "studyType",
        "sampleType"
})
public class ExperimentPackageType {

    @XmlElement(name = "EXPERIMENT")
    protected ExperimentType experimentType;
    @XmlElement(name = "SUBMISSION")
    protected SubmissionType submissionType;
    @XmlElement(name = "STUDY")
    protected StudyType studyType;
    @XmlElement(name = "SAMPLE")
    protected SampleType sampleType;

    public ExperimentType getExperimentType() {
        return experimentType;
    }

    public SubmissionType getSubmissionType() {
        return submissionType;
    }

    public StudyType getStudyType() {
        return studyType;
    }

    public SampleType getSampleType() {
        return sampleType;
    }
}
