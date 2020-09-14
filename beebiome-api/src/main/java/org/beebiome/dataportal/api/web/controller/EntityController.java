package org.beebiome.dataportal.api.web.controller;

import org.beebiome.dataportal.api.core.model.Entity;
import org.beebiome.dataportal.api.core.service.EntityService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EntityController {
    
    @Resource
    EntityService entityService;

    @CrossOrigin
    @GetMapping("/sample/all")
    public List<Entity> getAllSamples() {
        return entityService.getAllEntities();
    }

    @CrossOrigin
    @GetMapping("/sample/{id}")
    public List<Entity> sampleByStudy(@PathVariable String id) {
        return entityService.getEntitiesByBiosampleId(id);
    }

// Note: we add data throw beebiome-script repository    
//    @PostMapping("/sample/create")
//    public Sample getAllSamples(@RequestBody String line) {
//        if (StringUtils.isBlank(line)) {
//            throw new IllegalArgumentException("No blank line");
//        }
//        String[] split = line.split("\t");
//        if (split.length != 14) {
//            throw new IllegalArgumentException("Incorrect number of fields. Should be 14 fields");
//        }
//        Sample g = new Sample(split[0], split[1], split[2], split[3], split[4], split[5], split[6],
//                split[7], split[8], split[9], split[10], split[11], split[12], split[13]);
//        sampleService.createSample(g);
//        return g;
//    }
}
