
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  Reusable external links type to encode URL links, Entrez links, and db_xref links. 
 * 
 * <p>Classe Java pour LinkType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="URL_LINK">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="XREF_LINK" type="{}XRefType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkType", propOrder = {
    "urllink",
    "xreflink"
})
public class LinkType {

    @XmlElement(name = "URL_LINK")
    protected LinkType.URLLINK urllink;
    @XmlElement(name = "XREF_LINK")
    protected XRefType xreflink;

    /**
     * Obtient la valeur de la propriété urllink.
     * 
     * @return
     *     possible object is
     *     {@link LinkType.URLLINK }
     *     
     */
    public LinkType.URLLINK getURLLINK() {
        return urllink;
    }

    /**
     * Définit la valeur de la propriété urllink.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType.URLLINK }
     *     
     */
    public void setURLLINK(LinkType.URLLINK value) {
        this.urllink = value;
    }

    /**
     * Obtient la valeur de la propriété xreflink.
     * 
     * @return
     *     possible object is
     *     {@link XRefType }
     *     
     */
    public XRefType getXREFLINK() {
        return xreflink;
    }

    /**
     * Définit la valeur de la propriété xreflink.
     * 
     * @param value
     *     allowed object is
     *     {@link XRefType }
     *     
     */
    public void setXREFLINK(XRefType value) {
        this.xreflink = value;
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
     *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *       &lt;/all>
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
    public static class URLLINK {

        @XmlElement(name = "LABEL", required = true)
        protected String label;
        @XmlElement(name = "URL", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String url;

        /**
         * Obtient la valeur de la propriété label.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLABEL() {
            return label;
        }

        /**
         * Définit la valeur de la propriété label.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLABEL(String value) {
            this.label = value;
        }

        /**
         * Obtient la valeur de la propriété url.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURL() {
            return url;
        }

        /**
         * Définit la valeur de la propriété url.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURL(String value) {
            this.url = value;
        }

    }

}
