package org.beebiome.dataportal.core.service;

import org.beebiome.dataportal.core.model.Greeting;
import org.beebiome.dataportal.repository.api.GreetingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GreetingService {

    public List<Greeting> getAllGreetings();

    public void createGreeting(Greeting g);
}
