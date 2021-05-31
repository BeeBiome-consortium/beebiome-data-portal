package org.beebiome.dataportal.api.core.service.impl;

import org.beebiome.dataportal.api.core.model.Entity;
import org.beebiome.dataportal.api.core.service.EntityService;
import org.beebiome.dataportal.api.repository.dao.EntityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityServiceImpl implements EntityService {

    @Autowired
    private EntityDAO dao;

    @Override
    public List<Entity> getAllEntities() {
        return dao.findAll();
    }

    @Override
    public List<Entity> getEntitiesByBiosampleAcc(String acc) {
        return dao.findByBiosampleAcc(acc);
    }

    @Override
    public List<Entity> getEntities(String biosampleAcc, String bioProjectAcc, String libraryStrategies,
                                    String centerName, String instruments, String libraryLayouts,
                                    String librarySources, String organism, String host,
                                    String geoLocName, String collectionDate,
                                    String biosamplePackageAcc, String biosamplePackageName) {
        return dao.find(biosampleAcc, bioProjectAcc, libraryStrategies, centerName, instruments,
                libraryLayouts, librarySources, organism, host, geoLocName, collectionDate,
                biosamplePackageAcc, biosamplePackageName);
    }


}
