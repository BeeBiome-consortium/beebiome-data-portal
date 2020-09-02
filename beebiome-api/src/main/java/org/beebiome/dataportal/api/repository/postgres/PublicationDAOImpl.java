package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.PublicationDAO;
import org.beebiome.dataportal.api.repository.dt.PublicationTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class PublicationDAOImpl implements PublicationDAO {

    NamedParameterJdbcTemplate template;

    public PublicationDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(PublicationTO to) {
        final String sql = "insert into publication(accession, source)" +
                " values(:accession, :source)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("accession", to.getAccession())
                .addValue("source", to.getPublicationSource());

        template.update(sql, param, holder);
    }

}
