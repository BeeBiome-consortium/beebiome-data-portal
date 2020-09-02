package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class RecommendationTO {

    private final String id;
    private final String name;

    public RecommendationTO(String id) {
        this(id, null);
    }

    public RecommendationTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecommendationTO that = (RecommendationTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
