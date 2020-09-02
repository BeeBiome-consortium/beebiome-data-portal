
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour BioSampleSetType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BioSampleSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BioSample" type="{}BioSampleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BioSampleSetType", propOrder = {
    "bioSample"
})
public class BioSampleSetType {

    @XmlElement(name = "BioSample")
    protected List<BioSampleType> bioSample;

    /**
     * Gets the value of the bioSample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bioSample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBioSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BioSampleType }
     * 
     * 
     */
    public List<BioSampleType> getBioSample() {
        if (bioSample == null) {
            bioSample = new ArrayList<BioSampleType>();
        }
        return this.bioSample;
    }

    public void setBioSample(List<BioSampleType> bioSample) {
        this.bioSample = bioSample == null? new ArrayList<>(): new ArrayList<>(bioSample);
    }
}
