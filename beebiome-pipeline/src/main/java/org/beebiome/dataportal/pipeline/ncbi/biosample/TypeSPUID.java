
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 *  Unique identifier in submitter context (Submitter Provided Unique
 *                 ID). 
 * 
 * <p>Classe Java pour typeSPUID complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeSPUID">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="submitter_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spuid_namespace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeSPUID", namespace = "SP.common", propOrder = {
    "value"
})
@XmlSeeAlso({
    org.beebiome.dataportal.pipeline.ncbi.biosample.TypeBioSampleIdentifier.SPUID.class
})
public class TypeSPUID {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "submitter_id")
    protected String submitterId;
    @XmlAttribute(name = "spuid_namespace")
    protected String spuidNamespace;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété submitterId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitterId() {
        return submitterId;
    }

    /**
     * Définit la valeur de la propriété submitterId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitterId(String value) {
        this.submitterId = value;
    }

    /**
     * Obtient la valeur de la propriété spuidNamespace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpuidNamespace() {
        return spuidNamespace;
    }

    /**
     * Définit la valeur de la propriété spuidNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpuidNamespace(String value) {
        this.spuidNamespace = value;
    }

}
