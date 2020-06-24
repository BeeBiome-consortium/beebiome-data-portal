
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeTable complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caption" type="{SP.common}typeCaption" minOccurs="0"/>
 *         &lt;element name="tr" type="{SP.common}typeTR" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTable", namespace = "SP.common", propOrder = {
    "caption",
    "tr"
})
public class TypeTable {

    protected TypeCaption caption;
    @XmlElement(required = true)
    protected List<TypeTR> tr;

    /**
     * Obtient la valeur de la propriété caption.
     * 
     * @return
     *     possible object is
     *     {@link TypeCaption }
     *     
     */
    public TypeCaption getCaption() {
        return caption;
    }

    /**
     * Définit la valeur de la propriété caption.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCaption }
     *     
     */
    public void setCaption(TypeCaption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the tr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTR }
     * 
     * 
     */
    public List<TypeTR> getTr() {
        if (tr == null) {
            tr = new ArrayList<TypeTR>();
        }
        return this.tr;
    }

}
