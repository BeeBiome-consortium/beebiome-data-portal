package org.beebiome.dataportal.api.core.model;

import java.util.StringJoiner;

public class StatisticsResult {

    private final ReleaseVersion releaseVersion;
    private final Integer projectCount;
    private final Integer sampleCount;
    private final Integer experimentCount;
    private final Integer hostCount;

    public StatisticsResult(ReleaseVersion releaseVersion, Integer projectCount, Integer sampleCount,
                            Integer experimentCount, Integer hostCount) {
        this.releaseVersion = releaseVersion;
        this.projectCount = projectCount;
        this.sampleCount = sampleCount;
        this.experimentCount = experimentCount;
        this.hostCount = hostCount;
    }

    public ReleaseVersion getReleaseVersion() {
        return releaseVersion;
    }

    public Integer getProjectCount() {
        return projectCount;
    }

    public Integer getSampleCount() {
        return sampleCount;
    }

    public Integer getExperimentCount() {
        return experimentCount;
    }

    public Integer getHostCount() {
        return hostCount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StatisticsResult.class.getSimpleName() + "[", "]")
                .add("sampleCount=" + sampleCount)
                .add("projectCount=" + projectCount)
                .add("experimentCount=" + experimentCount)
                .add("hostCount=" + hostCount)
                .toString();
    }
}
