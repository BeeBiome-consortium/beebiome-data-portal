package org.beebiome.dataportal.api.core.service;

import org.beebiome.dataportal.api.core.model.Entity;

import java.util.List;

public interface EntityService {

    public List<Entity> getAllEntities();

    public List<Entity> getEntitiesByBiosampleId(String id);
}
