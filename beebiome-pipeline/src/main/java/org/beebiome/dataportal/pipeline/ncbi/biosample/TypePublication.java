
package org.beebiome.dataportal.pipeline.ncbi.biosample;

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
 * <p>Classe Java pour typePublication complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typePublication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthorSet" type="{SP.common}typeAuthorSet" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StructuredCitation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Journal" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="JournalTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Issue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PagesFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PagesTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="DbType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="ePMC"/>
 *               &lt;enumeration value="ePubmed"/>
 *               &lt;enumeration value="eDOI"/>
 *               &lt;enumeration value="eNotAvailable"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="ePublished"/>
 *             &lt;enumeration value="eInPress"/>
 *             &lt;enumeration value="eUnpublished"/>
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
@XmlType(name = "typePublication", namespace = "SP.common", propOrder = {
    "authorSet",
    "reference",
    "structuredCitation",
    "dbType"
})
public class TypePublication {

    @XmlElement(name = "AuthorSet")
    protected TypeAuthorSet authorSet;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "StructuredCitation")
    protected TypePublication.StructuredCitation structuredCitation;
    @XmlElement(name = "DbType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dbType;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;

    /**
     * Obtient la valeur de la propriété authorSet.
     * 
     * @return
     *     possible object is
     *     {@link TypeAuthorSet }
     *     
     */
    public TypeAuthorSet getAuthorSet() {
        return authorSet;
    }

    /**
     * Définit la valeur de la propriété authorSet.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAuthorSet }
     *     
     */
    public void setAuthorSet(TypeAuthorSet value) {
        this.authorSet = value;
    }

    /**
     * Obtient la valeur de la propriété reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Définit la valeur de la propriété reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Obtient la valeur de la propriété structuredCitation.
     * 
     * @return
     *     possible object is
     *     {@link TypePublication.StructuredCitation }
     *     
     */
    public TypePublication.StructuredCitation getStructuredCitation() {
        return structuredCitation;
    }

    /**
     * Définit la valeur de la propriété structuredCitation.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePublication.StructuredCitation }
     *     
     */
    public void setStructuredCitation(TypePublication.StructuredCitation value) {
        this.structuredCitation = value;
    }

    /**
     * Obtient la valeur de la propriété dbType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbType() {
        return dbType;
    }

    /**
     * Définit la valeur de la propriété dbType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbType(String value) {
        this.dbType = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
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
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Journal" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="JournalTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Issue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PagesFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PagesTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "title",
        "journal"
    })
    public static class StructuredCitation {

        @XmlElement(name = "Title", required = true)
        protected String title;
        @XmlElement(name = "Journal")
        protected TypePublication.StructuredCitation.Journal journal;

        /**
         * Obtient la valeur de la propriété title.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
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
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Obtient la valeur de la propriété journal.
         * 
         * @return
         *     possible object is
         *     {@link TypePublication.StructuredCitation.Journal }
         *     
         */
        public TypePublication.StructuredCitation.Journal getJournal() {
            return journal;
        }

        /**
         * Définit la valeur de la propriété journal.
         * 
         * @param value
         *     allowed object is
         *     {@link TypePublication.StructuredCitation.Journal }
         *     
         */
        public void setJournal(TypePublication.StructuredCitation.Journal value) {
            this.journal = value;
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
         *         &lt;element name="JournalTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Issue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PagesFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PagesTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "journalTitle",
            "year",
            "volume",
            "issue",
            "pagesFrom",
            "pagesTo"
        })
        public static class Journal {

            @XmlElement(name = "JournalTitle", required = true)
            protected String journalTitle;
            @XmlElement(name = "Year")
            protected String year;
            @XmlElement(name = "Volume")
            protected String volume;
            @XmlElement(name = "Issue")
            protected String issue;
            @XmlElement(name = "PagesFrom")
            protected String pagesFrom;
            @XmlElement(name = "PagesTo")
            protected String pagesTo;

            /**
             * Obtient la valeur de la propriété journalTitle.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJournalTitle() {
                return journalTitle;
            }

            /**
             * Définit la valeur de la propriété journalTitle.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJournalTitle(String value) {
                this.journalTitle = value;
            }

            /**
             * Obtient la valeur de la propriété year.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYear() {
                return year;
            }

            /**
             * Définit la valeur de la propriété year.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYear(String value) {
                this.year = value;
            }

            /**
             * Obtient la valeur de la propriété volume.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVolume() {
                return volume;
            }

            /**
             * Définit la valeur de la propriété volume.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVolume(String value) {
                this.volume = value;
            }

            /**
             * Obtient la valeur de la propriété issue.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIssue() {
                return issue;
            }

            /**
             * Définit la valeur de la propriété issue.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssue(String value) {
                this.issue = value;
            }

            /**
             * Obtient la valeur de la propriété pagesFrom.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPagesFrom() {
                return pagesFrom;
            }

            /**
             * Définit la valeur de la propriété pagesFrom.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPagesFrom(String value) {
                this.pagesFrom = value;
            }

            /**
             * Obtient la valeur de la propriété pagesTo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPagesTo() {
                return pagesTo;
            }

            /**
             * Définit la valeur de la propriété pagesTo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPagesTo(String value) {
                this.pagesTo = value;
            }

        }

    }

}
