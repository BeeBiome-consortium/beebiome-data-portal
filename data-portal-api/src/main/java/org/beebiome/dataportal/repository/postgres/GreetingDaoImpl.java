package org.beebiome.dataportal.repository.postgres;

import org.beebiome.dataportal.core.model.Greeting;
import org.beebiome.dataportal.repository.api.GreetingDao;
import org.beebiome.dataportal.repository.postgres.mapper.GreetingRowMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class GreetingDaoImpl implements GreetingDao {

    NamedParameterJdbcTemplate template;
    
    public GreetingDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    public List<Greeting> findAll() {
        return template.query("select * from greeting", new GreetingRowMapper());
    }

    public void insertGreeting(Greeting g) {
        final String sql = "insert into greeting(id, content) values(:id, :content)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", g.getId())
                .addValue("content", g.getContent());

        template.update(sql, param, holder);
    }

    public void updateGreeting(Greeting g) {
        final String sql = "update greeting set id=:id, content=:content";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", g.getId())
                .addValue("content", g.getContent());

        template.update(sql,param, holder);
    }

    public void executeUpdateGreeting(Greeting g) {
        final String sql = "update greeting set content=:content where id=:id";

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("id", g.getId());
        map.put("content", g.getContent());

        template.execute(sql, map, new PreparedStatementCallback<Object>() {

            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }

    public void deleteGreeting(Greeting g) {
        final String sql = "delete from greeting where id=:id";

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("id", g.getId());

        template.execute(sql, map, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }
}
