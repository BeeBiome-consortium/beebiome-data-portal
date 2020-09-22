
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  A Study is a container for a sequencing investigation that may comprise multiple experiments. The
 *       Study has an overall goal, but is otherwise minimally defined in the SRA. A Study is composed of a descriptor, zero
 *       or more experiments, and zero or more analyses. The submitter may decorate the Study with web links and properties. 
 * 
 * <p>Classe Java pour StudyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StudyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFIERS" type="{}IdentifierType" minOccurs="0"/>
 *         &lt;element name="DESCRIPTOR">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STUDY_TITLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="STUDY_TYPE" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="existing_study_type" use="required" type="{}typeStudyTypes" />
 *                           &lt;attribute name="new_study_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="STUDY_ABSTRACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CENTER_PROJECT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RELATED_STUDIES" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RELATED_STUDY" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RELATED_LINK" type="{}XRefType"/>
 *                                       &lt;element name="IS_PRIMARY" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="STUDY_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="STUDY_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="STUDY_LINK" type="{}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="STUDY_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="STUDY_ATTRIBUTE" type="{}AttributeType"/>
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
@XmlType(name = "StudyType", propOrder = {
    "identifiers",
    "descriptor",
    "studylinks",
    "studyattributes"
})
public class StudyType {

    @XmlElement(name = "IDENTIFIERS")
    protected IdentifierType identifiers;
    @XmlElement(name = "DESCRIPTOR", required = true)
    protected StudyType.DESCRIPTOR descriptor;
    @XmlElement(name = "STUDY_LINKS")
    protected StudyType.STUDYLINKS studylinks;
    @XmlElement(name = "STUDY_ATTRIBUTES")
    protected StudyType.STUDYATTRIBUTES studyattributes;
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
     * Obtient la valeur de la propriété descriptor.
     * 
     * @return
     *     possible object is
     *     {@link StudyType.DESCRIPTOR }
     *     
     */
    public StudyType.DESCRIPTOR getDESCRIPTOR() {
        return descriptor;
    }

    /**
     * Définit la valeur de la propriété descriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link StudyType.DESCRIPTOR }
     *     
     */
    public void setDESCRIPTOR(StudyType.DESCRIPTOR value) {
        this.descriptor = value;
    }

    /**
     * Obtient la valeur de la propriété studylinks.
     * 
     * @return
     *     possible object is
     *     {@link StudyType.STUDYLINKS }
     *     
     */
    public StudyType.STUDYLINKS getSTUDYLINKS() {
        return studylinks;
    }

    /**
     * Définit la valeur de la propriété studylinks.
     * 
     * @param value
     *     allowed object is
     *     {@link StudyType.STUDYLINKS }
     *     
     */
    public void setSTUDYLINKS(StudyType.STUDYLINKS value) {
        this.studylinks = value;
    }

    /**
     * Obtient la valeur de la propriété studyattributes.
     * 
     * @return
     *     possible object is
     *     {@link StudyType.STUDYATTRIBUTES }
     *     
     */
    public StudyType.STUDYATTRIBUTES getSTUDYATTRIBUTES() {
        return studyattributes;
    }

    /**
     * Définit la valeur de la propriété studyattributes.
     * 
     * @param value
     *     allowed object is
     *     {@link StudyType.STUDYATTRIBUTES }
     *     
     */
    public void setSTUDYATTRIBUTES(StudyType.STUDYATTRIBUTES value) {
        this.studyattributes = value;
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
     *         &lt;element name="STUDY_TITLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="STUDY_TYPE" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="existing_study_type" use="required" type="{}typeStudyTypes" />
     *                 &lt;attribute name="new_study_type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="STUDY_ABSTRACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CENTER_PROJECT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RELATED_STUDIES" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RELATED_STUDY" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RELATED_LINK" type="{}XRefType"/>
     *                             &lt;element name="IS_PRIMARY" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="STUDY_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "studytitle",
        "studytype",
        "studyabstract",
        "centerprojectname",
        "relatedstudies",
        "studydescription"
    })
    public static class DESCRIPTOR {

        @XmlElement(name = "STUDY_TITLE", required = true)
        protected String studytitle;
        @XmlElement(name = "STUDY_TYPE")
        protected StudyType.DESCRIPTOR.STUDYTYPE studytype;
        @XmlElement(name = "STUDY_ABSTRACT")
        protected String studyabstract;
        @XmlElement(name = "CENTER_PROJECT_NAME")
        protected String centerprojectname;
        @XmlElement(name = "RELATED_STUDIES")
        protected StudyType.DESCRIPTOR.RELATEDSTUDIES relatedstudies;
        @XmlElement(name = "STUDY_DESCRIPTION")
        protected String studydescription;

        /**
         * Obtient la valeur de la propriété studytitle.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTUDYTITLE() {
            return studytitle;
        }

        /**
         * Définit la valeur de la propriété studytitle.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTUDYTITLE(String value) {
            this.studytitle = value;
        }

        /**
         * Obtient la valeur de la propriété studytype.
         * 
         * @return
         *     possible object is
         *     {@link StudyType.DESCRIPTOR.STUDYTYPE }
         *     
         */
        public StudyType.DESCRIPTOR.STUDYTYPE getSTUDYTYPE() {
            return studytype;
        }

        /**
         * Définit la valeur de la propriété studytype.
         * 
         * @param value
         *     allowed object is
         *     {@link StudyType.DESCRIPTOR.STUDYTYPE }
         *     
         */
        public void setSTUDYTYPE(StudyType.DESCRIPTOR.STUDYTYPE value) {
            this.studytype = value;
        }

        /**
         * Obtient la valeur de la propriété studyabstract.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTUDYABSTRACT() {
            return studyabstract;
        }

        /**
         * Définit la valeur de la propriété studyabstract.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTUDYABSTRACT(String value) {
            this.studyabstract = value;
        }

        /**
         * Obtient la valeur de la propriété centerprojectname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCENTERPROJECTNAME() {
            return centerprojectname;
        }

        /**
         * Définit la valeur de la propriété centerprojectname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCENTERPROJECTNAME(String value) {
            this.centerprojectname = value;
        }

        /**
         * Obtient la valeur de la propriété relatedstudies.
         * 
         * @return
         *     possible object is
         *     {@link StudyType.DESCRIPTOR.RELATEDSTUDIES }
         *     
         */
        public StudyType.DESCRIPTOR.RELATEDSTUDIES getRELATEDSTUDIES() {
            return relatedstudies;
        }

        /**
         * Définit la valeur de la propriété relatedstudies.
         * 
         * @param value
         *     allowed object is
         *     {@link StudyType.DESCRIPTOR.RELATEDSTUDIES }
         *     
         */
        public void setRELATEDSTUDIES(StudyType.DESCRIPTOR.RELATEDSTUDIES value) {
            this.relatedstudies = value;
        }

        /**
         * Obtient la valeur de la propriété studydescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTUDYDESCRIPTION() {
            return studydescription;
        }

        /**
         * Définit la valeur de la propriété studydescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTUDYDESCRIPTION(String value) {
            this.studydescription = value;
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
         *         &lt;element name="RELATED_STUDY" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RELATED_LINK" type="{}XRefType"/>
         *                   &lt;element name="IS_PRIMARY" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                 &lt;/sequence>
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
            "relatedstudy"
        })
        public static class RELATEDSTUDIES {

            @XmlElement(name = "RELATED_STUDY", required = true)
            protected List<StudyType.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY> relatedstudy;

            /**
             * Gets the value of the relatedstudy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the relatedstudy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRELATEDSTUDY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StudyType.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY }
             * 
             * 
             */
            public List<StudyType.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY> getRELATEDSTUDY() {
                if (relatedstudy == null) {
                    relatedstudy = new ArrayList<StudyType.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY>();
                }
                return this.relatedstudy;
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
             *         &lt;element name="RELATED_LINK" type="{}XRefType"/>
             *         &lt;element name="IS_PRIMARY" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                "relatedlink",
                "isprimary"
            })
            public static class RELATEDSTUDY {

                @XmlElement(name = "RELATED_LINK", required = true)
                protected XRefType relatedlink;
                @XmlElement(name = "IS_PRIMARY")
                protected boolean isprimary;

                /**
                 * Obtient la valeur de la propriété relatedlink.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XRefType }
                 *     
                 */
                public XRefType getRELATEDLINK() {
                    return relatedlink;
                }

                /**
                 * Définit la valeur de la propriété relatedlink.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XRefType }
                 *     
                 */
                public void setRELATEDLINK(XRefType value) {
                    this.relatedlink = value;
                }

                /**
                 * Obtient la valeur de la propriété isprimary.
                 * 
                 */
                public boolean isISPRIMARY() {
                    return isprimary;
                }

                /**
                 * Définit la valeur de la propriété isprimary.
                 * 
                 */
                public void setISPRIMARY(boolean value) {
                    this.isprimary = value;
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
         *       &lt;attribute name="existing_study_type" use="required" type="{}typeStudyTypes" />
         *       &lt;attribute name="new_study_type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class STUDYTYPE {

            @XmlAttribute(name = "existing_study_type", required = true)
            protected TypeStudyTypes existingStudyType;
            @XmlAttribute(name = "new_study_type")
            protected String newStudyType;

            /**
             * Obtient la valeur de la propriété existingStudyType.
             * 
             * @return
             *     possible object is
             *     {@link TypeStudyTypes }
             *     
             */
            public TypeStudyTypes getExistingStudyType() {
                return existingStudyType;
            }

            /**
             * Définit la valeur de la propriété existingStudyType.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeStudyTypes }
             *     
             */
            public void setExistingStudyType(TypeStudyTypes value) {
                this.existingStudyType = value;
            }

            /**
             * Obtient la valeur de la propriété newStudyType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewStudyType() {
                return newStudyType;
            }

            /**
             * Définit la valeur de la propriété newStudyType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewStudyType(String value) {
                this.newStudyType = value;
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
     *         &lt;element name="STUDY_ATTRIBUTE" type="{}AttributeType"/>
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
        "studyattribute"
    })
    public static class STUDYATTRIBUTES {

        @XmlElement(name = "STUDY_ATTRIBUTE", required = true)
        protected List<AttributeType> studyattribute;

        /**
         * Gets the value of the studyattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the studyattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTUDYATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getSTUDYATTRIBUTE() {
            if (studyattribute == null) {
                studyattribute = new ArrayList<AttributeType>();
            }
            return this.studyattribute;
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
     *         &lt;element name="STUDY_LINK" type="{}LinkType"/>
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
        "studylink"
    })
    public static class STUDYLINKS {

        @XmlElement(name = "STUDY_LINK", required = true)
        protected List<LinkType> studylink;

        /**
         * Gets the value of the studylink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the studylink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTUDYLINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        public List<LinkType> getSTUDYLINK() {
            if (studylink == null) {
                studylink = new ArrayList<LinkType>();
            }
            return this.studylink;
        }

    }

}
