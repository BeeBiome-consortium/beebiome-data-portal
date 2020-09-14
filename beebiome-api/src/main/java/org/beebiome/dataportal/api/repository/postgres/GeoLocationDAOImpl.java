package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.GeoLocationDAO;
import org.beebiome.dataportal.api.repository.dt.GeoLocationTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class GeoLocationDAOImpl implements GeoLocationDAO {

    NamedParameterJdbcTemplate template;

    private final String INSERTION_SQL = "INSERT INTO location(id, latitude, longitude, name) " +
            "VALUES (:id, :latitude, :longitude, :name) " +
            "ON CONFLICT DO NOTHING";

    public GeoLocationDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(GeoLocationTO to) {

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", to.getId())
                .addValue("latitude", to.getLatitude())
                .addValue("longitude", to.getLongitude())
                .addValue("name", to.getName());

        template.update(INSERTION_SQL, param);
    }

    @Override
    public void insertAll(Collection<GeoLocationTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }
}
