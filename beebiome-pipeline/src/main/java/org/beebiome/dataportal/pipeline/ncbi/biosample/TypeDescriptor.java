
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeDescriptor complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{SP.common}typeBlock" minOccurs="0"/>
 *         &lt;element name="ExternalLink" type="{SP.common}typeExternalLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeDescriptor", namespace = "SP.common", propOrder = {
    "title",
    "description",
    "externalLink"
})
public class TypeDescriptor {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Description")
    protected TypeBlock description;
    @XmlElement(name = "ExternalLink")
    protected List<TypeExternalLink> externalLink;

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link TypeBlock }
     *     
     */
    public TypeBlock getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBlock }
     *     
     */
    public void setDescription(TypeBlock value) {
        this.description = value;
    }

    /**
     * Gets the value of the externalLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeExternalLink }
     * 
     * 
     */
    public List<TypeExternalLink> getExternalLink() {
        if (externalLink == null) {
            externalLink = new ArrayList<TypeExternalLink>();
        }
        return this.externalLink;
    }

}
