package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class GeoLocationTO {
    private final String id;
    private final String latitude;
    private final String longitude;
    private final String name;

    public GeoLocationTO(String id) {
        this(id, null, null, null);
    }

    public GeoLocationTO(String id, String latitude, String longitude, String name) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public String getId() {
        return id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoLocationTO that = (GeoLocationTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
