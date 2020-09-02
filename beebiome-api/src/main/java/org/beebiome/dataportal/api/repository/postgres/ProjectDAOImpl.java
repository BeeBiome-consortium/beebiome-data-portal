package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.ProjectDAO;
import org.beebiome.dataportal.api.repository.dt.ProjectTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDAOImpl implements ProjectDAO {

    NamedParameterJdbcTemplate template;

    public ProjectDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(ProjectTO to) {
        final String sql = "insert into project(bioprojectAcc, title, description, " +
                "submissionDate, updateDate, submittingOrganizationName, " +
                "grantId, grantTitle, grantAgency) " +
                "values(:bioprojectAcc, :title, :description, " +
                ":submissionDate, :updateDate, :submittingOrganizationName, " +
                ":grantId, :grantTitle, :grantAgency)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("bioprojectAcc", to.getBioprojectAcc())
                .addValue("title", to.getTitle())
                .addValue("description", to.getDescription())
                .addValue("submissionDate", to.getSubmissionDate())
                .addValue("updateDate", to.getUpdateDate())
                .addValue("submittingOrganizationName", to.getSubmittingOrganizationName())
                .addValue("grantId", to.getGrantId())
                .addValue("grantTitle", to.getGrantTitle())
                .addValue("grantAgency", to.getGrantAgency());

        template.update(sql,param,holder);
    }
}
