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
    public List<Entity> getEntitiesByBiosampleId(String id) {
        return dao.findByBiosampleId(id);
    }
}
