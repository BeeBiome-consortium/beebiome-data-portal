
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  The PipelineType identifies the sequence or tree of actions to process the sequencing data. 
 * 
 * <p>Classe Java pour PipelineType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PipelineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PIPE_SECTION" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STEP_INDEX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PREV_STEP_INDEX" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="section_name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "PipelineType", propOrder = {
    "pipesection"
})
public class PipelineType {

    @XmlElement(name = "PIPE_SECTION", required = true)
    protected List<PipelineType.PIPESECTION> pipesection;

    /**
     * Gets the value of the pipesection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pipesection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIPESECTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PipelineType.PIPESECTION }
     * 
     * 
     */
    public List<PipelineType.PIPESECTION> getPIPESECTION() {
        if (pipesection == null) {
            pipesection = new ArrayList<PipelineType.PIPESECTION>();
        }
        return this.pipesection;
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
     *         &lt;element name="STEP_INDEX" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PREV_STEP_INDEX" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="section_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stepindex",
        "prevstepindex",
        "program",
        "version",
        "notes"
    })
    public static class PIPESECTION {

        @XmlElement(name = "STEP_INDEX", required = true)
        protected String stepindex;
        @XmlElement(name = "PREV_STEP_INDEX", required = true, nillable = true)
        protected List<String> prevstepindex;
        @XmlElement(name = "PROGRAM", required = true)
        protected String program;
        @XmlElement(name = "VERSION", required = true)
        protected String version;
        @XmlElement(name = "NOTES")
        protected String notes;
        @XmlAttribute(name = "section_name")
        protected String sectionName;

        /**
         * Obtient la valeur de la propriété stepindex.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTEPINDEX() {
            return stepindex;
        }

        /**
         * Définit la valeur de la propriété stepindex.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTEPINDEX(String value) {
            this.stepindex = value;
        }

        /**
         * Gets the value of the prevstepindex property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prevstepindex property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPREVSTEPINDEX().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPREVSTEPINDEX() {
            if (prevstepindex == null) {
                prevstepindex = new ArrayList<String>();
            }
            return this.prevstepindex;
        }

        /**
         * Obtient la valeur de la propriété program.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROGRAM() {
            return program;
        }

        /**
         * Définit la valeur de la propriété program.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROGRAM(String value) {
            this.program = value;
        }

        /**
         * Obtient la valeur de la propriété version.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVERSION() {
            return version;
        }

        /**
         * Définit la valeur de la propriété version.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVERSION(String value) {
            this.version = value;
        }

        /**
         * Obtient la valeur de la propriété notes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNOTES() {
            return notes;
        }

        /**
         * Définit la valeur de la propriété notes.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNOTES(String value) {
            this.notes = value;
        }

        /**
         * Obtient la valeur de la propriété sectionName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSectionName() {
            return sectionName;
        }

        /**
         * Définit la valeur de la propriété sectionName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSectionName(String value) {
            this.sectionName = value;
        }

    }

}
