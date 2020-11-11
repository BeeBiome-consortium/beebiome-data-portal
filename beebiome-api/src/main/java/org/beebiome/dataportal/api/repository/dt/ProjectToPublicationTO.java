package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class ProjectToPublicationTO {
    
    private final Integer bioprojectId;
    private final String publicationAcc;

    public ProjectToPublicationTO(Integer bioprojectId, String publicationAcc) {
        this.bioprojectId = bioprojectId;
        this.publicationAcc = publicationAcc;
    }

    public Integer getBioprojectId() {
        return bioprojectId;
    }

    public String getPublicationAcc() {
        return publicationAcc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectToPublicationTO that = (ProjectToPublicationTO) o;
        return Objects.equals(bioprojectId, that.bioprojectId) &&
                Objects.equals(publicationAcc, that.publicationAcc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bioprojectId, publicationAcc);
    }
}
