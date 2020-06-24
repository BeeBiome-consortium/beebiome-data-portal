
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The typeLink represents links between archived objects. If link is
 *                 submitted together with archive object(s) user or local ids can be used. Those will
 *                 be resolved once archive objects are accessioned. 
 * 
 * <p>Classe Java pour typeLink complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="From" type="{SP.common}typeRefId"/>
 *         &lt;element name="To" type="{SP.common}typeRefId"/>
 *         &lt;element name="Attributes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeLink", namespace = "SP.common", propOrder = {
    "from",
    "to",
    "attributes"
})
public class TypeLink {

    @XmlElement(name = "From", required = true)
    protected TypeRefId from;
    @XmlElement(name = "To", required = true)
    protected TypeRefId to;
    @XmlElement(name = "Attributes")
    protected Object attributes;

    /**
     * Obtient la valeur de la propriété from.
     * 
     * @return
     *     possible object is
     *     {@link TypeRefId }
     *     
     */
    public TypeRefId getFrom() {
        return from;
    }

    /**
     * Définit la valeur de la propriété from.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRefId }
     *     
     */
    public void setFrom(TypeRefId value) {
        this.from = value;
    }

    /**
     * Obtient la valeur de la propriété to.
     * 
     * @return
     *     possible object is
     *     {@link TypeRefId }
     *     
     */
    public TypeRefId getTo() {
        return to;
    }

    /**
     * Définit la valeur de la propriété to.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRefId }
     *     
     */
    public void setTo(TypeRefId value) {
        this.to = value;
    }

    /**
     * Obtient la valeur de la propriété attributes.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAttributes() {
        return attributes;
    }

    /**
     * Définit la valeur de la propriété attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAttributes(Object value) {
        this.attributes = value;
    }

}
