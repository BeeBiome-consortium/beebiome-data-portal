
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 *  "Inline" covers inline or "text-level" elements 
 * 
 * <p>Classe Java pour typeInline complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeInline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="a" type="{SP.common}typeA"/>
 *         &lt;element name="i" type="{SP.common}typeInline"/>
 *         &lt;element name="b" type="{SP.common}typeInline"/>
 *         &lt;element name="sub" type="{SP.common}typeInline"/>
 *         &lt;element name="sup" type="{SP.common}typeInline"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeInline", namespace = "SP.common", propOrder = {
    "content"
})
@XmlSeeAlso({
    TypeCaption.class
})
public class TypeInline {

    @XmlElementRefs({
        @XmlElementRef(name = "a", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "i", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "b", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sup", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sub", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     *  "Inline" covers inline or "text-level" elements Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeA }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeInline }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
