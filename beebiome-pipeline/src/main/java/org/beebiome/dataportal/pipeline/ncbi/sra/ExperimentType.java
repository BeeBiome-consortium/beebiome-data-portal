
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  An Experiment specifies of what will be sequenced and how the
 *       sequencing will be performed. It does not contain results. An Experiment is composed
 *       of a design, a platform selection, and processing parameters. 
 * 
 * <p>Classe Java pour ExperimentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ExperimentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STUDY_REF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attGroup ref="{}RefNameGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DESIGN" type="{}LibraryType"/>
 *         &lt;element name="PLATFORM" type="{}PlatformType"/>
 *         &lt;element name="PROCESSING" type="{}ProcessingType" minOccurs="0"/>
 *         &lt;element name="EXPERIMENT_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="EXPERIMENT_LINK" type="{}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EXPERIMENT_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="EXPERIMENT_ATTRIBUTE" type="{}AttributeType"/>
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
@XmlType(name = "ExperimentType", propOrder = {
    "identifiers",
    "title",
    "studyref",
    "design",
    "platform",
    "processing",
    "experimentlinks",
    "experimentattributes"
})
public class ExperimentType {

    @XmlElement(name = "IDENTIFIERS")
    protected IdentifierType identifiers;
    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "STUDY_REF", required = true)
    protected ExperimentType.STUDYREF studyref;
    @XmlElement(name = "DESIGN", required = true)
    protected LibraryType design;
    @XmlElement(name = "PLATFORM", required = true)
    protected PlatformType platform;
    @XmlElement(name = "PROCESSING")
    protected ProcessingType processing;
    @XmlElement(name = "EXPERIMENT_LINKS")
    protected ExperimentType.EXPERIMENTLINKS experimentlinks;
    @XmlElement(name = "EXPERIMENT_ATTRIBUTES")
    protected ExperimentType.EXPERIMENTATTRIBUTES experimentattributes;
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
     * Obtient la valeur de la propriété studyref.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentType.STUDYREF }
     *     
     */
    public ExperimentType.STUDYREF getSTUDYREF() {
        return studyref;
    }

    /**
     * Définit la valeur de la propriété studyref.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentType.STUDYREF }
     *     
     */
    public void setSTUDYREF(ExperimentType.STUDYREF value) {
        this.studyref = value;
    }

    /**
     * Obtient la valeur de la propriété design.
     * 
     * @return
     *     possible object is
     *     {@link LibraryType }
     *     
     */
    public LibraryType getDESIGN() {
        return design;
    }

    /**
     * Définit la valeur de la propriété design.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryType }
     *     
     */
    public void setDESIGN(LibraryType value) {
        this.design = value;
    }

    /**
     * Obtient la valeur de la propriété platform.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType }
     *     
     */
    public PlatformType getPLATFORM() {
        return platform;
    }

    /**
     * Définit la valeur de la propriété platform.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType }
     *     
     */
    public void setPLATFORM(PlatformType value) {
        this.platform = value;
    }

    /**
     * Obtient la valeur de la propriété processing.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingType }
     *     
     */
    public ProcessingType getPROCESSING() {
        return processing;
    }

    /**
     * Définit la valeur de la propriété processing.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingType }
     *     
     */
    public void setPROCESSING(ProcessingType value) {
        this.processing = value;
    }

    /**
     * Obtient la valeur de la propriété experimentlinks.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentType.EXPERIMENTLINKS }
     *     
     */
    public ExperimentType.EXPERIMENTLINKS getEXPERIMENTLINKS() {
        return experimentlinks;
    }

    /**
     * Définit la valeur de la propriété experimentlinks.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentType.EXPERIMENTLINKS }
     *     
     */
    public void setEXPERIMENTLINKS(ExperimentType.EXPERIMENTLINKS value) {
        this.experimentlinks = value;
    }

    /**
     * Obtient la valeur de la propriété experimentattributes.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentType.EXPERIMENTATTRIBUTES }
     *     
     */
    public ExperimentType.EXPERIMENTATTRIBUTES getEXPERIMENTATTRIBUTES() {
        return experimentattributes;
    }

    /**
     * Définit la valeur de la propriété experimentattributes.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentType.EXPERIMENTATTRIBUTES }
     *     
     */
    public void setEXPERIMENTATTRIBUTES(ExperimentType.EXPERIMENTATTRIBUTES value) {
        this.experimentattributes = value;
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
     *         &lt;element name="EXPERIMENT_ATTRIBUTE" type="{}AttributeType"/>
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
        "experimentattribute"
    })
    public static class EXPERIMENTATTRIBUTES {

        @XmlElement(name = "EXPERIMENT_ATTRIBUTE", required = true)
        protected List<AttributeType> experimentattribute;

        /**
         * Gets the value of the experimentattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the experimentattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXPERIMENTATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getEXPERIMENTATTRIBUTE() {
            if (experimentattribute == null) {
                experimentattribute = new ArrayList<AttributeType>();
            }
            return this.experimentattribute;
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
     *         &lt;element name="EXPERIMENT_LINK" type="{}LinkType"/>
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
        "experimentlink"
    })
    public static class EXPERIMENTLINKS {

        @XmlElement(name = "EXPERIMENT_LINK", required = true)
        protected List<LinkType> experimentlink;

        /**
         * Gets the value of the experimentlink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the experimentlink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXPERIMENTLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getEXPERIMENTLINK() {
            if (experimentlink == null) {
                experimentlink = new ArrayList<LinkType>();
            }
            return this.experimentlink;
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
     *         &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attGroup ref="{}RefNameGroup"/>
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
    public static class STUDYREF {

        @XmlElement(name = "IDENTIFIERS")
        protected IdentifierType identifiers;
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

    }

}
