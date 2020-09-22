package org.beebiome.dataportal.api.repository.dt;

import java.time.LocalDate;
import java.util.Objects;

public class ProjectTO {

    private final String bioprojectAcc;
    private final String title;
    private final String description;
    private final LocalDate submissionDate;
    private final LocalDate updateDate;
    private final String submittingOrganizationName;
    private final String grantId;
    private final String grantTitle;
    private final String grantAgency;

    public ProjectTO(String bioprojectAcc) {
        this(bioprojectAcc, null, null, null, null, null, null, null, null);
    }

    public ProjectTO(String bioprojectAcc, String title, String description,
                     LocalDate submissionDate, LocalDate updateDate, String submittingOrganizationName,
                     String grantId, String grantTitle, String grantAgency) {
        this.bioprojectAcc = bioprojectAcc;
        this.title = title;
        this.description = description;
        this.submissionDate = submissionDate;
        this.updateDate = updateDate;
        this.submittingOrganizationName = submittingOrganizationName;
        this.grantId = grantId;
        this.grantTitle = grantTitle;
        this.grantAgency = grantAgency;
    }

    public String getBioprojectAcc() {
        return bioprojectAcc;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public String getSubmittingOrganizationName() {
        return submittingOrganizationName;
    }

    public String getGrantId() {
        return grantId;
    }

    public String getGrantTitle() {
        return grantTitle;
    }

    public String getGrantAgency() {
        return grantAgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectTO projectTO = (ProjectTO) o;
        return Objects.equals(bioprojectAcc, projectTO.bioprojectAcc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bioprojectAcc);
    }
}
