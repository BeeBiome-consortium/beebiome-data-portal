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

    // We don't remove a link between a project and a sample.
    // Do to that, it would be necessary to set up a more complex db update.
    private final String INSERTION_SQL = "INSERT INTO projectToSample(bioprojectId, biosampleId) " +
            "VALUES (:bioprojectId, :biosampleId) " +
            "ON CONFLICT DO NOTHING";

    public ProjectToSampleDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(ProjectToSampleTO to) {

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("bioprojectId", to.getBioprojectId())
                .addValue("biosampleId", to.getBiosampleId());

        template.update(INSERTION_SQL, param, holder);
    }
    
    @Override
    public void insertAll(Collection<ProjectToSampleTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }

}
