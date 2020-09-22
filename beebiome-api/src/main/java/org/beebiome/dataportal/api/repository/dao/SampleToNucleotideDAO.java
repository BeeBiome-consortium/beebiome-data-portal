package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.SampleToNucleotideTO;

import java.util.Collection;

public interface SampleToNucleotideDAO {

    void insert(SampleToNucleotideTO sampleToNucleotideTO);

    void insertAll(Collection<SampleToNucleotideTO> tos);
}
