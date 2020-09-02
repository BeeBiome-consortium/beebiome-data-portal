package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class ProjectToPublicationTO {
    
    private final String bioprojectAcc;
    private final String publicationAcc;

    public ProjectToPublicationTO(String bioprojectAcc, String publicationAcc) {
        this.bioprojectAcc = bioprojectAcc;
        this.publicationAcc = publicationAcc;
    }

    public String getBioprojectAcc() {
        return bioprojectAcc;
    }

    public String getPublicationAcc() {
        return publicationAcc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectToPublicationTO that = (ProjectToPublicationTO) o;
        return Objects.equals(bioprojectAcc, that.bioprojectAcc) &&
                Objects.equals(publicationAcc, that.publicationAcc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bioprojectAcc, publicationAcc);
    }
}
