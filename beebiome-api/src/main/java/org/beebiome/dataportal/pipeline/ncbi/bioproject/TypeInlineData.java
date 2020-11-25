
package org.beebiome.dataportal.pipeline.ncbi.bioproject;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is inline data to be embedded into the submission
 * 
 * <p>Classe Java pour typeInlineData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeInlineData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tracking" type="{}typeTracking" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="XmlContent">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;any processContents='skip'/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="DataContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="data_model" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="content_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="content_encoding">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="plain"/>
 *             &lt;enumeration value="base64"/>
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
@XmlType(name = "typeInlineData", propOrder = {
    "tracking",
    "xmlContent",
    "dataContent"
})
@XmlSeeAlso({
    TypeSubmission.Action.AddData.Data.class
})
public class TypeInlineData {

    @XmlElement(name = "Tracking")
    protected TypeTracking tracking;
    @XmlElement(name = "XmlContent")
    protected TypeInlineData.XmlContent xmlContent;
    @XmlElement(name = "DataContent")
    protected String dataContent;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "data_model")
    protected String dataModel;
    @XmlAttribute(name = "content_type", required = true)
    protected String contentType;
    @XmlAttribute(name = "content_encoding")
    protected String contentEncoding;

    /**
     * Obtient la valeur de la propriété tracking.
     * 
     * @return
     *     possible object is
     *     {@link TypeTracking }
     *     
     */
    public TypeTracking getTracking() {
        return tracking;
    }

    /**
     * Définit la valeur de la propriété tracking.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTracking }
     *     
     */
    public void setTracking(TypeTracking value) {
        this.tracking = value;
    }

    /**
     * Obtient la valeur de la propriété xmlContent.
     * 
     * @return
     *     possible object is
     *     {@link TypeInlineData.XmlContent }
     *     
     */
    public TypeInlineData.XmlContent getXmlContent() {
        return xmlContent;
    }

    /**
     * Définit la valeur de la propriété xmlContent.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInlineData.XmlContent }
     *     
     */
    public void setXmlContent(TypeInlineData.XmlContent value) {
        this.xmlContent = value;
    }

    /**
     * Obtient la valeur de la propriété dataContent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataContent() {
        return dataContent;
    }

    /**
     * Définit la valeur de la propriété dataContent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataContent(String value) {
        this.dataContent = value;
    }

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
     * Obtient la valeur de la propriété dataModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataModel() {
        return dataModel;
    }

    /**
     * Définit la valeur de la propriété dataModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataModel(String value) {
        this.dataModel = value;
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
     * Obtient la valeur de la propriété contentEncoding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * Définit la valeur de la propriété contentEncoding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentEncoding(String value) {
        this.contentEncoding = value;
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
     *         &lt;any processContents='skip'/>
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
        "any"
    })
    public static class XmlContent {

        @XmlAnyElement
        protected Element any;

        /**
         * Obtient la valeur de la propriété any.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     
         */
        public Element getAny() {
            return any;
        }

        /**
         * Définit la valeur de la propriété any.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     
         */
        public void setAny(Element value) {
            this.any = value;
        }

    }

}
