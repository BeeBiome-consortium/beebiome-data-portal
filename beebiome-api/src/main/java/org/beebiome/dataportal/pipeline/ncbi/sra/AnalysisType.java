
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  A SRA analysis object captures secondary analysis results from a sequence read dataset. This analysis can
 *         the results of short reads used in assembly, alignment, abundance instrumentation. The analysis can also be a list of reads,
 *         or a fasta file of trimmed reads associated with the experiment. The analysis can be technical data represented in a tab
 *         separated file (spreadsheet). 
 * 
 * <p>Classe Java pour AnalysisType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AnalysisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STUDY_REF">
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
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ANALYSIS_TYPE">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="DE_NOVO_ASSEMBLY">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PROCESSING" type="{}DefaultProcessingType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="REFERENCE_ALIGNMENT">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ASSEMBLY">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="STANDARD">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="NAME" type="{}XRefType" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="short_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="CUSTOM">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="REFERENCE_SOURCE" type="{}LinkType" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RUN_LABELS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RUN" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attGroup ref="{}RefNameGroup"/>
 *                                               &lt;attribute name="data_block_name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="read_group_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SEQ_LABELS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SEQUENCE" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="accession" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                                               &lt;attribute name="gi" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="data_block_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="seq_label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PROCESSING" type="{}AlignmentProcessingType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SEQUENCE_ANNOTATION">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PROCESSING" type="{}DefaultProcessingType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ABUNDANCE_MEASUREMENT">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PROCESSING" type="{}DefaultProcessingType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TARGETS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="TARGET" type="{}SraLinkType" minOccurs="0"/>
 *                   &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence>
 *           &lt;element name="DATA_BLOCK" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;all>
 *                     &lt;element name="FILES">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="FILE" type="{}AnalysisFileType" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/all>
 *                   &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="serial" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                   &lt;attribute name="member" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;element name="ANALYSIS_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="ANALYSIS_LINK" type="{}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ANALYSIS_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="ANALYSIS_ATTRIBUTE" type="{}AttributeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}NameGroup"/>
 *       &lt;attribute name="analysis_center" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="analysis_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalysisType", propOrder = {
    "identifiers",
    "title",
    "studyref",
    "description",
    "analysistype",
    "targets",
    "datablock",
    "analysislinks",
    "analysisattributes"
})
public class AnalysisType {

    @XmlElement(name = "IDENTIFIERS")
    protected IdentifierType identifiers;
    @XmlElement(name = "TITLE", required = true)
    protected String title;
    @XmlElement(name = "STUDY_REF", required = true)
    protected AnalysisType.STUDYREF studyref;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "ANALYSIS_TYPE", required = true)
    protected AnalysisType.ANALYSISTYPE analysistype;
    @XmlElement(name = "TARGETS")
    protected AnalysisType.TARGETS targets;
    @XmlElement(name = "DATA_BLOCK")
    protected List<AnalysisType.DATABLOCK> datablock;
    @XmlElement(name = "ANALYSIS_LINKS")
    protected AnalysisType.ANALYSISLINKS analysislinks;
    @XmlElement(name = "ANALYSIS_ATTRIBUTES")
    protected AnalysisType.ANALYSISATTRIBUTES analysisattributes;
    @XmlAttribute(name = "analysis_center")
    protected String analysisCenter;
    @XmlAttribute(name = "analysis_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar analysisDate;
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
     *     {@link AnalysisType.STUDYREF }
     *     
     */
    public AnalysisType.STUDYREF getSTUDYREF() {
        return studyref;
    }

    /**
     * Définit la valeur de la propriété studyref.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType.STUDYREF }
     *     
     */
    public void setSTUDYREF(AnalysisType.STUDYREF value) {
        this.studyref = value;
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
     * Obtient la valeur de la propriété analysistype.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisType.ANALYSISTYPE }
     *     
     */
    public AnalysisType.ANALYSISTYPE getANALYSISTYPE() {
        return analysistype;
    }

    /**
     * Définit la valeur de la propriété analysistype.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType.ANALYSISTYPE }
     *     
     */
    public void setANALYSISTYPE(AnalysisType.ANALYSISTYPE value) {
        this.analysistype = value;
    }

    /**
     * Obtient la valeur de la propriété targets.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisType.TARGETS }
     *     
     */
    public AnalysisType.TARGETS getTARGETS() {
        return targets;
    }

    /**
     * Définit la valeur de la propriété targets.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType.TARGETS }
     *     
     */
    public void setTARGETS(AnalysisType.TARGETS value) {
        this.targets = value;
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
     * {@link AnalysisType.DATABLOCK }
     * 
     * 
     */
    public List<AnalysisType.DATABLOCK> getDATABLOCK() {
        if (datablock == null) {
            datablock = new ArrayList<AnalysisType.DATABLOCK>();
        }
        return this.datablock;
    }

    /**
     * Obtient la valeur de la propriété analysislinks.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisType.ANALYSISLINKS }
     *     
     */
    public AnalysisType.ANALYSISLINKS getANALYSISLINKS() {
        return analysislinks;
    }

    /**
     * Définit la valeur de la propriété analysislinks.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType.ANALYSISLINKS }
     *     
     */
    public void setANALYSISLINKS(AnalysisType.ANALYSISLINKS value) {
        this.analysislinks = value;
    }

    /**
     * Obtient la valeur de la propriété analysisattributes.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisType.ANALYSISATTRIBUTES }
     *     
     */
    public AnalysisType.ANALYSISATTRIBUTES getANALYSISATTRIBUTES() {
        return analysisattributes;
    }

    /**
     * Définit la valeur de la propriété analysisattributes.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType.ANALYSISATTRIBUTES }
     *     
     */
    public void setANALYSISATTRIBUTES(AnalysisType.ANALYSISATTRIBUTES value) {
        this.analysisattributes = value;
    }

    /**
     * Obtient la valeur de la propriété analysisCenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisCenter() {
        return analysisCenter;
    }

    /**
     * Définit la valeur de la propriété analysisCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisCenter(String value) {
        this.analysisCenter = value;
    }

    /**
     * Obtient la valeur de la propriété analysisDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnalysisDate() {
        return analysisDate;
    }

    /**
     * Définit la valeur de la propriété analysisDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnalysisDate(XMLGregorianCalendar value) {
        this.analysisDate = value;
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
     *         &lt;element name="ANALYSIS_ATTRIBUTE" type="{}AttributeType"/>
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
        "analysisattribute"
    })
    public static class ANALYSISATTRIBUTES {

        @XmlElement(name = "ANALYSIS_ATTRIBUTE", required = true)
        protected List<AttributeType> analysisattribute;

        /**
         * Gets the value of the analysisattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the analysisattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getANALYSISATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getANALYSISATTRIBUTE() {
            if (analysisattribute == null) {
                analysisattribute = new ArrayList<AttributeType>();
            }
            return this.analysisattribute;
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
     *         &lt;element name="ANALYSIS_LINK" type="{}LinkType"/>
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
        "analysislink"
    })
    public static class ANALYSISLINKS {

        @XmlElement(name = "ANALYSIS_LINK", required = true)
        protected List<LinkType> analysislink;

        /**
         * Gets the value of the analysislink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the analysislink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getANALYSISLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getANALYSISLINK() {
            if (analysislink == null) {
                analysislink = new ArrayList<LinkType>();
            }
            return this.analysislink;
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
     *       &lt;choice>
     *         &lt;element name="DE_NOVO_ASSEMBLY">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PROCESSING" type="{}DefaultProcessingType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="REFERENCE_ALIGNMENT">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ASSEMBLY">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="STANDARD">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="NAME" type="{}XRefType" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="short_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="CUSTOM">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="REFERENCE_SOURCE" type="{}LinkType" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RUN_LABELS" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RUN" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attGroup ref="{}RefNameGroup"/>
     *                                     &lt;attribute name="data_block_name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="read_group_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SEQ_LABELS" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SEQUENCE" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="accession" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                                     &lt;attribute name="gi" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="data_block_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="seq_label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PROCESSING" type="{}AlignmentProcessingType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SEQUENCE_ANNOTATION">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PROCESSING" type="{}DefaultProcessingType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ABUNDANCE_MEASUREMENT">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PROCESSING" type="{}DefaultProcessingType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "denovoassembly",
        "referencealignment",
        "sequenceannotation",
        "abundancemeasurement"
    })
    public static class ANALYSISTYPE {

        @XmlElement(name = "DE_NOVO_ASSEMBLY")
        protected AnalysisType.ANALYSISTYPE.DENOVOASSEMBLY denovoassembly;
        @XmlElement(name = "REFERENCE_ALIGNMENT")
        protected AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT referencealignment;
        @XmlElement(name = "SEQUENCE_ANNOTATION")
        protected AnalysisType.ANALYSISTYPE.SEQUENCEANNOTATION sequenceannotation;
        @XmlElement(name = "ABUNDANCE_MEASUREMENT")
        protected AnalysisType.ANALYSISTYPE.ABUNDANCEMEASUREMENT abundancemeasurement;

        /**
         * Obtient la valeur de la propriété denovoassembly.
         * 
         * @return
         *     possible object is
         *     {@link AnalysisType.ANALYSISTYPE.DENOVOASSEMBLY }
         *     
         */
        public AnalysisType.ANALYSISTYPE.DENOVOASSEMBLY getDENOVOASSEMBLY() {
            return denovoassembly;
        }

        /**
         * Définit la valeur de la propriété denovoassembly.
         * 
         * @param value
         *     allowed object is
         *     {@link AnalysisType.ANALYSISTYPE.DENOVOASSEMBLY }
         *     
         */
        public void setDENOVOASSEMBLY(AnalysisType.ANALYSISTYPE.DENOVOASSEMBLY value) {
            this.denovoassembly = value;
        }

        /**
         * Obtient la valeur de la propriété referencealignment.
         * 
         * @return
         *     possible object is
         *     {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT }
         *     
         */
        public AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT getREFERENCEALIGNMENT() {
            return referencealignment;
        }

        /**
         * Définit la valeur de la propriété referencealignment.
         * 
         * @param value
         *     allowed object is
         *     {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT }
         *     
         */
        public void setREFERENCEALIGNMENT(AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT value) {
            this.referencealignment = value;
        }

        /**
         * Obtient la valeur de la propriété sequenceannotation.
         * 
         * @return
         *     possible object is
         *     {@link AnalysisType.ANALYSISTYPE.SEQUENCEANNOTATION }
         *     
         */
        public AnalysisType.ANALYSISTYPE.SEQUENCEANNOTATION getSEQUENCEANNOTATION() {
            return sequenceannotation;
        }

        /**
         * Définit la valeur de la propriété sequenceannotation.
         * 
         * @param value
         *     allowed object is
         *     {@link AnalysisType.ANALYSISTYPE.SEQUENCEANNOTATION }
         *     
         */
        public void setSEQUENCEANNOTATION(AnalysisType.ANALYSISTYPE.SEQUENCEANNOTATION value) {
            this.sequenceannotation = value;
        }

        /**
         * Obtient la valeur de la propriété abundancemeasurement.
         * 
         * @return
         *     possible object is
         *     {@link AnalysisType.ANALYSISTYPE.ABUNDANCEMEASUREMENT }
         *     
         */
        public AnalysisType.ANALYSISTYPE.ABUNDANCEMEASUREMENT getABUNDANCEMEASUREMENT() {
            return abundancemeasurement;
        }

        /**
         * Définit la valeur de la propriété abundancemeasurement.
         * 
         * @param value
         *     allowed object is
         *     {@link AnalysisType.ANALYSISTYPE.ABUNDANCEMEASUREMENT }
         *     
         */
        public void setABUNDANCEMEASUREMENT(AnalysisType.ANALYSISTYPE.ABUNDANCEMEASUREMENT value) {
            this.abundancemeasurement = value;
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
         *         &lt;element name="PROCESSING" type="{}DefaultProcessingType"/>
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
            "processing"
        })
        public static class ABUNDANCEMEASUREMENT {

            @XmlElement(name = "PROCESSING", required = true)
            protected DefaultProcessingType processing;

            /**
             * Obtient la valeur de la propriété processing.
             * 
             * @return
             *     possible object is
             *     {@link DefaultProcessingType }
             *     
             */
            public DefaultProcessingType getPROCESSING() {
                return processing;
            }

            /**
             * Définit la valeur de la propriété processing.
             * 
             * @param value
             *     allowed object is
             *     {@link DefaultProcessingType }
             *     
             */
            public void setPROCESSING(DefaultProcessingType value) {
                this.processing = value;
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
         *         &lt;element name="PROCESSING" type="{}DefaultProcessingType"/>
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
            "processing"
        })
        public static class DENOVOASSEMBLY {

            @XmlElement(name = "PROCESSING", required = true)
            protected DefaultProcessingType processing;

            /**
             * Obtient la valeur de la propriété processing.
             * 
             * @return
             *     possible object is
             *     {@link DefaultProcessingType }
             *     
             */
            public DefaultProcessingType getPROCESSING() {
                return processing;
            }

            /**
             * Définit la valeur de la propriété processing.
             * 
             * @param value
             *     allowed object is
             *     {@link DefaultProcessingType }
             *     
             */
            public void setPROCESSING(DefaultProcessingType value) {
                this.processing = value;
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
         *         &lt;element name="ASSEMBLY">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="STANDARD">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="NAME" type="{}XRefType" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="short_name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="CUSTOM">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="REFERENCE_SOURCE" type="{}LinkType" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RUN_LABELS" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RUN" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attGroup ref="{}RefNameGroup"/>
         *                           &lt;attribute name="data_block_name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="read_group_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SEQ_LABELS" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SEQUENCE" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="accession" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
         *                           &lt;attribute name="gi" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="data_block_name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="seq_label" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PROCESSING" type="{}AlignmentProcessingType"/>
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
            "assembly",
            "runlabels",
            "seqlabels",
            "processing"
        })
        public static class REFERENCEALIGNMENT {

            @XmlElement(name = "ASSEMBLY", required = true)
            protected AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY assembly;
            @XmlElement(name = "RUN_LABELS")
            protected AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.RUNLABELS runlabels;
            @XmlElement(name = "SEQ_LABELS")
            protected AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.SEQLABELS seqlabels;
            @XmlElement(name = "PROCESSING", required = true)
            protected AlignmentProcessingType processing;

            /**
             * Obtient la valeur de la propriété assembly.
             * 
             * @return
             *     possible object is
             *     {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY }
             *     
             */
            public AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY getASSEMBLY() {
                return assembly;
            }

            /**
             * Définit la valeur de la propriété assembly.
             * 
             * @param value
             *     allowed object is
             *     {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY }
             *     
             */
            public void setASSEMBLY(AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY value) {
                this.assembly = value;
            }

            /**
             * Obtient la valeur de la propriété runlabels.
             * 
             * @return
             *     possible object is
             *     {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.RUNLABELS }
             *     
             */
            public AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.RUNLABELS getRUNLABELS() {
                return runlabels;
            }

            /**
             * Définit la valeur de la propriété runlabels.
             * 
             * @param value
             *     allowed object is
             *     {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.RUNLABELS }
             *     
             */
            public void setRUNLABELS(AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.RUNLABELS value) {
                this.runlabels = value;
            }

            /**
             * Obtient la valeur de la propriété seqlabels.
             * 
             * @return
             *     possible object is
             *     {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.SEQLABELS }
             *     
             */
            public AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.SEQLABELS getSEQLABELS() {
                return seqlabels;
            }

            /**
             * Définit la valeur de la propriété seqlabels.
             * 
             * @param value
             *     allowed object is
             *     {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.SEQLABELS }
             *     
             */
            public void setSEQLABELS(AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.SEQLABELS value) {
                this.seqlabels = value;
            }

            /**
             * Obtient la valeur de la propriété processing.
             * 
             * @return
             *     possible object is
             *     {@link AlignmentProcessingType }
             *     
             */
            public AlignmentProcessingType getPROCESSING() {
                return processing;
            }

            /**
             * Définit la valeur de la propriété processing.
             * 
             * @param value
             *     allowed object is
             *     {@link AlignmentProcessingType }
             *     
             */
            public void setPROCESSING(AlignmentProcessingType value) {
                this.processing = value;
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
             *       &lt;choice>
             *         &lt;element name="STANDARD">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="NAME" type="{}XRefType" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="short_name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="CUSTOM">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="REFERENCE_SOURCE" type="{}LinkType" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "standard",
                "custom"
            })
            public static class ASSEMBLY {

                @XmlElement(name = "STANDARD")
                protected AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY.STANDARD standard;
                @XmlElement(name = "CUSTOM")
                protected AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY.CUSTOM custom;

                /**
                 * Obtient la valeur de la propriété standard.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY.STANDARD }
                 *     
                 */
                public AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY.STANDARD getSTANDARD() {
                    return standard;
                }

                /**
                 * Définit la valeur de la propriété standard.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY.STANDARD }
                 *     
                 */
                public void setSTANDARD(AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY.STANDARD value) {
                    this.standard = value;
                }

                /**
                 * Obtient la valeur de la propriété custom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY.CUSTOM }
                 *     
                 */
                public AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY.CUSTOM getCUSTOM() {
                    return custom;
                }

                /**
                 * Définit la valeur de la propriété custom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY.CUSTOM }
                 *     
                 */
                public void setCUSTOM(AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.ASSEMBLY.CUSTOM value) {
                    this.custom = value;
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
                 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="REFERENCE_SOURCE" type="{}LinkType" maxOccurs="unbounded" minOccurs="0"/>
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
                    "description",
                    "referencesource"
                })
                public static class CUSTOM {

                    @XmlElement(name = "DESCRIPTION")
                    protected String description;
                    @XmlElement(name = "REFERENCE_SOURCE")
                    protected List<LinkType> referencesource;

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
                     * Gets the value of the referencesource property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the referencesource property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getREFERENCESOURCE().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link LinkType }
                     * 
                     * 
                     */
                    public List<LinkType> getREFERENCESOURCE() {
                        if (referencesource == null) {
                            referencesource = new ArrayList<LinkType>();
                        }
                        return this.referencesource;
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
                 *         &lt;element name="NAME" type="{}XRefType" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="short_name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "name"
                })
                public static class STANDARD {

                    @XmlElement(name = "NAME")
                    protected List<XRefType> name;
                    @XmlAttribute(name = "short_name")
                    protected String shortName;

                    /**
                     * Gets the value of the name property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the name property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getNAME().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link XRefType }
                     * 
                     * 
                     */
                    public List<XRefType> getNAME() {
                        if (name == null) {
                            name = new ArrayList<XRefType>();
                        }
                        return this.name;
                    }

                    /**
                     * Obtient la valeur de la propriété shortName.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getShortName() {
                        return shortName;
                    }

                    /**
                     * Définit la valeur de la propriété shortName.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setShortName(String value) {
                        this.shortName = value;
                    }

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
             *         &lt;element name="RUN" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attGroup ref="{}RefNameGroup"/>
             *                 &lt;attribute name="data_block_name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="read_group_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
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
            @XmlType(name = "", propOrder = {
                "run"
            })
            public static class RUNLABELS {

                @XmlElement(name = "RUN", required = true)
                protected List<AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.RUNLABELS.RUN> run;

                /**
                 * Gets the value of the run property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the run property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRUN().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.RUNLABELS.RUN }
                 * 
                 * 
                 */
                public List<AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.RUNLABELS.RUN> getRUN() {
                    if (run == null) {
                        run = new ArrayList<AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.RUNLABELS.RUN>();
                    }
                    return this.run;
                }


                /**
                 * RUNs which are labeled by SRA Accession are optional in the list
                 * 
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attGroup ref="{}RefNameGroup"/>
                 *       &lt;attribute name="data_block_name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="read_group_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class RUN {

                    @XmlAttribute(name = "data_block_name")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String dataBlockName;
                    @XmlAttribute(name = "read_group_label")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String readGroupLabel;
                    @XmlAttribute(name = "refname")
                    protected String refname;
                    @XmlAttribute(name = "refcenter")
                    protected String refcenter;
                    @XmlAttribute(name = "accession")
                    protected String accession;

                    /**
                     * Obtient la valeur de la propriété dataBlockName.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDataBlockName() {
                        return dataBlockName;
                    }

                    /**
                     * Définit la valeur de la propriété dataBlockName.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDataBlockName(String value) {
                        this.dataBlockName = value;
                    }

                    /**
                     * Obtient la valeur de la propriété readGroupLabel.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getReadGroupLabel() {
                        return readGroupLabel;
                    }

                    /**
                     * Définit la valeur de la propriété readGroupLabel.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setReadGroupLabel(String value) {
                        this.readGroupLabel = value;
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


            /**
             * Mapping between the reference (sequence dictionary) labels used in the alignment data
             *                           file, and the reference sequences in the Archive. The whole element is optional when Sequences are
             *                           referenced by accession.version in submitted data.
             * 
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="SEQUENCE" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="accession" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
             *                 &lt;attribute name="gi" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="data_block_name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="seq_label" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
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
            @XmlType(name = "", propOrder = {
                "sequence"
            })
            public static class SEQLABELS {

                @XmlElement(name = "SEQUENCE", required = true)
                protected List<AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.SEQLABELS.SEQUENCE> sequence;

                /**
                 * Gets the value of the sequence property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the sequence property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSEQUENCE().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.SEQLABELS.SEQUENCE }
                 * 
                 * 
                 */
                public List<AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.SEQLABELS.SEQUENCE> getSEQUENCE() {
                    if (sequence == null) {
                        sequence = new ArrayList<AnalysisType.ANALYSISTYPE.REFERENCEALIGNMENT.SEQLABELS.SEQUENCE>();
                    }
                    return this.sequence;
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
                 *       &lt;attribute name="accession" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
                 *       &lt;attribute name="gi" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="data_block_name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="seq_label" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class SEQUENCE {

                    @XmlAttribute(name = "accession", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String accession;
                    @XmlAttribute(name = "gi")
                    protected BigInteger gi;
                    @XmlAttribute(name = "data_block_name")
                    protected String dataBlockName;
                    @XmlAttribute(name = "seq_label")
                    protected String seqLabel;

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
                     * Obtient la valeur de la propriété gi.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getGi() {
                        return gi;
                    }

                    /**
                     * Définit la valeur de la propriété gi.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setGi(BigInteger value) {
                        this.gi = value;
                    }

                    /**
                     * Obtient la valeur de la propriété dataBlockName.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDataBlockName() {
                        return dataBlockName;
                    }

                    /**
                     * Définit la valeur de la propriété dataBlockName.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDataBlockName(String value) {
                        this.dataBlockName = value;
                    }

                    /**
                     * Obtient la valeur de la propriété seqLabel.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSeqLabel() {
                        return seqLabel;
                    }

                    /**
                     * Définit la valeur de la propriété seqLabel.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSeqLabel(String value) {
                        this.seqLabel = value;
                    }

                }

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
         *         &lt;element name="PROCESSING" type="{}DefaultProcessingType"/>
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
            "processing"
        })
        public static class SEQUENCEANNOTATION {

            @XmlElement(name = "PROCESSING", required = true)
            protected DefaultProcessingType processing;

            /**
             * Obtient la valeur de la propriété processing.
             * 
             * @return
             *     possible object is
             *     {@link DefaultProcessingType }
             *     
             */
            public DefaultProcessingType getPROCESSING() {
                return processing;
            }

            /**
             * Définit la valeur de la propriété processing.
             * 
             * @param value
             *     allowed object is
             *     {@link DefaultProcessingType }
             *     
             */
            public void setPROCESSING(DefaultProcessingType value) {
                this.processing = value;
            }

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
     *         &lt;element name="FILES">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FILE" type="{}AnalysisFileType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="serial" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="member" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class DATABLOCK {

        @XmlElement(name = "FILES", required = true)
        protected AnalysisType.DATABLOCK.FILES files;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "serial")
        protected BigInteger serial;
        @XmlAttribute(name = "member")
        protected String member;

        /**
         * Obtient la valeur de la propriété files.
         * 
         * @return
         *     possible object is
         *     {@link AnalysisType.DATABLOCK.FILES }
         *     
         */
        public AnalysisType.DATABLOCK.FILES getFILES() {
            return files;
        }

        /**
         * Définit la valeur de la propriété files.
         * 
         * @param value
         *     allowed object is
         *     {@link AnalysisType.DATABLOCK.FILES }
         *     
         */
        public void setFILES(AnalysisType.DATABLOCK.FILES value) {
            this.files = value;
        }

        /**
         * Obtient la valeur de la propriété name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Définit la valeur de la propriété name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtient la valeur de la propriété serial.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSerial() {
            return serial;
        }

        /**
         * Définit la valeur de la propriété serial.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSerial(BigInteger value) {
            this.serial = value;
        }

        /**
         * Obtient la valeur de la propriété member.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMember() {
            return member;
        }

        /**
         * Définit la valeur de la propriété member.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMember(String value) {
            this.member = value;
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
         *         &lt;element name="FILE" type="{}AnalysisFileType" maxOccurs="unbounded"/>
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
            "file"
        })
        public static class FILES {

            @XmlElement(name = "FILE", required = true)
            protected List<AnalysisFileType> file;

            /**
             * Gets the value of the file property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the file property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFILE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AnalysisFileType }
             * 
             * 
             */
            public List<AnalysisFileType> getFILE() {
                if (file == null) {
                    file = new ArrayList<AnalysisFileType>();
                }
                return this.file;
            }

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
     *         &lt;element name="TARGET" type="{}SraLinkType" minOccurs="0"/>
     *         &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
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
        "targetAndIDENTIFIERS"
    })
    public static class TARGETS {

        @XmlElements({
            @XmlElement(name = "TARGET", type = SraLinkType.class),
            @XmlElement(name = "IDENTIFIERS", type = IdentifierType.class)
        })
        protected List<Object> targetAndIDENTIFIERS;

        /**
         * Gets the value of the targetAndIDENTIFIERS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetAndIDENTIFIERS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTARGETAndIDENTIFIERS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SraLinkType }
         * {@link IdentifierType }
         * 
         * 
         */
        public List<Object> getTARGETAndIDENTIFIERS() {
            if (targetAndIDENTIFIERS == null) {
                targetAndIDENTIFIERS = new ArrayList<Object>();
            }
            return this.targetAndIDENTIFIERS;
        }

    }

}
