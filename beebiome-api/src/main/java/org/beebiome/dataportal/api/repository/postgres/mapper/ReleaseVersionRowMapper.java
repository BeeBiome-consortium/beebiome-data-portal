package org.beebiome.dataportal.api.repository.postgres.mapper;

import org.beebiome.dataportal.api.core.model.ReleaseVersion;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class ReleaseVersionRowMapper implements RowMapper<ReleaseVersion> {

    @Override
    public ReleaseVersion mapRow(ResultSet rs, int i) throws SQLException {
        return new ReleaseVersion(
                rs.getObject("date", LocalDateTime.class).toLocalDate(),
                rs.getString("name"));
    }
}
