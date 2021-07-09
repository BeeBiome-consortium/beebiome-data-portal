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

    // We don't remove a link between a sample and a recommendation.
    // Do to that, it would be necessary to set up a more complex db update.
    private final String INSERTION_SQL = "INSERT INTO sampleToRecommendation(biosampleId, recommendationId) " +
            "VALUES (:biosampleId, :recommendationId) " +
            "ON CONFLICT DO NOTHING";

    public SampleToRecommendationDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SampleToRecommendationTO to) {

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("biosampleId", to.getBiosampleId())
                .addValue("recommendationId", to.getRecommendationId());

        template.update(INSERTION_SQL, param, holder);
    }
    
    @Override
    public void insertAll(Collection<SampleToRecommendationTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }
}
