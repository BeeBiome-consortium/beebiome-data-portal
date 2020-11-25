package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.TaxonDAO;
import org.beebiome.dataportal.api.repository.dt.TaxonTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class TaxonDAOImpl implements TaxonDAO {

    NamedParameterJdbcTemplate template;

    private final static String INSERTION_SQL = "INSERT INTO taxon(id, name) " +
            "VALUES (:id, :name) " +
            "ON CONFLICT DO NOTHING";

    public TaxonDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(TaxonTO to) {

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", to.getId())
                .addValue("name", to.getName());

        template.update(INSERTION_SQL, param, holder);
    }

    @Override
    public void insertAll(Collection<TaxonTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }
}
