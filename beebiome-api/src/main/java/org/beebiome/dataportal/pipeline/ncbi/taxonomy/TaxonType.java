
package org.beebiome.dataportal.pipeline.ncbi.taxonomy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TaxonType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TaxonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScientificName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OtherNames" type="{}OtherNamesType" minOccurs="0"/>
 *         &lt;element name="ParentTaxId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Division" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Invertebrates"/>
 *               &lt;enumeration value="Environmental samples"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GeneticCode" type="{}GeneticCodeType" minOccurs="0"/>
 *         &lt;element name="MitoGeneticCode" type="{}MitoGeneticCodeType" minOccurs="0"/>
 *         &lt;element name="Lineage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineageEx" type="{}LineageExType" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PubDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxonType", propOrder = {
    "taxId",
    "scientificName",
    "otherNames",
    "parentTaxId",
    "rank",
    "division",
    "geneticCode",
    "mitoGeneticCode",
    "lineage",
    "lineageEx",
    "createDate",
    "updateDate",
    "pubDate"
})
public class TaxonType {

    @XmlElement(name = "TaxId")
    protected int taxId;
    @XmlElement(name = "ScientificName", required = true)
    protected String scientificName;
    @XmlElement(name = "OtherNames")
    protected OtherNamesType otherNames;
    @XmlElement(name = "ParentTaxId")
    protected Integer parentTaxId;
    @XmlElement(name = "Rank", required = true)
    protected String rank;
    @XmlElement(name = "Division")
    protected String division;
    @XmlElement(name = "GeneticCode")
    protected GeneticCodeType geneticCode;
    @XmlElement(name = "MitoGeneticCode")
    protected MitoGeneticCodeType mitoGeneticCode;
    @XmlElement(name = "Lineage")
    protected String lineage;
    @XmlElement(name = "LineageEx")
    protected LineageExType lineageEx;
    @XmlElement(name = "CreateDate")
    protected String createDate;
    @XmlElement(name = "UpdateDate")
    protected String updateDate;
    @XmlElement(name = "PubDate")
    protected String pubDate;

    /**
     * Obtient la valeur de la propriété taxId.
     * 
     */
    public int getTaxId() {
        return taxId;
    }

    /**
     * Définit la valeur de la propriété taxId.
     * 
     */
    public void setTaxId(int value) {
        this.taxId = value;
    }

    /**
     * Obtient la valeur de la propriété scientificName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificName() {
        return scientificName;
    }

    /**
     * Définit la valeur de la propriété scientificName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificName(String value) {
        this.scientificName = value;
    }

    /**
     * Obtient la valeur de la propriété otherNames.
     * 
     * @return
     *     possible object is
     *     {@link OtherNamesType }
     *     
     */
    public OtherNamesType getOtherNames() {
        return otherNames;
    }

    /**
     * Définit la valeur de la propriété otherNames.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNamesType }
     *     
     */
    public void setOtherNames(OtherNamesType value) {
        this.otherNames = value;
    }

    /**
     * Obtient la valeur de la propriété parentTaxId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentTaxId() {
        return parentTaxId;
    }

    /**
     * Définit la valeur de la propriété parentTaxId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentTaxId(Integer value) {
        this.parentTaxId = value;
    }

    /**
     * Obtient la valeur de la propriété rank.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * Définit la valeur de la propriété rank.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * Obtient la valeur de la propriété division.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Définit la valeur de la propriété division.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Obtient la valeur de la propriété geneticCode.
     * 
     * @return
     *     possible object is
     *     {@link GeneticCodeType }
     *     
     */
    public GeneticCodeType getGeneticCode() {
        return geneticCode;
    }

    /**
     * Définit la valeur de la propriété geneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneticCodeType }
     *     
     */
    public void setGeneticCode(GeneticCodeType value) {
        this.geneticCode = value;
    }

    /**
     * Obtient la valeur de la propriété mitoGeneticCode.
     * 
     * @return
     *     possible object is
     *     {@link MitoGeneticCodeType }
     *     
     */
    public MitoGeneticCodeType getMitoGeneticCode() {
        return mitoGeneticCode;
    }

    /**
     * Définit la valeur de la propriété mitoGeneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MitoGeneticCodeType }
     *     
     */
    public void setMitoGeneticCode(MitoGeneticCodeType value) {
        this.mitoGeneticCode = value;
    }

    /**
     * Obtient la valeur de la propriété lineage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineage() {
        return lineage;
    }

    /**
     * Définit la valeur de la propriété lineage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineage(String value) {
        this.lineage = value;
    }

    /**
     * Obtient la valeur de la propriété lineageEx.
     * 
     * @return
     *     possible object is
     *     {@link LineageExType }
     *     
     */
    public LineageExType getLineageEx() {
        return lineageEx;
    }

    /**
     * Définit la valeur de la propriété lineageEx.
     * 
     * @param value
     *     allowed object is
     *     {@link LineageExType }
     *     
     */
    public void setLineageEx(LineageExType value) {
        this.lineageEx = value;
    }

    /**
     * Obtient la valeur de la propriété createDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Définit la valeur de la propriété createDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Obtient la valeur de la propriété updateDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * Définit la valeur de la propriété updateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    /**
     * Obtient la valeur de la propriété pubDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubDate() {
        return pubDate;
    }

    /**
     * Définit la valeur de la propriété pubDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubDate(String value) {
        this.pubDate = value;
    }

}
