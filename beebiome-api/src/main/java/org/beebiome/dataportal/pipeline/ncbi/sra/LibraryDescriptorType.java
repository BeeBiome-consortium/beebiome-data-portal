
package org.beebiome.dataportal.pipeline.ncbi.sra;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  The LIBRARY_DESCRIPTOR specifies the origin of the material being
 *       sequenced and any treatments that the material might have undergone that affect the
 *       sequencing result. This specification is needed even if the platform does not
 *       require a library construction step per se. 
 * 
 * <p>Classe Java pour LibraryDescriptorType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LibraryDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIBRARY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIBRARY_STRATEGY" type="{}typeLibraryStrategy"/>
 *         &lt;element name="LIBRARY_SOURCE" type="{}typeLibrarySource"/>
 *         &lt;element name="LIBRARY_SELECTION" type="{}typeLibrarySelection"/>
 *         &lt;element name="LIBRARY_LAYOUT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="SINGLE">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PAIRED">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="NOMINAL_LENGTH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="NOMINAL_SDEV" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TARGETED_LOCI" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LOCUS" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PROBE_SET" type="{}XRefType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="locus_name">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="16S rRNA"/>
 *                                 &lt;enumeration value="18S rRNA"/>
 *                                 &lt;enumeration value="RBCL"/>
 *                                 &lt;enumeration value="matK"/>
 *                                 &lt;enumeration value="COX1"/>
 *                                 &lt;enumeration value="ITS1-5.8S-ITS2"/>
 *                                 &lt;enumeration value="exome"/>
 *                                 &lt;enumeration value="other"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LIBRARY_CONSTRUCTION_PROTOCOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LibraryDescriptorType", propOrder = {
    "libraryname",
    "librarystrategy",
    "librarysource",
    "libraryselection",
    "librarylayout",
    "targetedloci",
    "libraryconstructionprotocol"
})
public class LibraryDescriptorType {

    @XmlElement(name = "LIBRARY_NAME")
    protected String libraryname;
    @XmlElement(name = "LIBRARY_STRATEGY", required = true)
    @XmlSchemaType(name = "string")
    protected TypeLibraryStrategy librarystrategy;
    @XmlElement(name = "LIBRARY_SOURCE", required = true)
    @XmlSchemaType(name = "string")
    protected TypeLibrarySource librarysource;
    @XmlElement(name = "LIBRARY_SELECTION", required = true)
    protected String libraryselection;
    @XmlElement(name = "LIBRARY_LAYOUT", required = true)
    protected LibraryDescriptorType.LIBRARYLAYOUT librarylayout;
    @XmlElement(name = "TARGETED_LOCI")
    protected LibraryDescriptorType.TARGETEDLOCI targetedloci;
    @XmlElement(name = "LIBRARY_CONSTRUCTION_PROTOCOL")
    protected String libraryconstructionprotocol;

    /**
     * Obtient la valeur de la propriété libraryname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIBRARYNAME() {
        return libraryname;
    }

    /**
     * Définit la valeur de la propriété libraryname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIBRARYNAME(String value) {
        this.libraryname = value;
    }

    /**
     * Obtient la valeur de la propriété librarystrategy.
     * 
     * @return
     *     possible object is
     *     {@link TypeLibraryStrategy }
     *     
     */
    public TypeLibraryStrategy getLIBRARYSTRATEGY() {
        return librarystrategy;
    }

    /**
     * Définit la valeur de la propriété librarystrategy.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLibraryStrategy }
     *     
     */
    public void setLIBRARYSTRATEGY(TypeLibraryStrategy value) {
        this.librarystrategy = value;
    }

    /**
     * Obtient la valeur de la propriété librarysource.
     * 
     * @return
     *     possible object is
     *     {@link TypeLibrarySource }
     *     
     */
    public TypeLibrarySource getLIBRARYSOURCE() {
        return librarysource;
    }

    /**
     * Définit la valeur de la propriété librarysource.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLibrarySource }
     *     
     */
    public void setLIBRARYSOURCE(TypeLibrarySource value) {
        this.librarysource = value;
    }

    /**
     * Obtient la valeur de la propriété libraryselection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIBRARYSELECTION() {
        return libraryselection;
    }

    /**
     * Définit la valeur de la propriété libraryselection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIBRARYSELECTION(String value) {
        this.libraryselection = value;
    }

    /**
     * Obtient la valeur de la propriété librarylayout.
     * 
     * @return
     *     possible object is
     *     {@link LibraryDescriptorType.LIBRARYLAYOUT }
     *     
     */
    public LibraryDescriptorType.LIBRARYLAYOUT getLIBRARYLAYOUT() {
        return librarylayout;
    }

    /**
     * Définit la valeur de la propriété librarylayout.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryDescriptorType.LIBRARYLAYOUT }
     *     
     */
    public void setLIBRARYLAYOUT(LibraryDescriptorType.LIBRARYLAYOUT value) {
        this.librarylayout = value;
    }

    /**
     * Obtient la valeur de la propriété targetedloci.
     * 
     * @return
     *     possible object is
     *     {@link LibraryDescriptorType.TARGETEDLOCI }
     *     
     */
    public LibraryDescriptorType.TARGETEDLOCI getTARGETEDLOCI() {
        return targetedloci;
    }

    /**
     * Définit la valeur de la propriété targetedloci.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryDescriptorType.TARGETEDLOCI }
     *     
     */
    public void setTARGETEDLOCI(LibraryDescriptorType.TARGETEDLOCI value) {
        this.targetedloci = value;
    }

    /**
     * Obtient la valeur de la propriété libraryconstructionprotocol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIBRARYCONSTRUCTIONPROTOCOL() {
        return libraryconstructionprotocol;
    }

    /**
     * Définit la valeur de la propriété libraryconstructionprotocol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIBRARYCONSTRUCTIONPROTOCOL(String value) {
        this.libraryconstructionprotocol = value;
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
     *         &lt;element name="SINGLE">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PAIRED">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="NOMINAL_LENGTH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="NOMINAL_SDEV" type="{http://www.w3.org/2001/XMLSchema}double" />
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
        "single",
        "paired"
    })
    public static class LIBRARYLAYOUT {

        @XmlElement(name = "SINGLE")
        protected LibraryDescriptorType.LIBRARYLAYOUT.SINGLE single;
        @XmlElement(name = "PAIRED")
        protected LibraryDescriptorType.LIBRARYLAYOUT.PAIRED paired;

        /**
         * Obtient la valeur de la propriété single.
         * 
         * @return
         *     possible object is
         *     {@link LibraryDescriptorType.LIBRARYLAYOUT.SINGLE }
         *     
         */
        public LibraryDescriptorType.LIBRARYLAYOUT.SINGLE getSINGLE() {
            return single;
        }

        /**
         * Définit la valeur de la propriété single.
         * 
         * @param value
         *     allowed object is
         *     {@link LibraryDescriptorType.LIBRARYLAYOUT.SINGLE }
         *     
         */
        public void setSINGLE(LibraryDescriptorType.LIBRARYLAYOUT.SINGLE value) {
            this.single = value;
        }

        /**
         * Obtient la valeur de la propriété paired.
         * 
         * @return
         *     possible object is
         *     {@link LibraryDescriptorType.LIBRARYLAYOUT.PAIRED }
         *     
         */
        public LibraryDescriptorType.LIBRARYLAYOUT.PAIRED getPAIRED() {
            return paired;
        }

        /**
         * Définit la valeur de la propriété paired.
         * 
         * @param value
         *     allowed object is
         *     {@link LibraryDescriptorType.LIBRARYLAYOUT.PAIRED }
         *     
         */
        public void setPAIRED(LibraryDescriptorType.LIBRARYLAYOUT.PAIRED value) {
            this.paired = value;
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
         *       &lt;attribute name="NOMINAL_LENGTH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="NOMINAL_SDEV" type="{http://www.w3.org/2001/XMLSchema}double" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PAIRED {

            @XmlAttribute(name = "NOMINAL_LENGTH")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger nominallength;
            @XmlAttribute(name = "NOMINAL_SDEV")
            protected Double nominalsdev;

            /**
             * Obtient la valeur de la propriété nominallength.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNOMINALLENGTH() {
                return nominallength;
            }

            /**
             * Définit la valeur de la propriété nominallength.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNOMINALLENGTH(BigInteger value) {
                this.nominallength = value;
            }

            /**
             * Obtient la valeur de la propriété nominalsdev.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getNOMINALSDEV() {
                return nominalsdev;
            }

            /**
             * Définit la valeur de la propriété nominalsdev.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setNOMINALSDEV(Double value) {
                this.nominalsdev = value;
            }

        }


        /**
         *  Reads are unpaired (usual case). 
         * 
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SINGLE {


        }

    }


    /**
     *  Names the gene(s) or locus(loci) or other genomic
     *             feature(s) targeted by the sequence. 
     * 
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LOCUS" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PROBE_SET" type="{}XRefType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="locus_name">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="16S rRNA"/>
     *                       &lt;enumeration value="18S rRNA"/>
     *                       &lt;enumeration value="RBCL"/>
     *                       &lt;enumeration value="matK"/>
     *                       &lt;enumeration value="COX1"/>
     *                       &lt;enumeration value="ITS1-5.8S-ITS2"/>
     *                       &lt;enumeration value="exome"/>
     *                       &lt;enumeration value="other"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "locus"
    })
    public static class TARGETEDLOCI {

        @XmlElement(name = "LOCUS", required = true)
        protected List<LibraryDescriptorType.TARGETEDLOCI.LOCUS> locus;

        /**
         * Gets the value of the locus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOCUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LibraryDescriptorType.TARGETEDLOCI.LOCUS }
         * 
         * 
         */
        public List<LibraryDescriptorType.TARGETEDLOCI.LOCUS> getLOCUS() {
            if (locus == null) {
                locus = new ArrayList<LibraryDescriptorType.TARGETEDLOCI.LOCUS>();
            }
            return this.locus;
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
         *         &lt;element name="PROBE_SET" type="{}XRefType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="locus_name">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="16S rRNA"/>
         *             &lt;enumeration value="18S rRNA"/>
         *             &lt;enumeration value="RBCL"/>
         *             &lt;enumeration value="matK"/>
         *             &lt;enumeration value="COX1"/>
         *             &lt;enumeration value="ITS1-5.8S-ITS2"/>
         *             &lt;enumeration value="exome"/>
         *             &lt;enumeration value="other"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "probeset"
        })
        public static class LOCUS {

            @XmlElement(name = "PROBE_SET")
            protected XRefType probeset;
            @XmlAttribute(name = "locus_name")
            protected String locusName;
            @XmlAttribute(name = "description")
            protected String description;

            /**
             * Obtient la valeur de la propriété probeset.
             * 
             * @return
             *     possible object is
             *     {@link XRefType }
             *     
             */
            public XRefType getPROBESET() {
                return probeset;
            }

            /**
             * Définit la valeur de la propriété probeset.
             * 
             * @param value
             *     allowed object is
             *     {@link XRefType }
             *     
             */
            public void setPROBESET(XRefType value) {
                this.probeset = value;
            }

            /**
             * Obtient la valeur de la propriété locusName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocusName() {
                return locusName;
            }

            /**
             * Définit la valeur de la propriété locusName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocusName(String value) {
                this.locusName = value;
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

        }

    }

}
