package org.beebiome.dataportal.repository.api;

import org.beebiome.dataportal.core.model.Greeting;

import java.util.List;

public interface GreetingDao {

    List<Greeting> findAll();

    void insertGreeting(Greeting g);

    void updateGreeting(Greeting g);

    void executeUpdateGreeting(Greeting g);

    public void deleteGreeting(Greeting g);

}
