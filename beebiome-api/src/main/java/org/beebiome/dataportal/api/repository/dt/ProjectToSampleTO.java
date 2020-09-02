package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class ProjectToSampleTO {

    private final String bioprojectAcc;
    private final String biosampleAcc;

    public ProjectToSampleTO(String bioprojectAcc, String biosampleAcc) {
        this.bioprojectAcc = bioprojectAcc;
        this.biosampleAcc = biosampleAcc;
    }

    public String getBioprojectAcc() {
        return bioprojectAcc;
    }

    public String getBiosampleAcc() {
        return biosampleAcc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectToSampleTO that = (ProjectToSampleTO) o;
        return Objects.equals(bioprojectAcc, that.bioprojectAcc) &&
                Objects.equals(biosampleAcc, that.biosampleAcc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bioprojectAcc, biosampleAcc);
    }
}
