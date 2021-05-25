package org.beebiome.dataportal.api.repository.postgres;

import org.apache.commons.lang3.StringUtils;
import org.beebiome.dataportal.api.core.model.Entity;
import org.beebiome.dataportal.api.repository.dao.EntityDAO;
import org.beebiome.dataportal.api.repository.postgres.mapper.EntityRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class EntityDAOImpl implements EntityDAO {

    NamedParameterJdbcTemplate template;

    public EntityDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Entity> findAll() {
        return template.query("select * from entity", new EntityRowMapper());
    }

    @Override
    public List<Entity> findByBiosampleAcc(String biosampleAcc) {
        Map<String,Object> map = new HashMap<>();
        map.put("biosampleAcc", "%" + biosampleAcc + "%");

        return template.query("select * from entity where biosampleAcc like :biosampleAcc", map, new EntityRowMapper());
    }

    @Override
    public List<Entity> find(String biosampleAcc, String bioProjectAcc, String assayTypes,
                             String centerName, String platforms, String libraryLayouts,
                             String librarySources, String organism, String host,
                             String geoLocName, String collectionDate) {
        Map<String,Object> map = new HashMap<>();
        Map<String, String> columnNames = new HashMap<>();
        if (StringUtils.isNotBlank(biosampleAcc)) {
            map.put("biosampleAcc", "%" + biosampleAcc + "%");
            columnNames.put("biosampleAcc", "biosampleAcc");
        }
        if (StringUtils.isNotBlank(bioProjectAcc)) {
            map.put("bioProjectAcc", "%" + bioProjectAcc + "%");
            columnNames.put("bioProjectAcc", "bioProjectAcc");
        }
        if (StringUtils.isNotBlank(assayTypes)) {
            map.put("assayTypes", "%" + assayTypes + "%");
            columnNames.put("assayTypes", "libraryStrategies");
        }
        if (StringUtils.isNotBlank(centerName)) {
            map.put("centerName", "%" + centerName + "%");
            columnNames.put("centerName", "submittingOrganizationName");
        }
        if (StringUtils.isNotBlank(libraryLayouts)) {
            map.put("libraryLayouts", "%" + libraryLayouts + "%");
            columnNames.put("libraryLayouts", "libraryLayouts");
        }
        if (StringUtils.isNotBlank(librarySources)) {
            map.put("librarySources", "%" + librarySources + "%");
            columnNames.put("librarySources", "librarySources");
        }
        if (StringUtils.isNotBlank(organism)) {
            map.put("organism", "%" + organism + "%");
            columnNames.put("organism", "speciesScientificName");
        }
        if (StringUtils.isNotBlank(host)) {
            map.put("host", "%" + host + "%");
            columnNames.put("host", "hostScientificName");
        }
        if (StringUtils.isNotBlank(platforms)) {
            map.put("platforms", "%" + platforms + "%");
            columnNames.put("platforms", "platforms");
        }
        if (StringUtils.isNotBlank(geoLocName)) {
            map.put("geoLocName", "%" + geoLocName + "%");
            columnNames.put("geoLocName", "geoLocName");
        }
        if (StringUtils.isNotBlank(collectionDate)) {
            map.put("collectionDate", "%" + collectionDate + "%");
            columnNames.put("collectionDate", "collectionDate");
        }
        
        if (columnNames.isEmpty()) {
            throw new IllegalArgumentException("At least one filter should be provided");
        }

        return template.query("select * from entity where " + columnNames.entrySet().stream()
                        .map(e -> e.getValue() + " iLIKE :" + e.getKey())
                        .collect(Collectors.joining(" AND ")),
                map, new EntityRowMapper());
    }
}
