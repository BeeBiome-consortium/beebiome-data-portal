package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.SpeciesToNameDAO;
import org.beebiome.dataportal.api.repository.dt.SampleToRecommendationTO;
import org.beebiome.dataportal.api.repository.dt.SpeciesToNameTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class SpeciesToNameDAOImpl implements SpeciesToNameDAO {

    NamedParameterJdbcTemplate template;

    public SpeciesToNameDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SpeciesToNameTO to) {
        final String sql = "insert into speciesToName(speciesId, name)" +
                " values(:speciesId, :name)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("speciesId", to.getSpeciesId())
                .addValue("name", to.getName());

        template.update(sql, param, holder);
    }
}
