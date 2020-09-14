
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeLibrarySource.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeLibrarySource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENOMIC"/>
 *     &lt;enumeration value="GENOMIC SINGLE CELL"/>
 *     &lt;enumeration value="TRANSCRIPTOMIC"/>
 *     &lt;enumeration value="TRANSCRIPTOMIC SINGLE CELL"/>
 *     &lt;enumeration value="METAGENOMIC"/>
 *     &lt;enumeration value="METATRANSCRIPTOMIC"/>
 *     &lt;enumeration value="SYNTHETIC"/>
 *     &lt;enumeration value="VIRAL RNA"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeLibrarySource")
@XmlEnum
public enum TypeLibrarySource {


    /**
     *  Genomic DNA (includes PCR products from genomic DNA). 
     * 
     */
    GENOMIC("GENOMIC"),
    @XmlEnumValue("GENOMIC SINGLE CELL")
    GENOMIC_SINGLE_CELL("GENOMIC SINGLE CELL"),

    /**
     *  Transcription products or non genomic DNA (EST, cDNA, RT-PCR, screened libraries). 
     * 
     */
    TRANSCRIPTOMIC("TRANSCRIPTOMIC"),
    @XmlEnumValue("TRANSCRIPTOMIC SINGLE CELL")
    TRANSCRIPTOMIC_SINGLE_CELL("TRANSCRIPTOMIC SINGLE CELL"),

    /**
     *  Mixed material from metagenome. 
     * 
     */
    METAGENOMIC("METAGENOMIC"),

    /**
     *  Transcription products from community targets 
     * 
     */
    METATRANSCRIPTOMIC("METATRANSCRIPTOMIC"),

    /**
     *  Synthetic DNA. 
     * 
     */
    SYNTHETIC("SYNTHETIC"),

    /**
     *  Viral RNA. 
     * 
     */
    @XmlEnumValue("VIRAL RNA")
    VIRAL_RNA("VIRAL RNA"),

    /**
     *  Other, unspecified, or unknown library source material. 
     * 
     */
    OTHER("OTHER");
    private final String value;

    TypeLibrarySource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeLibrarySource fromValue(String v) {
        for (TypeLibrarySource c: TypeLibrarySource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
