package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.ProjectDAO;
import org.beebiome.dataportal.api.repository.dt.ProjectTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class ProjectDAOImpl implements ProjectDAO {

    NamedParameterJdbcTemplate template;

    private final String INSERTION_SQL = "INSERT INTO project(bioprojectId, bioprojectAcc, title, " +
            "description, submissionDate, updateDate, submittingOrganizationName, " +
            "grantId, grantTitle, grantAgency) " +
            "VALUES (:bioprojectId, :bioprojectAcc, :title, :description, " +
            ":submissionDate, :updateDate, :submittingOrganizationName, " +
            ":grantId, :grantTitle, :grantAgency) " +
            "ON CONFLICT (bioprojectId) DO UPDATE SET bioprojectAcc = EXCLUDED.bioprojectAcc, " +
            "               title = EXCLUDED.title, description = EXCLUDED.description, " +
            "               submissionDate = EXCLUDED.submissiondate, updateDate = EXCLUDED.updateDate, " +
            "               submittingOrganizationName = EXCLUDED.submittingOrganizationName, " +
            "               grantId = EXCLUDED.grantId, grantTitle = EXCLUDED.grantTitle, grantAgency = EXCLUDED.grantAgency";

    public ProjectDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(ProjectTO to) {

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("bioprojectId", to.getBioprojectId())
                .addValue("bioprojectAcc", to.getBioprojectAcc())
                .addValue("title", to.getTitle())
                .addValue("description", to.getDescription())
                .addValue("submissionDate", to.getSubmissionDate())
                .addValue("updateDate", to.getUpdateDate())
                .addValue("submittingOrganizationName", to.getSubmittingOrganizationName())
                .addValue("grantId", to.getGrantId())
                .addValue("grantTitle", to.getGrantTitle())
                .addValue("grantAgency", to.getGrantAgency());

        template.update(INSERTION_SQL, param, holder);
    }

    @Override
    public void insertAll(Collection<ProjectTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }
}
