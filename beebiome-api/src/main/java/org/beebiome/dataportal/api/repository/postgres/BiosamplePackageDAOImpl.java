package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.BiosamplePackageDAO;
import org.beebiome.dataportal.api.repository.dt.BiosamplePackageTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class BiosamplePackageDAOImpl implements BiosamplePackageDAO {

    NamedParameterJdbcTemplate template;
    
    public BiosamplePackageDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    private final String INSERTION_SQL = "insert into biosamplePackage(id, name)" +
            " values(:id, :name)";
    
    @Override
    public void insert(BiosamplePackageTO to) {

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", to.getId())
                .addValue("name", to.getName());

        template.update(INSERTION_SQL, param, holder);
    }

    @Override
    public void insertAll(Collection<BiosamplePackageTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }

}
