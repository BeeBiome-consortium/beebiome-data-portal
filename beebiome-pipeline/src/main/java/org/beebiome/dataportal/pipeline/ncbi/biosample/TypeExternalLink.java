
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeExternalLink complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeExternalLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="ExternalID" type="{SP.common}typePrimaryId"/>
 *         &lt;element name="EntrezQuery" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeExternalLink", namespace = "SP.common", propOrder = {
    "url",
    "externalID",
    "entrezQuery"
})
public class TypeExternalLink {

    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "ExternalID")
    protected TypePrimaryId externalID;
    @XmlElement(name = "EntrezQuery")
    protected String entrezQuery;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "category")
    protected String category;

    /**
     * Obtient la valeur de la propriété url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Définit la valeur de la propriété url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Obtient la valeur de la propriété externalID.
     * 
     * @return
     *     possible object is
     *     {@link TypePrimaryId }
     *     
     */
    public TypePrimaryId getExternalID() {
        return externalID;
    }

    /**
     * Définit la valeur de la propriété externalID.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePrimaryId }
     *     
     */
    public void setExternalID(TypePrimaryId value) {
        this.externalID = value;
    }

    /**
     * Obtient la valeur de la propriété entrezQuery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrezQuery() {
        return entrezQuery;
    }

    /**
     * Définit la valeur de la propriété entrezQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrezQuery(String value) {
        this.entrezQuery = value;
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
     * Obtient la valeur de la propriété category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Définit la valeur de la propriété category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

}
