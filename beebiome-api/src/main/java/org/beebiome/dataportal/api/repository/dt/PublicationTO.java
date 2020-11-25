package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class PublicationTO {

    // FIXME use PublicationSource
    public enum PublicationSource {
        PUBMED,
        DOI
    }
    private final String accession;
    private final String source;

    public PublicationTO(String accession, String source) {
        this.accession = accession;
        this.source = source;
    }

    public String getAccession() {
        return accession;
    }

    public String getSource() {
        return source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublicationTO that = (PublicationTO) o;
        return Objects.equals(accession, that.accession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accession);
    }
}
