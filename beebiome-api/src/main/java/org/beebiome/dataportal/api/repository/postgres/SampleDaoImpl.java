package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.SampleDAO;
import org.beebiome.dataportal.api.repository.dt.SampleTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDAOImpl implements SampleDAO {

    NamedParameterJdbcTemplate template;

    public SampleDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SampleTO to) {
        final String sql = "insert into sample(biosampleAcc, biosamplePackageId, locationId, " +
                "speciesId, hostSpeciesId, collectionDate) " +
                "values(:biosampleAcc, :biosamplePackageId, :locationId, :speciesId, " +
                ":hostSpeciesId, :collectionDate)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("biosampleAcc", to.getBiosampleAcc())
                .addValue("biosamplePackageId", to.getBiosamplePackageId())
                .addValue("locationId", to.getLocationId())
                .addValue("speciesId", to.getSpeciesId())
                .addValue("hostSpeciesId", to.getHostSpeciesId())
                .addValue("collectionDate", to.getCollectionDate());

        template.update(sql,param,holder);
    }
}
