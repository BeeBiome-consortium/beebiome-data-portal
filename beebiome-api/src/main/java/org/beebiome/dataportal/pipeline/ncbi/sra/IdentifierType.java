
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of record identifiers.
 * 
 * <p>Classe Java pour IdentifierType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRIMARY_ID" type="{}NameAndLabelType" minOccurs="0"/>
 *         &lt;element name="SECONDARY_ID" type="{}NameAndLabelType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EXTERNAL_ID" type="{}QualifiedNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SUBMITTER_ID" type="{}QualifiedNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UUID" type="{}NameAndLabelType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", propOrder = {
    "primaryid",
    "secondaryid",
    "externalid",
    "submitterid",
    "uuid"
})
public class IdentifierType {

    @XmlElement(name = "PRIMARY_ID")
    protected NameAndLabelType primaryid;
    @XmlElement(name = "SECONDARY_ID")
    protected List<NameAndLabelType> secondaryid;
    @XmlElement(name = "EXTERNAL_ID")
    protected List<QualifiedNameType> externalid;
    @XmlElement(name = "SUBMITTER_ID")
    protected List<QualifiedNameType> submitterid;
    @XmlElement(name = "UUID")
    protected List<NameAndLabelType> uuid;

    /**
     * Obtient la valeur de la propriété primaryid.
     * 
     * @return
     *     possible object is
     *     {@link NameAndLabelType }
     *     
     */
    public NameAndLabelType getPRIMARYID() {
        return primaryid;
    }

    /**
     * Définit la valeur de la propriété primaryid.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndLabelType }
     *     
     */
    public void setPRIMARYID(NameAndLabelType value) {
        this.primaryid = value;
    }

    /**
     * Gets the value of the secondaryid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSECONDARYID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameAndLabelType }
     * 
     * 
     */
    public List<NameAndLabelType> getSECONDARYID() {
        if (secondaryid == null) {
            secondaryid = new ArrayList<NameAndLabelType>();
        }
        return this.secondaryid;
    }

    /**
     * Gets the value of the externalid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXTERNALID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedNameType }
     * 
     * 
     */
    public List<QualifiedNameType> getEXTERNALID() {
        if (externalid == null) {
            externalid = new ArrayList<QualifiedNameType>();
        }
        return this.externalid;
    }

    /**
     * Gets the value of the submitterid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submitterid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSUBMITTERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedNameType }
     * 
     * 
     */
    public List<QualifiedNameType> getSUBMITTERID() {
        if (submitterid == null) {
            submitterid = new ArrayList<QualifiedNameType>();
        }
        return this.submitterid;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uuid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameAndLabelType }
     * 
     * 
     */
    public List<NameAndLabelType> getUUID() {
        if (uuid == null) {
            uuid = new ArrayList<NameAndLabelType>();
        }
        return this.uuid;
    }

}
