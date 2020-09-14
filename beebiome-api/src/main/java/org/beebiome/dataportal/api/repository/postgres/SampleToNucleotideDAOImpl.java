package org.beebiome.dataportal.api.repository.postgres;

import org.beebiome.dataportal.api.repository.dao.SampleToNucleotideDAO;
import org.beebiome.dataportal.api.repository.dt.SampleToNucleotideTO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class SampleToNucleotideDAOImpl implements SampleToNucleotideDAO {

    NamedParameterJdbcTemplate template;

    private final String INSERTION_SQL = "INSERT INTO sampleToNucleotide(biosampleAcc, nucleotideLink) " +
            "VALUES(:biosampleAcc, :nucleotideLink) " +
            "ON CONFLICT DO NOTHING";

    public SampleToNucleotideDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void insert(SampleToNucleotideTO to) {

        KeyHolder holder = new GeneratedKeyHolder();

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("biosampleAcc", to.getBiosampleAcc())
                .addValue("nucleotideLink", to.getNucleotideLink());

        template.update(INSERTION_SQL, param, holder);
    }

    @Override
    public void insertAll(Collection<SampleToNucleotideTO> tos) {

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(tos.toArray());

        template.batchUpdate(INSERTION_SQL, batch);
    }
}
