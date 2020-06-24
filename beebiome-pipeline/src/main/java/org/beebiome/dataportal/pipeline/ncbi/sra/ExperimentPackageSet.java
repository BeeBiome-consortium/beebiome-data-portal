package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXPERIMENT_PACKAGE_SET", propOrder = {
        "experimentPackages"
})
@XmlRootElement(name = "EXPERIMENT_PACKAGE_SET")
public class ExperimentPackageSet {
    
    @XmlElement(name = "EXPERIMENT_PACKAGE", required = true)
    protected List<ExperimentPackageType> experimentPackages;

    public List<ExperimentPackageType> getExperimentPackages() {
        if (experimentPackages == null) {
            experimentPackages = new ArrayList<>();
        }
        return this.experimentPackages;
    }
}
