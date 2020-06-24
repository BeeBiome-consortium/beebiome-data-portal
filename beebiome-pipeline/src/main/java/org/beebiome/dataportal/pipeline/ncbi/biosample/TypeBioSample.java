
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeBioSample complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeBioSample">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SampleId" type="{}typeBioSampleIdentifier"/>
 *         &lt;element name="Descriptor" type="{SP.common}typeDescriptor"/>
 *         &lt;element name="Organism" type="{SP.common}typeOrganism"/>
 *         &lt;element name="BioProject" type="{SP.common}typeRefId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Package" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attributes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attribute" type="{}typeAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="schema_version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeBioSample", propOrder = {
    "sampleId",
    "descriptor",
    "organism",
    "bioProject",
    "_package",
    "attributes"
})
public class TypeBioSample {

    @XmlElement(name = "SampleId", required = true)
    protected TypeBioSampleIdentifier sampleId;
    @XmlElement(name = "Descriptor", required = true)
    protected TypeDescriptor descriptor;
    @XmlElement(name = "Organism", required = true)
    protected TypeOrganism organism;
    @XmlElement(name = "BioProject")
    protected List<TypeRefId> bioProject;
    @XmlElement(name = "Package", required = true)
    protected String _package;
    @XmlElement(name = "Attributes", required = true)
    protected TypeBioSample.Attributes attributes;
    @XmlAttribute(name = "schema_version", required = true)
    protected String schemaVersion;

    /**
     * Obtient la valeur de la propriété sampleId.
     * 
     * @return
     *     possible object is
     *     {@link TypeBioSampleIdentifier }
     *     
     */
    public TypeBioSampleIdentifier getSampleId() {
        return sampleId;
    }

    /**
     * Définit la valeur de la propriété sampleId.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBioSampleIdentifier }
     *     
     */
    public void setSampleId(TypeBioSampleIdentifier value) {
        this.sampleId = value;
    }

    /**
     * Obtient la valeur de la propriété descriptor.
     * 
     * @return
     *     possible object is
     *     {@link TypeDescriptor }
     *     
     */
    public TypeDescriptor getDescriptor() {
        return descriptor;
    }

    /**
     * Définit la valeur de la propriété descriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDescriptor }
     *     
     */
    public void setDescriptor(TypeDescriptor value) {
        this.descriptor = value;
    }

    /**
     * Obtient la valeur de la propriété organism.
     * 
     * @return
     *     possible object is
     *     {@link TypeOrganism }
     *     
     */
    public TypeOrganism getOrganism() {
        return organism;
    }

    /**
     * Définit la valeur de la propriété organism.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOrganism }
     *     
     */
    public void setOrganism(TypeOrganism value) {
        this.organism = value;
    }

    /**
     * Gets the value of the bioProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bioProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBioProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeRefId }
     * 
     * 
     */
    public List<TypeRefId> getBioProject() {
        if (bioProject == null) {
            bioProject = new ArrayList<TypeRefId>();
        }
        return this.bioProject;
    }

    /**
     * Obtient la valeur de la propriété package.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackage() {
        return _package;
    }

    /**
     * Définit la valeur de la propriété package.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackage(String value) {
        this._package = value;
    }

    /**
     * Obtient la valeur de la propriété attributes.
     * 
     * @return
     *     possible object is
     *     {@link TypeBioSample.Attributes }
     *     
     */
    public TypeBioSample.Attributes getAttributes() {
        return attributes;
    }

    /**
     * Définit la valeur de la propriété attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBioSample.Attributes }
     *     
     */
    public void setAttributes(TypeBioSample.Attributes value) {
        this.attributes = value;
    }

    /**
     * Obtient la valeur de la propriété schemaVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Définit la valeur de la propriété schemaVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
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
     *         &lt;element name="Attribute" type="{}typeAttribute" maxOccurs="unbounded" minOccurs="0"/>
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
        "attribute"
    })
    public static class Attributes {

        @XmlElement(name = "Attribute")
        protected List<TypeAttribute> attribute;

        /**
         * Gets the value of the attribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeAttribute }
         * 
         * 
         */
        public List<TypeAttribute> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<TypeAttribute>();
            }
            return this.attribute;
        }

    }

}
