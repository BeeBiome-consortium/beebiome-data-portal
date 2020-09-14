
package org.beebiome.dataportal.pipeline.ncbi.taxonomy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GeneticCodeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneticCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GCId" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="GCName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneticCodeType", propOrder = {
    "gcId",
    "gcName"
})
public class GeneticCodeType {

    @XmlElement(name = "GCId")
    protected byte gcId;
    @XmlElement(name = "GCName", required = true)
    protected String gcName;

    /**
     * Obtient la valeur de la propriété gcId.
     * 
     */
    public byte getGCId() {
        return gcId;
    }

    /**
     * Définit la valeur de la propriété gcId.
     * 
     */
    public void setGCId(byte value) {
        this.gcId = value;
    }

    /**
     * Obtient la valeur de la propriété gcName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGCName() {
        return gcName;
    }

    /**
     * Définit la valeur de la propriété gcName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGCName(String value) {
        this.gcName = value;
    }

}
