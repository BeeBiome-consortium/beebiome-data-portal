package org.beebiome.dataportal.api.web.controller;

import org.beebiome.dataportal.api.core.model.StatisticsResult;
import org.beebiome.dataportal.api.core.service.StatisticsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StatisticsController {

    @Resource
    StatisticsService statisticsService;

    @CrossOrigin
    @GetMapping("/statistics/all")
    public StatisticsResult getStatistics() {
        return statisticsService.getStatistics();
    }
}
