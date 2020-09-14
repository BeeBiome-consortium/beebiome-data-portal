
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ProcessingType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ProcessingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PIPELINE" type="{}PipelineType" minOccurs="0"/>
 *         &lt;element name="DIRECTIVES" type="{}SequencingDirectivesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingType", propOrder = {
    "pipeline",
    "directives"
})
public class ProcessingType {

    @XmlElement(name = "PIPELINE")
    protected PipelineType pipeline;
    @XmlElement(name = "DIRECTIVES")
    protected SequencingDirectivesType directives;

    /**
     * Obtient la valeur de la propriété pipeline.
     * 
     * @return
     *     possible object is
     *     {@link PipelineType }
     *     
     */
    public PipelineType getPIPELINE() {
        return pipeline;
    }

    /**
     * Définit la valeur de la propriété pipeline.
     * 
     * @param value
     *     allowed object is
     *     {@link PipelineType }
     *     
     */
    public void setPIPELINE(PipelineType value) {
        this.pipeline = value;
    }

    /**
     * Obtient la valeur de la propriété directives.
     * 
     * @return
     *     possible object is
     *     {@link SequencingDirectivesType }
     *     
     */
    public SequencingDirectivesType getDIRECTIVES() {
        return directives;
    }

    /**
     * Définit la valeur de la propriété directives.
     * 
     * @param value
     *     allowed object is
     *     {@link SequencingDirectivesType }
     *     
     */
    public void setDIRECTIVES(SequencingDirectivesType value) {
        this.directives = value;
    }

}
