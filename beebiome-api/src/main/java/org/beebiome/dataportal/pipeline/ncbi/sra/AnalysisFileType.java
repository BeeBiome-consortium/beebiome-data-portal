
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AnalysisFileType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AnalysisFileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="filetype" use="required" type="{}typeAnalysisFileType" />
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
@XmlType(name = "AnalysisFileType")
public class AnalysisFileType {

    @XmlAttribute(name = "filename", required = true)
    protected String filename;
    @XmlAttribute(name = "filetype", required = true)
    protected TypeAnalysisFileType filetype;
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
     *     {@link TypeAnalysisFileType }
     *     
     */
    public TypeAnalysisFileType getFiletype() {
        return filetype;
    }

    /**
     * Définit la valeur de la propriété filetype.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAnalysisFileType }
     *     
     */
    public void setFiletype(TypeAnalysisFileType value) {
        this.filetype = value;
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
