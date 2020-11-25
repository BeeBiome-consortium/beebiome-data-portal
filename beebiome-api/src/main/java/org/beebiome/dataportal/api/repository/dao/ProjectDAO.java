package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.ProjectTO;

import java.util.Collection;

public interface ProjectDAO {

    void insert(ProjectTO projectTO);

    void insertAll(Collection<ProjectTO> tos);
}
