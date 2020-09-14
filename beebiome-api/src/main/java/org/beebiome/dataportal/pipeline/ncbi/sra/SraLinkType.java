
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 *  The SraLinkType mechanism encodes local references between SRA
 *         objects. These references are local to the Home Archive and during archival are
 *         resolved to exportable references suitable for mirroring between Archives. SraLinks
 *         can be used as temporary place holders for pre-published or post-suppressed
 *         relationships that will not be mirrored between Archives. 
 * 
 * <p>Classe Java pour SraLinkType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SraLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{}RefNameGroup"/>
 *       &lt;attribute name="sra_object_type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="STUDY"/>
 *             &lt;enumeration value="SAMPLE"/>
 *             &lt;enumeration value="ANALYSIS"/>
 *             &lt;enumeration value="EXPERIMENT"/>
 *             &lt;enumeration value="RUN"/>
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
@XmlType(name = "SraLinkType")
public class SraLinkType {

    @XmlAttribute(name = "sra_object_type")
    protected String sraObjectType;
    @XmlAttribute(name = "refname")
    protected String refname;
    @XmlAttribute(name = "refcenter")
    protected String refcenter;
    @XmlAttribute(name = "accession")
    protected String accession;

    /**
     * Obtient la valeur de la propriété sraObjectType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSraObjectType() {
        return sraObjectType;
    }

    /**
     * Définit la valeur de la propriété sraObjectType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSraObjectType(String value) {
        this.sraObjectType = value;
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
