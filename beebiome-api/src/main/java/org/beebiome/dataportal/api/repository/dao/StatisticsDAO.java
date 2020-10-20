package org.beebiome.dataportal.api.repository.dao;

public interface StatisticsDAO {

    int findSampleCount();
    
    int findProjectCount();
    
    int findExperimentCount();
    
    int findHostCount();


}
