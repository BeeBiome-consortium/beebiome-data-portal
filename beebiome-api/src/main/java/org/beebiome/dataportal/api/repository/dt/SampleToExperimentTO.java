package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class SampleToExperimentTO {

    private final String biosampleAcc;
    private final String sraAcc;

    public SampleToExperimentTO(String biosampleAcc, String sraAcc) {
        this.biosampleAcc = biosampleAcc;
        this.sraAcc = sraAcc;
    }

    public String getBiosampleAcc() {
        return biosampleAcc;
    }

    public String getSraAcc() {
        return sraAcc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleToExperimentTO that = (SampleToExperimentTO) o;
        return Objects.equals(biosampleAcc, that.biosampleAcc) &&
                Objects.equals(sraAcc, that.sraAcc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(biosampleAcc, sraAcc);
    }
}
