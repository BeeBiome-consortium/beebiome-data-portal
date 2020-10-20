package org.beebiome.dataportal.api.core.service.impl;

import org.beebiome.dataportal.api.core.model.StatisticsResult;
import org.beebiome.dataportal.api.core.service.StatisticsService;
import org.beebiome.dataportal.api.repository.dao.StatisticsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    private StatisticsDAO dao;

    @Override
    public StatisticsResult getStatistics() {
        return new StatisticsResult(dao.findProjectCount(), dao.findSampleCount(),
                dao.findExperimentCount(), dao.findHostCount());
    }
}
