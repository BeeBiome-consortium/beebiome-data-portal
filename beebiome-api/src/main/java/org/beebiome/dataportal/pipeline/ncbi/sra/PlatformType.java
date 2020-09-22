
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  The PLATFORM record selects which sequencing platform and platform-specific runtime parameters. This will be
 *         determined by the Center. 
 * 
 * <p>Classe Java pour PlatformType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PlatformType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="LS454">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{}type454Model"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ILLUMINA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{}typeIlluminaModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HELICOS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{}typeHelicosModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ABI_SOLID">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{}typeAbiSolidModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="COMPLETE_GENOMICS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{}typeCGModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BGISEQ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{}typeBGISEQModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OXFORD_NANOPORE">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{}typeOxfordNanoporeModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PACBIO_SMRT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{}typePacBioModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ION_TORRENT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{}typeIontorrentModel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CAPILLARY">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRUMENT_MODEL" type="{}typeCapillaryModel"/>
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
@XmlType(name = "PlatformType", propOrder = {
    "ls454",
    "illumina",
    "helicos",
    "abisolid",
    "completegenomics",
    "bgiseq",
    "oxfordnanopore",
    "pacbiosmrt",
    "iontorrent",
    "capillary"
})
public class PlatformType {

    @XmlElement(name = "LS454")
    protected PlatformType.LS454 ls454;
    @XmlElement(name = "ILLUMINA")
    protected PlatformType.ILLUMINA illumina;
    @XmlElement(name = "HELICOS")
    protected PlatformType.HELICOS helicos;
    @XmlElement(name = "ABI_SOLID")
    protected PlatformType.ABISOLID abisolid;
    @XmlElement(name = "COMPLETE_GENOMICS")
    protected PlatformType.COMPLETEGENOMICS completegenomics;
    @XmlElement(name = "BGISEQ")
    protected PlatformType.BGISEQ bgiseq;
    @XmlElement(name = "OXFORD_NANOPORE")
    protected PlatformType.OXFORDNANOPORE oxfordnanopore;
    @XmlElement(name = "PACBIO_SMRT")
    protected PlatformType.PACBIOSMRT pacbiosmrt;
    @XmlElement(name = "ION_TORRENT")
    protected PlatformType.IONTORRENT iontorrent;
    @XmlElement(name = "CAPILLARY")
    protected PlatformType.CAPILLARY capillary;

    /**
     * Obtient la valeur de la propriété ls454.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.LS454 }
     *     
     */
    public PlatformType.LS454 getLS454() {
        return ls454;
    }

    /**
     * Définit la valeur de la propriété ls454.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.LS454 }
     *     
     */
    public void setLS454(PlatformType.LS454 value) {
        this.ls454 = value;
    }

    /**
     * Obtient la valeur de la propriété illumina.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.ILLUMINA }
     *     
     */
    public PlatformType.ILLUMINA getILLUMINA() {
        return illumina;
    }

    /**
     * Définit la valeur de la propriété illumina.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.ILLUMINA }
     *     
     */
    public void setILLUMINA(PlatformType.ILLUMINA value) {
        this.illumina = value;
    }

    /**
     * Obtient la valeur de la propriété helicos.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.HELICOS }
     *     
     */
    public PlatformType.HELICOS getHELICOS() {
        return helicos;
    }

    /**
     * Définit la valeur de la propriété helicos.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.HELICOS }
     *     
     */
    public void setHELICOS(PlatformType.HELICOS value) {
        this.helicos = value;
    }

    /**
     * Obtient la valeur de la propriété abisolid.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.ABISOLID }
     *     
     */
    public PlatformType.ABISOLID getABISOLID() {
        return abisolid;
    }

    /**
     * Définit la valeur de la propriété abisolid.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.ABISOLID }
     *     
     */
    public void setABISOLID(PlatformType.ABISOLID value) {
        this.abisolid = value;
    }

    /**
     * Obtient la valeur de la propriété completegenomics.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.COMPLETEGENOMICS }
     *     
     */
    public PlatformType.COMPLETEGENOMICS getCOMPLETEGENOMICS() {
        return completegenomics;
    }

    /**
     * Définit la valeur de la propriété completegenomics.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.COMPLETEGENOMICS }
     *     
     */
    public void setCOMPLETEGENOMICS(PlatformType.COMPLETEGENOMICS value) {
        this.completegenomics = value;
    }

    /**
     * Obtient la valeur de la propriété bgiseq.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.BGISEQ }
     *     
     */
    public PlatformType.BGISEQ getBGISEQ() {
        return bgiseq;
    }

    /**
     * Définit la valeur de la propriété bgiseq.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.BGISEQ }
     *     
     */
    public void setBGISEQ(PlatformType.BGISEQ value) {
        this.bgiseq = value;
    }

    /**
     * Obtient la valeur de la propriété oxfordnanopore.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.OXFORDNANOPORE }
     *     
     */
    public PlatformType.OXFORDNANOPORE getOXFORDNANOPORE() {
        return oxfordnanopore;
    }

    /**
     * Définit la valeur de la propriété oxfordnanopore.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.OXFORDNANOPORE }
     *     
     */
    public void setOXFORDNANOPORE(PlatformType.OXFORDNANOPORE value) {
        this.oxfordnanopore = value;
    }

    /**
     * Obtient la valeur de la propriété pacbiosmrt.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.PACBIOSMRT }
     *     
     */
    public PlatformType.PACBIOSMRT getPACBIOSMRT() {
        return pacbiosmrt;
    }

    /**
     * Définit la valeur de la propriété pacbiosmrt.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.PACBIOSMRT }
     *     
     */
    public void setPACBIOSMRT(PlatformType.PACBIOSMRT value) {
        this.pacbiosmrt = value;
    }

    /**
     * Obtient la valeur de la propriété iontorrent.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.IONTORRENT }
     *     
     */
    public PlatformType.IONTORRENT getIONTORRENT() {
        return iontorrent;
    }

    /**
     * Définit la valeur de la propriété iontorrent.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.IONTORRENT }
     *     
     */
    public void setIONTORRENT(PlatformType.IONTORRENT value) {
        this.iontorrent = value;
    }

    /**
     * Obtient la valeur de la propriété capillary.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType.CAPILLARY }
     *     
     */
    public PlatformType.CAPILLARY getCAPILLARY() {
        return capillary;
    }

    /**
     * Définit la valeur de la propriété capillary.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType.CAPILLARY }
     *     
     */
    public void setCAPILLARY(PlatformType.CAPILLARY value) {
        this.capillary = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{}typeAbiSolidModel"/>
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
        "instrumentmodel"
    })
    public static class ABISOLID {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeAbiSolidModel instrumentmodel;

        /**
         * Obtient la valeur de la propriété instrumentmodel.
         * 
         * @return
         *     possible object is
         *     {@link TypeAbiSolidModel }
         *     
         */
        public TypeAbiSolidModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Définit la valeur de la propriété instrumentmodel.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeAbiSolidModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeAbiSolidModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{}typeBGISEQModel"/>
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
        "instrumentmodel"
    })
    public static class BGISEQ {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeBGISEQModel instrumentmodel;

        /**
         * Obtient la valeur de la propriété instrumentmodel.
         * 
         * @return
         *     possible object is
         *     {@link TypeBGISEQModel }
         *     
         */
        public TypeBGISEQModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Définit la valeur de la propriété instrumentmodel.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeBGISEQModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeBGISEQModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{}typeCapillaryModel"/>
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
        "instrumentmodel"
    })
    public static class CAPILLARY {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeCapillaryModel instrumentmodel;

        /**
         * Obtient la valeur de la propriété instrumentmodel.
         * 
         * @return
         *     possible object is
         *     {@link TypeCapillaryModel }
         *     
         */
        public TypeCapillaryModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Définit la valeur de la propriété instrumentmodel.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeCapillaryModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeCapillaryModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{}typeCGModel"/>
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
        "instrumentmodel"
    })
    public static class COMPLETEGENOMICS {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeCGModel instrumentmodel;

        /**
         * Obtient la valeur de la propriété instrumentmodel.
         * 
         * @return
         *     possible object is
         *     {@link TypeCGModel }
         *     
         */
        public TypeCGModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Définit la valeur de la propriété instrumentmodel.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeCGModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeCGModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{}typeHelicosModel"/>
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
        "instrumentmodel"
    })
    public static class HELICOS {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeHelicosModel instrumentmodel;

        /**
         * Obtient la valeur de la propriété instrumentmodel.
         * 
         * @return
         *     possible object is
         *     {@link TypeHelicosModel }
         *     
         */
        public TypeHelicosModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Définit la valeur de la propriété instrumentmodel.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeHelicosModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeHelicosModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{}typeIlluminaModel"/>
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
        "instrumentmodel"
    })
    public static class ILLUMINA {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeIlluminaModel instrumentmodel;

        /**
         * Obtient la valeur de la propriété instrumentmodel.
         * 
         * @return
         *     possible object is
         *     {@link TypeIlluminaModel }
         *     
         */
        public TypeIlluminaModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Définit la valeur de la propriété instrumentmodel.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeIlluminaModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeIlluminaModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{}typeIontorrentModel"/>
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
        "instrumentmodel"
    })
    public static class IONTORRENT {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeIontorrentModel instrumentmodel;

        /**
         * Obtient la valeur de la propriété instrumentmodel.
         * 
         * @return
         *     possible object is
         *     {@link TypeIontorrentModel }
         *     
         */
        public TypeIontorrentModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Définit la valeur de la propriété instrumentmodel.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeIontorrentModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeIontorrentModel value) {
            this.instrumentmodel = value;
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
     *       &lt;all>
     *         &lt;element name="INSTRUMENT_MODEL" type="{}type454Model"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class LS454 {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        protected String instrumentmodel;

        /**
         * Obtient la valeur de la propriété instrumentmodel.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Définit la valeur de la propriété instrumentmodel.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRUMENTMODEL(String value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{}typeOxfordNanoporeModel"/>
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
        "instrumentmodel"
    })
    public static class OXFORDNANOPORE {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypeOxfordNanoporeModel instrumentmodel;

        /**
         * Obtient la valeur de la propriété instrumentmodel.
         * 
         * @return
         *     possible object is
         *     {@link TypeOxfordNanoporeModel }
         *     
         */
        public TypeOxfordNanoporeModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Définit la valeur de la propriété instrumentmodel.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeOxfordNanoporeModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypeOxfordNanoporeModel value) {
            this.instrumentmodel = value;
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
     *         &lt;element name="INSTRUMENT_MODEL" type="{}typePacBioModel"/>
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
        "instrumentmodel"
    })
    public static class PACBIOSMRT {

        @XmlElement(name = "INSTRUMENT_MODEL", required = true)
        @XmlSchemaType(name = "string")
        protected TypePacBioModel instrumentmodel;

        /**
         * Obtient la valeur de la propriété instrumentmodel.
         * 
         * @return
         *     possible object is
         *     {@link TypePacBioModel }
         *     
         */
        public TypePacBioModel getINSTRUMENTMODEL() {
            return instrumentmodel;
        }

        /**
         * Définit la valeur de la propriété instrumentmodel.
         * 
         * @param value
         *     allowed object is
         *     {@link TypePacBioModel }
         *     
         */
        public void setINSTRUMENTMODEL(TypePacBioModel value) {
            this.instrumentmodel = value;
        }

    }

}
