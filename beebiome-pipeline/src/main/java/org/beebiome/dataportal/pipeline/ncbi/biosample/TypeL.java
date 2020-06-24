
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Ordered or Unordered list 
 * 
 * <p>Classe Java pour typeL complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="li" type="{SP.common}typeLI" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeL", namespace = "SP.common", propOrder = {
    "li"
})
public class TypeL {

    @XmlElement(required = true)
    protected List<TypeLI> li;

    /**
     * Gets the value of the li property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the li property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeLI }
     * 
     * 
     */
    public List<TypeLI> getLi() {
        if (li == null) {
            li = new ArrayList<TypeLI>();
        }
        return this.li;
    }

}
