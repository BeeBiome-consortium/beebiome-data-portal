
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Reference to a record inside NCBI database or in Submission Portal.
 *             
 * 
 * <p>Classe Java pour typeRefId complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeRefId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="LocalId" type="{SP.common}typeLocalId" minOccurs="0"/>
 *         &lt;element name="SPUID" type="{SP.common}typeSPUID" minOccurs="0"/>
 *         &lt;element name="PrimaryId" type="{SP.common}typePrimaryId" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRefId", namespace = "SP.common", propOrder = {
    "localId",
    "spuid",
    "primaryId"
})
public class TypeRefId {

    @XmlElement(name = "LocalId")
    protected TypeLocalId localId;
    @XmlElement(name = "SPUID")
    protected TypeSPUID spuid;
    @XmlElement(name = "PrimaryId")
    protected TypePrimaryId primaryId;

    /**
     * Obtient la valeur de la propriété localId.
     * 
     * @return
     *     possible object is
     *     {@link TypeLocalId }
     *     
     */
    public TypeLocalId getLocalId() {
        return localId;
    }

    /**
     * Définit la valeur de la propriété localId.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLocalId }
     *     
     */
    public void setLocalId(TypeLocalId value) {
        this.localId = value;
    }

    /**
     * Obtient la valeur de la propriété spuid.
     * 
     * @return
     *     possible object is
     *     {@link TypeSPUID }
     *     
     */
    public TypeSPUID getSPUID() {
        return spuid;
    }

    /**
     * Définit la valeur de la propriété spuid.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSPUID }
     *     
     */
    public void setSPUID(TypeSPUID value) {
        this.spuid = value;
    }

    /**
     * Obtient la valeur de la propriété primaryId.
     * 
     * @return
     *     possible object is
     *     {@link TypePrimaryId }
     *     
     */
    public TypePrimaryId getPrimaryId() {
        return primaryId;
    }

    /**
     * Définit la valeur de la propriété primaryId.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePrimaryId }
     *     
     */
    public void setPrimaryId(TypePrimaryId value) {
        this.primaryId = value;
    }

}
