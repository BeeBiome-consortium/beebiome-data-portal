package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.repository.dt.BiosamplePackageTO;

import java.util.Collection;

public interface BiosamplePackageDAO {

    void insert(BiosamplePackageTO biosamplePackageTO);

    void insertAll(Collection<BiosamplePackageTO> tos);
}
