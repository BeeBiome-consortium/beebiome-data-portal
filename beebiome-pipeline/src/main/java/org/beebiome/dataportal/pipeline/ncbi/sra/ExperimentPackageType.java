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
        "sampleSetType"
})
public class ExperimentPackageType {

    @XmlElement(name = "EXPERIMENT")
    protected ExperimentType experimentType;
    @XmlElement(name = "SUBMISSION")
    protected SubmissionType submissionType;
    @XmlElement(name = "STUDY")
    protected StudyType studyType;
    @XmlElement(name = "SAMPLE_SET")
    protected SampleSetType sampleSetType;

    public ExperimentType getExperimentType() {
        return experimentType;
    }

    public SubmissionType getSubmissionType() {
        return submissionType;
    }

    public StudyType getStudyType() {
        return studyType;
    }

    public SampleSetType getSampleSetType() {
        return sampleSetType;
    }
}
