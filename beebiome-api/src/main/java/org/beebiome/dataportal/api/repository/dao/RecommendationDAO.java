package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.RecommendationTO;

import java.util.Collection;

public interface RecommendationDAO {

    void insert(RecommendationTO recommendationTO);

    void insertAll(Collection   <RecommendationTO> tos);
}
