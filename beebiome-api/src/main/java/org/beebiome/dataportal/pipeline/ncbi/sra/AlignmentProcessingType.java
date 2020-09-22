
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Identify the tools and processing steps used to produce the reference alignment. 
 * 
 * <p>Classe Java pour AlignmentProcessingType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlignmentProcessingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="PIPELINE" type="{}PipelineType"/>
 *         &lt;element name="DIRECTIVES" type="{}AlignmentDirectivesType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlignmentProcessingType", propOrder = {

})
public class AlignmentProcessingType {

    @XmlElement(name = "PIPELINE", required = true)
    protected PipelineType pipeline;
    @XmlElement(name = "DIRECTIVES", required = true)
    protected AlignmentDirectivesType directives;

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
     *     {@link AlignmentDirectivesType }
     *     
     */
    public AlignmentDirectivesType getDIRECTIVES() {
        return directives;
    }

    /**
     * Définit la valeur de la propriété directives.
     * 
     * @param value
     *     allowed object is
     *     {@link AlignmentDirectivesType }
     *     
     */
    public void setDIRECTIVES(AlignmentDirectivesType value) {
        this.directives = value;
    }

}
