
package org.beebiome.dataportal.pipeline.ncbi.taxonomy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MitoGeneticCodeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MitoGeneticCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MGCId" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="MGCName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MitoGeneticCodeType", propOrder = {
    "mgcId",
    "mgcName"
})
public class MitoGeneticCodeType {

    @XmlElement(name = "MGCId")
    protected byte mgcId;
    @XmlElement(name = "MGCName", required = true)
    protected String mgcName;

    /**
     * Obtient la valeur de la propriété mgcId.
     * 
     */
    public byte getMGCId() {
        return mgcId;
    }

    /**
     * Définit la valeur de la propriété mgcId.
     * 
     */
    public void setMGCId(byte value) {
        this.mgcId = value;
    }

    /**
     * Obtient la valeur de la propriété mgcName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGCName() {
        return mgcName;
    }

    /**
     * Définit la valeur de la propriété mgcName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGCName(String value) {
        this.mgcName = value;
    }

}
