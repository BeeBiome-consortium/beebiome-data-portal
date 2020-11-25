
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeStudyTypes.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeStudyTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Whole Genome Sequencing"/>
 *     &lt;enumeration value="Metagenomics"/>
 *     &lt;enumeration value="Transcriptome Sequencing"/>
 *     &lt;enumeration value="Transcriptome Analysis"/>
 *     &lt;enumeration value="Epigenetics"/>
 *     &lt;enumeration value="Synthetic Genomics"/>
 *     &lt;enumeration value="Cancer Genomics"/>
 *     &lt;enumeration value="Population Genomics"/>
 *     &lt;enumeration value="Exome Sequencing"/>
 *     &lt;enumeration value="Pooled Clone Sequencing"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeStudyTypes")
@XmlEnum
public enum TypeStudyTypes {


    /**
     *  Sequencing of a single organism. 
     * 
     */
    @XmlEnumValue("Whole Genome Sequencing")
    WHOLE_GENOME_SEQUENCING("Whole Genome Sequencing"),

    /**
     *  Sequencing of a community. 
     * 
     */
    @XmlEnumValue("Metagenomics")
    METAGENOMICS("Metagenomics"),

    /**
     *  Sequencing of transcription elements. 
     * 
     */
    @XmlEnumValue("Transcriptome Sequencing")
    TRANSCRIPTOME_SEQUENCING("Transcriptome Sequencing"),

    /**
     *  Characterization of transcription elements. 
     * 
     */
    @XmlEnumValue("Transcriptome Analysis")
    TRANSCRIPTOME_ANALYSIS("Transcriptome Analysis"),

    /**
     *  Cellular differentiation study. 
     * 
     */
    @XmlEnumValue("Epigenetics")
    EPIGENETICS("Epigenetics"),

    /**
     *  Sequencing of modified, synthetic, or transplanted genomes. 
     * 
     */
    @XmlEnumValue("Synthetic Genomics")
    SYNTHETIC_GENOMICS("Synthetic Genomics"),

    /**
     *  Study of cancer genomics. 
     * 
     */
    @XmlEnumValue("Cancer Genomics")
    CANCER_GENOMICS("Cancer Genomics"),

    /**
     *  Study of populations and evolution through genomics. 
     * 
     */
    @XmlEnumValue("Population Genomics")
    POPULATION_GENOMICS("Population Genomics"),

    /**
     *  The study investigates the exons of the genome. 
     * 
     */
    @XmlEnumValue("Exome Sequencing")
    EXOME_SEQUENCING("Exome Sequencing"),

    /**
     *  The study is sequencing clone pools (BACs, fosmids, other
     *           constructs). 
     * 
     */
    @XmlEnumValue("Pooled Clone Sequencing")
    POOLED_CLONE_SEQUENCING("Pooled Clone Sequencing"),

    /**
     *  Study type not listed. 
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeStudyTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeStudyTypes fromValue(String v) {
        for (TypeStudyTypes c: TypeStudyTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
