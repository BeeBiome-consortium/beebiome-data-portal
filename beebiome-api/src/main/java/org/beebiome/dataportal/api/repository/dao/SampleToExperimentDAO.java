package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.SampleToExperimentTO;

import java.util.Collection;

public interface SampleToExperimentDAO {

    void insert(SampleToExperimentTO sampleToExperimentTO);

    void insertAll(Collection<SampleToExperimentTO> tos);
}
