package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.SpeciesToNameTO;

import java.util.Collection;

public interface SpeciesToNameDAO {

    void insert(SpeciesToNameTO speciesToNameTO);

    void insertAll(Collection<SpeciesToNameTO> tos);
}
