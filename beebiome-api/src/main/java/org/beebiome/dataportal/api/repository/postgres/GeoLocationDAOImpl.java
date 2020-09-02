package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.GeoLocationDAO;
import org.beebiome.dataportal.api.repository.dt.GeoLocationTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class GeoLocationDAOImpl implements GeoLocationDAO {

    NamedParameterJdbcTemplate template;

    public GeoLocationDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(GeoLocationTO to) {
        final String sql = "insert into location(id, latitude, longitude, name)" +
                " values(:id, :latitude, :longitude, :name)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", to.getId())
                .addValue("latitude", to.getLatitude())
                .addValue("longitude", to.getLongitude())
                .addValue("name", to.getName());

        template.update(sql,param,holder);
    }
}
