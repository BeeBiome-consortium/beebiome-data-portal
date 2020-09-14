
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour IdType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IdType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="db" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is_primary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="db_label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdType", propOrder = {
    "value"
})
public class IdType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "db")
    protected String db;
    @XmlAttribute(name = "is_primary")
    protected String isPrimary;
    @XmlAttribute(name = "db_label")
    protected String dbLabel;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété db.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDb() {
        return db;
    }

    /**
     * Définit la valeur de la propriété db.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDb(String value) {
        this.db = value;
    }

    /**
     * Obtient la valeur de la propriété isPrimary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrimary() {
        return isPrimary;
    }

    /**
     * Définit la valeur de la propriété isPrimary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrimary(String value) {
        this.isPrimary = value;
    }

    /**
     * Obtient la valeur de la propriété dbLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbLabel() {
        return dbLabel;
    }

    /**
     * Définit la valeur de la propriété dbLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbLabel(String value) {
        this.dbLabel = value;
    }

}
