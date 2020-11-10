package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.SampleDAO;
import org.beebiome.dataportal.api.repository.dt.SampleTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class SampleDAOImpl implements SampleDAO {

    NamedParameterJdbcTemplate template;

    private final String INSERTION_SQL = "INSERT INTO sample(biosampleAcc, biosamplePackageId, locationId, " +
            "speciesId, hostSpeciesId, collectionDate, nucleotideCount) " +
            "VALUES (:biosampleAcc, :biosamplePackageId, :locationId, :speciesId, " +
            ":hostSpeciesId, :collectionDate, :nucleotideCount) " +
            "ON CONFLICT DO NOTHING";

    public SampleDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SampleTO to) {

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("biosampleAcc", to.getBiosampleAcc())
                .addValue("biosamplePackageId", to.getBiosamplePackageId())
                .addValue("locationId", to.getLocationId())
                .addValue("speciesId", to.getSpeciesId())
                .addValue("hostSpeciesId", to.getHostSpeciesId())
                .addValue("collectionDate", to.getCollectionDate())
                .addValue("nucleotideCount", to.getNucleotideCount());

        template.update(INSERTION_SQL, param, holder);
    }
    
    @Override
    public void insertAll(Collection<SampleTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }
}
