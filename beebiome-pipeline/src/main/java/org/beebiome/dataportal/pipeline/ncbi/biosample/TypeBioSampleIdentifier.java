
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeBioSampleIdentifier complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeBioSampleIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryId" type="{SP.common}typePrimaryId" minOccurs="0"/>
 *         &lt;element name="SPUID" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;SP.common>typeSPUID">
 *                 &lt;attribute name="label">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Sample name"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="display">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="yes"/>
 *                       &lt;enumeration value="no"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeBioSampleIdentifier", propOrder = {
    "primaryId",
    "spuid"
})
public class TypeBioSampleIdentifier {

    @XmlElement(name = "PrimaryId")
    protected TypePrimaryId primaryId;
    @XmlElement(name = "SPUID")
    protected List<TypeBioSampleIdentifier.SPUID> spuid;

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
     * Gets the value of the spuid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spuid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBioSampleIdentifier.SPUID }
     * 
     * 
     */
    public List<TypeBioSampleIdentifier.SPUID> getSPUID() {
        if (spuid == null) {
            spuid = new ArrayList<TypeBioSampleIdentifier.SPUID>();
        }
        return this.spuid;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;SP.common>typeSPUID">
     *       &lt;attribute name="label">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Sample name"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="display">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="yes"/>
     *             &lt;enumeration value="no"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SPUID
        extends TypeSPUID
    {

        @XmlAttribute(name = "label")
        protected String label;
        @XmlAttribute(name = "display")
        protected String display;

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
         * Obtient la valeur de la propriété display.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplay() {
            return display;
        }

        /**
         * Définit la valeur de la propriété display.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplay(String value) {
            this.display = value;
        }

    }

}
