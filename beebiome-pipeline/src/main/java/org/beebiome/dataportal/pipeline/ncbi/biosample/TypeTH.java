
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeTH complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeTH">
 *   &lt;complexContent>
 *     &lt;extension base="{SP.common}typeFlow">
 *       &lt;attribute name="rowspan" type="{SP.common}typeNumber" default="1" />
 *       &lt;attribute name="colspan" type="{SP.common}typeNumber" default="1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTH", namespace = "SP.common")
public class TypeTH
    extends TypeFlow
{

    @XmlAttribute(name = "rowspan")
    protected BigInteger rowspan;
    @XmlAttribute(name = "colspan")
    protected BigInteger colspan;

    /**
     * Obtient la valeur de la propriété rowspan.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowspan() {
        if (rowspan == null) {
            return new BigInteger("1");
        } else {
            return rowspan;
        }
    }

    /**
     * Définit la valeur de la propriété rowspan.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowspan(BigInteger value) {
        this.rowspan = value;
    }

    /**
     * Obtient la valeur de la propriété colspan.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColspan() {
        if (colspan == null) {
            return new BigInteger("1");
        } else {
            return colspan;
        }
    }

    /**
     * Définit la valeur de la propriété colspan.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColspan(BigInteger value) {
        this.colspan = value;
    }

}
