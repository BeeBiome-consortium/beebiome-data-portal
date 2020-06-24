
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
 *  "Flow" mixes block and inline and is used for list items etc.
 *             
 * 
 * <p>Classe Java pour typeFlow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="p" type="{SP.common}typeInline"/>
 *           &lt;element name="ul" type="{SP.common}typeL"/>
 *           &lt;element name="ol" type="{SP.common}typeL"/>
 *           &lt;element name="table" type="{SP.common}typeTable"/>
 *           &lt;element name="a" type="{SP.common}typeA"/>
 *           &lt;element name="i" type="{SP.common}typeInline"/>
 *           &lt;element name="b" type="{SP.common}typeInline"/>
 *           &lt;element name="sub" type="{SP.common}typeInline"/>
 *           &lt;element name="sup" type="{SP.common}typeInline"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeFlow", namespace = "SP.common", propOrder = {
    "content"
})
@XmlSeeAlso({
    TypeTH.class,
    TypeTD.class,
    TypeLI.class
})
public class TypeFlow {

    @XmlElementRefs({
        @XmlElementRef(name = "sup", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "a", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "p", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ol", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ul", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sub", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "i", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "b", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     *  "Flow" mixes block and inline and is used for list items etc.
     *             Gets the value of the content property.
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
     * {@link JAXBElement }{@code <}{@link TypeTable }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeA }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeL }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeL }{@code >}
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
