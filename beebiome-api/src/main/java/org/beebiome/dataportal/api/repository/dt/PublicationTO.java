package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class PublicationTO {
    
    private final String accession;
    private final String publicationSource;

    public PublicationTO(String accession) {
        this(accession, null);
    }

    public PublicationTO(String accession, String publicationSource) {
        this.accession = accession;
        this.publicationSource = publicationSource;
    }

    public String getAccession() {
        return accession;
    }

    public String getPublicationSource() {
        return publicationSource;
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
