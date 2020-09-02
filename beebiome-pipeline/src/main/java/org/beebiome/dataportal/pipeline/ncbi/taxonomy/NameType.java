
package org.beebiome.dataportal.pipeline.ncbi.taxonomy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NameType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassCDE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="authority"/>
 *               &lt;enumeration value="unpublished name"/>
 *               &lt;enumeration value="misspelling"/>
 *               &lt;enumeration value="type material"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DispName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType", propOrder = {
    "classCDE",
    "dispName"
})
public class NameType {

    @XmlElement(name = "ClassCDE", required = true)
    protected String classCDE;
    @XmlElement(name = "DispName", required = true)
    protected String dispName;

    /**
     * Obtient la valeur de la propriété classCDE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCDE() {
        return classCDE;
    }

    /**
     * Définit la valeur de la propriété classCDE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCDE(String value) {
        this.classCDE = value;
    }

    /**
     * Obtient la valeur de la propriété dispName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispName() {
        return dispName;
    }

    /**
     * Définit la valeur de la propriété dispName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispName(String value) {
        this.dispName = value;
    }

}
