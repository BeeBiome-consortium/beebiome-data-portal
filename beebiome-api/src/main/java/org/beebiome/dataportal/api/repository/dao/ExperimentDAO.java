package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.ExperimentTO;

import java.util.Collection;

public interface ExperimentDAO {

    void insert(ExperimentTO experimentTO);

    void insertAll(Collection<ExperimentTO> tos);
}
