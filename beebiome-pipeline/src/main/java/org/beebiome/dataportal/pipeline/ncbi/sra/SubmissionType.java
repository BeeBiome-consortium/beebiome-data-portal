
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
 *  A Submission type is used to describe an object that contains submission information, contacts for the
 *         submission, actions to be performed by the Archive, and file manifest. 
 * 
 * <p>Classe Java pour SubmissionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SubmissionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTACTS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="CONTACT">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="inform_on_status" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;attribute name="inform_on_error" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ACTIONS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="ACTION">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="ADD">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="schema" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="study"/>
 *                                           &lt;enumeration value="experiment"/>
 *                                           &lt;enumeration value="sample"/>
 *                                           &lt;enumeration value="run"/>
 *                                           &lt;enumeration value="analysis"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MODIFY">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="schema" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="study"/>
 *                                           &lt;enumeration value="experiment"/>
 *                                           &lt;enumeration value="sample"/>
 *                                           &lt;enumeration value="run"/>
 *                                           &lt;enumeration value="analysis"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SUPPRESS">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="HOLD">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="HoldUntilDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RELEASE">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PROTECT">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="VALIDATE">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="schema" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="study"/>
 *                                           &lt;enumeration value="experiment"/>
 *                                           &lt;enumeration value="sample"/>
 *                                           &lt;enumeration value="run"/>
 *                                           &lt;enumeration value="analysis"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SUBMISSION_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="SUBMISSION_LINK" type="{}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SUBMISSION_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="SUBMISSION_ATTRIBUTE" type="{}AttributeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}NameGroup"/>
 *       &lt;attribute name="submission_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="submission_comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lab_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmissionType", propOrder = {
    "identifiers",
    "title",
    "contacts",
    "actions",
    "submissionlinks",
    "submissionattributes"
})
public class SubmissionType {

    @XmlElement(name = "IDENTIFIERS")
    protected IdentifierType identifiers;
    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "CONTACTS")
    protected SubmissionType.CONTACTS contacts;
    @XmlElement(name = "ACTIONS")
    protected SubmissionType.ACTIONS actions;
    @XmlElement(name = "SUBMISSION_LINKS")
    protected SubmissionType.SUBMISSIONLINKS submissionlinks;
    @XmlElement(name = "SUBMISSION_ATTRIBUTES")
    protected SubmissionType.SUBMISSIONATTRIBUTES submissionattributes;
    @XmlAttribute(name = "submission_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionDate;
    @XmlAttribute(name = "submission_comment")
    protected String submissionComment;
    @XmlAttribute(name = "lab_name")
    protected String labName;
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
     * Obtient la valeur de la propriété contacts.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionType.CONTACTS }
     *     
     */
    public SubmissionType.CONTACTS getCONTACTS() {
        return contacts;
    }

    /**
     * Définit la valeur de la propriété contacts.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionType.CONTACTS }
     *     
     */
    public void setCONTACTS(SubmissionType.CONTACTS value) {
        this.contacts = value;
    }

    /**
     * Obtient la valeur de la propriété actions.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionType.ACTIONS }
     *     
     */
    public SubmissionType.ACTIONS getACTIONS() {
        return actions;
    }

    /**
     * Définit la valeur de la propriété actions.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionType.ACTIONS }
     *     
     */
    public void setACTIONS(SubmissionType.ACTIONS value) {
        this.actions = value;
    }

    /**
     * Obtient la valeur de la propriété submissionlinks.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionType.SUBMISSIONLINKS }
     *     
     */
    public SubmissionType.SUBMISSIONLINKS getSUBMISSIONLINKS() {
        return submissionlinks;
    }

    /**
     * Définit la valeur de la propriété submissionlinks.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionType.SUBMISSIONLINKS }
     *     
     */
    public void setSUBMISSIONLINKS(SubmissionType.SUBMISSIONLINKS value) {
        this.submissionlinks = value;
    }

    /**
     * Obtient la valeur de la propriété submissionattributes.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionType.SUBMISSIONATTRIBUTES }
     *     
     */
    public SubmissionType.SUBMISSIONATTRIBUTES getSUBMISSIONATTRIBUTES() {
        return submissionattributes;
    }

    /**
     * Définit la valeur de la propriété submissionattributes.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionType.SUBMISSIONATTRIBUTES }
     *     
     */
    public void setSUBMISSIONATTRIBUTES(SubmissionType.SUBMISSIONATTRIBUTES value) {
        this.submissionattributes = value;
    }

    /**
     * Obtient la valeur de la propriété submissionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Définit la valeur de la propriété submissionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionDate(XMLGregorianCalendar value) {
        this.submissionDate = value;
    }

    /**
     * Obtient la valeur de la propriété submissionComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionComment() {
        return submissionComment;
    }

    /**
     * Définit la valeur de la propriété submissionComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionComment(String value) {
        this.submissionComment = value;
    }

    /**
     * Obtient la valeur de la propriété labName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabName() {
        return labName;
    }

    /**
     * Définit la valeur de la propriété labName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabName(String value) {
        this.labName = value;
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
     *         &lt;element name="ACTION">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="ADD">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="schema" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="study"/>
     *                                 &lt;enumeration value="experiment"/>
     *                                 &lt;enumeration value="sample"/>
     *                                 &lt;enumeration value="run"/>
     *                                 &lt;enumeration value="analysis"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MODIFY">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="schema" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="study"/>
     *                                 &lt;enumeration value="experiment"/>
     *                                 &lt;enumeration value="sample"/>
     *                                 &lt;enumeration value="run"/>
     *                                 &lt;enumeration value="analysis"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SUPPRESS">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="HOLD">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="HoldUntilDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RELEASE">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PROTECT">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="VALIDATE">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="schema" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="study"/>
     *                                 &lt;enumeration value="experiment"/>
     *                                 &lt;enumeration value="sample"/>
     *                                 &lt;enumeration value="run"/>
     *                                 &lt;enumeration value="analysis"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
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
        "action"
    })
    public static class ACTIONS {

        @XmlElement(name = "ACTION", required = true)
        protected List<SubmissionType.ACTIONS.ACTION> action;

        /**
         * Gets the value of the action property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the action property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubmissionType.ACTIONS.ACTION }
         * 
         * 
         */
        public List<SubmissionType.ACTIONS.ACTION> getACTION() {
            if (action == null) {
                action = new ArrayList<SubmissionType.ACTIONS.ACTION>();
            }
            return this.action;
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
         *         &lt;element name="ADD">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="schema" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="study"/>
         *                       &lt;enumeration value="experiment"/>
         *                       &lt;enumeration value="sample"/>
         *                       &lt;enumeration value="run"/>
         *                       &lt;enumeration value="analysis"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MODIFY">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="schema" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="study"/>
         *                       &lt;enumeration value="experiment"/>
         *                       &lt;enumeration value="sample"/>
         *                       &lt;enumeration value="run"/>
         *                       &lt;enumeration value="analysis"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SUPPRESS">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="HOLD">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="HoldUntilDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RELEASE">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PROTECT">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="VALIDATE">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="schema" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="study"/>
         *                       &lt;enumeration value="experiment"/>
         *                       &lt;enumeration value="sample"/>
         *                       &lt;enumeration value="run"/>
         *                       &lt;enumeration value="analysis"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
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
            "add",
            "modify",
            "suppress",
            "hold",
            "release",
            "protect",
            "validate"
        })
        public static class ACTION {

            @XmlElement(name = "ADD")
            protected SubmissionType.ACTIONS.ACTION.ADD add;
            @XmlElement(name = "MODIFY")
            protected SubmissionType.ACTIONS.ACTION.MODIFY modify;
            @XmlElement(name = "SUPPRESS")
            protected SubmissionType.ACTIONS.ACTION.SUPPRESS suppress;
            @XmlElement(name = "HOLD")
            protected SubmissionType.ACTIONS.ACTION.HOLD hold;
            @XmlElement(name = "RELEASE")
            protected SubmissionType.ACTIONS.ACTION.RELEASE release;
            @XmlElement(name = "PROTECT")
            protected SubmissionType.ACTIONS.ACTION.PROTECT protect;
            @XmlElement(name = "VALIDATE")
            protected SubmissionType.ACTIONS.ACTION.VALIDATE validate;

            /**
             * Obtient la valeur de la propriété add.
             * 
             * @return
             *     possible object is
             *     {@link SubmissionType.ACTIONS.ACTION.ADD }
             *     
             */
            public SubmissionType.ACTIONS.ACTION.ADD getADD() {
                return add;
            }

            /**
             * Définit la valeur de la propriété add.
             * 
             * @param value
             *     allowed object is
             *     {@link SubmissionType.ACTIONS.ACTION.ADD }
             *     
             */
            public void setADD(SubmissionType.ACTIONS.ACTION.ADD value) {
                this.add = value;
            }

            /**
             * Obtient la valeur de la propriété modify.
             * 
             * @return
             *     possible object is
             *     {@link SubmissionType.ACTIONS.ACTION.MODIFY }
             *     
             */
            public SubmissionType.ACTIONS.ACTION.MODIFY getMODIFY() {
                return modify;
            }

            /**
             * Définit la valeur de la propriété modify.
             * 
             * @param value
             *     allowed object is
             *     {@link SubmissionType.ACTIONS.ACTION.MODIFY }
             *     
             */
            public void setMODIFY(SubmissionType.ACTIONS.ACTION.MODIFY value) {
                this.modify = value;
            }

            /**
             * Obtient la valeur de la propriété suppress.
             * 
             * @return
             *     possible object is
             *     {@link SubmissionType.ACTIONS.ACTION.SUPPRESS }
             *     
             */
            public SubmissionType.ACTIONS.ACTION.SUPPRESS getSUPPRESS() {
                return suppress;
            }

            /**
             * Définit la valeur de la propriété suppress.
             * 
             * @param value
             *     allowed object is
             *     {@link SubmissionType.ACTIONS.ACTION.SUPPRESS }
             *     
             */
            public void setSUPPRESS(SubmissionType.ACTIONS.ACTION.SUPPRESS value) {
                this.suppress = value;
            }

            /**
             * Obtient la valeur de la propriété hold.
             * 
             * @return
             *     possible object is
             *     {@link SubmissionType.ACTIONS.ACTION.HOLD }
             *     
             */
            public SubmissionType.ACTIONS.ACTION.HOLD getHOLD() {
                return hold;
            }

            /**
             * Définit la valeur de la propriété hold.
             * 
             * @param value
             *     allowed object is
             *     {@link SubmissionType.ACTIONS.ACTION.HOLD }
             *     
             */
            public void setHOLD(SubmissionType.ACTIONS.ACTION.HOLD value) {
                this.hold = value;
            }

            /**
             * Obtient la valeur de la propriété release.
             * 
             * @return
             *     possible object is
             *     {@link SubmissionType.ACTIONS.ACTION.RELEASE }
             *     
             */
            public SubmissionType.ACTIONS.ACTION.RELEASE getRELEASE() {
                return release;
            }

            /**
             * Définit la valeur de la propriété release.
             * 
             * @param value
             *     allowed object is
             *     {@link SubmissionType.ACTIONS.ACTION.RELEASE }
             *     
             */
            public void setRELEASE(SubmissionType.ACTIONS.ACTION.RELEASE value) {
                this.release = value;
            }

            /**
             * Obtient la valeur de la propriété protect.
             * 
             * @return
             *     possible object is
             *     {@link SubmissionType.ACTIONS.ACTION.PROTECT }
             *     
             */
            public SubmissionType.ACTIONS.ACTION.PROTECT getPROTECT() {
                return protect;
            }

            /**
             * Définit la valeur de la propriété protect.
             * 
             * @param value
             *     allowed object is
             *     {@link SubmissionType.ACTIONS.ACTION.PROTECT }
             *     
             */
            public void setPROTECT(SubmissionType.ACTIONS.ACTION.PROTECT value) {
                this.protect = value;
            }

            /**
             * Obtient la valeur de la propriété validate.
             * 
             * @return
             *     possible object is
             *     {@link SubmissionType.ACTIONS.ACTION.VALIDATE }
             *     
             */
            public SubmissionType.ACTIONS.ACTION.VALIDATE getVALIDATE() {
                return validate;
            }

            /**
             * Définit la valeur de la propriété validate.
             * 
             * @param value
             *     allowed object is
             *     {@link SubmissionType.ACTIONS.ACTION.VALIDATE }
             *     
             */
            public void setVALIDATE(SubmissionType.ACTIONS.ACTION.VALIDATE value) {
                this.validate = value;
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
             *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="schema" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="study"/>
             *             &lt;enumeration value="experiment"/>
             *             &lt;enumeration value="sample"/>
             *             &lt;enumeration value="run"/>
             *             &lt;enumeration value="analysis"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ADD {

                @XmlAttribute(name = "source", required = true)
                protected String source;
                @XmlAttribute(name = "schema", required = true)
                protected String schema;

                /**
                 * Obtient la valeur de la propriété source.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSource() {
                    return source;
                }

                /**
                 * Définit la valeur de la propriété source.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSource(String value) {
                    this.source = value;
                }

                /**
                 * Obtient la valeur de la propriété schema.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchema() {
                    return schema;
                }

                /**
                 * Définit la valeur de la propriété schema.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchema(String value) {
                    this.schema = value;
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
             *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HoldUntilDate" type="{http://www.w3.org/2001/XMLSchema}date" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class HOLD {

                @XmlAttribute(name = "target")
                protected String target;
                @XmlAttribute(name = "HoldUntilDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar holdUntilDate;

                /**
                 * Obtient la valeur de la propriété target.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTarget() {
                    return target;
                }

                /**
                 * Définit la valeur de la propriété target.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTarget(String value) {
                    this.target = value;
                }

                /**
                 * Obtient la valeur de la propriété holdUntilDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getHoldUntilDate() {
                    return holdUntilDate;
                }

                /**
                 * Définit la valeur de la propriété holdUntilDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setHoldUntilDate(XMLGregorianCalendar value) {
                    this.holdUntilDate = value;
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
             *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="schema" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="study"/>
             *             &lt;enumeration value="experiment"/>
             *             &lt;enumeration value="sample"/>
             *             &lt;enumeration value="run"/>
             *             &lt;enumeration value="analysis"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MODIFY {

                @XmlAttribute(name = "source", required = true)
                protected String source;
                @XmlAttribute(name = "schema", required = true)
                protected String schema;

                /**
                 * Obtient la valeur de la propriété source.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSource() {
                    return source;
                }

                /**
                 * Définit la valeur de la propriété source.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSource(String value) {
                    this.source = value;
                }

                /**
                 * Obtient la valeur de la propriété schema.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchema() {
                    return schema;
                }

                /**
                 * Définit la valeur de la propriété schema.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchema(String value) {
                    this.schema = value;
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PROTECT {


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
             *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RELEASE {

                @XmlAttribute(name = "target")
                protected String target;

                /**
                 * Obtient la valeur de la propriété target.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTarget() {
                    return target;
                }

                /**
                 * Définit la valeur de la propriété target.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTarget(String value) {
                    this.target = value;
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
             *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SUPPRESS {

                @XmlAttribute(name = "target", required = true)
                protected String target;

                /**
                 * Obtient la valeur de la propriété target.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTarget() {
                    return target;
                }

                /**
                 * Définit la valeur de la propriété target.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTarget(String value) {
                    this.target = value;
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
             *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="schema" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="study"/>
             *             &lt;enumeration value="experiment"/>
             *             &lt;enumeration value="sample"/>
             *             &lt;enumeration value="run"/>
             *             &lt;enumeration value="analysis"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class VALIDATE {

                @XmlAttribute(name = "source", required = true)
                protected String source;
                @XmlAttribute(name = "schema", required = true)
                protected String schema;

                /**
                 * Obtient la valeur de la propriété source.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSource() {
                    return source;
                }

                /**
                 * Définit la valeur de la propriété source.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSource(String value) {
                    this.source = value;
                }

                /**
                 * Obtient la valeur de la propriété schema.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchema() {
                    return schema;
                }

                /**
                 * Définit la valeur de la propriété schema.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchema(String value) {
                    this.schema = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="CONTACT">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="inform_on_status" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                 &lt;attribute name="inform_on_error" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
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
        "contact"
    })
    public static class CONTACTS {

        @XmlElement(name = "CONTACT", required = true)
        protected List<SubmissionType.CONTACTS.CONTACT> contact;

        /**
         * Gets the value of the contact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubmissionType.CONTACTS.CONTACT }
         * 
         * 
         */
        public List<SubmissionType.CONTACTS.CONTACT> getCONTACT() {
            if (contact == null) {
                contact = new ArrayList<SubmissionType.CONTACTS.CONTACT>();
            }
            return this.contact;
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
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="inform_on_status" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *       &lt;attribute name="inform_on_error" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CONTACT {

            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "inform_on_status")
            @XmlSchemaType(name = "anyURI")
            protected String informOnStatus;
            @XmlAttribute(name = "inform_on_error")
            @XmlSchemaType(name = "anyURI")
            protected String informOnError;

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
             * Obtient la valeur de la propriété informOnStatus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInformOnStatus() {
                return informOnStatus;
            }

            /**
             * Définit la valeur de la propriété informOnStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInformOnStatus(String value) {
                this.informOnStatus = value;
            }

            /**
             * Obtient la valeur de la propriété informOnError.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInformOnError() {
                return informOnError;
            }

            /**
             * Définit la valeur de la propriété informOnError.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInformOnError(String value) {
                this.informOnError = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="SUBMISSION_ATTRIBUTE" type="{}AttributeType"/>
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
        "submissionattribute"
    })
    public static class SUBMISSIONATTRIBUTES {

        @XmlElement(name = "SUBMISSION_ATTRIBUTE", required = true)
        protected List<AttributeType> submissionattribute;

        /**
         * Gets the value of the submissionattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the submissionattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUBMISSIONATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getSUBMISSIONATTRIBUTE() {
            if (submissionattribute == null) {
                submissionattribute = new ArrayList<AttributeType>();
            }
            return this.submissionattribute;
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
     *         &lt;element name="SUBMISSION_LINK" type="{}LinkType"/>
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
        "submissionlink"
    })
    public static class SUBMISSIONLINKS {

        @XmlElement(name = "SUBMISSION_LINK", required = true)
        protected List<LinkType> submissionlink;

        /**
         * Gets the value of the submissionlink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the submissionlink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUBMISSIONLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getSUBMISSIONLINK() {
            if (submissionlink == null) {
                submissionlink = new ArrayList<LinkType>();
            }
            return this.submissionlink;
        }

    }

}
