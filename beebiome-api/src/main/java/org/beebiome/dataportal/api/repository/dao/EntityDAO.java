package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.core.model.Entity;

import java.util.List;

public interface EntityDAO {

    List<Entity> findAll();

    List<Entity> findByBiosampleAcc(String id);

    List<Entity> find(String biosampleAcc, String bioProjectAcc, String assayTypes, String centerName, 
                      String platforms, String libraryLayouts, String librarySources, String organism,
                      String host, String geoLocName, String collectionDate, String biosamplePackageAcc,
                      String biosamplePackageName);

}
