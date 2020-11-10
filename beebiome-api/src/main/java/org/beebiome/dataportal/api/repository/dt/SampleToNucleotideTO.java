package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class SampleToNucleotideTO {

    private final String biosampleAcc;
    private final String nucleotideAcc;

    public SampleToNucleotideTO(String biosampleAcc, String nucleotideAcc) {
        this.biosampleAcc = biosampleAcc;
        this.nucleotideAcc = nucleotideAcc;
    }

    public String getBiosampleAcc() {
        return biosampleAcc;
    }

    public String getNucleotideAcc() {
        return nucleotideAcc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleToNucleotideTO that = (SampleToNucleotideTO) o;
        return Objects.equals(biosampleAcc, that.biosampleAcc) &&
                Objects.equals(nucleotideAcc, that.nucleotideAcc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(biosampleAcc, nucleotideAcc);
    }
}
