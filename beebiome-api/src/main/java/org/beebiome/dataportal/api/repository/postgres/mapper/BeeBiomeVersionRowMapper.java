package org.beebiome.dataportal.api.repository.postgres.mapper;

import org.beebiome.dataportal.api.core.model.BeeBiomeVersion;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class BeeBiomeVersionRowMapper implements RowMapper<BeeBiomeVersion> {

    @Override
    public BeeBiomeVersion mapRow(ResultSet rs, int i) throws SQLException {
        return new BeeBiomeVersion(
                rs.getObject("date", LocalDateTime.class).toLocalDate(),
                rs.getString("name"));
    }
}
