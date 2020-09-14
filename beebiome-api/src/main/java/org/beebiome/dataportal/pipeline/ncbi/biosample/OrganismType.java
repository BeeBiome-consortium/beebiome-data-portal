
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OrganismType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OrganismType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganismName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="taxonomy_id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="taxonomy_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganismType", propOrder = {
    "organismName"
})
public class OrganismType {

    @XmlElement(name = "OrganismName", required = true)
    protected String organismName;
    @XmlAttribute(name = "taxonomy_id")
    protected Integer taxonomyId;
    @XmlAttribute(name = "taxonomy_name")
    protected String taxonomyName;

    /**
     * Obtient la valeur de la propriété organismName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganismName() {
        return organismName;
    }

    /**
     * Définit la valeur de la propriété organismName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganismName(String value) {
        this.organismName = value;
    }

    /**
     * Obtient la valeur de la propriété taxonomyId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxonomyId() {
        return taxonomyId;
    }

    /**
     * Définit la valeur de la propriété taxonomyId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxonomyId(Integer value) {
        this.taxonomyId = value;
    }

    /**
     * Obtient la valeur de la propriété taxonomyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxonomyName() {
        return taxonomyName;
    }

    /**
     * Définit la valeur de la propriété taxonomyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxonomyName(String value) {
        this.taxonomyName = value;
    }

}
