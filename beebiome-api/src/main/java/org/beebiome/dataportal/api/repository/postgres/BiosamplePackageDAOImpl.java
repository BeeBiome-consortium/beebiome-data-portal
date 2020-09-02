package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.BiosamplePackageDAO;
import org.beebiome.dataportal.api.repository.dt.BiosamplePackageTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class BiosamplePackageDAOImpl implements BiosamplePackageDAO {

    NamedParameterJdbcTemplate template;
    
    public BiosamplePackageDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insertBiosamplePackage(BiosamplePackageTO to) {
        final String sql = "insert into biosamplePackage(id, name)" +
                " values(:id, :name)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", to.getId())
                .addValue("name", to.getName());

        template.update(sql, param, holder);
    }

}
