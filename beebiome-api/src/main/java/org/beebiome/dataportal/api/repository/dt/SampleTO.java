package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class SampleTO {

    private final Integer biosampleId;
    private final String biosampleAcc;
    private final String biosamplePackageId;
    private final String locationId;
    private final Integer speciesId;
    private final Integer hostSpeciesId;
    private final String collectionDate;
    private final Integer nucleotideCount;

    public SampleTO(Integer biosampleId, String biosampleAcc, String biosamplePackageId, String locationId,
                    Integer speciesId, Integer hostSpeciesId, String collectionDate,
                    Integer nucleotideCount) {
        this.biosampleId = biosampleId;
        this.biosampleAcc = biosampleAcc;
        this.biosamplePackageId = biosamplePackageId;
        this.locationId = locationId;
        this.speciesId = speciesId;
        this.hostSpeciesId = hostSpeciesId;
        this.collectionDate = collectionDate;
        this.nucleotideCount = nucleotideCount;
    }

    public Integer getBiosampleId() {
        return biosampleId;
    }

    public String getBiosampleAcc() {
        return biosampleAcc;
    }

    public String getBiosamplePackageId() {
        return biosamplePackageId;
    }

    public String getLocationId() {
        return locationId;
    }

    public Integer getSpeciesId() {
        return speciesId;
    }

    public Integer getHostSpeciesId() {
        return hostSpeciesId;
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public Integer getNucleotideCount() {
        return nucleotideCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleTO sampleTO = (SampleTO) o;
        return Objects.equals(biosampleId, sampleTO.biosampleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(biosampleId);
    }
}
