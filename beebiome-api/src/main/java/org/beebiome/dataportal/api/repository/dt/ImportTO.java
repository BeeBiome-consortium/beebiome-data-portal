package org.beebiome.dataportal.api.repository.dt;

import org.beebiome.dataportal.utils.BeebiomeUtils;

import java.util.Collection;
import java.util.Set;

public class ImportTO {

    private final Set<TaxonTO> taxonTOs;
    private final Set<SpeciesTO> speciesTOs;
    private final Set<SpeciesToNameTO> speciesToNameTOs;
    private final Set<GeoLocationTO> geoLocationTOs;
    private final Set<PublicationTO> publicationTOs;
    private final Set<ProjectTO> projectTOs;
    private final Set<ProjectToPublicationTO> projectToPublicationTOs;
    private final Set<BiosamplePackageTO> biosamplePackageTOs;
    //    private final Set<RecommendationTO> recommendationTOs;
    private final Set<SampleTO> sampleTOs;
    private final Set<ProjectToSampleTO> projectToSampleTOs;
    //    private final Set<SampleToRecommendationTO> sampleToRecommendationTOs;
    private final Set<ExperimentTO> experimentTOs;
    private final Set<SampleToExperimentTO> sampleToExperimentTOs;

    public ImportTO(Collection<TaxonTO> taxonTOs, Collection<SpeciesTO> speciesTOs,
                    Collection<SpeciesToNameTO> speciesToNameTOs, Collection<GeoLocationTO> geoLocationTOs,
                    Collection<PublicationTO> publicationTOs, Collection<ProjectTO> projectTOs,
                    Collection<ProjectToPublicationTO> projectToPublicationTOs,
                    Collection<BiosamplePackageTO> biosamplePackageTOs, Collection<SampleTO> sampleTOs,
                    Collection<ProjectToSampleTO> projectToSampleTOs, Collection<ExperimentTO> experimentTOs,
                    Collection<SampleToExperimentTO> sampleToExperimentTOs) {
        this.taxonTOs = BeebiomeUtils.getUnmodifiableSet(taxonTOs);
        this.speciesTOs = BeebiomeUtils.getUnmodifiableSet(speciesTOs);
        this.speciesToNameTOs = BeebiomeUtils.getUnmodifiableSet(speciesToNameTOs);
        this.geoLocationTOs = BeebiomeUtils.getUnmodifiableSet(geoLocationTOs);
        this.publicationTOs = BeebiomeUtils.getUnmodifiableSet(publicationTOs);
        this.projectTOs = BeebiomeUtils.getUnmodifiableSet(projectTOs);
        this.projectToPublicationTOs = BeebiomeUtils.getUnmodifiableSet(projectToPublicationTOs);
        this.biosamplePackageTOs = BeebiomeUtils.getUnmodifiableSet(biosamplePackageTOs);
        this.sampleTOs = BeebiomeUtils.getUnmodifiableSet(sampleTOs);
        this.projectToSampleTOs = BeebiomeUtils.getUnmodifiableSet(projectToSampleTOs);
        this.experimentTOs = BeebiomeUtils.getUnmodifiableSet(experimentTOs);
        this.sampleToExperimentTOs = BeebiomeUtils.getUnmodifiableSet(sampleToExperimentTOs);
    }

    public Set<TaxonTO> getTaxonTOs() {
        return taxonTOs;
    }

    public Set<SpeciesTO> getSpeciesTOs() {
        return speciesTOs;
    }

    public Set<SpeciesToNameTO> getSpeciesToNameTOs() {
        return speciesToNameTOs;
    }

    public Set<GeoLocationTO> getGeoLocationTOs() {
        return geoLocationTOs;
    }

    public Set<PublicationTO> getPublicationTOs() {
        return publicationTOs;
    }

    public Set<ProjectTO> getProjectTOs() {
        return projectTOs;
    }

    public Set<ProjectToPublicationTO> getProjectToPublicationTOs() {
        return projectToPublicationTOs;
    }

    public Set<BiosamplePackageTO> getBiosamplePackageTOs() {
        return biosamplePackageTOs;
    }

    public Set<SampleTO> getSampleTOs() {
        return sampleTOs;
    }

    public Set<ProjectToSampleTO> getProjectToSampleTOs() {
        return projectToSampleTOs;
    }

    public Set<ExperimentTO> getExperimentTOs() {
        return experimentTOs;
    }

    public Set<SampleToExperimentTO> getSampleToExperimentTOs() {
        return sampleToExperimentTOs;
    }
}
