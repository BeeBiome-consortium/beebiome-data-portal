package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.PublicationTO;

import java.util.Collection;

public interface PublicationDAO {

    void insert(PublicationTO publicationTO);

    void insertAll(Collection<PublicationTO> tos);
}
