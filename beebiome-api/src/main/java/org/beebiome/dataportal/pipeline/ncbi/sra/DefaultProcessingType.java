
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Identify the tools and processing steps used to produce the de novo assembly. 
 * 
 * <p>Classe Java pour DefaultProcessingType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DefaultProcessingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="PIPELINE" type="{}PipelineType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultProcessingType", propOrder = {

})
public class DefaultProcessingType {

    @XmlElement(name = "PIPELINE", required = true)
    protected PipelineType pipeline;

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

}
