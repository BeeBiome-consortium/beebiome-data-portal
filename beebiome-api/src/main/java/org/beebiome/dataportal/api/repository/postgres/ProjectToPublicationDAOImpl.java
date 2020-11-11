package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.ProjectToPublicationDAO;
import org.beebiome.dataportal.api.repository.dt.ProjectToPublicationTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class ProjectToPublicationDAOImpl implements ProjectToPublicationDAO {

    NamedParameterJdbcTemplate template;

    private final String INSERTION_SQL = "INSERT INTO projectToPublication(bioprojectId, publicationAcc) " +
            "VALUES (:bioprojectId, :publicationAcc) " +
            "ON CONFLICT DO NOTHING";


    public ProjectToPublicationDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(ProjectToPublicationTO to) {
        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("bioprojectId", to.getBioprojectId())
                .addValue("publicationAcc", to.getPublicationAcc());

        template.update(INSERTION_SQL, param, holder);
    }

    @Override
    public void insertAll(Collection<ProjectToPublicationTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }

}
