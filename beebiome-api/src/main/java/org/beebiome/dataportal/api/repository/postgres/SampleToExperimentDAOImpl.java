package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.SampleToExperimentDAO;
import org.beebiome.dataportal.api.repository.dt.SampleToExperimentTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class SampleToExperimentDAOImpl implements SampleToExperimentDAO {

    NamedParameterJdbcTemplate template;

    public SampleToExperimentDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SampleToExperimentTO to) {
        final String sql = "insert into sampleToExperiment(biosampleAcc, sraAcc)" +
                " values(:biosampleAcc, :sraAcc)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("biosampleAcc", to.getBiosampleAcc())
                .addValue("sraAcc", to.getSraAcc());

        template.update(sql, param, holder);
    }
}
