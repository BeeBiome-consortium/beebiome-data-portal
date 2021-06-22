package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.core.model.BeeBiomeVersion;

public interface StatisticsDAO {

    int findSampleCount();
    
    int findProjectCount();
    
    int findExperimentCount();
    
    int findHostCount();

    BeeBiomeVersion findBeeBiomeVersion();

    int insertNewBeeBiomeVersion();

}
