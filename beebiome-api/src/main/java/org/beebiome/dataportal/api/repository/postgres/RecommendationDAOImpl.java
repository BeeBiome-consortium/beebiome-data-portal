package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.RecommendationDAO;
import org.beebiome.dataportal.api.repository.dt.RecommendationTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class RecommendationDAOImpl implements RecommendationDAO {

    NamedParameterJdbcTemplate template;

    public RecommendationDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(RecommendationTO to) {
        final String sql = "insert into recommendation(id, name)" +
                " values(:id, :name)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", to.getId())
                .addValue("name", to.getName());

        template.update(sql, param, holder);
    }
}
