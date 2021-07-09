package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.core.model.ReleaseVersion;

public interface StatisticsDAO {

    int findSampleCount();
    
    int findProjectCount();
    
    int findExperimentCount();
    
    int findHostCount();

    ReleaseVersion findReleaseVersion();

    int insertNewReleaseVersion();

}
