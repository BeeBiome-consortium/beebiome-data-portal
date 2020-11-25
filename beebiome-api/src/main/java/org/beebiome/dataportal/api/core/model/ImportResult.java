package org.beebiome.dataportal.api.core.model;

public class ImportResult {

    private int projectCount;
    private int sampleCount;
    private int experimentCount;

    public ImportResult(int projectCount, int sampleCount, int experimentCount) {
        this.projectCount = projectCount;
        this.sampleCount = sampleCount;
        this.experimentCount = experimentCount;
    }

    public int getProjectCount() {
        return projectCount;
    }

    public int getSampleCount() {
        return sampleCount;
    }

    public int getExperimentCount() {
        return experimentCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ImportResult{");
        sb.append("projectCount=").append(projectCount);
        sb.append(", sampleCount=").append(sampleCount);
        sb.append(", experimentCount=").append(experimentCount);
        sb.append('}');
        return sb.toString();
    }
}
