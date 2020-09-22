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
        return template.query("select * from entity", new EntityRowMapper());
    }

    @Override
    public List<Entity> findByBiosampleId(String biosampleAcc) {
        Map<String,Object> map = new HashMap<>();
        map.put("biosampleAcc", "%" + biosampleAcc + "%");

        return template.query("select * from entity where biosampleAcc like :biosampleAcc", map, new EntityRowMapper());
    }

}
