package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.GeoLocationTO;

import java.util.Collection;

public interface GeoLocationDAO {

    void insert(GeoLocationTO geoLocationTO);

    void insertAll(Collection<GeoLocationTO> tos);
}
