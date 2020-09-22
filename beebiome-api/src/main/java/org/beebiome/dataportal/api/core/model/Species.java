package org.beebiome.dataportal.api.core.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Species {
    
    private final int id;
    private final String scientificName;
    private final Integer parentTaxId;
    private final Integer parentSpeciesId;
    private final Boolean isApoidea;
    private final Set<String> names;

    public Species(int id, String scientificName) {
        this(id, scientificName, null, null, null, null);
    }

    public Species(int id, String scientificName, Integer parentTaxId, Integer parentSpeciesId,
                   Boolean isApoidea, Set<String> names) {
        this.id = id;
        this.scientificName = scientificName;
        this.parentTaxId = parentTaxId;
        this.parentSpeciesId = parentSpeciesId;
        this.isApoidea = isApoidea;
        this.names =  Collections.unmodifiableSet(names == null ? new HashSet<>(): new HashSet<>(names));
    }

    public int getId() {
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

    public Set<String> getNames() {
        return names;
    }
}
