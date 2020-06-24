
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeAuthorSet complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeAuthorSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Author" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{SP.common}typeAuthorName" minOccurs="0"/>
 *                   &lt;element name="Consortium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAuthorSet", namespace = "SP.common", propOrder = {
    "author"
})
public class TypeAuthorSet {

    @XmlElement(name = "Author", required = true)
    protected List<TypeAuthorSet.Author> author;

    /**
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAuthorSet.Author }
     * 
     * 
     */
    public List<TypeAuthorSet.Author> getAuthor() {
        if (author == null) {
            author = new ArrayList<TypeAuthorSet.Author>();
        }
        return this.author;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Name" type="{SP.common}typeAuthorName" minOccurs="0"/>
     *         &lt;element name="Consortium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "consortium"
    })
    public static class Author {

        @XmlElement(name = "Name")
        protected TypeAuthorName name;
        @XmlElement(name = "Consortium")
        protected String consortium;

        /**
         * Obtient la valeur de la propriété name.
         * 
         * @return
         *     possible object is
         *     {@link TypeAuthorName }
         *     
         */
        public TypeAuthorName getName() {
            return name;
        }

        /**
         * Définit la valeur de la propriété name.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeAuthorName }
         *     
         */
        public void setName(TypeAuthorName value) {
            this.name = value;
        }

        /**
         * Obtient la valeur de la propriété consortium.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConsortium() {
            return consortium;
        }

        /**
         * Définit la valeur de la propriété consortium.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConsortium(String value) {
            this.consortium = value;
        }

    }

}
