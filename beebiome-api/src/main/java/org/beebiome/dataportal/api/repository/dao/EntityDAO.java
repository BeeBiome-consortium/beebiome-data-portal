package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.core.model.Entity;

import java.util.List;

public interface EntityDAO {

    List<Entity> findAll();

    List<Entity> findByBiosampleId(String id);

}
