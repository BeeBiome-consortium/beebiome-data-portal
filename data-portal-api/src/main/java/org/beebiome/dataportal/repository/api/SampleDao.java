package org.beebiome.dataportal.repository.api;

import org.beebiome.dataportal.core.model.Sample;

import java.util.List;

public interface SampleDao {

    List<Sample> findAll();

    List<Sample> findByStudy(String id);

    void insertSample(Sample g);

}
