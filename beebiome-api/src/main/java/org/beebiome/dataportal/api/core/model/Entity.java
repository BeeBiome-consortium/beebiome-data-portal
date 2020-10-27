package org.beebiome.dataportal.api.core.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Entity {
    
    private final String biosampleAcc;
    private final String bioprojectAcc;
    private final BioSamplePackage biosamplePackage;
    private final String submittingOrganizationName;
    private final Set<LibraryStrategy> libraryStrategies; // such as amplicon, wgs.. https://www.ebi.ac.uk/ena/submit/reads-library-strategy
    private final Set<LibraryLayout> libraryLayouts; // paired single
    private final Set<LibrarySource> librarySources; // genomic, metagenomic... 
    private final Species organism;
    private final Species host;
    private final Set<String> platforms;
    private final String geoLocName;
    private final String collectionDate;
    private final Set<String> experimentAccs;
//    private final Set<String> nucleotideAccs;

    public Entity(String biosampleAcc, String bioprojectAcc, BioSamplePackage biosamplePackage,
                  Set<LibraryStrategy> libraryStrategies, String submittingOrganizationName,
                  Set<LibraryLayout> libraryLayouts, Set<LibrarySource> librarySources, Species organism,
                  Species host, Set<String> platforms,
                  String geoLocName, String collectionDate, Set<String> experimentAccs) {
        this.biosampleAcc = biosampleAcc;
        this.bioprojectAcc = bioprojectAcc;
        this.biosamplePackage = biosamplePackage;
        this.libraryStrategies = Collections.unmodifiableSet(libraryStrategies == null ? new HashSet<>(): new HashSet<>(libraryStrategies));
        this.submittingOrganizationName = submittingOrganizationName;
        this.libraryLayouts =  Collections.unmodifiableSet(libraryLayouts == null ? new HashSet<>(): new HashSet<>(libraryLayouts));
        this.librarySources = librarySources;
        this.organism = organism;
        this.host = host;
        this.platforms = platforms;
        this.geoLocName = geoLocName;
        this.collectionDate = collectionDate;
        this.experimentAccs = Collections.unmodifiableSet(experimentAccs == null ? new HashSet<>(): new HashSet<>(experimentAccs));
    }

    public String getBiosampleAcc() {
        return biosampleAcc;
    }

    public String getBioprojectAcc() {
        return bioprojectAcc;
    }

    public BioSamplePackage getBiosamplePackage() {
        return biosamplePackage;
    }
    
    public Set<LibraryStrategy> getLibraryStrategies() {
        return libraryStrategies;
    }

    public String getSubmittingOrganizationName() {
        return submittingOrganizationName;
    }

    public Set<LibraryLayout> getLibraryLayouts() {
        return libraryLayouts;
    }

    public Set<LibrarySource> getLibrarySources() {
        return librarySources;
    }

    public Species getOrganism() {
        return organism;
    }

    public Species getHost() {
        return host;
    }

    public Set<String> getPlatforms() {
        return platforms;
    }

    public String getGeoLocName() {
        return geoLocName;
    }

    public String getCollectionDate() {
        return collectionDate;
    }
    
    public Set<String> getExperimentAccs() {
        return experimentAccs;
    }
}
