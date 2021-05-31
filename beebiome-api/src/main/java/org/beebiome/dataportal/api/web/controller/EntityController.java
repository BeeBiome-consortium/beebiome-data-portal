package org.beebiome.dataportal.api.web.controller;

import org.beebiome.dataportal.api.core.model.Entity;
import org.beebiome.dataportal.api.core.service.EntityService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping("/sample/{acc}")
    public List<Entity> getSampleByStudy(@PathVariable String acc) {
        return entityService.getEntitiesByBiosampleAcc(acc);
    }
    
    @CrossOrigin
    @RequestMapping(value={"/sample/advanced-search"}, method={RequestMethod.GET, RequestMethod.POST})
    public List<Entity> getSample(@RequestParam(required = false) String bioSampleAcc,
                                  @RequestParam(required = false) String bioProjectAcc,
                                  @RequestParam(required = false) String organism,
                                  @RequestParam(required = false) String host,
                                  @RequestParam(required = false) String collectionDate,
                                  @RequestParam(required = false) String geoLocName,
                                  @RequestParam(required = false) String librarySources,
                                  @RequestParam(required = false) String libraryLayouts,
                                  @RequestParam(required = false) String libraryStrategies,
                                  @RequestParam(required = false) String centerName,
                                  @RequestParam(required = false) String instruments,
                                  @RequestParam(required = false) String biosamplePackageAcc,
                                  @RequestParam(required = false) String biosamplePackageName) {
        return entityService.getEntities(bioSampleAcc, bioProjectAcc, libraryStrategies, centerName,
                instruments, libraryLayouts, librarySources, organism, host, geoLocName, collectionDate,
                biosamplePackageAcc, biosamplePackageName);
    }
}
