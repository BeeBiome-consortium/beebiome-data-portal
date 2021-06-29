package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.core.model.ReleaseVersion;
import org.beebiome.dataportal.api.repository.dao.StatisticsDAO;
import org.beebiome.dataportal.api.repository.postgres.mapper.ReleaseVersionRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

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
        return template.queryForObject("SELECT count(distinct hostid) FROM entity", new HashMap<>(), Integer.class);
    }

    @Override
    public ReleaseVersion findReleaseVersion() {
        return template.queryForObject("SELECT * FROM releaseVersion ORDER BY date DESC LIMIT 1", new HashMap<>(), new ReleaseVersionRowMapper());
    }

    @Override
    public int insertNewReleaseVersion() {
        // Currently, version name is the date.
        Map<String,Object> map = new HashMap<>();
        map.put("name", "BeeBiome " + LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));

        return template.update("INSERT INTO releaseVersion (date, name) VALUES (now(), :name)", map);
    }
}
