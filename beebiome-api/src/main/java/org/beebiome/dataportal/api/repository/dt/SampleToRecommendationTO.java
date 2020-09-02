package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class SampleToRecommendationTO {
    private final String biosampleAcc;
    private final String recommendationId;

    public SampleToRecommendationTO(String biosampleAcc, String recommendationId) {
        this.biosampleAcc = biosampleAcc;
        this.recommendationId = recommendationId;
    }

    public String getBiosampleAcc() {
        return biosampleAcc;
    }

    public String getRecommendationId() {
        return recommendationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleToRecommendationTO that = (SampleToRecommendationTO) o;
        return Objects.equals(biosampleAcc, that.biosampleAcc) &&
                Objects.equals(recommendationId, that.recommendationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(biosampleAcc, recommendationId);
    }
}
