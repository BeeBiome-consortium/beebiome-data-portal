
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LibraryType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LibraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESIGN_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SAMPLE_DESCRIPTOR" type="{}SampleDescriptorType"/>
 *         &lt;element name="LIBRARY_DESCRIPTOR" type="{}LibraryDescriptorType"/>
 *         &lt;element name="SPOT_DESCRIPTOR" type="{}SpotDescriptorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LibraryType", propOrder = {
    "designdescription",
    "sampledescriptor",
    "librarydescriptor",
    "spotdescriptor"
})
public class LibraryType {

    @XmlElement(name = "DESIGN_DESCRIPTION", required = true)
    protected String designdescription;
    @XmlElement(name = "SAMPLE_DESCRIPTOR", required = true)
    protected SampleDescriptorType sampledescriptor;
    @XmlElement(name = "LIBRARY_DESCRIPTOR", required = true)
    protected LibraryDescriptorType librarydescriptor;
    @XmlElement(name = "SPOT_DESCRIPTOR")
    protected SpotDescriptorType spotdescriptor;

    /**
     * Obtient la valeur de la propriété designdescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESIGNDESCRIPTION() {
        return designdescription;
    }

    /**
     * Définit la valeur de la propriété designdescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESIGNDESCRIPTION(String value) {
        this.designdescription = value;
    }

    /**
     * Obtient la valeur de la propriété sampledescriptor.
     * 
     * @return
     *     possible object is
     *     {@link SampleDescriptorType }
     *     
     */
    public SampleDescriptorType getSAMPLEDESCRIPTOR() {
        return sampledescriptor;
    }

    /**
     * Définit la valeur de la propriété sampledescriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleDescriptorType }
     *     
     */
    public void setSAMPLEDESCRIPTOR(SampleDescriptorType value) {
        this.sampledescriptor = value;
    }

    /**
     * Obtient la valeur de la propriété librarydescriptor.
     * 
     * @return
     *     possible object is
     *     {@link LibraryDescriptorType }
     *     
     */
    public LibraryDescriptorType getLIBRARYDESCRIPTOR() {
        return librarydescriptor;
    }

    /**
     * Définit la valeur de la propriété librarydescriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryDescriptorType }
     *     
     */
    public void setLIBRARYDESCRIPTOR(LibraryDescriptorType value) {
        this.librarydescriptor = value;
    }

    /**
     * Obtient la valeur de la propriété spotdescriptor.
     * 
     * @return
     *     possible object is
     *     {@link SpotDescriptorType }
     *     
     */
    public SpotDescriptorType getSPOTDESCRIPTOR() {
        return spotdescriptor;
    }

    /**
     * Définit la valeur de la propriété spotdescriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotDescriptorType }
     *     
     */
    public void setSPOTDESCRIPTOR(SpotDescriptorType value) {
        this.spotdescriptor = value;
    }

}
