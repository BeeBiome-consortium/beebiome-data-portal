
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Reusable attributes to encode tag-value pairs with optional units. 
 * 
 * <p>Classe Java pour AttributeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="TAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType", propOrder = {

})
public class AttributeType {

    @XmlElement(name = "TAG", required = true)
    protected String tag;
    @XmlElement(name = "VALUE")
    protected String value;
    @XmlElement(name = "UNITS")
    protected String units;

    /**
     * Obtient la valeur de la propriété tag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAG() {
        return tag;
    }

    /**
     * Définit la valeur de la propriété tag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAG(String value) {
        this.tag = value;
    }

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUE() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUE(String value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété units.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITS() {
        return units;
    }

    /**
     * Définit la valeur de la propriété units.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITS(String value) {
        this.units = value;
    }

}
