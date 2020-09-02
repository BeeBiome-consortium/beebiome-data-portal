package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.SampleToNucleotideDAO;
import org.beebiome.dataportal.api.repository.dt.SampleToNucleotideTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class SampleToNucleotideDAOImpl implements SampleToNucleotideDAO {

    NamedParameterJdbcTemplate template;

    public SampleToNucleotideDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SampleToNucleotideTO to) {
        final String sql = "insert into sampleToNucleotide(biosampleAcc, nucleotideLink)" +
                " values(:biosampleAcc, :nucleotideLink)";

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("biosampleAcc", to.getBiosampleAcc())
                .addValue("nucleotideLink", to.getNucleotideLink());

        template.update(sql, param, holder);
    }
}
