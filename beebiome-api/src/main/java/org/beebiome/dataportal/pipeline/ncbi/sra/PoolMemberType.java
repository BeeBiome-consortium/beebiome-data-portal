
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 *  Impementation of lookup table between Sample Pool member and
 *       identified read_group_tags for a given READ_LABEL 
 * 
 * <p>Classe Java pour PoolMemberType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PoolMemberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
 *         &lt;element name="READ_LABEL" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="read_group_tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}RefNameGroup"/>
 *       &lt;attribute name="member_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proportion" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoolMemberType", propOrder = {
    "identifiers",
    "readlabel"
})
public class PoolMemberType {

    @XmlElement(name = "IDENTIFIERS")
    protected IdentifierType identifiers;
    @XmlElement(name = "READ_LABEL")
    protected List<PoolMemberType.READLABEL> readlabel;
    @XmlAttribute(name = "member_name")
    protected String memberName;
    @XmlAttribute(name = "proportion")
    protected Float proportion;
    @XmlAttribute(name = "refname")
    protected String refname;
    @XmlAttribute(name = "refcenter")
    protected String refcenter;
    @XmlAttribute(name = "accession")
    protected String accession;

    /**
     * Obtient la valeur de la propriété identifiers.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getIDENTIFIERS() {
        return identifiers;
    }

    /**
     * Définit la valeur de la propriété identifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setIDENTIFIERS(IdentifierType value) {
        this.identifiers = value;
    }

    /**
     * Gets the value of the readlabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readlabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREADLABEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoolMemberType.READLABEL }
     * 
     * 
     */
    public List<PoolMemberType.READLABEL> getREADLABEL() {
        if (readlabel == null) {
            readlabel = new ArrayList<PoolMemberType.READLABEL>();
        }
        return this.readlabel;
    }

    /**
     * Obtient la valeur de la propriété memberName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * Définit la valeur de la propriété memberName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberName(String value) {
        this.memberName = value;
    }

    /**
     * Obtient la valeur de la propriété proportion.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProportion() {
        return proportion;
    }

    /**
     * Définit la valeur de la propriété proportion.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProportion(Float value) {
        this.proportion = value;
    }

    /**
     * Obtient la valeur de la propriété refname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefname() {
        return refname;
    }

    /**
     * Définit la valeur de la propriété refname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefname(String value) {
        this.refname = value;
    }

    /**
     * Obtient la valeur de la propriété refcenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefcenter() {
        return refcenter;
    }

    /**
     * Définit la valeur de la propriété refcenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefcenter(String value) {
        this.refcenter = value;
    }

    /**
     * Obtient la valeur de la propriété accession.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccession() {
        return accession;
    }

    /**
     * Définit la valeur de la propriété accession.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccession(String value) {
        this.accession = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="read_group_tag" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class READLABEL {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "read_group_tag")
        protected String readGroupTag;

        /**
         * Obtient la valeur de la propriété value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propriété readGroupTag.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReadGroupTag() {
            return readGroupTag;
        }

        /**
         * Définit la valeur de la propriété readGroupTag.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReadGroupTag(String value) {
            this.readGroupTag = value;
        }

    }

}
