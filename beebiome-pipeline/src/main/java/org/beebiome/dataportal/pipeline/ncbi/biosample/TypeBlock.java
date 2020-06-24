
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeBlock complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeBlock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="p" type="{SP.common}typeInline"/>
 *         &lt;element name="ul" type="{SP.common}typeL"/>
 *         &lt;element name="ol" type="{SP.common}typeL"/>
 *         &lt;element name="table" type="{SP.common}typeTable"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeBlock", namespace = "SP.common", propOrder = {
    "pOrUlOrOl"
})
public class TypeBlock {

    @XmlElementRefs({
        @XmlElementRef(name = "table", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ul", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "p", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ol", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> pOrUlOrOl;

    /**
     * Gets the value of the pOrUlOrOl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pOrUlOrOl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOrUlOrOl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TypeTable }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeL }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeL }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPOrUlOrOl() {
        if (pOrUlOrOl == null) {
            pOrUlOrOl = new ArrayList<JAXBElement<?>>();
        }
        return this.pOrUlOrOl;
    }

}
