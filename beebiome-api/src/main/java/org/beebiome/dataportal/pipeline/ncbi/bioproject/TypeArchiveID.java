
package org.beebiome.dataportal.pipeline.ncbi.bioproject;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeArchiveID complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeArchiveID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="archive" use="required" type="{}typeArchive" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="accession" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeArchiveID")
public class TypeArchiveID {

    @XmlAttribute(name = "archive", required = true)
    protected TypeArchive archive;
    @XmlAttribute(name = "id")
    protected BigInteger id;
    @XmlAttribute(name = "accession", required = true)
    protected String accession;

    /**
     * Obtient la valeur de la propriété archive.
     * 
     * @return
     *     possible object is
     *     {@link TypeArchive }
     *     
     */
    public TypeArchive getArchive() {
        return archive;
    }

    /**
     * Définit la valeur de la propriété archive.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeArchive }
     *     
     */
    public void setArchive(TypeArchive value) {
        this.archive = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
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
