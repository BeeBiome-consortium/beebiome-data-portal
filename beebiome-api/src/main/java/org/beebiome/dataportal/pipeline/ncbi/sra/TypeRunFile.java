
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Actual run data are contained in one of the
 *       files listed in the submission manifest. Each data block is
 *       represented by one SRF file, one SFF file, one compressed
 *       fastq file, or one compressed tar archive file.
 *       
 * 
 * <p>Classe Java pour typeRunFile complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeRunFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FILE" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="filetype" use="required" type="{}typeRunFileType" />
 *                 &lt;attribute name="quality_scoring_system">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="phred"/>
 *                       &lt;enumeration value="log-odds"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="quality_encoding">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="ascii"/>
 *                       &lt;enumeration value="decimal"/>
 *                       &lt;enumeration value="hexadecimal"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ascii_offset" type="{}typeScoring" />
 *                 &lt;attribute name="checksum_method" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="MD5"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="checksum" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "typeRunFile", propOrder = {
    "file"
})
public class TypeRunFile {

    @XmlElement(name = "FILE", required = true)
    protected List<TypeRunFile.FILE> file;

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
     * {@link TypeRunFile.FILE }
     * 
     * 
     */
    public List<TypeRunFile.FILE> getFILE() {
        if (file == null) {
            file = new ArrayList<TypeRunFile.FILE>();
        }
        return this.file;
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
     *       &lt;attribute name="filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="filetype" use="required" type="{}typeRunFileType" />
     *       &lt;attribute name="quality_scoring_system">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="phred"/>
     *             &lt;enumeration value="log-odds"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="quality_encoding">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="ascii"/>
     *             &lt;enumeration value="decimal"/>
     *             &lt;enumeration value="hexadecimal"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ascii_offset" type="{}typeScoring" />
     *       &lt;attribute name="checksum_method" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="MD5"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="checksum" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FILE {

        @XmlAttribute(name = "filename", required = true)
        protected String filename;
        @XmlAttribute(name = "filetype", required = true)
        protected String filetype;
        @XmlAttribute(name = "quality_scoring_system")
        protected String qualityScoringSystem;
        @XmlAttribute(name = "quality_encoding")
        protected String qualityEncoding;
        @XmlAttribute(name = "ascii_offset")
        protected String asciiOffset;
        @XmlAttribute(name = "checksum_method", required = true)
        protected String checksumMethod;
        @XmlAttribute(name = "checksum", required = true)
        protected String checksum;

        /**
         * Obtient la valeur de la propriété filename.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFilename() {
            return filename;
        }

        /**
         * Définit la valeur de la propriété filename.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFilename(String value) {
            this.filename = value;
        }

        /**
         * Obtient la valeur de la propriété filetype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFiletype() {
            return filetype;
        }

        /**
         * Définit la valeur de la propriété filetype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFiletype(String value) {
            this.filetype = value;
        }

        /**
         * Obtient la valeur de la propriété qualityScoringSystem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualityScoringSystem() {
            return qualityScoringSystem;
        }

        /**
         * Définit la valeur de la propriété qualityScoringSystem.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualityScoringSystem(String value) {
            this.qualityScoringSystem = value;
        }

        /**
         * Obtient la valeur de la propriété qualityEncoding.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualityEncoding() {
            return qualityEncoding;
        }

        /**
         * Définit la valeur de la propriété qualityEncoding.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualityEncoding(String value) {
            this.qualityEncoding = value;
        }

        /**
         * Obtient la valeur de la propriété asciiOffset.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAsciiOffset() {
            return asciiOffset;
        }

        /**
         * Définit la valeur de la propriété asciiOffset.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAsciiOffset(String value) {
            this.asciiOffset = value;
        }

        /**
         * Obtient la valeur de la propriété checksumMethod.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChecksumMethod() {
            return checksumMethod;
        }

        /**
         * Définit la valeur de la propriété checksumMethod.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChecksumMethod(String value) {
            this.checksumMethod = value;
        }

        /**
         * Obtient la valeur de la propriété checksum.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChecksum() {
            return checksum;
        }

        /**
         * Définit la valeur de la propriété checksum.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChecksum(String value) {
            this.checksum = value;
        }

    }

}
