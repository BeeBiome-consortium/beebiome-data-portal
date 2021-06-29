package org.beebiome.dataportal.api.core.model;

public class GeoLocation {
    
    private String latitude;
    private String longitude;
    private String name;

    public GeoLocation(String latitude, String longitude, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }
}
