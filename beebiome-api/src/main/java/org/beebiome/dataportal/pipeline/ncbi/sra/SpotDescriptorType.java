
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
import javax.xml.bind.annotation.XmlValue;


/**
 *  The SPOT_DESCRIPTOR specifies how to decode the individual reads of
 *       interest from the monolithic spot sequence. The spot descriptor contains aspects of
 *       the experimental design, platform, and processing information. There will be two
 *       methods of specification: one will be an index into a table of typical decodings,
 *       the other being an exact specification. 
 * 
 * <p>Classe Java pour SpotDescriptorType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SpotDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SPOT_DECODE_SPEC">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SPOT_LENGTH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="READ_SPEC" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="READ_INDEX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                             &lt;element name="READ_LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="READ_CLASS">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Application Read"/>
 *                                   &lt;enumeration value="Technical Read"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="READ_TYPE">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Forward"/>
 *                                   &lt;enumeration value="Reverse"/>
 *                                   &lt;enumeration value="Adapter"/>
 *                                   &lt;enumeration value="Primer"/>
 *                                   &lt;enumeration value="Linker"/>
 *                                   &lt;enumeration value="BarCode"/>
 *                                   &lt;enumeration value="Other"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;choice>
 *                               &lt;element name="RELATIVE_ORDER">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="follows_read_index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                       &lt;attribute name="precedes_read_index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="BASE_COORD" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                               &lt;element name="EXPECTED_BASECALL_TABLE">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="BASECALL" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;simpleContent>
 *                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                 &lt;attribute name="read_group_tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="min_match" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                                 &lt;attribute name="max_mismatch" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                                 &lt;attribute name="match_edge">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="full"/>
 *                                                       &lt;enumeration value="start"/>
 *                                                       &lt;enumeration value="end"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                               &lt;/extension>
 *                                             &lt;/simpleContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="default_length" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                       &lt;attribute name="base_coord" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
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
@XmlType(name = "SpotDescriptorType", propOrder = {
    "spotdecodespec"
})
public class SpotDescriptorType {

    @XmlElement(name = "SPOT_DECODE_SPEC")
    protected SpotDescriptorType.SPOTDECODESPEC spotdecodespec;

    /**
     * Obtient la valeur de la propriété spotdecodespec.
     * 
     * @return
     *     possible object is
     *     {@link SpotDescriptorType.SPOTDECODESPEC }
     *     
     */
    public SpotDescriptorType.SPOTDECODESPEC getSPOTDECODESPEC() {
        return spotdecodespec;
    }

    /**
     * Définit la valeur de la propriété spotdecodespec.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotDescriptorType.SPOTDECODESPEC }
     *     
     */
    public void setSPOTDECODESPEC(SpotDescriptorType.SPOTDECODESPEC value) {
        this.spotdecodespec = value;
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
     *         &lt;element name="SPOT_LENGTH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="READ_SPEC" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="READ_INDEX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *                   &lt;element name="READ_LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="READ_CLASS">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Application Read"/>
     *                         &lt;enumeration value="Technical Read"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="READ_TYPE">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Forward"/>
     *                         &lt;enumeration value="Reverse"/>
     *                         &lt;enumeration value="Adapter"/>
     *                         &lt;enumeration value="Primer"/>
     *                         &lt;enumeration value="Linker"/>
     *                         &lt;enumeration value="BarCode"/>
     *                         &lt;enumeration value="Other"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;choice>
     *                     &lt;element name="RELATIVE_ORDER">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="follows_read_index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                             &lt;attribute name="precedes_read_index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="BASE_COORD" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                     &lt;element name="EXPECTED_BASECALL_TABLE">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="BASECALL" maxOccurs="unbounded">
     *                                 &lt;complexType>
     *                                   &lt;simpleContent>
     *                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                       &lt;attribute name="read_group_tag" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="min_match" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                       &lt;attribute name="max_mismatch" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                       &lt;attribute name="match_edge">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="full"/>
     *                                             &lt;enumeration value="start"/>
     *                                             &lt;enumeration value="end"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/attribute>
     *                                     &lt;/extension>
     *                                   &lt;/simpleContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                             &lt;attribute name="default_length" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                             &lt;attribute name="base_coord" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
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
        "spotlength",
        "readspec"
    })
    public static class SPOTDECODESPEC {

        @XmlElement(name = "SPOT_LENGTH")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger spotlength;
        @XmlElement(name = "READ_SPEC", required = true)
        protected List<SpotDescriptorType.SPOTDECODESPEC.READSPEC> readspec;

        /**
         * Obtient la valeur de la propriété spotlength.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSPOTLENGTH() {
            return spotlength;
        }

        /**
         * Définit la valeur de la propriété spotlength.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSPOTLENGTH(BigInteger value) {
            this.spotlength = value;
        }

        /**
         * Gets the value of the readspec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the readspec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREADSPEC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC }
         * 
         * 
         */
        public List<SpotDescriptorType.SPOTDECODESPEC.READSPEC> getREADSPEC() {
            if (readspec == null) {
                readspec = new ArrayList<SpotDescriptorType.SPOTDECODESPEC.READSPEC>();
            }
            return this.readspec;
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
         *         &lt;element name="READ_INDEX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
         *         &lt;element name="READ_LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="READ_CLASS">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Application Read"/>
         *               &lt;enumeration value="Technical Read"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="READ_TYPE">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Forward"/>
         *               &lt;enumeration value="Reverse"/>
         *               &lt;enumeration value="Adapter"/>
         *               &lt;enumeration value="Primer"/>
         *               &lt;enumeration value="Linker"/>
         *               &lt;enumeration value="BarCode"/>
         *               &lt;enumeration value="Other"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;choice>
         *           &lt;element name="RELATIVE_ORDER">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="follows_read_index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                   &lt;attribute name="precedes_read_index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="BASE_COORD" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *           &lt;element name="EXPECTED_BASECALL_TABLE">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="BASECALL" maxOccurs="unbounded">
         *                       &lt;complexType>
         *                         &lt;simpleContent>
         *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                             &lt;attribute name="read_group_tag" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="min_match" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                             &lt;attribute name="max_mismatch" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                             &lt;attribute name="match_edge">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="full"/>
         *                                   &lt;enumeration value="start"/>
         *                                   &lt;enumeration value="end"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                           &lt;/extension>
         *                         &lt;/simpleContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                   &lt;attribute name="default_length" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                   &lt;attribute name="base_coord" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
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
            "readindex",
            "readlabel",
            "readclass",
            "readtype",
            "relativeorder",
            "basecoord",
            "expectedbasecalltable"
        })
        public static class READSPEC {

            @XmlElement(name = "READ_INDEX", required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger readindex;
            @XmlElement(name = "READ_LABEL")
            protected String readlabel;
            @XmlElement(name = "READ_CLASS", required = true)
            protected String readclass;
            @XmlElement(name = "READ_TYPE", required = true, defaultValue = "Forward")
            protected String readtype;
            @XmlElement(name = "RELATIVE_ORDER")
            protected SpotDescriptorType.SPOTDECODESPEC.READSPEC.RELATIVEORDER relativeorder;
            @XmlElement(name = "BASE_COORD")
            protected BigInteger basecoord;
            @XmlElement(name = "EXPECTED_BASECALL_TABLE")
            protected SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE expectedbasecalltable;

            /**
             * Obtient la valeur de la propriété readindex.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getREADINDEX() {
                return readindex;
            }

            /**
             * Définit la valeur de la propriété readindex.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setREADINDEX(BigInteger value) {
                this.readindex = value;
            }

            /**
             * Obtient la valeur de la propriété readlabel.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREADLABEL() {
                return readlabel;
            }

            /**
             * Définit la valeur de la propriété readlabel.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREADLABEL(String value) {
                this.readlabel = value;
            }

            /**
             * Obtient la valeur de la propriété readclass.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREADCLASS() {
                return readclass;
            }

            /**
             * Définit la valeur de la propriété readclass.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREADCLASS(String value) {
                this.readclass = value;
            }

            /**
             * Obtient la valeur de la propriété readtype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREADTYPE() {
                return readtype;
            }

            /**
             * Définit la valeur de la propriété readtype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREADTYPE(String value) {
                this.readtype = value;
            }

            /**
             * Obtient la valeur de la propriété relativeorder.
             * 
             * @return
             *     possible object is
             *     {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC.RELATIVEORDER }
             *     
             */
            public SpotDescriptorType.SPOTDECODESPEC.READSPEC.RELATIVEORDER getRELATIVEORDER() {
                return relativeorder;
            }

            /**
             * Définit la valeur de la propriété relativeorder.
             * 
             * @param value
             *     allowed object is
             *     {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC.RELATIVEORDER }
             *     
             */
            public void setRELATIVEORDER(SpotDescriptorType.SPOTDECODESPEC.READSPEC.RELATIVEORDER value) {
                this.relativeorder = value;
            }

            /**
             * Obtient la valeur de la propriété basecoord.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBASECOORD() {
                return basecoord;
            }

            /**
             * Définit la valeur de la propriété basecoord.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBASECOORD(BigInteger value) {
                this.basecoord = value;
            }

            /**
             * Obtient la valeur de la propriété expectedbasecalltable.
             * 
             * @return
             *     possible object is
             *     {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE }
             *     
             */
            public SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE getEXPECTEDBASECALLTABLE() {
                return expectedbasecalltable;
            }

            /**
             * Définit la valeur de la propriété expectedbasecalltable.
             * 
             * @param value
             *     allowed object is
             *     {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE }
             *     
             */
            public void setEXPECTEDBASECALLTABLE(SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE value) {
                this.expectedbasecalltable = value;
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
             *         &lt;element name="BASECALL" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="read_group_tag" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="min_match" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                 &lt;attribute name="max_mismatch" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                 &lt;attribute name="match_edge">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="full"/>
             *                       &lt;enumeration value="start"/>
             *                       &lt;enumeration value="end"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="default_length" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="base_coord" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "basecall"
            })
            public static class EXPECTEDBASECALLTABLE {

                @XmlElement(name = "BASECALL", required = true)
                protected List<SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE.BASECALL> basecall;
                @XmlAttribute(name = "default_length")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger defaultLength;
                @XmlAttribute(name = "base_coord")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger baseCoord;

                /**
                 * Gets the value of the basecall property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the basecall property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBASECALL().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE.BASECALL }
                 * 
                 * 
                 */
                public List<SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE.BASECALL> getBASECALL() {
                    if (basecall == null) {
                        basecall = new ArrayList<SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE.BASECALL>();
                    }
                    return this.basecall;
                }

                /**
                 * Obtient la valeur de la propriété defaultLength.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDefaultLength() {
                    return defaultLength;
                }

                /**
                 * Définit la valeur de la propriété defaultLength.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDefaultLength(BigInteger value) {
                    this.defaultLength = value;
                }

                /**
                 * Obtient la valeur de la propriété baseCoord.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getBaseCoord() {
                    return baseCoord;
                }

                /**
                 * Définit la valeur de la propriété baseCoord.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setBaseCoord(BigInteger value) {
                    this.baseCoord = value;
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
                 *       &lt;attribute name="read_group_tag" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="min_match" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *       &lt;attribute name="max_mismatch" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *       &lt;attribute name="match_edge">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="full"/>
                 *             &lt;enumeration value="start"/>
                 *             &lt;enumeration value="end"/>
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
                public static class BASECALL {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "read_group_tag")
                    protected String readGroupTag;
                    @XmlAttribute(name = "min_match")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger minMatch;
                    @XmlAttribute(name = "max_mismatch")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger maxMismatch;
                    @XmlAttribute(name = "match_edge")
                    protected String matchEdge;

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
                     * Obtient la valeur de la propriété readGroupTag.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getReadGroupTag() {
                        return readGroupTag;
                    }

                    /**
                     * Définit la valeur de la propriété readGroupTag.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setReadGroupTag(String value) {
                        this.readGroupTag = value;
                    }

                    /**
                     * Obtient la valeur de la propriété minMatch.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getMinMatch() {
                        return minMatch;
                    }

                    /**
                     * Définit la valeur de la propriété minMatch.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setMinMatch(BigInteger value) {
                        this.minMatch = value;
                    }

                    /**
                     * Obtient la valeur de la propriété maxMismatch.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getMaxMismatch() {
                        return maxMismatch;
                    }

                    /**
                     * Définit la valeur de la propriété maxMismatch.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setMaxMismatch(BigInteger value) {
                        this.maxMismatch = value;
                    }

                    /**
                     * Obtient la valeur de la propriété matchEdge.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMatchEdge() {
                        return matchEdge;
                    }

                    /**
                     * Définit la valeur de la propriété matchEdge.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMatchEdge(String value) {
                        this.matchEdge = value;
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
             *       &lt;attribute name="follows_read_index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="precedes_read_index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RELATIVEORDER {

                @XmlAttribute(name = "follows_read_index")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger followsReadIndex;
                @XmlAttribute(name = "precedes_read_index")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger precedesReadIndex;

                /**
                 * Obtient la valeur de la propriété followsReadIndex.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getFollowsReadIndex() {
                    return followsReadIndex;
                }

                /**
                 * Définit la valeur de la propriété followsReadIndex.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setFollowsReadIndex(BigInteger value) {
                    this.followsReadIndex = value;
                }

                /**
                 * Obtient la valeur de la propriété precedesReadIndex.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPrecedesReadIndex() {
                    return precedesReadIndex;
                }

                /**
                 * Définit la valeur de la propriété precedesReadIndex.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPrecedesReadIndex(BigInteger value) {
                    this.precedesReadIndex = value;
                }

            }

        }

    }

}
