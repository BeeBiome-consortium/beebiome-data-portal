package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.SpeciesDAO;
import org.beebiome.dataportal.api.repository.dt.SpeciesTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class SpeciesDAOImpl implements SpeciesDAO {

    NamedParameterJdbcTemplate template;

    public SpeciesDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SpeciesTO to) {
        final String sql = "insert into species(id, scientificName, parentTaxId, parentSpeciesId, " +
                "isApoidea) " +
                "values(:id, :scientificName, :parentTaxId, :parentSpeciesId, " +
                ":isApoidea)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", to.getId())
                .addValue("scientificName", to.getScientificName())
                .addValue("parentTaxId", to.getParentTaxId())
                .addValue("parentSpeciesId", to.getParentSpeciesId())
                .addValue("isApoidea", to.isApoidea());

        template.update(sql,param,holder);
    }
}
