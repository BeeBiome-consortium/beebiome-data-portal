
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour typeSubmission complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeSubmission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Submitter" type="{}typeAccount" minOccurs="0"/>
 *                   &lt;element name="Organization" type="{}typeOrganization" maxOccurs="unbounded"/>
 *                   &lt;element name="Hold" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="release_date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Access">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="public"/>
 *                         &lt;enumeration value="controlled-access"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Context" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>typeIdTag">
 *                 &lt;attribute name="local_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Action" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="ProcessFile">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{}typeFile">
 *                           &lt;attGroup ref="{}attributesFileGroup"/>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AddFiles">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="File" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{}typeFile">
 *                                     &lt;attribute name="target_db_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{}attributesFileGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AddData">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Data" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{}typeInlineData">
 *                                     &lt;attribute name="target_db_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{}attributesFileGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ChangeStatus">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Target" type="{}typeIdTag"/>
 *                             &lt;choice>
 *                               &lt;element name="Release" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                               &lt;element name="SetReleaseDate">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="release_date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="Suppress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="AddComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *                 &lt;attribute name="action_id" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="submitted" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="last_update" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="related_to" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="submission_id" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeSubmission", propOrder = {
    "description",
    "context",
    "action"
})
public class TypeSubmission {

    @XmlElement(name = "Description", required = true)
    protected TypeSubmission.Description description;
    @XmlElement(name = "Context")
    protected List<TypeSubmission.Context> context;
    @XmlElement(name = "Action")
    protected List<TypeSubmission.Action> action;
    @XmlAttribute(name = "submitted")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar submitted;
    @XmlAttribute(name = "last_update")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdate;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "related_to")
    protected String relatedTo;
    @XmlAttribute(name = "submission_id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String submissionId;

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link TypeSubmission.Description }
     *     
     */
    public TypeSubmission.Description getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSubmission.Description }
     *     
     */
    public void setDescription(TypeSubmission.Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the context property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSubmission.Context }
     * 
     * 
     */
    public List<TypeSubmission.Context> getContext() {
        if (context == null) {
            context = new ArrayList<TypeSubmission.Context>();
        }
        return this.context;
    }

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
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSubmission.Action }
     * 
     * 
     */
    public List<TypeSubmission.Action> getAction() {
        if (action == null) {
            action = new ArrayList<TypeSubmission.Action>();
        }
        return this.action;
    }

    /**
     * Obtient la valeur de la propriété submitted.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitted() {
        return submitted;
    }

    /**
     * Définit la valeur de la propriété submitted.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitted(XMLGregorianCalendar value) {
        this.submitted = value;
    }

    /**
     * Obtient la valeur de la propriété lastUpdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Définit la valeur de la propriété lastUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété relatedTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedTo() {
        return relatedTo;
    }

    /**
     * Définit la valeur de la propriété relatedTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedTo(String value) {
        this.relatedTo = value;
    }

    /**
     * Obtient la valeur de la propriété submissionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionId() {
        return submissionId;
    }

    /**
     * Définit la valeur de la propriété submissionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionId(String value) {
        this.submissionId = value;
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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="ProcessFile">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{}typeFile">
     *                 &lt;attGroup ref="{}attributesFileGroup"/>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AddFiles">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="File" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{}typeFile">
     *                           &lt;attribute name="target_db_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{}attributesFileGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AddData">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Data" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{}typeInlineData">
     *                           &lt;attribute name="target_db_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{}attributesFileGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ChangeStatus">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Target" type="{}typeIdTag"/>
     *                   &lt;choice>
     *                     &lt;element name="Release" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                     &lt;element name="SetReleaseDate">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="release_date" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="Suppress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     &lt;element name="AddComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *       &lt;attribute name="action_id" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "processFile",
        "addFiles",
        "addData",
        "changeStatus"
    })
    public static class Action {

        @XmlElement(name = "ProcessFile")
        protected TypeSubmission.Action.ProcessFile processFile;
        @XmlElement(name = "AddFiles")
        protected TypeSubmission.Action.AddFiles addFiles;
        @XmlElement(name = "AddData")
        protected TypeSubmission.Action.AddData addData;
        @XmlElement(name = "ChangeStatus")
        protected TypeSubmission.Action.ChangeStatus changeStatus;
        @XmlAttribute(name = "action_id")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String actionId;

        /**
         * Obtient la valeur de la propriété processFile.
         * 
         * @return
         *     possible object is
         *     {@link TypeSubmission.Action.ProcessFile }
         *     
         */
        public TypeSubmission.Action.ProcessFile getProcessFile() {
            return processFile;
        }

        /**
         * Définit la valeur de la propriété processFile.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSubmission.Action.ProcessFile }
         *     
         */
        public void setProcessFile(TypeSubmission.Action.ProcessFile value) {
            this.processFile = value;
        }

        /**
         * Obtient la valeur de la propriété addFiles.
         * 
         * @return
         *     possible object is
         *     {@link TypeSubmission.Action.AddFiles }
         *     
         */
        public TypeSubmission.Action.AddFiles getAddFiles() {
            return addFiles;
        }

        /**
         * Définit la valeur de la propriété addFiles.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSubmission.Action.AddFiles }
         *     
         */
        public void setAddFiles(TypeSubmission.Action.AddFiles value) {
            this.addFiles = value;
        }

        /**
         * Obtient la valeur de la propriété addData.
         * 
         * @return
         *     possible object is
         *     {@link TypeSubmission.Action.AddData }
         *     
         */
        public TypeSubmission.Action.AddData getAddData() {
            return addData;
        }

        /**
         * Définit la valeur de la propriété addData.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSubmission.Action.AddData }
         *     
         */
        public void setAddData(TypeSubmission.Action.AddData value) {
            this.addData = value;
        }

        /**
         * Obtient la valeur de la propriété changeStatus.
         * 
         * @return
         *     possible object is
         *     {@link TypeSubmission.Action.ChangeStatus }
         *     
         */
        public TypeSubmission.Action.ChangeStatus getChangeStatus() {
            return changeStatus;
        }

        /**
         * Définit la valeur de la propriété changeStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSubmission.Action.ChangeStatus }
         *     
         */
        public void setChangeStatus(TypeSubmission.Action.ChangeStatus value) {
            this.changeStatus = value;
        }

        /**
         * Obtient la valeur de la propriété actionId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionId() {
            return actionId;
        }

        /**
         * Définit la valeur de la propriété actionId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionId(String value) {
            this.actionId = value;
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
         *         &lt;element name="Data" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{}typeInlineData">
         *                 &lt;attribute name="target_db_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{}attributesFileGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "data"
        })
        public static class AddData {

            @XmlElement(name = "Data", required = true)
            protected List<TypeSubmission.Action.AddData.Data> data;
            @XmlAttribute(name = "target_db")
            @XmlSchemaType(name = "anySimpleType")
            protected String targetDb;
            @XmlAttribute(name = "target_db_context")
            @XmlSchemaType(name = "anySimpleType")
            protected String targetDbContext;

            /**
             * Gets the value of the data property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the data property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypeSubmission.Action.AddData.Data }
             * 
             * 
             */
            public List<TypeSubmission.Action.AddData.Data> getData() {
                if (data == null) {
                    data = new ArrayList<TypeSubmission.Action.AddData.Data>();
                }
                return this.data;
            }

            /**
             * Obtient la valeur de la propriété targetDb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargetDb() {
                return targetDb;
            }

            /**
             * Définit la valeur de la propriété targetDb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargetDb(String value) {
                this.targetDb = value;
            }

            /**
             * Obtient la valeur de la propriété targetDbContext.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargetDbContext() {
                return targetDbContext;
            }

            /**
             * Définit la valeur de la propriété targetDbContext.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargetDbContext(String value) {
                this.targetDbContext = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{}typeInlineData">
             *       &lt;attribute name="target_db_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Data
                extends TypeInlineData
            {

                @XmlAttribute(name = "target_db_label")
                @XmlSchemaType(name = "anySimpleType")
                protected String targetDbLabel;

                /**
                 * Obtient la valeur de la propriété targetDbLabel.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTargetDbLabel() {
                    return targetDbLabel;
                }

                /**
                 * Définit la valeur de la propriété targetDbLabel.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTargetDbLabel(String value) {
                    this.targetDbLabel = value;
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
         *         &lt;element name="File" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{}typeFile">
         *                 &lt;attribute name="target_db_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{}attributesFileGroup"/>
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
        public static class AddFiles {

            @XmlElement(name = "File", required = true)
            protected List<TypeSubmission.Action.AddFiles.File> file;
            @XmlAttribute(name = "target_db")
            @XmlSchemaType(name = "anySimpleType")
            protected String targetDb;
            @XmlAttribute(name = "target_db_context")
            @XmlSchemaType(name = "anySimpleType")
            protected String targetDbContext;

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
             *    getFile().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypeSubmission.Action.AddFiles.File }
             * 
             * 
             */
            public List<TypeSubmission.Action.AddFiles.File> getFile() {
                if (file == null) {
                    file = new ArrayList<TypeSubmission.Action.AddFiles.File>();
                }
                return this.file;
            }

            /**
             * Obtient la valeur de la propriété targetDb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargetDb() {
                return targetDb;
            }

            /**
             * Définit la valeur de la propriété targetDb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargetDb(String value) {
                this.targetDb = value;
            }

            /**
             * Obtient la valeur de la propriété targetDbContext.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargetDbContext() {
                return targetDbContext;
            }

            /**
             * Définit la valeur de la propriété targetDbContext.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargetDbContext(String value) {
                this.targetDbContext = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{}typeFile">
             *       &lt;attribute name="target_db_label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class File
                extends TypeFile
            {

                @XmlAttribute(name = "target_db_label")
                @XmlSchemaType(name = "anySimpleType")
                protected String targetDbLabel;

                /**
                 * Obtient la valeur de la propriété targetDbLabel.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTargetDbLabel() {
                    return targetDbLabel;
                }

                /**
                 * Définit la valeur de la propriété targetDbLabel.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTargetDbLabel(String value) {
                    this.targetDbLabel = value;
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
         *         &lt;element name="Target" type="{}typeIdTag"/>
         *         &lt;choice>
         *           &lt;element name="Release" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *           &lt;element name="SetReleaseDate">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="release_date" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="Suppress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *           &lt;element name="AddComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;/choice>
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
            "target",
            "release",
            "setReleaseDate",
            "suppress",
            "addComment"
        })
        public static class ChangeStatus {

            @XmlElement(name = "Target", required = true)
            protected TypeIdTag target;
            @XmlElement(name = "Release")
            protected Object release;
            @XmlElement(name = "SetReleaseDate")
            protected TypeSubmission.Action.ChangeStatus.SetReleaseDate setReleaseDate;
            @XmlElement(name = "Suppress")
            protected String suppress;
            @XmlElement(name = "AddComment")
            protected String addComment;

            /**
             * Obtient la valeur de la propriété target.
             * 
             * @return
             *     possible object is
             *     {@link TypeIdTag }
             *     
             */
            public TypeIdTag getTarget() {
                return target;
            }

            /**
             * Définit la valeur de la propriété target.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeIdTag }
             *     
             */
            public void setTarget(TypeIdTag value) {
                this.target = value;
            }

            /**
             * Obtient la valeur de la propriété release.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getRelease() {
                return release;
            }

            /**
             * Définit la valeur de la propriété release.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setRelease(Object value) {
                this.release = value;
            }

            /**
             * Obtient la valeur de la propriété setReleaseDate.
             * 
             * @return
             *     possible object is
             *     {@link TypeSubmission.Action.ChangeStatus.SetReleaseDate }
             *     
             */
            public TypeSubmission.Action.ChangeStatus.SetReleaseDate getSetReleaseDate() {
                return setReleaseDate;
            }

            /**
             * Définit la valeur de la propriété setReleaseDate.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeSubmission.Action.ChangeStatus.SetReleaseDate }
             *     
             */
            public void setSetReleaseDate(TypeSubmission.Action.ChangeStatus.SetReleaseDate value) {
                this.setReleaseDate = value;
            }

            /**
             * Obtient la valeur de la propriété suppress.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuppress() {
                return suppress;
            }

            /**
             * Définit la valeur de la propriété suppress.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuppress(String value) {
                this.suppress = value;
            }

            /**
             * Obtient la valeur de la propriété addComment.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddComment() {
                return addComment;
            }

            /**
             * Définit la valeur de la propriété addComment.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddComment(String value) {
                this.addComment = value;
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
             *       &lt;attribute name="release_date" type="{http://www.w3.org/2001/XMLSchema}date" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SetReleaseDate {

                @XmlAttribute(name = "release_date")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar releaseDate;

                /**
                 * Obtient la valeur de la propriété releaseDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getReleaseDate() {
                    return releaseDate;
                }

                /**
                 * Définit la valeur de la propriété releaseDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setReleaseDate(XMLGregorianCalendar value) {
                    this.releaseDate = value;
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
         *     &lt;extension base="{}typeFile">
         *       &lt;attGroup ref="{}attributesFileGroup"/>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ProcessFile
            extends TypeFile
        {

            @XmlAttribute(name = "target_db")
            @XmlSchemaType(name = "anySimpleType")
            protected String targetDb;
            @XmlAttribute(name = "target_db_context")
            @XmlSchemaType(name = "anySimpleType")
            protected String targetDbContext;

            /**
             * Obtient la valeur de la propriété targetDb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargetDb() {
                return targetDb;
            }

            /**
             * Définit la valeur de la propriété targetDb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargetDb(String value) {
                this.targetDb = value;
            }

            /**
             * Obtient la valeur de la propriété targetDbContext.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargetDbContext() {
                return targetDbContext;
            }

            /**
             * Définit la valeur de la propriété targetDbContext.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargetDbContext(String value) {
                this.targetDbContext = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>typeIdTag">
     *       &lt;attribute name="local_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Context
        extends TypeIdTag
    {

        @XmlAttribute(name = "local_name")
        protected String localName;

        /**
         * Obtient la valeur de la propriété localName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalName() {
            return localName;
        }

        /**
         * Définit la valeur de la propriété localName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalName(String value) {
            this.localName = value;
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
     *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Submitter" type="{}typeAccount" minOccurs="0"/>
     *         &lt;element name="Organization" type="{}typeOrganization" maxOccurs="unbounded"/>
     *         &lt;element name="Hold" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="release_date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Access">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="public"/>
     *               &lt;enumeration value="controlled-access"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "comment",
        "submitter",
        "organization",
        "hold",
        "access"
    })
    public static class Description {

        @XmlElement(name = "Comment")
        protected String comment;
        @XmlElement(name = "Submitter")
        protected TypeAccount submitter;
        @XmlElement(name = "Organization", required = true)
        protected List<TypeOrganization> organization;
        @XmlElement(name = "Hold")
        protected TypeSubmission.Description.Hold hold;
        @XmlElement(name = "Access", required = true)
        protected String access;

        /**
         * Obtient la valeur de la propriété comment.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Définit la valeur de la propriété comment.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * Obtient la valeur de la propriété submitter.
         * 
         * @return
         *     possible object is
         *     {@link TypeAccount }
         *     
         */
        public TypeAccount getSubmitter() {
            return submitter;
        }

        /**
         * Définit la valeur de la propriété submitter.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeAccount }
         *     
         */
        public void setSubmitter(TypeAccount value) {
            this.submitter = value;
        }

        /**
         * Gets the value of the organization property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organization property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeOrganization }
         * 
         * 
         */
        public List<TypeOrganization> getOrganization() {
            if (organization == null) {
                organization = new ArrayList<TypeOrganization>();
            }
            return this.organization;
        }

        /**
         * Obtient la valeur de la propriété hold.
         * 
         * @return
         *     possible object is
         *     {@link TypeSubmission.Description.Hold }
         *     
         */
        public TypeSubmission.Description.Hold getHold() {
            return hold;
        }

        /**
         * Définit la valeur de la propriété hold.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSubmission.Description.Hold }
         *     
         */
        public void setHold(TypeSubmission.Description.Hold value) {
            this.hold = value;
        }

        /**
         * Obtient la valeur de la propriété access.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccess() {
            return access;
        }

        /**
         * Définit la valeur de la propriété access.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccess(String value) {
            this.access = value;
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
         *       &lt;attribute name="release_date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Hold {

            @XmlAttribute(name = "release_date", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar releaseDate;

            /**
             * Obtient la valeur de la propriété releaseDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getReleaseDate() {
                return releaseDate;
            }

            /**
             * Définit la valeur de la propriété releaseDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setReleaseDate(XMLGregorianCalendar value) {
                this.releaseDate = value;
            }

        }

    }

}
