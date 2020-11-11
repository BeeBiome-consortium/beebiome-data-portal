package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;
import java.util.StringJoiner;

public class ProjectToSampleTO {

    private final Integer bioprojectId;
    private final Integer biosampleId;

    public ProjectToSampleTO(Integer bioprojectId, Integer biosampleId) {
        this.bioprojectId = bioprojectId;
        this.biosampleId = biosampleId;
    }

    public Integer getBioprojectId() {
        return bioprojectId;
    }

    public Integer getBiosampleId() {
        return biosampleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectToSampleTO that = (ProjectToSampleTO) o;
        return Objects.equals(bioprojectId, that.bioprojectId) &&
                Objects.equals(biosampleId, that.biosampleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bioprojectId, biosampleId);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ProjectToSampleTO.class.getSimpleName() + "[", "]")
                .add("bioprojectId='" + bioprojectId + "'")
                .add("biosampleId='" + biosampleId + "'")
                .toString();
    }
}
