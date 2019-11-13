package org.beebiome.dataportal.core.service;

import org.beebiome.dataportal.core.model.Sample;

import java.util.List;

public interface SampleService {

    public List<Sample> getAllSamples();

    public List<Sample> getSampleByStudy(String id);

    public void createSample(Sample g);

}
