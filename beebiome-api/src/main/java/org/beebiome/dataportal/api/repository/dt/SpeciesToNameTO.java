package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class SpeciesToNameTO {

    private final Integer speciesId;
    private final String name;

    public SpeciesToNameTO(Integer speciesId, String name) {
        this.speciesId = speciesId;
        this.name = name;
    }

    public Integer getSpeciesId() {
        return speciesId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpeciesToNameTO that = (SpeciesToNameTO) o;
        return Objects.equals(speciesId, that.speciesId) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speciesId, name);
    }
}
