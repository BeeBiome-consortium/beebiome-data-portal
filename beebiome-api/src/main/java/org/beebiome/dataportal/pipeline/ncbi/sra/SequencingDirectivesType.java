
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SequencingDirectivesType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SequencingDirectivesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SAMPLE_DEMUX_DIRECTIVE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="leave_as_pool"/>
 *               &lt;enumeration value="submitter_demultiplexed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequencingDirectivesType", propOrder = {

})
public class SequencingDirectivesType {

    @XmlElement(name = "SAMPLE_DEMUX_DIRECTIVE")
    protected String sampledemuxdirective;

    /**
     * Obtient la valeur de la propriété sampledemuxdirective.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAMPLEDEMUXDIRECTIVE() {
        return sampledemuxdirective;
    }

    /**
     * Définit la valeur de la propriété sampledemuxdirective.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAMPLEDEMUXDIRECTIVE(String value) {
        this.sampledemuxdirective = value;
    }

}
