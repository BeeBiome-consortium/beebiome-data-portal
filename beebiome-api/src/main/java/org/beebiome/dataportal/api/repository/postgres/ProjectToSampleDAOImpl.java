package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.ProjectToSampleDAO;
import org.beebiome.dataportal.api.repository.dt.ProjectToSampleTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class ProjectToSampleDAOImpl implements ProjectToSampleDAO {
    
    NamedParameterJdbcTemplate template;

    private final String INSERTION_SQL = "INSERT INTO projectToSample(bioprojectAcc, biosampleAcc) " +
            "VALUES (:bioprojectAcc, :biosampleAcc) " +
            "ON CONFLICT DO NOTHING";

    public ProjectToSampleDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(ProjectToSampleTO to) {

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("bioprojectAcc", to.getBioprojectAcc())
                .addValue("biosampleAcc", to.getBiosampleAcc());

        template.update(INSERTION_SQL, param, holder);
    }
    
    @Override
    public void insertAll(Collection<ProjectToSampleTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }

}
