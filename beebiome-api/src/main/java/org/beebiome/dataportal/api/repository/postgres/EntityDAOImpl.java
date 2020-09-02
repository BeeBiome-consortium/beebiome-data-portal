package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.core.model.Entity;
import org.beebiome.dataportal.api.repository.dao.EntityDAO;
import org.beebiome.dataportal.api.repository.postgres.mapper.EntityRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EntityDAOImpl implements EntityDAO {

    NamedParameterJdbcTemplate template;

    public EntityDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Entity> findAll() {
        return template.query("select * from sample", new EntityRowMapper());
    }

    @Override
    public List<Entity> findByBiosampleId(String study) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("study", "%" + study + "%");

        return template.query("select * from sample where study like :study", map, new EntityRowMapper());
    }

//    @Override
//    public void insertSample(Entity g) {
//        final String sql = "insert into sample(id, study, assay_type, center_name, instrument, " +
//                "library_layout, library_source, organism, platform, geo_loc_name, collection_date)" +
//                " values(:id, :study, :assayType, :centerName, :instrument, :libraryLayout," +
//                " :librarySource, :organism, :platform, :geoLocName, :collectionDate)";
//
//        KeyHolder holder = new GeneratedKeyHolder();
//
//        SqlParameterSource param = new MapSqlParameterSource()
//                .addValue("id", g.getBioSampleId())
//                .addValue("study", g.getBioProjectId())
//                .addValue("assayType", g.getAssayType())
//                .addValue("centerName", g.getCenterName())
//                .addValue("instrument", g.getInstrument())
//                .addValue("libraryLayout", g.getLibraryLayout())
//                .addValue("librarySource", g.getLibrarySource())
//                .addValue("organism", g.getOrganism())
//                .addValue("platform", g.getPlatform())
//                .addValue("geoLocName", g.getGeoLocName())
//                .addValue("collectionDate", g.getCollectionDate());
//
//        template.update(sql, param, holder);
//    }
}
