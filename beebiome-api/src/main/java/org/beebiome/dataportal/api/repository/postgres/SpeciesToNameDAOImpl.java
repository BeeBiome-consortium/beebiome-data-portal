package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.SpeciesToNameDAO;
import org.beebiome.dataportal.api.repository.dt.SpeciesToNameTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class SpeciesToNameDAOImpl implements SpeciesToNameDAO {

    NamedParameterJdbcTemplate template;

    // We don't remove a link between a species and a name/synonym.
    // Do to that, it would be necessary to set up a more complex db update.
    private final String INSERTION_SQL = "INSERT INTO speciesToName(speciesId, name) " +
            "VALUES (:speciesId, :name) " +
            "ON CONFLICT DO NOTHING";

    public SpeciesToNameDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SpeciesToNameTO to) {
        
        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("speciesId", to.getSpeciesId())
                .addValue("name", to.getName());

        template.update(INSERTION_SQL, param, holder);
    }
    
    @Override
    public void insertAll(Collection<SpeciesToNameTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }
}
