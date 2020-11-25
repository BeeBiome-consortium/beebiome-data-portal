package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.SampleTO;

import java.util.Collection;

public interface SampleDAO {

    void insert(SampleTO sampleTO);

    void insertAll(Collection<SampleTO> tos);
}
