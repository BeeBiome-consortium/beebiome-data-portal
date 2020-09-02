package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.ProjectToSampleDAO;
import org.beebiome.dataportal.api.repository.dt.ProjectToSampleTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectToSampleDAOImpl implements ProjectToSampleDAO {
    
    NamedParameterJdbcTemplate template;

    public ProjectToSampleDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(ProjectToSampleTO to) {
        final String sql = "insert into projectToSample(bioprojectAcc, biosampleAcc)" +
                " values(:bioprojectAcc, :biosampleAcc)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("bioprojectAcc", to.getBioprojectAcc())
                .addValue("biosampleAcc", to.getBiosampleAcc());

        template.update(sql, param, holder);
    }

}
