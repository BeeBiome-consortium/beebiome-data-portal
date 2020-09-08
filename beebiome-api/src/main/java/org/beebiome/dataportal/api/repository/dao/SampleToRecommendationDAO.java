package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.SampleToRecommendationTO;

import java.util.Collection;

public interface SampleToRecommendationDAO {
    
    void insert(SampleToRecommendationTO sampleToRecommendationTO);

    void insertAll(Collection<SampleToRecommendationTO> tos);
}
