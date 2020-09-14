
package org.beebiome.dataportal.pipeline.ncbi.bioproject;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 A container for project information that may be exchanged.
 *                 May contain one or more single elements (i.e. one Project and one Submission)
 *             
 * 
 * <p>Classe Java pour typePackage complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typePackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Processing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="owner" use="required" type="{}typeArchive" />
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="action" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="eUnchanged"/>
 *                       &lt;enumeration value="eUpdated"/>
 *                       &lt;enumeration value="eAdded"/>
 *                       &lt;enumeration value="eDeleted"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Project">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProjectID">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ArchiveID" type="{}typeArchiveID" minOccurs="0"/>
 *                             &lt;element name="CenterID" type="{}typeCenterID" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="LocalID" type="{}typeLocalID" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProjectDescr">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExternalLink" type="{}typeExternalLink" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Grant" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Agency">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="abbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="GrantId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Publication" type="{}typePublication" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ProjectReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Relevance" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Agricultural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Medical" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Industrial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Environmental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Evolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ModelOrganism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LocusTagPrefix" type="{}typeLocusTagPrefix" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="UserTerm" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="term" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RefSeq" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AnnotationSource" type="{}typeRefSeqSource"/>
 *                                       &lt;element name="SequenceSource" type="{}typeRefSeqSource" minOccurs="0"/>
 *                                       &lt;element name="NomenclatureSource" type="{}typeRefSeqSource" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="representation" type="{}typeRepresentation" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProjectType">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="ProjectTypeTopSingleOrganism">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Organism" type="{}typeOrganism"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ProjectTypeTopAdmin">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Organism" type="{}typeOrganism" minOccurs="0"/>
 *                                       &lt;element name="DescriptionSubtypeOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="subtype" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                           &lt;enumeration value="eDisease"/>
 *                                           &lt;enumeration value="eComparativeGenomics"/>
 *                                           &lt;enumeration value="eMetagenome"/>
 *                                           &lt;enumeration value="eSingleOrganismDiscovery"/>
 *                                           &lt;enumeration value="eFundingInitiative"/>
 *                                           &lt;enumeration value="eOther"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ProjectTypeSubmission">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="Target">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="Organism" type="{}typeOrganism" minOccurs="0"/>
 *                                                   &lt;element name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                                 &lt;attribute name="sample_scope" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                                       &lt;enumeration value="eMonoisolate"/>
 *                                                       &lt;enumeration value="eMultiisolate"/>
 *                                                       &lt;enumeration value="eMultispecies"/>
 *                                                       &lt;enumeration value="eEnvironment"/>
 *                                                       &lt;enumeration value="eSynthetic"/>
 *                                                       &lt;enumeration value="eOther"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                                 &lt;attribute name="material" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                                       &lt;enumeration value="eGenome"/>
 *                                                       &lt;enumeration value="ePartialGenome"/>
 *                                                       &lt;enumeration value="eTranscriptome"/>
 *                                                       &lt;enumeration value="eReagent"/>
 *                                                       &lt;enumeration value="eProteome"/>
 *                                                       &lt;enumeration value="ePhenotype"/>
 *                                                       &lt;enumeration value="eOther"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                                 &lt;attribute name="capture" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                                       &lt;enumeration value="eWhole"/>
 *                                                       &lt;enumeration value="eCloneEnds"/>
 *                                                       &lt;enumeration value="eExome"/>
 *                                                       &lt;enumeration value="eTargetedLocusLoci"/>
 *                                                       &lt;enumeration value="eRandomSurvey"/>
 *                                                       &lt;enumeration value="eOther"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                                 &lt;attribute name="biosample_id" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="TargetBioSampleSet">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                       &lt;element name="Method">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="method_type" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                                     &lt;enumeration value="eSequencing"/>
 *                                                     &lt;enumeration value="eArray"/>
 *                                                     &lt;enumeration value="eMassSpectrometry"/>
 *                                                     &lt;enumeration value="eOther"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Objectives">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Data" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="data_type">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                                               &lt;enumeration value="eRawSequenceReads"/>
 *                                                               &lt;enumeration value="eSequence"/>
 *                                                               &lt;enumeration value="eAnalysis"/>
 *                                                               &lt;enumeration value="eAssembly"/>
 *                                                               &lt;enumeration value="eAnnotation"/>
 *                                                               &lt;enumeration value="eVariation"/>
 *                                                               &lt;enumeration value="eEpigeneticMarkers"/>
 *                                                               &lt;enumeration value="eExpression"/>
 *                                                               &lt;enumeration value="eMaps"/>
 *                                                               &lt;enumeration value="ePhenotype"/>
 *                                                               &lt;enumeration value="eOther"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProjectAssembly" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ProjectSubmission" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ProjectLinks" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ProjectPresentation" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typePackage", propOrder = {
    "processing",
    "project",
    "projectAssembly",
    "projectSubmission",
    "projectLinks",
    "projectPresentation"
})
public class TypePackage {

    @XmlElement(name = "Processing")
    protected TypePackage.Processing processing;
    @XmlElement(name = "Project", required = true)
    protected Project project;
    @XmlElement(name = "ProjectAssembly")
    protected Object projectAssembly;
    @XmlElement(name = "ProjectSubmission")
    protected Object projectSubmission;
    @XmlElement(name = "ProjectLinks")
    protected Object projectLinks;
    @XmlElement(name = "ProjectPresentation")
    protected Object projectPresentation;

    /**
     * Obtient la valeur de la propriété processing.
     * 
     * @return
     *     possible object is
     *     {@link TypePackage.Processing }
     *     
     */
    public TypePackage.Processing getProcessing() {
        return processing;
    }

    /**
     * Définit la valeur de la propriété processing.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePackage.Processing }
     *     
     */
    public void setProcessing(TypePackage.Processing value) {
        this.processing = value;
    }

    /**
     * Obtient la valeur de la propriété project.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProject() {
        return project;
    }

    /**
     * Définit la valeur de la propriété project.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(Project value) {
        this.project = value;
    }

    /**
     * Obtient la valeur de la propriété projectAssembly.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectAssembly() {
        return projectAssembly;
    }

    /**
     * Définit la valeur de la propriété projectAssembly.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectAssembly(Object value) {
        this.projectAssembly = value;
    }

    /**
     * Obtient la valeur de la propriété projectSubmission.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectSubmission() {
        return projectSubmission;
    }

    /**
     * Définit la valeur de la propriété projectSubmission.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectSubmission(Object value) {
        this.projectSubmission = value;
    }

    /**
     * Obtient la valeur de la propriété projectLinks.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectLinks() {
        return projectLinks;
    }

    /**
     * Définit la valeur de la propriété projectLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectLinks(Object value) {
        this.projectLinks = value;
    }

    /**
     * Obtient la valeur de la propriété projectPresentation.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectPresentation() {
        return projectPresentation;
    }

    /**
     * Définit la valeur de la propriété projectPresentation.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectPresentation(Object value) {
        this.projectPresentation = value;
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
     *       &lt;attribute name="owner" use="required" type="{}typeArchive" />
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="action" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="eUnchanged"/>
     *             &lt;enumeration value="eUpdated"/>
     *             &lt;enumeration value="eAdded"/>
     *             &lt;enumeration value="eDeleted"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Processing {

        @XmlAttribute(name = "owner", required = true)
        protected TypeArchive owner;
        @XmlAttribute(name = "id")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;
        @XmlAttribute(name = "action", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String action;

        /**
         * Obtient la valeur de la propriété owner.
         * 
         * @return
         *     possible object is
         *     {@link TypeArchive }
         *     
         */
        public TypeArchive getOwner() {
            return owner;
        }

        /**
         * Définit la valeur de la propriété owner.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeArchive }
         *     
         */
        public void setOwner(TypeArchive value) {
            this.owner = value;
        }

        /**
         * Obtient la valeur de la propriété id.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Définit la valeur de la propriété id.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
        }

        /**
         * Obtient la valeur de la propriété action.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * Définit la valeur de la propriété action.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }

    }


}
