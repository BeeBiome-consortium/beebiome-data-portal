package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.SampleToRecommendationDAO;
import org.beebiome.dataportal.api.repository.dt.SampleToRecommendationTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class SampleToRecommendationDAOImpl implements SampleToRecommendationDAO {

    NamedParameterJdbcTemplate template;

    public SampleToRecommendationDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SampleToRecommendationTO to) {
        final String sql = "insert into sampleToRecommendation(biosampleAcc, recommendationId)" +
                " values(:biosampleAcc, :recommendationId)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("biosampleAcc", to.getBiosampleAcc())
                .addValue("recommendationId", to.getRecommendationId());

        template.update(sql, param, holder);
    }
}
