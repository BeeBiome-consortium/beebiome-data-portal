package org.beebiome.dataportal.repository.postgres.mapper;

import org.beebiome.dataportal.core.model.Greeting;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GreetingRowMapper implements RowMapper<Greeting> {
    public Greeting mapRow(ResultSet rs, int i) throws SQLException {
        return new Greeting(rs.getLong("id"), rs.getString("content"));
    }
}
