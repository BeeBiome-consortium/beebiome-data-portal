
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  A Sample defines an isolate of sequenceable material upon which sequencing experiments can be based. The
 *         Sample object may be a surrogate for taxonomy accession or an anonymized individual identifier. Or, it may fully specify
 *         provenance and isolation method of the starting material. 
 * 
 * <p>Classe Java pour SampleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SampleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAMPLE_NAME">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="TAXON_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="SCIENTIFIC_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMMON_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ANONYMIZED_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INDIVIDUAL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAMPLE_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="SAMPLE_LINK" type="{}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SAMPLE_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="SAMPLE_ATTRIBUTE" type="{}AttributeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}NameGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleType", propOrder = {
    "identifiers",
    "title",
    "samplename",
    "description",
    "samplelinks",
    "sampleattributes"
})
public class SampleType {

    @XmlElement(name = "IDENTIFIERS")
    protected IdentifierType identifiers;
    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "SAMPLE_NAME", required = true)
    protected SampleType.SAMPLENAME samplename;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "SAMPLE_LINKS")
    protected SampleType.SAMPLELINKS samplelinks;
    @XmlElement(name = "SAMPLE_ATTRIBUTES")
    protected SampleType.SAMPLEATTRIBUTES sampleattributes;
    @XmlAttribute(name = "alias")
    protected String alias;
    @XmlAttribute(name = "center_name")
    protected String centerName;
    @XmlAttribute(name = "broker_name")
    protected String brokerName;
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
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITLE() {
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
    public void setTITLE(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propriété samplename.
     * 
     * @return
     *     possible object is
     *     {@link SampleType.SAMPLENAME }
     *     
     */
    public SampleType.SAMPLENAME getSAMPLENAME() {
        return samplename;
    }

    /**
     * Définit la valeur de la propriété samplename.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleType.SAMPLENAME }
     *     
     */
    public void setSAMPLENAME(SampleType.SAMPLENAME value) {
        this.samplename = value;
    }

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propriété samplelinks.
     * 
     * @return
     *     possible object is
     *     {@link SampleType.SAMPLELINKS }
     *     
     */
    public SampleType.SAMPLELINKS getSAMPLELINKS() {
        return samplelinks;
    }

    /**
     * Définit la valeur de la propriété samplelinks.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleType.SAMPLELINKS }
     *     
     */
    public void setSAMPLELINKS(SampleType.SAMPLELINKS value) {
        this.samplelinks = value;
    }

    /**
     * Obtient la valeur de la propriété sampleattributes.
     * 
     * @return
     *     possible object is
     *     {@link SampleType.SAMPLEATTRIBUTES }
     *     
     */
    public SampleType.SAMPLEATTRIBUTES getSAMPLEATTRIBUTES() {
        return sampleattributes;
    }

    /**
     * Définit la valeur de la propriété sampleattributes.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleType.SAMPLEATTRIBUTES }
     *     
     */
    public void setSAMPLEATTRIBUTES(SampleType.SAMPLEATTRIBUTES value) {
        this.sampleattributes = value;
    }

    /**
     * Obtient la valeur de la propriété alias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Définit la valeur de la propriété alias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Obtient la valeur de la propriété centerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterName() {
        return centerName;
    }

    /**
     * Définit la valeur de la propriété centerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterName(String value) {
        this.centerName = value;
    }

    /**
     * Obtient la valeur de la propriété brokerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerName() {
        return brokerName;
    }

    /**
     * Définit la valeur de la propriété brokerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerName(String value) {
        this.brokerName = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="SAMPLE_ATTRIBUTE" type="{}AttributeType"/>
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
        "sampleattribute"
    })
    public static class SAMPLEATTRIBUTES {

        @XmlElement(name = "SAMPLE_ATTRIBUTE", required = true)
        protected List<AttributeType> sampleattribute;

        /**
         * Gets the value of the sampleattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sampleattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSAMPLEATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getSAMPLEATTRIBUTE() {
            if (sampleattribute == null) {
                sampleattribute = new ArrayList<AttributeType>();
            }
            return this.sampleattribute;
        }

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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="SAMPLE_LINK" type="{}LinkType"/>
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
        "samplelink"
    })
    public static class SAMPLELINKS {

        @XmlElement(name = "SAMPLE_LINK", required = true)
        protected List<LinkType> samplelink;

        /**
         * Gets the value of the samplelink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the samplelink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSAMPLELINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getSAMPLELINK() {
            if (samplelink == null) {
                samplelink = new ArrayList<LinkType>();
            }
            return this.samplelink;
        }

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
     *       &lt;all>
     *         &lt;element name="TAXON_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="SCIENTIFIC_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMMON_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ANONYMIZED_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INDIVIDUAL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class SAMPLENAME {

        @XmlElement(name = "TAXON_ID")
        protected int taxonid;
        @XmlElement(name = "SCIENTIFIC_NAME")
        protected String scientificname;
        @XmlElement(name = "COMMON_NAME")
        protected String commonname;
        @XmlElement(name = "ANONYMIZED_NAME")
        protected String anonymizedname;
        @XmlElement(name = "INDIVIDUAL_NAME")
        protected String individualname;

        /**
         * Obtient la valeur de la propriété taxonid.
         * 
         */
        public int getTAXONID() {
            return taxonid;
        }

        /**
         * Définit la valeur de la propriété taxonid.
         * 
         */
        public void setTAXONID(int value) {
            this.taxonid = value;
        }

        /**
         * Obtient la valeur de la propriété scientificname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSCIENTIFICNAME() {
            return scientificname;
        }

        /**
         * Définit la valeur de la propriété scientificname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSCIENTIFICNAME(String value) {
            this.scientificname = value;
        }

        /**
         * Obtient la valeur de la propriété commonname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMMONNAME() {
            return commonname;
        }

        /**
         * Définit la valeur de la propriété commonname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMMONNAME(String value) {
            this.commonname = value;
        }

        /**
         * Obtient la valeur de la propriété anonymizedname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getANONYMIZEDNAME() {
            return anonymizedname;
        }

        /**
         * Définit la valeur de la propriété anonymizedname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setANONYMIZEDNAME(String value) {
            this.anonymizedname = value;
        }

        /**
         * Obtient la valeur de la propriété individualname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINDIVIDUALNAME() {
            return individualname;
        }

        /**
         * Définit la valeur de la propriété individualname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINDIVIDUALNAME(String value) {
            this.individualname = value;
        }

    }

}
