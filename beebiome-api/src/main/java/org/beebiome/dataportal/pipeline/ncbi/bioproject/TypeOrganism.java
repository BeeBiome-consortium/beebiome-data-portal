
package org.beebiome.dataportal.pipeline.ncbi.bioproject;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour typeOrganism complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeOrganism">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganismName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Strain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Supergroup" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="eEukaryotes"/>
 *               &lt;enumeration value="eArchaea"/>
 *               &lt;enumeration value="eBacteria"/>
 *               &lt;enumeration value="eViruses"/>
 *               &lt;enumeration value="eOther"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BiologicalProperties" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Morphology" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Gram" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="eNegative"/>
 *                                   &lt;enumeration value="ePositive"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Enveloped" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="eNo"/>
 *                                   &lt;enumeration value="eYes"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Shape" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="eBacilli"/>
 *                                   &lt;enumeration value="eCocci"/>
 *                                   &lt;enumeration value="eSpirilla"/>
 *                                   &lt;enumeration value="eCoccobacilli"/>
 *                                   &lt;enumeration value="eFilamentous"/>
 *                                   &lt;enumeration value="eVibrios"/>
 *                                   &lt;enumeration value="eFusobacteria"/>
 *                                   &lt;enumeration value="eSquareShaped"/>
 *                                   &lt;enumeration value="eCurvedShaped"/>
 *                                   &lt;enumeration value="eTailed"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Endospores" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="eNo"/>
 *                                   &lt;enumeration value="eYes"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Motility" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="eNo"/>
 *                                   &lt;enumeration value="eYes"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BiologicalSample" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CultureSample" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="ePureCulture"/>
 *                                   &lt;enumeration value="eMixedCulture"/>
 *                                   &lt;enumeration value="eUncultered"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CellSample" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="eIsolated"/>
 *                                   &lt;enumeration value="eNonisolated"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TissueSample" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Environment" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Salinity" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="eUnknown"/>
 *                                   &lt;enumeration value="eNonHalophilic"/>
 *                                   &lt;enumeration value="eMesophilic"/>
 *                                   &lt;enumeration value="eModerateHalophilic"/>
 *                                   &lt;enumeration value="eExtremeHalophilic"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OxygenReq" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="eUnknown"/>
 *                                   &lt;enumeration value="eAerobic"/>
 *                                   &lt;enumeration value="eMicroaerophilic"/>
 *                                   &lt;enumeration value="eFacultative"/>
 *                                   &lt;enumeration value="eAnaerobic"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OptimumTemperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TemperatureRange" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="eUnknown"/>
 *                                   &lt;enumeration value="eCryophilic"/>
 *                                   &lt;enumeration value="ePsychrophilic"/>
 *                                   &lt;enumeration value="eMesophilic"/>
 *                                   &lt;enumeration value="eThermophilic"/>
 *                                   &lt;enumeration value="eHyperthermophilic"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Habitat" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="eUnknown"/>
 *                                   &lt;enumeration value="eHostAssociated"/>
 *                                   &lt;enumeration value="eAquatic"/>
 *                                   &lt;enumeration value="eTerrestrial"/>
 *                                   &lt;enumeration value="eSpecialized"/>
 *                                   &lt;enumeration value="eMultiple"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Phenotype" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BioticRelationship" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="eFreeLiving"/>
 *                                   &lt;enumeration value="eCommensal"/>
 *                                   &lt;enumeration value="eSymbiont"/>
 *                                   &lt;enumeration value="eEpisymbiont"/>
 *                                   &lt;enumeration value="eIntracellular"/>
 *                                   &lt;enumeration value="eParasite"/>
 *                                   &lt;enumeration value="eHost"/>
 *                                   &lt;enumeration value="eEndosymbiont"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TrophicLevel" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="eAutotroph"/>
 *                                   &lt;enumeration value="eHeterotroph"/>
 *                                   &lt;enumeration value="eMixotroph"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Disease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Organization" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="eUnicellular"/>
 *               &lt;enumeration value="eMulticellular"/>
 *               &lt;enumeration value="eColonial"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Reproduction" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="eSexual"/>
 *               &lt;enumeration value="eAsexual"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RepliconSet" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Replicon" type="{}typeReplicon" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Ploidy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                 &lt;enumeration value="eHaploid"/>
 *                                 &lt;enumeration value="eDiploid"/>
 *                                 &lt;enumeration value="ePolyploid"/>
 *                                 &lt;enumeration value="eAllopolyploid"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Count" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
 *                           &lt;attribute name="repliconType" use="required" type="{}typeRepliconMolType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GenomeSize" type="{}typeGSize" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="taxID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="species" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOrganism", propOrder = {
    "organismName",
    "label",
    "strain",
    "supergroup",
    "biologicalProperties",
    "organization",
    "reproduction",
    "repliconSet",
    "genomeSize"
})
public class TypeOrganism {

    @XmlElement(name = "OrganismName", required = true)
    protected String organismName;
    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "Strain")
    protected String strain;
    @XmlElement(name = "Supergroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String supergroup;
    @XmlElement(name = "BiologicalProperties")
    protected TypeOrganism.BiologicalProperties biologicalProperties;
    @XmlElement(name = "Organization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String organization;
    @XmlElement(name = "Reproduction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reproduction;
    @XmlElement(name = "RepliconSet")
    protected TypeOrganism.RepliconSet repliconSet;
    @XmlElement(name = "GenomeSize")
    protected TypeGSize genomeSize;
    @XmlAttribute(name = "taxID")
    protected Integer taxID;
    @XmlAttribute(name = "species")
    protected Integer species;

    /**
     * Obtient la valeur de la propriété organismName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganismName() {
        return organismName;
    }

    /**
     * Définit la valeur de la propriété organismName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganismName(String value) {
        this.organismName = value;
    }

    /**
     * Obtient la valeur de la propriété label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Définit la valeur de la propriété label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtient la valeur de la propriété strain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrain() {
        return strain;
    }

    /**
     * Définit la valeur de la propriété strain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrain(String value) {
        this.strain = value;
    }

    /**
     * Obtient la valeur de la propriété supergroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupergroup() {
        return supergroup;
    }

    /**
     * Définit la valeur de la propriété supergroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupergroup(String value) {
        this.supergroup = value;
    }

    /**
     * Obtient la valeur de la propriété biologicalProperties.
     * 
     * @return
     *     possible object is
     *     {@link TypeOrganism.BiologicalProperties }
     *     
     */
    public TypeOrganism.BiologicalProperties getBiologicalProperties() {
        return biologicalProperties;
    }

    /**
     * Définit la valeur de la propriété biologicalProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOrganism.BiologicalProperties }
     *     
     */
    public void setBiologicalProperties(TypeOrganism.BiologicalProperties value) {
        this.biologicalProperties = value;
    }

    /**
     * Obtient la valeur de la propriété organization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Définit la valeur de la propriété organization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Obtient la valeur de la propriété reproduction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReproduction() {
        return reproduction;
    }

    /**
     * Définit la valeur de la propriété reproduction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReproduction(String value) {
        this.reproduction = value;
    }

    /**
     * Obtient la valeur de la propriété repliconSet.
     * 
     * @return
     *     possible object is
     *     {@link TypeOrganism.RepliconSet }
     *     
     */
    public TypeOrganism.RepliconSet getRepliconSet() {
        return repliconSet;
    }

    /**
     * Définit la valeur de la propriété repliconSet.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOrganism.RepliconSet }
     *     
     */
    public void setRepliconSet(TypeOrganism.RepliconSet value) {
        this.repliconSet = value;
    }

    /**
     * Obtient la valeur de la propriété genomeSize.
     * 
     * @return
     *     possible object is
     *     {@link TypeGSize }
     *     
     */
    public TypeGSize getGenomeSize() {
        return genomeSize;
    }

    /**
     * Définit la valeur de la propriété genomeSize.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGSize }
     *     
     */
    public void setGenomeSize(TypeGSize value) {
        this.genomeSize = value;
    }

    /**
     * Obtient la valeur de la propriété taxID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxID() {
        return taxID;
    }

    /**
     * Définit la valeur de la propriété taxID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxID(Integer value) {
        this.taxID = value;
    }

    /**
     * Obtient la valeur de la propriété species.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpecies() {
        return species;
    }

    /**
     * Définit la valeur de la propriété species.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpecies(Integer value) {
        this.species = value;
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
     *         &lt;element name="Morphology" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Gram" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="eNegative"/>
     *                         &lt;enumeration value="ePositive"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Enveloped" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="eNo"/>
     *                         &lt;enumeration value="eYes"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Shape" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="eBacilli"/>
     *                         &lt;enumeration value="eCocci"/>
     *                         &lt;enumeration value="eSpirilla"/>
     *                         &lt;enumeration value="eCoccobacilli"/>
     *                         &lt;enumeration value="eFilamentous"/>
     *                         &lt;enumeration value="eVibrios"/>
     *                         &lt;enumeration value="eFusobacteria"/>
     *                         &lt;enumeration value="eSquareShaped"/>
     *                         &lt;enumeration value="eCurvedShaped"/>
     *                         &lt;enumeration value="eTailed"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Endospores" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="eNo"/>
     *                         &lt;enumeration value="eYes"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Motility" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="eNo"/>
     *                         &lt;enumeration value="eYes"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BiologicalSample" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CultureSample" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="ePureCulture"/>
     *                         &lt;enumeration value="eMixedCulture"/>
     *                         &lt;enumeration value="eUncultered"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CellSample" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="eIsolated"/>
     *                         &lt;enumeration value="eNonisolated"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TissueSample" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Environment" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Salinity" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="eUnknown"/>
     *                         &lt;enumeration value="eNonHalophilic"/>
     *                         &lt;enumeration value="eMesophilic"/>
     *                         &lt;enumeration value="eModerateHalophilic"/>
     *                         &lt;enumeration value="eExtremeHalophilic"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OxygenReq" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="eUnknown"/>
     *                         &lt;enumeration value="eAerobic"/>
     *                         &lt;enumeration value="eMicroaerophilic"/>
     *                         &lt;enumeration value="eFacultative"/>
     *                         &lt;enumeration value="eAnaerobic"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OptimumTemperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TemperatureRange" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="eUnknown"/>
     *                         &lt;enumeration value="eCryophilic"/>
     *                         &lt;enumeration value="ePsychrophilic"/>
     *                         &lt;enumeration value="eMesophilic"/>
     *                         &lt;enumeration value="eThermophilic"/>
     *                         &lt;enumeration value="eHyperthermophilic"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Habitat" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="eUnknown"/>
     *                         &lt;enumeration value="eHostAssociated"/>
     *                         &lt;enumeration value="eAquatic"/>
     *                         &lt;enumeration value="eTerrestrial"/>
     *                         &lt;enumeration value="eSpecialized"/>
     *                         &lt;enumeration value="eMultiple"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Phenotype" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BioticRelationship" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="eFreeLiving"/>
     *                         &lt;enumeration value="eCommensal"/>
     *                         &lt;enumeration value="eSymbiont"/>
     *                         &lt;enumeration value="eEpisymbiont"/>
     *                         &lt;enumeration value="eIntracellular"/>
     *                         &lt;enumeration value="eParasite"/>
     *                         &lt;enumeration value="eHost"/>
     *                         &lt;enumeration value="eEndosymbiont"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TrophicLevel" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="eAutotroph"/>
     *                         &lt;enumeration value="eHeterotroph"/>
     *                         &lt;enumeration value="eMixotroph"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Disease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "morphology",
        "biologicalSample",
        "environment",
        "phenotype"
    })
    public static class BiologicalProperties {

        @XmlElement(name = "Morphology")
        protected TypeOrganism.BiologicalProperties.Morphology morphology;
        @XmlElement(name = "BiologicalSample")
        protected TypeOrganism.BiologicalProperties.BiologicalSample biologicalSample;
        @XmlElement(name = "Environment")
        protected TypeOrganism.BiologicalProperties.Environment environment;
        @XmlElement(name = "Phenotype")
        protected TypeOrganism.BiologicalProperties.Phenotype phenotype;

        /**
         * Obtient la valeur de la propriété morphology.
         * 
         * @return
         *     possible object is
         *     {@link TypeOrganism.BiologicalProperties.Morphology }
         *     
         */
        public TypeOrganism.BiologicalProperties.Morphology getMorphology() {
            return morphology;
        }

        /**
         * Définit la valeur de la propriété morphology.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeOrganism.BiologicalProperties.Morphology }
         *     
         */
        public void setMorphology(TypeOrganism.BiologicalProperties.Morphology value) {
            this.morphology = value;
        }

        /**
         * Obtient la valeur de la propriété biologicalSample.
         * 
         * @return
         *     possible object is
         *     {@link TypeOrganism.BiologicalProperties.BiologicalSample }
         *     
         */
        public TypeOrganism.BiologicalProperties.BiologicalSample getBiologicalSample() {
            return biologicalSample;
        }

        /**
         * Définit la valeur de la propriété biologicalSample.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeOrganism.BiologicalProperties.BiologicalSample }
         *     
         */
        public void setBiologicalSample(TypeOrganism.BiologicalProperties.BiologicalSample value) {
            this.biologicalSample = value;
        }

        /**
         * Obtient la valeur de la propriété environment.
         * 
         * @return
         *     possible object is
         *     {@link TypeOrganism.BiologicalProperties.Environment }
         *     
         */
        public TypeOrganism.BiologicalProperties.Environment getEnvironment() {
            return environment;
        }

        /**
         * Définit la valeur de la propriété environment.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeOrganism.BiologicalProperties.Environment }
         *     
         */
        public void setEnvironment(TypeOrganism.BiologicalProperties.Environment value) {
            this.environment = value;
        }

        /**
         * Obtient la valeur de la propriété phenotype.
         * 
         * @return
         *     possible object is
         *     {@link TypeOrganism.BiologicalProperties.Phenotype }
         *     
         */
        public TypeOrganism.BiologicalProperties.Phenotype getPhenotype() {
            return phenotype;
        }

        /**
         * Définit la valeur de la propriété phenotype.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeOrganism.BiologicalProperties.Phenotype }
         *     
         */
        public void setPhenotype(TypeOrganism.BiologicalProperties.Phenotype value) {
            this.phenotype = value;
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
         *         &lt;element name="CultureSample" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="ePureCulture"/>
         *               &lt;enumeration value="eMixedCulture"/>
         *               &lt;enumeration value="eUncultered"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CellSample" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="eIsolated"/>
         *               &lt;enumeration value="eNonisolated"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TissueSample" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "cultureSample",
            "cellSample",
            "tissueSample"
        })
        public static class BiologicalSample {

            @XmlElement(name = "CultureSample")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String cultureSample;
            @XmlElement(name = "CellSample")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String cellSample;
            @XmlElement(name = "TissueSample")
            protected String tissueSample;

            /**
             * Obtient la valeur de la propriété cultureSample.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCultureSample() {
                return cultureSample;
            }

            /**
             * Définit la valeur de la propriété cultureSample.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCultureSample(String value) {
                this.cultureSample = value;
            }

            /**
             * Obtient la valeur de la propriété cellSample.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCellSample() {
                return cellSample;
            }

            /**
             * Définit la valeur de la propriété cellSample.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCellSample(String value) {
                this.cellSample = value;
            }

            /**
             * Obtient la valeur de la propriété tissueSample.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTissueSample() {
                return tissueSample;
            }

            /**
             * Définit la valeur de la propriété tissueSample.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTissueSample(String value) {
                this.tissueSample = value;
            }

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
         *         &lt;element name="Salinity" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="eUnknown"/>
         *               &lt;enumeration value="eNonHalophilic"/>
         *               &lt;enumeration value="eMesophilic"/>
         *               &lt;enumeration value="eModerateHalophilic"/>
         *               &lt;enumeration value="eExtremeHalophilic"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OxygenReq" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="eUnknown"/>
         *               &lt;enumeration value="eAerobic"/>
         *               &lt;enumeration value="eMicroaerophilic"/>
         *               &lt;enumeration value="eFacultative"/>
         *               &lt;enumeration value="eAnaerobic"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OptimumTemperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TemperatureRange" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="eUnknown"/>
         *               &lt;enumeration value="eCryophilic"/>
         *               &lt;enumeration value="ePsychrophilic"/>
         *               &lt;enumeration value="eMesophilic"/>
         *               &lt;enumeration value="eThermophilic"/>
         *               &lt;enumeration value="eHyperthermophilic"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Habitat" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="eUnknown"/>
         *               &lt;enumeration value="eHostAssociated"/>
         *               &lt;enumeration value="eAquatic"/>
         *               &lt;enumeration value="eTerrestrial"/>
         *               &lt;enumeration value="eSpecialized"/>
         *               &lt;enumeration value="eMultiple"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
        @XmlType(name = "", propOrder = {
            "salinity",
            "oxygenReq",
            "optimumTemperature",
            "temperatureRange",
            "habitat"
        })
        public static class Environment {

            @XmlElement(name = "Salinity")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String salinity;
            @XmlElement(name = "OxygenReq")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String oxygenReq;
            @XmlElement(name = "OptimumTemperature")
            protected String optimumTemperature;
            @XmlElement(name = "TemperatureRange")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String temperatureRange;
            @XmlElement(name = "Habitat")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String habitat;

            /**
             * Obtient la valeur de la propriété salinity.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSalinity() {
                return salinity;
            }

            /**
             * Définit la valeur de la propriété salinity.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSalinity(String value) {
                this.salinity = value;
            }

            /**
             * Obtient la valeur de la propriété oxygenReq.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOxygenReq() {
                return oxygenReq;
            }

            /**
             * Définit la valeur de la propriété oxygenReq.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOxygenReq(String value) {
                this.oxygenReq = value;
            }

            /**
             * Obtient la valeur de la propriété optimumTemperature.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOptimumTemperature() {
                return optimumTemperature;
            }

            /**
             * Définit la valeur de la propriété optimumTemperature.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOptimumTemperature(String value) {
                this.optimumTemperature = value;
            }

            /**
             * Obtient la valeur de la propriété temperatureRange.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTemperatureRange() {
                return temperatureRange;
            }

            /**
             * Définit la valeur de la propriété temperatureRange.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTemperatureRange(String value) {
                this.temperatureRange = value;
            }

            /**
             * Obtient la valeur de la propriété habitat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHabitat() {
                return habitat;
            }

            /**
             * Définit la valeur de la propriété habitat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHabitat(String value) {
                this.habitat = value;
            }

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
         *         &lt;element name="Gram" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="eNegative"/>
         *               &lt;enumeration value="ePositive"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Enveloped" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="eNo"/>
         *               &lt;enumeration value="eYes"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Shape" maxOccurs="unbounded" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="eBacilli"/>
         *               &lt;enumeration value="eCocci"/>
         *               &lt;enumeration value="eSpirilla"/>
         *               &lt;enumeration value="eCoccobacilli"/>
         *               &lt;enumeration value="eFilamentous"/>
         *               &lt;enumeration value="eVibrios"/>
         *               &lt;enumeration value="eFusobacteria"/>
         *               &lt;enumeration value="eSquareShaped"/>
         *               &lt;enumeration value="eCurvedShaped"/>
         *               &lt;enumeration value="eTailed"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Endospores" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="eNo"/>
         *               &lt;enumeration value="eYes"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Motility" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="eNo"/>
         *               &lt;enumeration value="eYes"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
        @XmlType(name = "", propOrder = {
            "gram",
            "enveloped",
            "shape",
            "endospores",
            "motility"
        })
        public static class Morphology {

            @XmlElement(name = "Gram")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String gram;
            @XmlElement(name = "Enveloped")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String enveloped;
            @XmlElement(name = "Shape")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected List<String> shape;
            @XmlElement(name = "Endospores")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String endospores;
            @XmlElement(name = "Motility")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String motility;

            /**
             * Obtient la valeur de la propriété gram.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGram() {
                return gram;
            }

            /**
             * Définit la valeur de la propriété gram.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGram(String value) {
                this.gram = value;
            }

            /**
             * Obtient la valeur de la propriété enveloped.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnveloped() {
                return enveloped;
            }

            /**
             * Définit la valeur de la propriété enveloped.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnveloped(String value) {
                this.enveloped = value;
            }

            /**
             * Gets the value of the shape property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the shape property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getShape().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getShape() {
                if (shape == null) {
                    shape = new ArrayList<String>();
                }
                return this.shape;
            }

            /**
             * Obtient la valeur de la propriété endospores.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndospores() {
                return endospores;
            }

            /**
             * Définit la valeur de la propriété endospores.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndospores(String value) {
                this.endospores = value;
            }

            /**
             * Obtient la valeur de la propriété motility.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMotility() {
                return motility;
            }

            /**
             * Définit la valeur de la propriété motility.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMotility(String value) {
                this.motility = value;
            }

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
         *         &lt;element name="BioticRelationship" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="eFreeLiving"/>
         *               &lt;enumeration value="eCommensal"/>
         *               &lt;enumeration value="eSymbiont"/>
         *               &lt;enumeration value="eEpisymbiont"/>
         *               &lt;enumeration value="eIntracellular"/>
         *               &lt;enumeration value="eParasite"/>
         *               &lt;enumeration value="eHost"/>
         *               &lt;enumeration value="eEndosymbiont"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TrophicLevel" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="eAutotroph"/>
         *               &lt;enumeration value="eHeterotroph"/>
         *               &lt;enumeration value="eMixotroph"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Disease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "bioticRelationship",
            "trophicLevel",
            "disease"
        })
        public static class Phenotype {

            @XmlElement(name = "BioticRelationship")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String bioticRelationship;
            @XmlElement(name = "TrophicLevel")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String trophicLevel;
            @XmlElement(name = "Disease")
            protected String disease;

            /**
             * Obtient la valeur de la propriété bioticRelationship.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBioticRelationship() {
                return bioticRelationship;
            }

            /**
             * Définit la valeur de la propriété bioticRelationship.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBioticRelationship(String value) {
                this.bioticRelationship = value;
            }

            /**
             * Obtient la valeur de la propriété trophicLevel.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrophicLevel() {
                return trophicLevel;
            }

            /**
             * Définit la valeur de la propriété trophicLevel.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrophicLevel(String value) {
                this.trophicLevel = value;
            }

            /**
             * Obtient la valeur de la propriété disease.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisease() {
                return disease;
            }

            /**
             * Définit la valeur de la propriété disease.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisease(String value) {
                this.disease = value;
            }

        }

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
     *         &lt;element name="Replicon" type="{}typeReplicon" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Ploidy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                       &lt;enumeration value="eHaploid"/>
     *                       &lt;enumeration value="eDiploid"/>
     *                       &lt;enumeration value="ePolyploid"/>
     *                       &lt;enumeration value="eAllopolyploid"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Count" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
     *                 &lt;attribute name="repliconType" use="required" type="{}typeRepliconMolType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
    @XmlType(name = "", propOrder = {
        "replicon",
        "ploidy",
        "count"
    })
    public static class RepliconSet {

        @XmlElement(name = "Replicon")
        protected List<TypeReplicon> replicon;
        @XmlElement(name = "Ploidy")
        protected TypeOrganism.RepliconSet.Ploidy ploidy;
        @XmlElement(name = "Count")
        protected List<TypeOrganism.RepliconSet.Count> count;

        /**
         * Gets the value of the replicon property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the replicon property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReplicon().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeReplicon }
         * 
         * 
         */
        public List<TypeReplicon> getReplicon() {
            if (replicon == null) {
                replicon = new ArrayList<TypeReplicon>();
            }
            return this.replicon;
        }

        /**
         * Obtient la valeur de la propriété ploidy.
         * 
         * @return
         *     possible object is
         *     {@link TypeOrganism.RepliconSet.Ploidy }
         *     
         */
        public TypeOrganism.RepliconSet.Ploidy getPloidy() {
            return ploidy;
        }

        /**
         * Définit la valeur de la propriété ploidy.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeOrganism.RepliconSet.Ploidy }
         *     
         */
        public void setPloidy(TypeOrganism.RepliconSet.Ploidy value) {
            this.ploidy = value;
        }

        /**
         * Gets the value of the count property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the count property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeOrganism.RepliconSet.Count }
         * 
         * 
         */
        public List<TypeOrganism.RepliconSet.Count> getCount() {
            if (count == null) {
                count = new ArrayList<TypeOrganism.RepliconSet.Count>();
            }
            return this.count;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
         *       &lt;attribute name="repliconType" use="required" type="{}typeRepliconMolType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Count {

            @XmlValue
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger value;
            @XmlAttribute(name = "repliconType", required = true)
            protected TypeRepliconMolType repliconType;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setValue(BigInteger value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété repliconType.
             * 
             * @return
             *     possible object is
             *     {@link TypeRepliconMolType }
             *     
             */
            public TypeRepliconMolType getRepliconType() {
                return repliconType;
            }

            /**
             * Définit la valeur de la propriété repliconType.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeRepliconMolType }
             *     
             */
            public void setRepliconType(TypeRepliconMolType value) {
                this.repliconType = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *             &lt;enumeration value="eHaploid"/>
         *             &lt;enumeration value="eDiploid"/>
         *             &lt;enumeration value="ePolyploid"/>
         *             &lt;enumeration value="eAllopolyploid"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Ploidy {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "type", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String type;

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
             * Obtient la valeur de la propriété type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Définit la valeur de la propriété type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }

}
