
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  The SAMPLE_DESCRIPTOR specifies how to decode the individual reads of
 *       interest from the monolithic spot sequence. The spot descriptor contains aspects of
 *       the experimental design, platform, and processing information. There will be two
 *       methods of specification: one will be an index into a table of typical decodings,
 *       the other being an exact specification. 
 * 
 * <p>Classe Java pour SampleDescriptorType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SampleDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="IDENTIFIERS" type="{}IdentifierType"/>
 *         &lt;element name="POOL">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DEFAULT_MEMBER" type="{}PoolMemberType" minOccurs="0"/>
 *                   &lt;element name="MEMBER" type="{}PoolMemberType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attGroup ref="{}RefNameGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleDescriptorType", propOrder = {
    "identifiers",
    "pool"
})
public class SampleDescriptorType {

    @XmlElement(name = "IDENTIFIERS")
    protected IdentifierType identifiers;
    @XmlElement(name = "POOL")
    protected SampleDescriptorType.POOL pool;
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
     * Obtient la valeur de la propriété pool.
     * 
     * @return
     *     possible object is
     *     {@link SampleDescriptorType.POOL }
     *     
     */
    public SampleDescriptorType.POOL getPOOL() {
        return pool;
    }

    /**
     * Définit la valeur de la propriété pool.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleDescriptorType.POOL }
     *     
     */
    public void setPOOL(SampleDescriptorType.POOL value) {
        this.pool = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DEFAULT_MEMBER" type="{}PoolMemberType" minOccurs="0"/>
     *         &lt;element name="MEMBER" type="{}PoolMemberType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "defaultmember",
        "member"
    })
    public static class POOL {

        @XmlElement(name = "DEFAULT_MEMBER")
        protected PoolMemberType defaultmember;
        @XmlElement(name = "MEMBER", required = true)
        protected List<PoolMemberType> member;

        /**
         * Obtient la valeur de la propriété defaultmember.
         * 
         * @return
         *     possible object is
         *     {@link PoolMemberType }
         *     
         */
        public PoolMemberType getDEFAULTMEMBER() {
            return defaultmember;
        }

        /**
         * Définit la valeur de la propriété defaultmember.
         * 
         * @param value
         *     allowed object is
         *     {@link PoolMemberType }
         *     
         */
        public void setDEFAULTMEMBER(PoolMemberType value) {
            this.defaultmember = value;
        }

        /**
         * Gets the value of the member property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the member property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEMBER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PoolMemberType }
         * 
         * 
         */
        public List<PoolMemberType> getMEMBER() {
            if (member == null) {
                member = new ArrayList<PoolMemberType>();
            }
            return this.member;
        }

    }

}
