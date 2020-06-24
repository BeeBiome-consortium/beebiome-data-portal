package org.beebiome.dataportal.api.repository.dao;

import org.beebiome.dataportal.api.core.model.Sample;

import java.util.List;

public interface SampleDao {

    List<Sample> findAll();

    List<Sample> findByStudy(String id);

    void insertSample(Sample g);

}
