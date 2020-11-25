package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.SpeciesDAO;
import org.beebiome.dataportal.api.repository.dt.SpeciesTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Comparator;

@Repository
public class SpeciesDAOImpl implements SpeciesDAO {

    NamedParameterJdbcTemplate template;

    private final String INSERTION_SQL =
            "INSERT INTO species(id, scientificName, parentTaxId, parentSpeciesId, isApoidea) " +
            "VALUES(:id, :scientificName, :parentTaxId, :parentSpeciesId, :isApoidea) " +
            "ON CONFLICT DO NOTHING";


    public SpeciesDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SpeciesTO to) {

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", to.getId())
                .addValue("scientificName", to.getScientificName())
                .addValue("parentTaxId", to.getParentTaxId())
                .addValue("parentSpeciesId", to.getParentSpeciesId())
                .addValue("isApoidea", to.getIsApoidea());

        template.update(INSERTION_SQL,param,holder);
    }

    @Override
    public void insertAll(Collection<SpeciesTO> tos) {

        // Note: order of insertion is important due to
        //       foreign key parentSpeciesId that references species(id)
        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.stream()
                .sorted(Comparator.comparing(SpeciesTO::getParentSpeciesId,
                        Comparator.nullsFirst(Comparator.naturalOrder())))
                .toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }
}
