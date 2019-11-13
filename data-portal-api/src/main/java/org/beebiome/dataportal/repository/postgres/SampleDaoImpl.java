package org.beebiome.dataportal.repository.postgres;

import org.beebiome.dataportal.core.model.Sample;
import org.beebiome.dataportal.repository.api.SampleDao;
import org.beebiome.dataportal.repository.postgres.mapper.SampleRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SampleDaoImpl implements SampleDao {

    NamedParameterJdbcTemplate template;

    public SampleDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Sample> findAll() {
        return template.query("select * from sample", new SampleRowMapper());
    }

    @Override
    public List<Sample> findByStudy(String study) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("study", "%" + study + "%");

        return template.query("select * from sample where study like :study", map, new SampleRowMapper());
    }

    @Override
    public void insertSample(Sample g) {
        final String sql = "insert into sample(id, study, assay_type, center_name, instrument, " +
                "library_layout, library_source, organism, platform, geo_loc_name, collection_date)" +
                " values(:id, :study, :assayType, :centerName, :instrument, :libraryLayout," +
                " :librarySource, :organism, :platform, :geoLocName, :collectionDate)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", g.getId())
                .addValue("study", g.getStudy())
                .addValue("assayType", g.getAssayType())
                .addValue("centerName", g.getCenterName())
                .addValue("instrument", g.getInstrument())
                .addValue("libraryLayout", g.getLibraryLayout())
                .addValue("librarySource", g.getLibrarySource())
                .addValue("organism", g.getOrganism())
                .addValue("platform", g.getPlatform())
                .addValue("geoLocName", g.getGeoLocName())
                .addValue("collectionDate", g.getCollectionDate());

        template.update(sql, param, holder);
    }
}
