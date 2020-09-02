package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class SpeciesTO {

    private final Integer id;
    private final String scientificName;
    private final Integer parentTaxId;
    private final Integer parentSpeciesId;
    private final Boolean isApoidea;

    public SpeciesTO(Integer id, String scientificName, Integer parentTaxId, Integer parentSpeciesId,
                     Boolean isApoidea) {
        this.id = id;
        this.scientificName = scientificName;
        this.parentTaxId = parentTaxId;
        this.parentSpeciesId = parentSpeciesId;
        this.isApoidea = isApoidea;
    }

    public Integer getId() {
        return id;
    }

    public String getScientificName() {
        return scientificName;
    }

    public Integer getParentTaxId() {
        return parentTaxId;
    }

    public Integer getParentSpeciesId() {
        return parentSpeciesId;
    }

    public Boolean isApoidea() {
        return isApoidea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpeciesTO speciesTO = (SpeciesTO) o;
        return Objects.equals(id, speciesTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
