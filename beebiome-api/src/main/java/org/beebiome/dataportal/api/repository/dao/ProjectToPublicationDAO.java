package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.ProjectToPublicationTO;

import java.util.Collection;

public interface ProjectToPublicationDAO {

    void insert(ProjectToPublicationTO projectToPublicationTO);

    void insertAll(Collection<ProjectToPublicationTO> tos);
}
