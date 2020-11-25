package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class SampleToRecommendationTO {
    private final Integer biosampleId;
    private final String recommendationId;

    public SampleToRecommendationTO(Integer biosampleId, String recommendationId) {
        this.biosampleId = biosampleId;
        this.recommendationId = recommendationId;
    }

    public Integer getBiosampleId() {
        return biosampleId;
    }

    public String getRecommendationId() {
        return recommendationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleToRecommendationTO that = (SampleToRecommendationTO) o;
        return Objects.equals(biosampleId, that.biosampleId) &&
                Objects.equals(recommendationId, that.recommendationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(biosampleId, recommendationId);
    }
}
