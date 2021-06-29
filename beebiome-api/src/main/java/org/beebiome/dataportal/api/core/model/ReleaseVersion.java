package org.beebiome.dataportal.api.core.model;

import java.time.LocalDate;

public class ReleaseVersion {

    private final LocalDate date;
    private final String name;

    public ReleaseVersion(LocalDate date, String name) {
        this.date = date;
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
