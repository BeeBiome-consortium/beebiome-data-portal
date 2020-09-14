
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A Run contains a group of reads generated for a particular experiment.
 *       NB: formerly bounded by physical production unit (flowcell) and instrument model.
 *       
 * 
 * <p>Classe Java pour RunType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RunType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPERIMENT_REF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{}RefNameGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SPOT_DESCRIPTOR" type="{}SpotDescriptorType" minOccurs="0"/>
 *         &lt;element name="PROCESSING" type="{}ProcessingType" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="DATA_BLOCK" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="FILES" type="{}typeRunFile"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="member_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;element name="RUN_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RUN_LINK" type="{}LinkType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RUN_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RUN_ATTRIBUTE" type="{}AttributeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}NameGroup"/>
 *       &lt;attribute name="run_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="run_center" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunType", propOrder = {
    "identifiers",
    "title",
    "experimentref",
    "spotdescriptor",
    "processing",
    "datablock",
    "runlinks",
    "runattributes"
})
public class RunType {

    @XmlElement(name = "IDENTIFIERS")
    protected IdentifierType identifiers;
    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "EXPERIMENT_REF", required = true)
    protected RunType.EXPERIMENTREF experimentref;
    @XmlElement(name = "SPOT_DESCRIPTOR")
    protected SpotDescriptorType spotdescriptor;
    @XmlElement(name = "PROCESSING")
    protected ProcessingType processing;
    @XmlElement(name = "DATA_BLOCK")
    protected List<RunType.DATABLOCK> datablock;
    @XmlElement(name = "RUN_LINKS")
    protected RunType.RUNLINKS runlinks;
    @XmlElement(name = "RUN_ATTRIBUTES")
    protected RunType.RUNATTRIBUTES runattributes;
    @XmlAttribute(name = "run_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar runDate;
    @XmlAttribute(name = "run_center")
    protected String runCenter;
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
     * Obtient la valeur de la propriété experimentref.
     * 
     * @return
     *     possible object is
     *     {@link RunType.EXPERIMENTREF }
     *     
     */
    public RunType.EXPERIMENTREF getEXPERIMENTREF() {
        return experimentref;
    }

    /**
     * Définit la valeur de la propriété experimentref.
     * 
     * @param value
     *     allowed object is
     *     {@link RunType.EXPERIMENTREF }
     *     
     */
    public void setEXPERIMENTREF(RunType.EXPERIMENTREF value) {
        this.experimentref = value;
    }

    /**
     * Obtient la valeur de la propriété spotdescriptor.
     * 
     * @return
     *     possible object is
     *     {@link SpotDescriptorType }
     *     
     */
    public SpotDescriptorType getSPOTDESCRIPTOR() {
        return spotdescriptor;
    }

    /**
     * Définit la valeur de la propriété spotdescriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotDescriptorType }
     *     
     */
    public void setSPOTDESCRIPTOR(SpotDescriptorType value) {
        this.spotdescriptor = value;
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
     * Gets the value of the datablock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datablock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDATABLOCK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunType.DATABLOCK }
     * 
     * 
     */
    public List<RunType.DATABLOCK> getDATABLOCK() {
        if (datablock == null) {
            datablock = new ArrayList<RunType.DATABLOCK>();
        }
        return this.datablock;
    }

    /**
     * Obtient la valeur de la propriété runlinks.
     * 
     * @return
     *     possible object is
     *     {@link RunType.RUNLINKS }
     *     
     */
    public RunType.RUNLINKS getRUNLINKS() {
        return runlinks;
    }

    /**
     * Définit la valeur de la propriété runlinks.
     * 
     * @param value
     *     allowed object is
     *     {@link RunType.RUNLINKS }
     *     
     */
    public void setRUNLINKS(RunType.RUNLINKS value) {
        this.runlinks = value;
    }

    /**
     * Obtient la valeur de la propriété runattributes.
     * 
     * @return
     *     possible object is
     *     {@link RunType.RUNATTRIBUTES }
     *     
     */
    public RunType.RUNATTRIBUTES getRUNATTRIBUTES() {
        return runattributes;
    }

    /**
     * Définit la valeur de la propriété runattributes.
     * 
     * @param value
     *     allowed object is
     *     {@link RunType.RUNATTRIBUTES }
     *     
     */
    public void setRUNATTRIBUTES(RunType.RUNATTRIBUTES value) {
        this.runattributes = value;
    }

    /**
     * Obtient la valeur de la propriété runDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRunDate() {
        return runDate;
    }

    /**
     * Définit la valeur de la propriété runDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRunDate(XMLGregorianCalendar value) {
        this.runDate = value;
    }

    /**
     * Obtient la valeur de la propriété runCenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunCenter() {
        return runCenter;
    }

    /**
     * Définit la valeur de la propriété runCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunCenter(String value) {
        this.runCenter = value;
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
     *       &lt;sequence>
     *         &lt;element name="FILES" type="{}typeRunFile"/>
     *       &lt;/sequence>
     *       &lt;attribute name="member_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "files"
    })
    public static class DATABLOCK {

        @XmlElement(name = "FILES", required = true)
        protected TypeRunFile files;
        @XmlAttribute(name = "member_name")
        protected String memberName;

        /**
         * Obtient la valeur de la propriété files.
         * 
         * @return
         *     possible object is
         *     {@link TypeRunFile }
         *     
         */
        public TypeRunFile getFILES() {
            return files;
        }

        /**
         * Définit la valeur de la propriété files.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeRunFile }
         *     
         */
        public void setFILES(TypeRunFile value) {
            this.files = value;
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
     *         &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
     *       &lt;/sequence>
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
        "identifiers"
    })
    public static class EXPERIMENTREF {

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
     *         &lt;element name="RUN_ATTRIBUTE" type="{}AttributeType" maxOccurs="unbounded"/>
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
        "runattribute"
    })
    public static class RUNATTRIBUTES {

        @XmlElement(name = "RUN_ATTRIBUTE", required = true)
        protected List<AttributeType> runattribute;

        /**
         * Gets the value of the runattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the runattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRUNATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getRUNATTRIBUTE() {
            if (runattribute == null) {
                runattribute = new ArrayList<AttributeType>();
            }
            return this.runattribute;
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
     *       &lt;sequence>
     *         &lt;element name="RUN_LINK" type="{}LinkType" maxOccurs="unbounded"/>
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
        "runlink"
    })
    public static class RUNLINKS {

        @XmlElement(name = "RUN_LINK", required = true)
        protected List<LinkType> runlink;

        /**
         * Gets the value of the runlink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the runlink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRUNLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getRUNLINK() {
            if (runlink == null) {
                runlink = new ArrayList<LinkType>();
            }
            return this.runlink;
        }

    }

}
