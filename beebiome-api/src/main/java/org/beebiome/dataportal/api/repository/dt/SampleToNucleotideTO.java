package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class SampleToNucleotideTO {

    private final String biosampleAcc;
    private final String nucleotideLink;

    public SampleToNucleotideTO(String biosampleAcc, String nucleotideLink) {
        this.biosampleAcc = biosampleAcc;
        this.nucleotideLink = nucleotideLink;
    }

    public String getBiosampleAcc() {
        return biosampleAcc;
    }

    public String getNucleotideLink() {
        return nucleotideLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleToNucleotideTO that = (SampleToNucleotideTO) o;
        return Objects.equals(biosampleAcc, that.biosampleAcc) &&
                Objects.equals(nucleotideLink, that.nucleotideLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(biosampleAcc, nucleotideLink);
    }
}
