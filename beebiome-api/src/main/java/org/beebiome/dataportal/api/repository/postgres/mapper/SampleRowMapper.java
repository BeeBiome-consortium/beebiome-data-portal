package org.beebiome.dataportal.api.repository.postgres.mapper;

import org.beebiome.dataportal.api.core.model.Sample;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleRowMapper implements RowMapper<Sample> {

    public Sample mapRow(ResultSet rs, int i) throws SQLException {
        return new Sample(rs.getString("id"), rs.getString("study"), rs.getString("assay_type"),
                rs.getString("center_name"), rs.getString("instrument"), rs.getString("library_layout"),
                rs.getString("library_source"), rs.getString("organism"), rs.getString("platform"),
                rs.getString("geo_loc_name"), rs.getString("collection_date"));
    }

}
