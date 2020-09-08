package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.SpeciesTO;

import java.util.Collection;

public interface SpeciesDAO {

    void insert(SpeciesTO speciesTO);
    
    void insertAll(Collection<SpeciesTO> tos);
}
