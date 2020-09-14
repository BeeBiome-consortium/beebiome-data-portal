
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeAnalysisFileType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAnalysisFileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ace"/>
 *     &lt;enumeration value="tab"/>
 *     &lt;enumeration value="bam"/>
 *     &lt;enumeration value="fasta"/>
 *     &lt;enumeration value="wig"/>
 *     &lt;enumeration value="bed"/>
 *     &lt;enumeration value="vcf"/>
 *     &lt;enumeration value="maf"/>
 *     &lt;enumeration value="gff"/>
 *     &lt;enumeration value="csv"/>
 *     &lt;enumeration value="tsv"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeAnalysisFileType")
@XmlEnum
public enum TypeAnalysisFileType {


    /**
     *  Multiple alignment file output from the phred assembler and similar programs. See
     *           http://www.phrap.org/consed/distributions/README.16.0.txt for a description of the ACE file format. 
     * 
     */
    @XmlEnumValue("ace")
    ACE("ace"),

    /**
     *  A tab delimited text file that can be viewed as a spreadsheet. The first line should contain column
     *           headers. 
     * 
     */
    @XmlEnumValue("tab")
    TAB("tab"),

    /**
     *  Binary form of the Sequence Alignment/Map (SAM) format for read placements, from the SAM tools project. See
     *            http://sourceforge.net/projects/samtools/ . BAM files are processed by SRA as primary data and should be specified in a Run.
     *           
     * 
     */
    @XmlEnumValue("bam")
    BAM("bam"),

    /**
     *  Sequence data format indicating sequence base calls. The format is simple: a header line initiated
     *           with the > character, data lines following with base calls. 
     * 
     */
    @XmlEnumValue("fasta")
    FASTA("fasta"),

    /**
     *  The wiggle (WIG) format allows display of continuous-valued data in track format. This display type
     *           is useful for GC percent, probability scores, and transcriptome data. See
     *           http://genome.ucsc.edu/goldenPath/help/wiggle.html for a description of the Wiggle Track format. 
     * 
     */
    @XmlEnumValue("wig")
    WIG("wig"),

    /**
     *  BED format provides a flexible way to define the data lines that are displayed in an annotation
     *           track. See http://genome.ucsc.edu/FAQ/FAQformat#format1 for a description of the BED format. 
     * 
     */
    @XmlEnumValue("bed")
    BED("bed"),
    @XmlEnumValue("vcf")
    VCF("vcf"),

    /**
     * Mutation Annotation Format
     * 
     */
    @XmlEnumValue("maf")
    MAF("maf"),
    @XmlEnumValue("gff")
    GFF("gff"),
    @XmlEnumValue("csv")
    CSV("csv"),
    @XmlEnumValue("tsv")
    TSV("tsv");
    private final String value;

    TypeAnalysisFileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAnalysisFileType fromValue(String v) {
        for (TypeAnalysisFileType c: TypeAnalysisFileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
