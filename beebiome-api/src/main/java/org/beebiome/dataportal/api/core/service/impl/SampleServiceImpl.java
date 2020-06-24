package org.beebiome.dataportal.api.core.service.impl;

import org.beebiome.dataportal.api.core.model.Sample;
import org.beebiome.dataportal.api.core.service.SampleService;
import org.beebiome.dataportal.api.repository.dao.SampleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleDao dao;

    @Override
    public List<Sample> getAllSamples() {
        return dao.findAll();
    }

    @Override
    public List<Sample> getSampleByStudy(String id) {
        return dao.findByStudy(id);
    }

    @Override
    public void createSample(Sample g) {
        dao.insertSample(g);
    }
}
