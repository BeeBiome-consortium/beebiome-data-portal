package org.beebiome.dataportal.pipeline.ncbi.biosample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BioSampleSet", propOrder = {
        "bioSamples"
})
@XmlRootElement(name = "BioSampleSet")
public class BioSampleSet {

    @XmlElement(name = "BioSample", required = true)
    protected List<TypeBioSample> bioSamples;

    public List<TypeBioSample> getBioSamples() {
        if (bioSamples == null) {
            bioSamples = new ArrayList<>();
        }
        return bioSamples;
    }
}
