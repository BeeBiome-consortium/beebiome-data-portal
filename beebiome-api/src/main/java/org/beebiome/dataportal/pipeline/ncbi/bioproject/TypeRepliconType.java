
package org.beebiome.dataportal.pipeline.ncbi.bioproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                         Replicon type is a text inside of element. Location and isSingle are attributes.
 *                     
 * 
 * <p>Classe Java pour typeRepliconType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeRepliconType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>typeRepliconMolType">
 *       &lt;attribute name="location" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="eNuclearProkaryote"/>
 *             &lt;enumeration value="eMacronuclear"/>
 *             &lt;enumeration value="eNucleomorph"/>
 *             &lt;enumeration value="eMitochondrion"/>
 *             &lt;enumeration value="eKinetoplast"/>
 *             &lt;enumeration value="eChloroplast"/>
 *             &lt;enumeration value="eChromoplast"/>
 *             &lt;enumeration value="ePlastid"/>
 *             &lt;enumeration value="eVirionPhage"/>
 *             &lt;enumeration value="eProviralProphage"/>
 *             &lt;enumeration value="eViroid"/>
 *             &lt;enumeration value="eExtrachrom"/>
 *             &lt;enumeration value="eCyanelle"/>
 *             &lt;enumeration value="eApicoplast"/>
 *             &lt;enumeration value="eLeucoplast"/>
 *             &lt;enumeration value="eProplastid"/>
 *             &lt;enumeration value="eHydrogenosome"/>
 *             &lt;enumeration value="eChromatophore"/>
 *             &lt;enumeration value="eOther"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isSingle" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="typeOtherDescr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locationOtherDescr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRepliconType", propOrder = {
    "value"
})
public class TypeRepliconType {

    @XmlValue
    protected TypeRepliconMolType value;
    @XmlAttribute(name = "location", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String location;
    @XmlAttribute(name = "isSingle", required = true)
    protected boolean isSingle;
    @XmlAttribute(name = "typeOtherDescr")
    protected String typeOtherDescr;
    @XmlAttribute(name = "locationOtherDescr")
    protected String locationOtherDescr;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link TypeRepliconMolType }
     *     
     */
    public TypeRepliconMolType getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRepliconMolType }
     *     
     */
    public void setValue(TypeRepliconMolType value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Définit la valeur de la propriété location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Obtient la valeur de la propriété isSingle.
     * 
     */
    public boolean isIsSingle() {
        return isSingle;
    }

    /**
     * Définit la valeur de la propriété isSingle.
     * 
     */
    public void setIsSingle(boolean value) {
        this.isSingle = value;
    }

    /**
     * Obtient la valeur de la propriété typeOtherDescr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOtherDescr() {
        return typeOtherDescr;
    }

    /**
     * Définit la valeur de la propriété typeOtherDescr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOtherDescr(String value) {
        this.typeOtherDescr = value;
    }

    /**
     * Obtient la valeur de la propriété locationOtherDescr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationOtherDescr() {
        return locationOtherDescr;
    }

    /**
     * Définit la valeur de la propriété locationOtherDescr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationOtherDescr(String value) {
        this.locationOtherDescr = value;
    }

}
