package org.beebiome.dataportal.core.service.impl;

import org.beebiome.dataportal.core.model.Greeting;
import org.beebiome.dataportal.core.service.GreetingService;
import org.beebiome.dataportal.repository.api.GreetingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService {
    
    @Autowired
    private GreetingDao dao;

    public List<Greeting> getAllGreetings() {
        return dao.findAll();
    }

    public void createGreeting(Greeting g) {
        dao.insertGreeting(g);
    }
}
