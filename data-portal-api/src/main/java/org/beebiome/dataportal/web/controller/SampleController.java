package org.beebiome.dataportal.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.beebiome.dataportal.core.model.Sample;
import org.beebiome.dataportal.core.service.SampleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SampleController {
    
    @Resource
    SampleService sampleService;

    @CrossOrigin
    @GetMapping("/sample/all")
    public List<Sample> getAllSamples() {
        return sampleService.getAllSamples();
    }

    @CrossOrigin
    @GetMapping("/sample/{id}")
    public List<Sample> sampleByStudy(@PathVariable String id) {
        return sampleService.getSampleByStudy(id);
    }

    @PostMapping("/sample/create")
    public Sample getAllSamples(@RequestBody String line) {
        if (StringUtils.isBlank(line)) {
            throw new IllegalArgumentException("No blank line");
        }
        String[] split = line.split("\t");
        if (split.length != 11) {
            throw new IllegalArgumentException("Incorrect number of fields. Should be 11 fields");
        }
        Sample g = new Sample(split[0], split[1], split[2], split[3], split[4], split[5], split[6],
                split[7], split[8], split[9], split[10]);
        sampleService.createSample(g);
        return g;
    }
}
