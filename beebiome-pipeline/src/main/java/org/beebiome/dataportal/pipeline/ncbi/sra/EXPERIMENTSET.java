
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  An EXPERMENT_SET is a container for a set of experiments and a common namespace. 
 * 
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPERIMENT" type="{}ExperimentType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "experiment"
})
@XmlRootElement(name = "EXPERIMENT_SET")
public class EXPERIMENTSET {

    @XmlElement(name = "EXPERIMENT", required = true)
    protected List<ExperimentType> experiment;

    /**
     * Gets the value of the experiment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experiment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXPERIMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimentType }
     * 
     * 
     */
    public List<ExperimentType> getEXPERIMENT() {
        if (experiment == null) {
            experiment = new ArrayList<ExperimentType>();
        }
        return this.experiment;
    }

}
