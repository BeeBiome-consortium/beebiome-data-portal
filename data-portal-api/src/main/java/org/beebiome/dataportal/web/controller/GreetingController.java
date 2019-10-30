package org.beebiome.dataportal.web.controller;

import org.beebiome.dataportal.core.model.Greeting;
import org.beebiome.dataportal.core.service.GreetingService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    
    @Resource
    GreetingService serv;
    
    private static final String template = "Hello, %s!";
    
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @CrossOrigin
    @GetMapping("/greeting/all")
    public List<Greeting> getAllGreetings() {
        return serv.getAllGreetings();
    }

    @PostMapping("/greeting/create")
    public Greeting getAllGreetings(@RequestBody String name) {
        Greeting g = new Greeting(counter.incrementAndGet() + 10, name);
        serv.createGreeting(g);
        return g;
    }
}
