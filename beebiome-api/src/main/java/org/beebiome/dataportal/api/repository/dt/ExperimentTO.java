package org.beebiome.dataportal.api.repository.dt;

import java.util.Objects;

public class ExperimentTO {
    
    private final String sraAcc;
    private final String title;
    private final String platform;
    private final String libraryStrategy;
    private final String libraryLayout;
    private final String librarySource;

    public ExperimentTO(String sraAcc) {
        this(sraAcc, null, null, null, null, null);
    }

    public ExperimentTO(String sraAcc, String title, String platform,
                        String libraryStrategy, String libraryLayout, String librarySource) {
        this.sraAcc = sraAcc;
        this.title = title;
        this.platform = platform;
        this.libraryStrategy = libraryStrategy;
        this.libraryLayout = libraryLayout;
        this.librarySource = librarySource;
    }

    public String getSraAcc() {
        return sraAcc;
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public String getLibraryStrategy() {
        return libraryStrategy;
    }

    public String getLibraryLayout() {
        return libraryLayout;
    }

    public String getLibrarySource() {
        return librarySource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExperimentTO that = (ExperimentTO) o;
        return Objects.equals(sraAcc, that.sraAcc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sraAcc);
    }
}
