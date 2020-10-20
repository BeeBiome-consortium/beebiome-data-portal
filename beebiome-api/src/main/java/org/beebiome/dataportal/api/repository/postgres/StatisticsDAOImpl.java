package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.StatisticsDAO;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StatisticsDAOImpl implements StatisticsDAO {

    NamedParameterJdbcTemplate template;

    public StatisticsDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public int findSampleCount() {
        return template.queryForObject("select count(*) from sample", new HashMap<>(), Integer.class);
    }

    @Override
    public int findProjectCount() {
        return template.queryForObject("select count(*) from project", new HashMap<>(), Integer.class);

    }

    @Override
    public int findExperimentCount() {
        return template.queryForObject("select count(*) from experiment", new HashMap<>(), Integer.class);
    }

    @Override
    public int findHostCount() {
        return template.queryForObject("select count(distinct hostSpeciesId) from sample", new HashMap<>(), Integer.class);
    }
}
