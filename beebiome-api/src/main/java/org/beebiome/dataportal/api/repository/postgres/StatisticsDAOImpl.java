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
        return template.queryForObject("select count(distinct biosampleacc) from entity", new HashMap<>(), Integer.class);
    }

    @Override
    public int findProjectCount() {
        return template.queryForObject("select count(distinct bioprojectacc) from entity", new HashMap<>(), Integer.class);

    }

    @Override
    public int findExperimentCount() {
        return template.queryForObject("SELECT count(distinct s.expAcc)" +
                " FROM entity, unnest(string_to_array(entity.experimentaccs, ';')) s(expAcc);",
                new HashMap<>(), Integer.class);
    }

    @Override
    public int findHostCount() {
        return template.queryForObject("select count(distinct hostid) from entity", new HashMap<>(), Integer.class);
    }
}
