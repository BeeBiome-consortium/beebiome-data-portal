package org.beebiome.dataportal.api.core.model;

public class Sample {
    private final String id;
    private final String study;
    private final String assayType;
    private final String centerName;
    private final String instrument;
    private final String libraryLayout;
    private final String librarySource;
    private final String organism;
    private final String platform;
    private final String geoLocName;
    private final String collectionDate;

    public Sample(String id, String study, String assayType, String centerName, String instrument,
                  String libraryLayout, String librarySource, String organism, String platform,
                  String geoLocName, String collectionDate) {
        this.id = id;
        this.study = study;
        this.assayType = assayType;
        this.centerName = centerName;
        this.instrument = instrument;
        this.libraryLayout = libraryLayout;
        this.librarySource = librarySource;
        this.organism = organism;
        this.platform = platform;
        this.geoLocName = geoLocName;
        this.collectionDate = collectionDate;
    }

    public String getId() {
        return id;
    }

    public String getStudy() {
        return study;
    }

    public String getAssayType() {
        return assayType;
    }

    public String getCenterName() {
        return centerName;
    }

    public String getInstrument() {
        return instrument;
    }

    public String getLibraryLayout() {
        return libraryLayout;
    }

    public String getLibrarySource() {
        return librarySource;
    }

    public String getOrganism() {
        return organism;
    }

    public String getPlatform() {
        return platform;
    }

    public String getGeoLocName() {
        return geoLocName;
    }

    public String getCollectionDate() {
        return collectionDate;
    }
    
}
