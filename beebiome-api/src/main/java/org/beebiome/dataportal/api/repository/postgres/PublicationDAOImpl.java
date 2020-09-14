package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.PublicationDAO;
import org.beebiome.dataportal.api.repository.dt.PublicationTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class PublicationDAOImpl implements PublicationDAO {

    NamedParameterJdbcTemplate template;

    private final String INSERTION_SQL = "INSERT INTO publication(accession, source) " +
            "VALUES (:accession, :source) " +
            "ON CONFLICT DO NOTHING";
    
    public PublicationDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(PublicationTO to) {
        
        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("accession", to.getAccession())
                .addValue("source", to.getSource());

        template.update(INSERTION_SQL, param, holder);
    }

    @Override
    public void insertAll(Collection<PublicationTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }
}
