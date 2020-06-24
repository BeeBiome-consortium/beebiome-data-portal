
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour typeFile complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tracking" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Record" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Target" type="{}typeIdTag" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="last_update" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="error_message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DataType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="autodetect-xml"/>
 *               &lt;enumeration value="generic-data"/>
 *               &lt;enumeration value="phenotype-table"/>
 *               &lt;enumeration value="sra-study-xml-v1"/>
 *               &lt;enumeration value="sra-experiment-xml-v1"/>
 *               &lt;enumeration value="sra-sample-xml-v1"/>
 *               &lt;enumeration value="sra-run-xml-v1"/>
 *               &lt;enumeration value="sra-analysis-xml-v1"/>
 *               &lt;enumeration value="sra-study-xml-v2"/>
 *               &lt;enumeration value="sra-experiment-xml-v2"/>
 *               &lt;enumeration value="sra-sample-xml-v2"/>
 *               &lt;enumeration value="sra-run-xml-v2"/>
 *               &lt;enumeration value="sra-analysis-xml-v2"/>
 *               &lt;enumeration value="project-core-xml-v1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="md5" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crc32" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="content_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeFile", propOrder = {
    "tracking",
    "dataType"
})
@XmlSeeAlso({
    org.beebiome.dataportal.pipeline.ncbi.sra.TypeSubmission.Action.ProcessFile.class,
    org.beebiome.dataportal.pipeline.ncbi.sra.TypeSubmission.Action.AddFiles.File.class
})
public class TypeFile {

    @XmlElement(name = "Tracking")
    protected TypeFile.Tracking tracking;
    @XmlElement(name = "DataType", required = true)
    protected String dataType;
    @XmlAttribute(name = "path", required = true)
    protected String path;
    @XmlAttribute(name = "md5")
    protected String md5;
    @XmlAttribute(name = "crc32")
    protected String crc32;
    @XmlAttribute(name = "content_type", required = true)
    protected String contentType;

    /**
     * Obtient la valeur de la propriété tracking.
     * 
     * @return
     *     possible object is
     *     {@link TypeFile.Tracking }
     *     
     */
    public TypeFile.Tracking getTracking() {
        return tracking;
    }

    /**
     * Définit la valeur de la propriété tracking.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFile.Tracking }
     *     
     */
    public void setTracking(TypeFile.Tracking value) {
        this.tracking = value;
    }

    /**
     * Obtient la valeur de la propriété dataType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Définit la valeur de la propriété dataType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Obtient la valeur de la propriété path.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Définit la valeur de la propriété path.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Obtient la valeur de la propriété md5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMd5() {
        return md5;
    }

    /**
     * Définit la valeur de la propriété md5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMd5(String value) {
        this.md5 = value;
    }

    /**
     * Obtient la valeur de la propriété crc32.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrc32() {
        return crc32;
    }

    /**
     * Définit la valeur de la propriété crc32.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrc32(String value) {
        this.crc32 = value;
    }

    /**
     * Obtient la valeur de la propriété contentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Définit la valeur de la propriété contentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
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
     *         &lt;element name="Record" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Target" type="{}typeIdTag" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="last_update" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="error_message" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "record"
    })
    public static class Tracking {

        @XmlElement(name = "Record", required = true)
        protected List<TypeFile.Tracking.Record> record;

        /**
         * Gets the value of the record property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the record property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeFile.Tracking.Record }
         * 
         * 
         */
        public List<TypeFile.Tracking.Record> getRecord() {
            if (record == null) {
                record = new ArrayList<TypeFile.Tracking.Record>();
            }
            return this.record;
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
         *         &lt;element name="Target" type="{}typeIdTag" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *       &lt;attribute name="last_update" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="error_message" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "target"
        })
        public static class Record {

            @XmlElement(name = "Target", required = true)
            protected List<TypeIdTag> target;
            @XmlAttribute(name = "last_update")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar lastUpdate;
            @XmlAttribute(name = "status")
            protected String status;
            @XmlAttribute(name = "error_message")
            protected String errorMessage;

            /**
             * Gets the value of the target property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the target property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTarget().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypeIdTag }
             * 
             * 
             */
            public List<TypeIdTag> getTarget() {
                if (target == null) {
                    target = new ArrayList<TypeIdTag>();
                }
                return this.target;
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
             * Obtient la valeur de la propriété errorMessage.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErrorMessage() {
                return errorMessage;
            }

            /**
             * Définit la valeur de la propriété errorMessage.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErrorMessage(String value) {
                this.errorMessage = value;
            }

        }

    }

}
