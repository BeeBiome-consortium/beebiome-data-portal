package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class TaxonTO {

    private final Integer id;
    private final String name;

    public TaxonTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxonTO taxonTO = (TaxonTO) o;
        return Objects.equals(id, taxonTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
