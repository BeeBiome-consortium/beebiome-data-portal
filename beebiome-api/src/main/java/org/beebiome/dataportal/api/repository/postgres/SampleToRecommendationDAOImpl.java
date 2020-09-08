package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.SampleToRecommendationDAO;
import org.beebiome.dataportal.api.repository.dt.SampleToRecommendationTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class SampleToRecommendationDAOImpl implements SampleToRecommendationDAO {

    NamedParameterJdbcTemplate template;

    private final String INSERTION_SQL = "insert into sampleToRecommendation(biosampleAcc, recommendationId)" +
            " values(:biosampleAcc, :recommendationId)";

    public SampleToRecommendationDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SampleToRecommendationTO to) {

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("biosampleAcc", to.getBiosampleAcc())
                .addValue("recommendationId", to.getRecommendationId());

        template.update(INSERTION_SQL, param, holder);
    }
    
    @Override
    public void insertAll(Collection<SampleToRecommendationTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }
}
