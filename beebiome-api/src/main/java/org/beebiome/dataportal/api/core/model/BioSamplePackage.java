package org.beebiome.dataportal.api.core.model;

public class BioSamplePackage {

    private final String id;
    private final String name;
    
    public BioSamplePackage(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
