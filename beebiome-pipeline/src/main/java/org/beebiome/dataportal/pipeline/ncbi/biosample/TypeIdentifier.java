
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeIdentifier complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryId" type="{SP.common}typePrimaryId" minOccurs="0"/>
 *         &lt;element name="SPUID" type="{SP.common}typeSPUID" minOccurs="0"/>
 *         &lt;element name="LocalId" type="{SP.common}typeLocalId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeIdentifier", namespace = "SP.common", propOrder = {
    "primaryId",
    "spuid",
    "localId"
})
public class TypeIdentifier {

    @XmlElement(name = "PrimaryId")
    protected TypePrimaryId primaryId;
    @XmlElement(name = "SPUID")
    protected TypeSPUID spuid;
    @XmlElement(name = "LocalId")
    protected TypeLocalId localId;

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

}
