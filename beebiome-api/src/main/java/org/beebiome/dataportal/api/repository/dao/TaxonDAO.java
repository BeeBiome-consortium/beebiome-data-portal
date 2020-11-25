package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.TaxonTO;

import java.util.Collection;

public interface TaxonDAO {

    void insert(TaxonTO taxonTO);

    void insertAll(Collection<TaxonTO> tos);

}
