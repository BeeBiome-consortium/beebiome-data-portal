package org.beebiome.dataportal.pipeline.ncbi.bioproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

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
     *         &lt;element name="ProjectID">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ArchiveID" type="{}typeArchiveID" minOccurs="0"/>
     *                   &lt;element name="CenterID" type="{}typeCenterID" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="LocalID" type="{}typeLocalID" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProjectDescr">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExternalLink" type="{}typeExternalLink" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Grant" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Agency">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="abbr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="GrantId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Publication" type="{}typePublication" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ProjectReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Relevance" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Agricultural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Medical" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Industrial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Environmental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Evolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ModelOrganism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LocusTagPrefix" type="{}typeLocusTagPrefix" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="UserTerm" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="term" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RefSeq" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AnnotationSource" type="{}typeRefSeqSource"/>
     *                             &lt;element name="SequenceSource" type="{}typeRefSeqSource" minOccurs="0"/>
     *                             &lt;element name="NomenclatureSource" type="{}typeRefSeqSource" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="representation" type="{}typeRepresentation" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProjectType">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="ProjectTypeTopSingleOrganism">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Organism" type="{}typeOrganism"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ProjectTypeTopAdmin">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Organism" type="{}typeOrganism" minOccurs="0"/>
     *                             &lt;element name="DescriptionSubtypeOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="subtype" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                 &lt;enumeration value="eDisease"/>
     *                                 &lt;enumeration value="eComparativeGenomics"/>
     *                                 &lt;enumeration value="eMetagenome"/>
     *                                 &lt;enumeration value="eSingleOrganismDiscovery"/>
     *                                 &lt;enumeration value="eFundingInitiative"/>
     *                                 &lt;enumeration value="eOther"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ProjectTypeSubmission">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="Target">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="Organism" type="{}typeOrganism" minOccurs="0"/>
     *                                         &lt;element name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                       &lt;attribute name="sample_scope" use="required">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                             &lt;enumeration value="eMonoisolate"/>
     *                                             &lt;enumeration value="eMultiisolate"/>
     *                                             &lt;enumeration value="eMultispecies"/>
     *                                             &lt;enumeration value="eEnvironment"/>
     *                                             &lt;enumeration value="eSynthetic"/>
     *                                             &lt;enumeration value="eOther"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/attribute>
     *                                       &lt;attribute name="material" use="required">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                             &lt;enumeration value="eGenome"/>
     *                                             &lt;enumeration value="ePartialGenome"/>
     *                                             &lt;enumeration value="eTranscriptome"/>
     *                                             &lt;enumeration value="eReagent"/>
     *                                             &lt;enumeration value="eProteome"/>
     *                                             &lt;enumeration value="ePhenotype"/>
     *                                             &lt;enumeration value="eOther"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/attribute>
     *                                       &lt;attribute name="capture" use="required">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                             &lt;enumeration value="eWhole"/>
     *                                             &lt;enumeration value="eCloneEnds"/>
     *                                             &lt;enumeration value="eExome"/>
     *                                             &lt;enumeration value="eTargetedLocusLoci"/>
     *                                             &lt;enumeration value="eRandomSurvey"/>
     *                                             &lt;enumeration value="eOther"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/attribute>
     *                                       &lt;attribute name="biosample_id" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="TargetBioSampleSet">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                             &lt;element name="Method">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="method_type" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                           &lt;enumeration value="eSequencing"/>
     *                                           &lt;enumeration value="eArray"/>
     *                                           &lt;enumeration value="eMassSpectrometry"/>
     *                                           &lt;enumeration value="eOther"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Objectives">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Data" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="data_type">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                                     &lt;enumeration value="eRawSequenceReads"/>
     *                                                     &lt;enumeration value="eSequence"/>
     *                                                     &lt;enumeration value="eAnalysis"/>
     *                                                     &lt;enumeration value="eAssembly"/>
     *                                                     &lt;enumeration value="eAnnotation"/>
     *                                                     &lt;enumeration value="eVariation"/>
     *                                                     &lt;enumeration value="eEpigeneticMarkers"/>
     *                                                     &lt;enumeration value="eExpression"/>
     *                                                     &lt;enumeration value="eMaps"/>
     *                                                     &lt;enumeration value="ePhenotype"/>
     *                                                     &lt;enumeration value="eOther"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
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
        "projectID",
        "projectDescr",
        "projectType"
    })
    public  class Project {

        @XmlElement(name = "ProjectID", required = true)
        protected ProjectID projectID;
        @XmlElement(name = "ProjectDescr", required = true)
        protected ProjectDescr projectDescr;
        @XmlElement(name = "ProjectType", required = true)
        protected ProjectType projectType;

        /**
         * Obtient la valeur de la propriété projectID.
         * 
         * @return
         *     possible object is
         *     {@link ProjectID }
         *     
         */
        public ProjectID getProjectID() {
            return projectID;
        }

        /**
         * Définit la valeur de la propriété projectID.
         * 
         * @param value
         *     allowed object is
         *     {@link ProjectID }
         *     
         */
        public void setProjectID(ProjectID value) {
            this.projectID = value;
        }

        /**
         * Obtient la valeur de la propriété projectDescr.
         * 
         * @return
         *     possible object is
         *     {@link ProjectDescr }
         *     
         */
        public ProjectDescr getProjectDescr() {
            return projectDescr;
        }

        /**
         * Définit la valeur de la propriété projectDescr.
         * 
         * @param value
         *     allowed object is
         *     {@link ProjectDescr }
         *     
         */
        public void setProjectDescr(ProjectDescr value) {
            this.projectDescr = value;
        }

        /**
         * Obtient la valeur de la propriété projectType.
         * 
         * @return
         *     possible object is
         *     {@link ProjectType }
         *     
         */
        public ProjectType getProjectType() {
            return projectType;
        }

        /**
         * Définit la valeur de la propriété projectType.
         * 
         * @param value
         *     allowed object is
         *     {@link ProjectType }
         *     
         */
        public void setProjectType(ProjectType value) {
            this.projectType = value;
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
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExternalLink" type="{}typeExternalLink" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Grant" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Agency">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="abbr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="GrantId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Publication" type="{}typePublication" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ProjectReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Relevance" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Agricultural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Medical" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Industrial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Environmental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Evolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ModelOrganism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LocusTagPrefix" type="{}typeLocusTagPrefix" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="UserTerm" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="term" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RefSeq" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AnnotationSource" type="{}typeRefSeqSource"/>
         *                   &lt;element name="SequenceSource" type="{}typeRefSeqSource" minOccurs="0"/>
         *                   &lt;element name="NomenclatureSource" type="{}typeRefSeqSource" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="representation" type="{}typeRepresentation" />
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
            "name",
            "title",
            "description",
            "externalLink",
            "grant",
            "publication",
            "projectReleaseDate",
            "keyword",
            "relevance",
            "locusTagPrefix",
            "userTerm",
            "refSeq"
        })
        public static class ProjectDescr {

            @XmlElement(name = "Name")
            protected String name;
            @XmlElement(name = "Title", required = true)
            protected String title;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "ExternalLink")
            protected List<TypeExternalLink> externalLink;
            @XmlElement(name = "Grant")
            protected List<ProjectDescr.Grant> grant;
            @XmlElement(name = "Publication")
            protected List<TypePublication> publication;
            @XmlElement(name = "ProjectReleaseDate")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar projectReleaseDate;
            @XmlElement(name = "Keyword")
            protected List<String> keyword;
            @XmlElement(name = "Relevance")
            protected ProjectDescr.Relevance relevance;
            @XmlElement(name = "LocusTagPrefix")
            protected List<String> locusTagPrefix;
            @XmlElement(name = "UserTerm")
            protected List<ProjectDescr.UserTerm> userTerm;
            @XmlElement(name = "RefSeq")
            protected ProjectDescr.RefSeq refSeq;

            /**
             * Obtient la valeur de la propriété name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Définit la valeur de la propriété name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtient la valeur de la propriété title.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Définit la valeur de la propriété title.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Obtient la valeur de la propriété description.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Définit la valeur de la propriété description.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the externalLink property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the externalLink property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExternalLink().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypeExternalLink }
             * 
             * 
             */
            public List<TypeExternalLink> getExternalLink() {
                if (externalLink == null) {
                    externalLink = new ArrayList<TypeExternalLink>();
                }
                return this.externalLink;
            }

            /**
             * Gets the value of the grant property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the grant property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGrant().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProjectDescr.Grant }
             * 
             * 
             */
            public List<ProjectDescr.Grant> getGrant() {
                if (grant == null) {
                    grant = new ArrayList<ProjectDescr.Grant>();
                }
                return this.grant;
            }

            /**
             * Gets the value of the publication property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the publication property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPublication().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypePublication }
             * 
             * 
             */
            public List<TypePublication> getPublication() {
                if (publication == null) {
                    publication = new ArrayList<TypePublication>();
                }
                return this.publication;
            }

            /**
             * Obtient la valeur de la propriété projectReleaseDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getProjectReleaseDate() {
                return projectReleaseDate;
            }

            /**
             * Définit la valeur de la propriété projectReleaseDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setProjectReleaseDate(XMLGregorianCalendar value) {
                this.projectReleaseDate = value;
            }

            /**
             * Gets the value of the keyword property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the keyword property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKeyword().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getKeyword() {
                if (keyword == null) {
                    keyword = new ArrayList<String>();
                }
                return this.keyword;
            }

            /**
             * Obtient la valeur de la propriété relevance.
             * 
             * @return
             *     possible object is
             *     {@link ProjectDescr.Relevance }
             *     
             */
            public ProjectDescr.Relevance getRelevance() {
                return relevance;
            }

            /**
             * Définit la valeur de la propriété relevance.
             * 
             * @param value
             *     allowed object is
             *     {@link ProjectDescr.Relevance }
             *     
             */
            public void setRelevance(ProjectDescr.Relevance value) {
                this.relevance = value;
            }

            /**
             * Gets the value of the locusTagPrefix property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the locusTagPrefix property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLocusTagPrefix().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getLocusTagPrefix() {
                if (locusTagPrefix == null) {
                    locusTagPrefix = new ArrayList<String>();
                }
                return this.locusTagPrefix;
            }

            /**
             * Gets the value of the userTerm property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the userTerm property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUserTerm().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProjectDescr.UserTerm }
             * 
             * 
             */
            public List<ProjectDescr.UserTerm> getUserTerm() {
                if (userTerm == null) {
                    userTerm = new ArrayList<ProjectDescr.UserTerm>();
                }
                return this.userTerm;
            }

            /**
             * Obtient la valeur de la propriété refSeq.
             * 
             * @return
             *     possible object is
             *     {@link ProjectDescr.RefSeq }
             *     
             */
            public ProjectDescr.RefSeq getRefSeq() {
                return refSeq;
            }

            /**
             * Définit la valeur de la propriété refSeq.
             * 
             * @param value
             *     allowed object is
             *     {@link ProjectDescr.RefSeq }
             *     
             */
            public void setRefSeq(ProjectDescr.RefSeq value) {
                this.refSeq = value;
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
             *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Agency">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="abbr" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="GrantId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "title",
                "agency"
            })
            public static class Grant {

                @XmlElement(name = "Title")
                protected String title;
                @XmlElement(name = "Agency", required = true)
                protected ProjectDescr.Grant.Agency agency;
                @XmlAttribute(name = "GrantId", required = true)
                protected String grantId;

                /**
                 * Obtient la valeur de la propriété title.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTitle() {
                    return title;
                }

                /**
                 * Définit la valeur de la propriété title.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTitle(String value) {
                    this.title = value;
                }

                /**
                 * Obtient la valeur de la propriété agency.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProjectDescr.Grant.Agency }
                 *     
                 */
                public ProjectDescr.Grant.Agency getAgency() {
                    return agency;
                }

                /**
                 * Définit la valeur de la propriété agency.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProjectDescr.Grant.Agency }
                 *     
                 */
                public void setAgency(ProjectDescr.Grant.Agency value) {
                    this.agency = value;
                }

                /**
                 * Obtient la valeur de la propriété grantId.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGrantId() {
                    return grantId;
                }

                /**
                 * Définit la valeur de la propriété grantId.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGrantId(String value) {
                    this.grantId = value;
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
                 *       &lt;attribute name="abbr" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class Agency {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "abbr")
                    protected String abbr;

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
                     * Obtient la valeur de la propriété abbr.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAbbr() {
                        return abbr;
                    }

                    /**
                     * Définit la valeur de la propriété abbr.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAbbr(String value) {
                        this.abbr = value;
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
             *         &lt;element name="AnnotationSource" type="{}typeRefSeqSource"/>
             *         &lt;element name="SequenceSource" type="{}typeRefSeqSource" minOccurs="0"/>
             *         &lt;element name="NomenclatureSource" type="{}typeRefSeqSource" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="representation" type="{}typeRepresentation" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "annotationSource",
                "sequenceSource",
                "nomenclatureSource"
            })
            public static class RefSeq {

                @XmlElement(name = "AnnotationSource", required = true)
                protected TypeRefSeqSource annotationSource;
                @XmlElement(name = "SequenceSource")
                protected TypeRefSeqSource sequenceSource;
                @XmlElement(name = "NomenclatureSource")
                protected TypeRefSeqSource nomenclatureSource;
                @XmlAttribute(name = "representation")
                protected TypeRepresentation representation;

                /**
                 * Obtient la valeur de la propriété annotationSource.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeRefSeqSource }
                 *     
                 */
                public TypeRefSeqSource getAnnotationSource() {
                    return annotationSource;
                }

                /**
                 * Définit la valeur de la propriété annotationSource.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeRefSeqSource }
                 *     
                 */
                public void setAnnotationSource(TypeRefSeqSource value) {
                    this.annotationSource = value;
                }

                /**
                 * Obtient la valeur de la propriété sequenceSource.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeRefSeqSource }
                 *     
                 */
                public TypeRefSeqSource getSequenceSource() {
                    return sequenceSource;
                }

                /**
                 * Définit la valeur de la propriété sequenceSource.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeRefSeqSource }
                 *     
                 */
                public void setSequenceSource(TypeRefSeqSource value) {
                    this.sequenceSource = value;
                }

                /**
                 * Obtient la valeur de la propriété nomenclatureSource.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeRefSeqSource }
                 *     
                 */
                public TypeRefSeqSource getNomenclatureSource() {
                    return nomenclatureSource;
                }

                /**
                 * Définit la valeur de la propriété nomenclatureSource.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeRefSeqSource }
                 *     
                 */
                public void setNomenclatureSource(TypeRefSeqSource value) {
                    this.nomenclatureSource = value;
                }

                /**
                 * Obtient la valeur de la propriété representation.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeRepresentation }
                 *     
                 */
                public TypeRepresentation getRepresentation() {
                    return representation;
                }

                /**
                 * Définit la valeur de la propriété representation.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeRepresentation }
                 *     
                 */
                public void setRepresentation(TypeRepresentation value) {
                    this.representation = value;
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
             *         &lt;element name="Agricultural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Medical" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Industrial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Environmental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Evolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ModelOrganism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "agricultural",
                "medical",
                "industrial",
                "environmental",
                "evolution",
                "modelOrganism",
                "other"
            })
            public static class Relevance {

                @XmlElement(name = "Agricultural")
                protected String agricultural;
                @XmlElement(name = "Medical")
                protected String medical;
                @XmlElement(name = "Industrial")
                protected String industrial;
                @XmlElement(name = "Environmental")
                protected String environmental;
                @XmlElement(name = "Evolution")
                protected String evolution;
                @XmlElement(name = "ModelOrganism")
                protected String modelOrganism;
                @XmlElement(name = "Other")
                protected String other;

                /**
                 * Obtient la valeur de la propriété agricultural.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgricultural() {
                    return agricultural;
                }

                /**
                 * Définit la valeur de la propriété agricultural.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgricultural(String value) {
                    this.agricultural = value;
                }

                /**
                 * Obtient la valeur de la propriété medical.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMedical() {
                    return medical;
                }

                /**
                 * Définit la valeur de la propriété medical.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMedical(String value) {
                    this.medical = value;
                }

                /**
                 * Obtient la valeur de la propriété industrial.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndustrial() {
                    return industrial;
                }

                /**
                 * Définit la valeur de la propriété industrial.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndustrial(String value) {
                    this.industrial = value;
                }

                /**
                 * Obtient la valeur de la propriété environmental.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEnvironmental() {
                    return environmental;
                }

                /**
                 * Définit la valeur de la propriété environmental.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEnvironmental(String value) {
                    this.environmental = value;
                }

                /**
                 * Obtient la valeur de la propriété evolution.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEvolution() {
                    return evolution;
                }

                /**
                 * Définit la valeur de la propriété evolution.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEvolution(String value) {
                    this.evolution = value;
                }

                /**
                 * Obtient la valeur de la propriété modelOrganism.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getModelOrganism() {
                    return modelOrganism;
                }

                /**
                 * Définit la valeur de la propriété modelOrganism.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setModelOrganism(String value) {
                    this.modelOrganism = value;
                }

                /**
                 * Obtient la valeur de la propriété other.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOther() {
                    return other;
                }

                /**
                 * Définit la valeur de la propriété other.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOther(String value) {
                    this.other = value;
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
             *       &lt;attribute name="term" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            public static class UserTerm {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "term", required = true)
                protected String term;
                @XmlAttribute(name = "category")
                protected String category;
                @XmlAttribute(name = "units")
                protected String units;

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
                 * Obtient la valeur de la propriété term.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTerm() {
                    return term;
                }

                /**
                 * Définit la valeur de la propriété term.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTerm(String value) {
                    this.term = value;
                }

                /**
                 * Obtient la valeur de la propriété category.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCategory() {
                    return category;
                }

                /**
                 * Définit la valeur de la propriété category.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCategory(String value) {
                    this.category = value;
                }

                /**
                 * Obtient la valeur de la propriété units.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnits() {
                    return units;
                }

                /**
                 * Définit la valeur de la propriété units.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnits(String value) {
                    this.units = value;
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
         *         &lt;element name="ArchiveID" type="{}typeArchiveID" minOccurs="0"/>
         *         &lt;element name="CenterID" type="{}typeCenterID" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="LocalID" type="{}typeLocalID" maxOccurs="unbounded" minOccurs="0"/>
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
            "archiveID",
            "centerID",
            "localID"
        })
        public static class ProjectID {

            @XmlElement(name = "ArchiveID")
            protected TypeArchiveID archiveID;
            @XmlElement(name = "CenterID")
            protected List<TypeCenterID> centerID;
            @XmlElement(name = "LocalID")
            protected List<TypeLocalID> localID;

            /**
             * Obtient la valeur de la propriété archiveID.
             * 
             * @return
             *     possible object is
             *     {@link TypeArchiveID }
             *     
             */
            public TypeArchiveID getArchiveID() {
                return archiveID;
            }

            /**
             * Définit la valeur de la propriété archiveID.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeArchiveID }
             *     
             */
            public void setArchiveID(TypeArchiveID value) {
                this.archiveID = value;
            }

            /**
             * Gets the value of the centerID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the centerID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCenterID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypeCenterID }
             * 
             * 
             */
            public List<TypeCenterID> getCenterID() {
                if (centerID == null) {
                    centerID = new ArrayList<TypeCenterID>();
                }
                return this.centerID;
            }

            /**
             * Gets the value of the localID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the localID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLocalID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypeLocalID }
             * 
             * 
             */
            public List<TypeLocalID> getLocalID() {
                if (localID == null) {
                    localID = new ArrayList<TypeLocalID>();
                }
                return this.localID;
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
         *       &lt;choice>
         *         &lt;element name="ProjectTypeTopSingleOrganism">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Organism" type="{}typeOrganism"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ProjectTypeTopAdmin">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Organism" type="{}typeOrganism" minOccurs="0"/>
         *                   &lt;element name="DescriptionSubtypeOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="subtype" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                       &lt;enumeration value="eDisease"/>
         *                       &lt;enumeration value="eComparativeGenomics"/>
         *                       &lt;enumeration value="eMetagenome"/>
         *                       &lt;enumeration value="eSingleOrganismDiscovery"/>
         *                       &lt;enumeration value="eFundingInitiative"/>
         *                       &lt;enumeration value="eOther"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ProjectTypeSubmission">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="Target">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="Organism" type="{}typeOrganism" minOccurs="0"/>
         *                               &lt;element name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                               &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;/sequence>
         *                             &lt;attribute name="sample_scope" use="required">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                                   &lt;enumeration value="eMonoisolate"/>
         *                                   &lt;enumeration value="eMultiisolate"/>
         *                                   &lt;enumeration value="eMultispecies"/>
         *                                   &lt;enumeration value="eEnvironment"/>
         *                                   &lt;enumeration value="eSynthetic"/>
         *                                   &lt;enumeration value="eOther"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                             &lt;attribute name="material" use="required">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                                   &lt;enumeration value="eGenome"/>
         *                                   &lt;enumeration value="ePartialGenome"/>
         *                                   &lt;enumeration value="eTranscriptome"/>
         *                                   &lt;enumeration value="eReagent"/>
         *                                   &lt;enumeration value="eProteome"/>
         *                                   &lt;enumeration value="ePhenotype"/>
         *                                   &lt;enumeration value="eOther"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                             &lt;attribute name="capture" use="required">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                                   &lt;enumeration value="eWhole"/>
         *                                   &lt;enumeration value="eCloneEnds"/>
         *                                   &lt;enumeration value="eExome"/>
         *                                   &lt;enumeration value="eTargetedLocusLoci"/>
         *                                   &lt;enumeration value="eRandomSurvey"/>
         *                                   &lt;enumeration value="eOther"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                             &lt;attribute name="biosample_id" type="{http://www.w3.org/2001/XMLSchema}token" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="TargetBioSampleSet">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}token"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                   &lt;element name="Method">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="method_type" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                                 &lt;enumeration value="eSequencing"/>
         *                                 &lt;enumeration value="eArray"/>
         *                                 &lt;enumeration value="eMassSpectrometry"/>
         *                                 &lt;enumeration value="eOther"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Objectives">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Data" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="data_type">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                                           &lt;enumeration value="eRawSequenceReads"/>
         *                                           &lt;enumeration value="eSequence"/>
         *                                           &lt;enumeration value="eAnalysis"/>
         *                                           &lt;enumeration value="eAssembly"/>
         *                                           &lt;enumeration value="eAnnotation"/>
         *                                           &lt;enumeration value="eVariation"/>
         *                                           &lt;enumeration value="eEpigeneticMarkers"/>
         *                                           &lt;enumeration value="eExpression"/>
         *                                           &lt;enumeration value="eMaps"/>
         *                                           &lt;enumeration value="ePhenotype"/>
         *                                           &lt;enumeration value="eOther"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
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
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "projectTypeTopSingleOrganism",
            "projectTypeTopAdmin",
            "projectTypeSubmission"
        })
        public static class ProjectType {

            @XmlElement(name = "ProjectTypeTopSingleOrganism")
            protected ProjectType.ProjectTypeTopSingleOrganism projectTypeTopSingleOrganism;
            @XmlElement(name = "ProjectTypeTopAdmin")
            protected ProjectType.ProjectTypeTopAdmin projectTypeTopAdmin;
            @XmlElement(name = "ProjectTypeSubmission")
            protected ProjectType.ProjectTypeSubmission projectTypeSubmission;

            /**
             * Obtient la valeur de la propriété projectTypeTopSingleOrganism.
             * 
             * @return
             *     possible object is
             *     {@link ProjectType.ProjectTypeTopSingleOrganism }
             *     
             */
            public ProjectType.ProjectTypeTopSingleOrganism getProjectTypeTopSingleOrganism() {
                return projectTypeTopSingleOrganism;
            }

            /**
             * Définit la valeur de la propriété projectTypeTopSingleOrganism.
             * 
             * @param value
             *     allowed object is
             *     {@link ProjectType.ProjectTypeTopSingleOrganism }
             *     
             */
            public void setProjectTypeTopSingleOrganism(ProjectType.ProjectTypeTopSingleOrganism value) {
                this.projectTypeTopSingleOrganism = value;
            }

            /**
             * Obtient la valeur de la propriété projectTypeTopAdmin.
             * 
             * @return
             *     possible object is
             *     {@link ProjectType.ProjectTypeTopAdmin }
             *     
             */
            public ProjectType.ProjectTypeTopAdmin getProjectTypeTopAdmin() {
                return projectTypeTopAdmin;
            }

            /**
             * Définit la valeur de la propriété projectTypeTopAdmin.
             * 
             * @param value
             *     allowed object is
             *     {@link ProjectType.ProjectTypeTopAdmin }
             *     
             */
            public void setProjectTypeTopAdmin(ProjectType.ProjectTypeTopAdmin value) {
                this.projectTypeTopAdmin = value;
            }

            /**
             * Obtient la valeur de la propriété projectTypeSubmission.
             * 
             * @return
             *     possible object is
             *     {@link ProjectType.ProjectTypeSubmission }
             *     
             */
            public ProjectType.ProjectTypeSubmission getProjectTypeSubmission() {
                return projectTypeSubmission;
            }

            /**
             * Définit la valeur de la propriété projectTypeSubmission.
             * 
             * @param value
             *     allowed object is
             *     {@link ProjectType.ProjectTypeSubmission }
             *     
             */
            public void setProjectTypeSubmission(ProjectType.ProjectTypeSubmission value) {
                this.projectTypeSubmission = value;
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
             *         &lt;choice>
             *           &lt;element name="Target">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="Organism" type="{}typeOrganism" minOccurs="0"/>
             *                     &lt;element name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                     &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;/sequence>
             *                   &lt;attribute name="sample_scope" use="required">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *                         &lt;enumeration value="eMonoisolate"/>
             *                         &lt;enumeration value="eMultiisolate"/>
             *                         &lt;enumeration value="eMultispecies"/>
             *                         &lt;enumeration value="eEnvironment"/>
             *                         &lt;enumeration value="eSynthetic"/>
             *                         &lt;enumeration value="eOther"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/attribute>
             *                   &lt;attribute name="material" use="required">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *                         &lt;enumeration value="eGenome"/>
             *                         &lt;enumeration value="ePartialGenome"/>
             *                         &lt;enumeration value="eTranscriptome"/>
             *                         &lt;enumeration value="eReagent"/>
             *                         &lt;enumeration value="eProteome"/>
             *                         &lt;enumeration value="ePhenotype"/>
             *                         &lt;enumeration value="eOther"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/attribute>
             *                   &lt;attribute name="capture" use="required">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *                         &lt;enumeration value="eWhole"/>
             *                         &lt;enumeration value="eCloneEnds"/>
             *                         &lt;enumeration value="eExome"/>
             *                         &lt;enumeration value="eTargetedLocusLoci"/>
             *                         &lt;enumeration value="eRandomSurvey"/>
             *                         &lt;enumeration value="eOther"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/attribute>
             *                   &lt;attribute name="biosample_id" type="{http://www.w3.org/2001/XMLSchema}token" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="TargetBioSampleSet">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}token"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
             *         &lt;element name="Method">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="method_type" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *                       &lt;enumeration value="eSequencing"/>
             *                       &lt;enumeration value="eArray"/>
             *                       &lt;enumeration value="eMassSpectrometry"/>
             *                       &lt;enumeration value="eOther"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Objectives">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Data" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="data_type">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *                                 &lt;enumeration value="eRawSequenceReads"/>
             *                                 &lt;enumeration value="eSequence"/>
             *                                 &lt;enumeration value="eAnalysis"/>
             *                                 &lt;enumeration value="eAssembly"/>
             *                                 &lt;enumeration value="eAnnotation"/>
             *                                 &lt;enumeration value="eVariation"/>
             *                                 &lt;enumeration value="eEpigeneticMarkers"/>
             *                                 &lt;enumeration value="eExpression"/>
             *                                 &lt;enumeration value="eMaps"/>
             *                                 &lt;enumeration value="ePhenotype"/>
             *                                 &lt;enumeration value="eOther"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
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
                "target",
                "targetBioSampleSet",
                "method",
                "objectives"
            })
            public static class ProjectTypeSubmission {

                @XmlElement(name = "Target")
                protected ProjectType.ProjectTypeSubmission.Target target;
                @XmlElement(name = "TargetBioSampleSet")
                protected ProjectType.ProjectTypeSubmission.TargetBioSampleSet targetBioSampleSet;
                @XmlElement(name = "Method", required = true)
                protected ProjectType.ProjectTypeSubmission.Method method;
                @XmlElement(name = "Objectives", required = true)
                protected ProjectType.ProjectTypeSubmission.Objectives objectives;

                /**
                 * Obtient la valeur de la propriété target.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProjectType.ProjectTypeSubmission.Target }
                 *     
                 */
                public ProjectType.ProjectTypeSubmission.Target getTarget() {
                    return target;
                }

                /**
                 * Définit la valeur de la propriété target.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProjectType.ProjectTypeSubmission.Target }
                 *     
                 */
                public void setTarget(ProjectType.ProjectTypeSubmission.Target value) {
                    this.target = value;
                }

                /**
                 * Obtient la valeur de la propriété targetBioSampleSet.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProjectType.ProjectTypeSubmission.TargetBioSampleSet }
                 *     
                 */
                public ProjectType.ProjectTypeSubmission.TargetBioSampleSet getTargetBioSampleSet() {
                    return targetBioSampleSet;
                }

                /**
                 * Définit la valeur de la propriété targetBioSampleSet.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProjectType.ProjectTypeSubmission.TargetBioSampleSet }
                 *     
                 */
                public void setTargetBioSampleSet(ProjectType.ProjectTypeSubmission.TargetBioSampleSet value) {
                    this.targetBioSampleSet = value;
                }

                /**
                 * Obtient la valeur de la propriété method.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProjectType.ProjectTypeSubmission.Method }
                 *     
                 */
                public ProjectType.ProjectTypeSubmission.Method getMethod() {
                    return method;
                }

                /**
                 * Définit la valeur de la propriété method.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProjectType.ProjectTypeSubmission.Method }
                 *     
                 */
                public void setMethod(ProjectType.ProjectTypeSubmission.Method value) {
                    this.method = value;
                }

                /**
                 * Obtient la valeur de la propriété objectives.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProjectType.ProjectTypeSubmission.Objectives }
                 *     
                 */
                public ProjectType.ProjectTypeSubmission.Objectives getObjectives() {
                    return objectives;
                }

                /**
                 * Définit la valeur de la propriété objectives.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProjectType.ProjectTypeSubmission.Objectives }
                 *     
                 */
                public void setObjectives(ProjectType.ProjectTypeSubmission.Objectives value) {
                    this.objectives = value;
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
                 *       &lt;attribute name="method_type" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
                 *             &lt;enumeration value="eSequencing"/>
                 *             &lt;enumeration value="eArray"/>
                 *             &lt;enumeration value="eMassSpectrometry"/>
                 *             &lt;enumeration value="eOther"/>
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
                public static class Method {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "method_type", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String methodType;

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
                     * Obtient la valeur de la propriété methodType.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMethodType() {
                        return methodType;
                    }

                    /**
                     * Définit la valeur de la propriété methodType.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMethodType(String value) {
                        this.methodType = value;
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
                 *         &lt;element name="Data" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="data_type">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
                 *                       &lt;enumeration value="eRawSequenceReads"/>
                 *                       &lt;enumeration value="eSequence"/>
                 *                       &lt;enumeration value="eAnalysis"/>
                 *                       &lt;enumeration value="eAssembly"/>
                 *                       &lt;enumeration value="eAnnotation"/>
                 *                       &lt;enumeration value="eVariation"/>
                 *                       &lt;enumeration value="eEpigeneticMarkers"/>
                 *                       &lt;enumeration value="eExpression"/>
                 *                       &lt;enumeration value="eMaps"/>
                 *                       &lt;enumeration value="ePhenotype"/>
                 *                       &lt;enumeration value="eOther"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
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
                    "data"
                })
                public static class Objectives {

                    @XmlElement(name = "Data", required = true)
                    protected List<ProjectType.ProjectTypeSubmission.Objectives.Data> data;

                    /**
                     * Gets the value of the data property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the data property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getData().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ProjectType.ProjectTypeSubmission.Objectives.Data }
                     * 
                     * 
                     */
                    public List<ProjectType.ProjectTypeSubmission.Objectives.Data> getData() {
                        if (data == null) {
                            data = new ArrayList<ProjectType.ProjectTypeSubmission.Objectives.Data>();
                        }
                        return this.data;
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
                     *       &lt;attribute name="data_type">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
                     *             &lt;enumeration value="eRawSequenceReads"/>
                     *             &lt;enumeration value="eSequence"/>
                     *             &lt;enumeration value="eAnalysis"/>
                     *             &lt;enumeration value="eAssembly"/>
                     *             &lt;enumeration value="eAnnotation"/>
                     *             &lt;enumeration value="eVariation"/>
                     *             &lt;enumeration value="eEpigeneticMarkers"/>
                     *             &lt;enumeration value="eExpression"/>
                     *             &lt;enumeration value="eMaps"/>
                     *             &lt;enumeration value="ePhenotype"/>
                     *             &lt;enumeration value="eOther"/>
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
                    public static class Data {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "data_type")
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        protected String dataType;

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
                         * Obtient la valeur de la propriété dataType.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDataType() {
                            return dataType;
                        }

                        /**
                         * Définit la valeur de la propriété dataType.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDataType(String value) {
                            this.dataType = value;
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
                 *         &lt;element name="Organism" type="{}typeOrganism" minOccurs="0"/>
                 *         &lt;element name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="sample_scope" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
                 *             &lt;enumeration value="eMonoisolate"/>
                 *             &lt;enumeration value="eMultiisolate"/>
                 *             &lt;enumeration value="eMultispecies"/>
                 *             &lt;enumeration value="eEnvironment"/>
                 *             &lt;enumeration value="eSynthetic"/>
                 *             &lt;enumeration value="eOther"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="material" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
                 *             &lt;enumeration value="eGenome"/>
                 *             &lt;enumeration value="ePartialGenome"/>
                 *             &lt;enumeration value="eTranscriptome"/>
                 *             &lt;enumeration value="eReagent"/>
                 *             &lt;enumeration value="eProteome"/>
                 *             &lt;enumeration value="ePhenotype"/>
                 *             &lt;enumeration value="eOther"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="capture" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
                 *             &lt;enumeration value="eWhole"/>
                 *             &lt;enumeration value="eCloneEnds"/>
                 *             &lt;enumeration value="eExome"/>
                 *             &lt;enumeration value="eTargetedLocusLoci"/>
                 *             &lt;enumeration value="eRandomSurvey"/>
                 *             &lt;enumeration value="eOther"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="biosample_id" type="{http://www.w3.org/2001/XMLSchema}token" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "organism",
                    "provider",
                    "description"
                })
                public static class Target {

                    @XmlElement(name = "Organism")
                    protected TypeOrganism organism;
                    @XmlElement(name = "Provider")
                    protected String provider;
                    @XmlElement(name = "Description")
                    protected String description;
                    @XmlAttribute(name = "sample_scope", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String sampleScope;
                    @XmlAttribute(name = "material", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String material;
                    @XmlAttribute(name = "capture", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String capture;
                    @XmlAttribute(name = "biosample_id")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String biosampleId;

                    /**
                     * Obtient la valeur de la propriété organism.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TypeOrganism }
                     *     
                     */
                    public TypeOrganism getOrganism() {
                        return organism;
                    }

                    /**
                     * Définit la valeur de la propriété organism.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TypeOrganism }
                     *     
                     */
                    public void setOrganism(TypeOrganism value) {
                        this.organism = value;
                    }

                    /**
                     * Obtient la valeur de la propriété provider.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProvider() {
                        return provider;
                    }

                    /**
                     * Définit la valeur de la propriété provider.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProvider(String value) {
                        this.provider = value;
                    }

                    /**
                     * Obtient la valeur de la propriété description.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * Définit la valeur de la propriété description.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescription(String value) {
                        this.description = value;
                    }

                    /**
                     * Obtient la valeur de la propriété sampleScope.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSampleScope() {
                        return sampleScope;
                    }

                    /**
                     * Définit la valeur de la propriété sampleScope.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSampleScope(String value) {
                        this.sampleScope = value;
                    }

                    /**
                     * Obtient la valeur de la propriété material.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMaterial() {
                        return material;
                    }

                    /**
                     * Définit la valeur de la propriété material.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMaterial(String value) {
                        this.material = value;
                    }

                    /**
                     * Obtient la valeur de la propriété capture.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCapture() {
                        return capture;
                    }

                    /**
                     * Définit la valeur de la propriété capture.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCapture(String value) {
                        this.capture = value;
                    }

                    /**
                     * Obtient la valeur de la propriété biosampleId.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBiosampleId() {
                        return biosampleId;
                    }

                    /**
                     * Définit la valeur de la propriété biosampleId.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBiosampleId(String value) {
                        this.biosampleId = value;
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
                 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}token"/>
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
                    "id"
                })
                public static class TargetBioSampleSet {

                    @XmlElement(name = "ID", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String id;

                    /**
                     * Obtient la valeur de la propriété id.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getID() {
                        return id;
                    }

                    /**
                     * Définit la valeur de la propriété id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setID(String value) {
                        this.id = value;
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
             *         &lt;element name="Organism" type="{}typeOrganism" minOccurs="0"/>
             *         &lt;element name="DescriptionSubtypeOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="subtype" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *             &lt;enumeration value="eDisease"/>
             *             &lt;enumeration value="eComparativeGenomics"/>
             *             &lt;enumeration value="eMetagenome"/>
             *             &lt;enumeration value="eSingleOrganismDiscovery"/>
             *             &lt;enumeration value="eFundingInitiative"/>
             *             &lt;enumeration value="eOther"/>
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
            @XmlType(name = "", propOrder = {
                "organism",
                "descriptionSubtypeOther"
            })
            public static class ProjectTypeTopAdmin {

                @XmlElement(name = "Organism")
                protected TypeOrganism organism;
                @XmlElement(name = "DescriptionSubtypeOther")
                protected String descriptionSubtypeOther;
                @XmlAttribute(name = "subtype", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String subtype;

                /**
                 * Obtient la valeur de la propriété organism.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeOrganism }
                 *     
                 */
                public TypeOrganism getOrganism() {
                    return organism;
                }

                /**
                 * Définit la valeur de la propriété organism.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeOrganism }
                 *     
                 */
                public void setOrganism(TypeOrganism value) {
                    this.organism = value;
                }

                /**
                 * Obtient la valeur de la propriété descriptionSubtypeOther.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescriptionSubtypeOther() {
                    return descriptionSubtypeOther;
                }

                /**
                 * Définit la valeur de la propriété descriptionSubtypeOther.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescriptionSubtypeOther(String value) {
                    this.descriptionSubtypeOther = value;
                }

                /**
                 * Obtient la valeur de la propriété subtype.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubtype() {
                    return subtype;
                }

                /**
                 * Définit la valeur de la propriété subtype.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubtype(String value) {
                    this.subtype = value;
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
             *         &lt;element name="Organism" type="{}typeOrganism"/>
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
                "organism"
            })
            public static class ProjectTypeTopSingleOrganism {

                @XmlElement(name = "Organism", required = true)
                protected TypeOrganism organism;

                /**
                 * Obtient la valeur de la propriété organism.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeOrganism }
                 *     
                 */
                public TypeOrganism getOrganism() {
                    return organism;
                }

                /**
                 * Définit la valeur de la propriété organism.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeOrganism }
                 *     
                 */
                public void setOrganism(TypeOrganism value) {
                    this.organism = value;
                }

            }

        }

    }
