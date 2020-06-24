
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeOrganism complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeOrganism">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganismName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Strain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsolateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Breed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cultivar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="taxonomy_id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOrganism", namespace = "SP.common", propOrder = {
    "organismName",
    "label",
    "strain",
    "isolateName",
    "breed",
    "cultivar"
})
public class TypeOrganism {

    @XmlElement(name = "OrganismName", required = true)
    protected String organismName;
    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "Strain")
    protected String strain;
    @XmlElement(name = "IsolateName")
    protected String isolateName;
    @XmlElement(name = "Breed")
    protected String breed;
    @XmlElement(name = "Cultivar")
    protected String cultivar;
    @XmlAttribute(name = "taxonomy_id")
    protected Integer taxonomyId;

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
     * Obtient la valeur de la propriété label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Définit la valeur de la propriété label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtient la valeur de la propriété strain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrain() {
        return strain;
    }

    /**
     * Définit la valeur de la propriété strain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrain(String value) {
        this.strain = value;
    }

    /**
     * Obtient la valeur de la propriété isolateName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsolateName() {
        return isolateName;
    }

    /**
     * Définit la valeur de la propriété isolateName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsolateName(String value) {
        this.isolateName = value;
    }

    /**
     * Obtient la valeur de la propriété breed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Définit la valeur de la propriété breed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreed(String value) {
        this.breed = value;
    }

    /**
     * Obtient la valeur de la propriété cultivar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCultivar() {
        return cultivar;
    }

    /**
     * Définit la valeur de la propriété cultivar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCultivar(String value) {
        this.cultivar = value;
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

}
