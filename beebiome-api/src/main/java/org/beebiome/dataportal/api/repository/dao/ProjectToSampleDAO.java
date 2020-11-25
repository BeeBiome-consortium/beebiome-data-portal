package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.ProjectToSampleTO;

import java.util.Collection;

public interface ProjectToSampleDAO {

    void insert(ProjectToSampleTO projectToSampleTO);

    void insertAll(Collection<ProjectToSampleTO> tos);
}
