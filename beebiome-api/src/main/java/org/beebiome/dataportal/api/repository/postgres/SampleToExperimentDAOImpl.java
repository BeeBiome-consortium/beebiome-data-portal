package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.SampleToExperimentDAO;
import org.beebiome.dataportal.api.repository.dt.SampleToExperimentTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class SampleToExperimentDAOImpl implements SampleToExperimentDAO {

    NamedParameterJdbcTemplate template;

    private final String INSERTION_SQL = "INSERT INTO sampleToExperiment(biosampleAcc, sraAcc) " +
            "VALUES (:biosampleAcc, :sraAcc) " +
            "ON CONFLICT DO NOTHING";

    public SampleToExperimentDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SampleToExperimentTO to) {

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("biosampleAcc", to.getBiosampleAcc())
                .addValue("sraAcc", to.getSraAcc());

        template.update(INSERTION_SQL, param, holder);
    }
    
    @Override
    public void insertAll(Collection<SampleToExperimentTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }
}
