
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeLibraryStrategy.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeLibraryStrategy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WGS"/>
 *     &lt;enumeration value="WGA"/>
 *     &lt;enumeration value="WXS"/>
 *     &lt;enumeration value="RNA-Seq"/>
 *     &lt;enumeration value="ssRNA-seq"/>
 *     &lt;enumeration value="miRNA-Seq"/>
 *     &lt;enumeration value="ncRNA-Seq"/>
 *     &lt;enumeration value="FL-cDNA"/>
 *     &lt;enumeration value="EST"/>
 *     &lt;enumeration value="Hi-C"/>
 *     &lt;enumeration value="ATAC-seq"/>
 *     &lt;enumeration value="WCS"/>
 *     &lt;enumeration value="RAD-Seq"/>
 *     &lt;enumeration value="CLONE"/>
 *     &lt;enumeration value="POOLCLONE"/>
 *     &lt;enumeration value="AMPLICON"/>
 *     &lt;enumeration value="CLONEEND"/>
 *     &lt;enumeration value="FINISHING"/>
 *     &lt;enumeration value="ChIP-Seq"/>
 *     &lt;enumeration value="MNase-Seq"/>
 *     &lt;enumeration value="DNase-Hypersensitivity"/>
 *     &lt;enumeration value="Bisulfite-Seq"/>
 *     &lt;enumeration value="CTS"/>
 *     &lt;enumeration value="MRE-Seq"/>
 *     &lt;enumeration value="MeDIP-Seq"/>
 *     &lt;enumeration value="MBD-Seq"/>
 *     &lt;enumeration value="Tn-Seq"/>
 *     &lt;enumeration value="VALIDATION"/>
 *     &lt;enumeration value="FAIRE-seq"/>
 *     &lt;enumeration value="SELEX"/>
 *     &lt;enumeration value="RIP-Seq"/>
 *     &lt;enumeration value="ChIA-PET"/>
 *     &lt;enumeration value="Synthetic-Long-Read"/>
 *     &lt;enumeration value="Targeted-Capture"/>
 *     &lt;enumeration value="Tethered Chromatin Conformation Capture"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeLibraryStrategy")
@XmlEnum
public enum TypeLibraryStrategy {


    /**
     * Whole Genome Sequencing - random sequencing of the whole genome (see pubmed 10731132 for details)
     *           
     * 
     */
    WGS("WGS"),

    /**
     * Whole Genome Amplification followed by random sequencing. (see pubmed 1631067,8962113 for details)
     *           
     * 
     */
    WGA("WGA"),

    /**
     *  Random sequencing of exonic regions selected from the genome. (see pubmed 20111037 for details)
     *           
     * 
     */
    WXS("WXS"),

    /**
     *  Random sequencing of whole transcriptome, also known as Whole Transcriptome Shotgun Sequencing, or WTSS).
     *           (see pubmed 18611170 for details) 
     * 
     */
    @XmlEnumValue("RNA-Seq")
    RNA_SEQ("RNA-Seq"),

    /**
     *  strand-specific RNA sequencing 
     * 
     */
    @XmlEnumValue("ssRNA-seq")
    SS_RNA_SEQ("ssRNA-seq"),

    /**
     *  Micro RNA sequencing strategy designed to capture post-transcriptional RNA elements and include
     *           non-coding functional elements. (see pubmed 21787409 for details) 
     * 
     */
    @XmlEnumValue("miRNA-Seq")
    MI_RNA_SEQ("miRNA-Seq"),

    /**
     * Capture of other non-coding RNA types, including post-translation modification types such as snRNA (small
     *           nuclear RNA) or snoRNA (small nucleolar RNA), or expression regulation types such as siRNA (small interfering RNA) or
     *           piRNA/piwi/RNA (piwi-interacting RNA).
     * 
     */
    @XmlEnumValue("ncRNA-Seq")
    NC_RNA_SEQ("ncRNA-Seq"),

    /**
     *  Full-length sequencing of cDNA templates 
     * 
     */
    @XmlEnumValue("FL-cDNA")
    FL_C_DNA("FL-cDNA"),

    /**
     *  Single pass sequencing of cDNA templates 
     * 
     */
    EST("EST"),

    /**
     *  Chromosome Conformation Capture technique where a biotin-labeled nucleotide is incorporated at the ligation junction, enabling selective purification of chimeric DNA ligation junctions followed by deep sequencing 
     * 
     */
    @XmlEnumValue("Hi-C")
    HI_C("Hi-C"),

    /**
     *  Assay for Transposase-Accessible Chromatin (ATAC) strategy is used to study genome-wide chromatin accessibility. alternative method to DNase-seq that uses an engineered Tn5 transposase to cleave DNA and to integrate primer DNA sequences into the cleaved genomic DNA
     * 
     */
    @XmlEnumValue("ATAC-seq")
    ATAC_SEQ("ATAC-seq"),

    /**
     *  Random sequencing of a whole chromosome or other replicon isolated from a genome. 
     * 
     */
    WCS("WCS"),
    @XmlEnumValue("RAD-Seq")
    RAD_SEQ("RAD-Seq"),

    /**
     *  Genomic clone based (hierarchical) sequencing. 
     * 
     */
    CLONE("CLONE"),

    /**
     *  Shotgun of pooled clones (usually BACs and Fosmids). 
     * 
     */
    POOLCLONE("POOLCLONE"),

    /**
     *  Sequencing of overlapping or distinct PCR or RT-PCR products. For example, metagenomic community
     *           profiling using SSU rRNA.
     * 
     */
    AMPLICON("AMPLICON"),

    /**
     *  Clone end (5', 3', or both) sequencing. 
     * 
     */
    CLONEEND("CLONEEND"),

    /**
     *  Sequencing intended to finish (close) gaps in existing coverage. 
     * 
     */
    FINISHING("FINISHING"),

    /**
     *  ChIP-seq, Chromatin ImmunoPrecipitation, reveals binding sites of specific proteins, typically transcription factors (TFs) using antibodies to extract DNA fragments bound to the target protein
     * 
     */
    @XmlEnumValue("ChIP-Seq")
    CH_IP_SEQ("ChIP-Seq"),

    /**
     *  identifies well-positioned nucleosomes. uses Micrococcal Nuclease (MNase) is an nuclease that processively digests DNA until an obstruction, such as a nucleosome, is reached 
     * 
     */
    @XmlEnumValue("MNase-Seq")
    M_NASE_SEQ("MNase-Seq"),

    /**
     *  Sequencing of hypersensitive sites, or segments of open chromatin that are more readily cleaved by
     *           DNaseI. 
     * 
     */
    @XmlEnumValue("DNase-Hypersensitivity")
    D_NASE_HYPERSENSITIVITY("DNase-Hypersensitivity"),

    /**
     * MethylC-seq. Sequencing following treatment of DNA with bisulfite to convert cytosine residues to uracil
     *           depending on methylation status. 
     * 
     */
    @XmlEnumValue("Bisulfite-Seq")
    BISULFITE_SEQ("Bisulfite-Seq"),

    /**
     *  Concatenated Tag Sequencing 
     * 
     */
    CTS("CTS"),

    /**
     *  Methylation-Sensitive Restriction Enzyme Sequencing. 
     * 
     */
    @XmlEnumValue("MRE-Seq")
    MRE_SEQ("MRE-Seq"),

    /**
     *  Methylated DNA Immunoprecipitation Sequencing. 
     * 
     */
    @XmlEnumValue("MeDIP-Seq")
    ME_DIP_SEQ("MeDIP-Seq"),

    /**
     *  Methyl CpG Binding Domain Sequencing. 
     * 
     */
    @XmlEnumValue("MBD-Seq")
    MBD_SEQ("MBD-Seq"),

    /**
     * Quantitatively determine fitness of bacterial genes based on how many times a purposely seeded transposon
     *           gets inserted into each gene of a colony after some time. 
     * 
     */
    @XmlEnumValue("Tn-Seq")
    TN_SEQ("Tn-Seq"),

    /**
     * CGHub special request: Independent experiment to re-evaluate putative variants. 
     * 
     */
    VALIDATION("VALIDATION"),

    /**
     * Formaldehyde Assisted Isolation of Regulatory Elements. reveals regions of open chromatin 
     * 
     */
    @XmlEnumValue("FAIRE-seq")
    FAIRE_SEQ("FAIRE-seq"),

    /**
     * Systematic Evolution of Ligands by EXponential enrichment
     * 
     */
    SELEX("SELEX"),

    /**
     * Direct sequencing of RNA immunoprecipitates (includes CLIP-Seq, HITS-CLIP and PAR-CLIP).
     *           
     * 
     */
    @XmlEnumValue("RIP-Seq")
    RIP_SEQ("RIP-Seq"),

    /**
     * Direct sequencing of proximity-ligated chromatin immunoprecipitates.
     * 
     */
    @XmlEnumValue("ChIA-PET")
    CH_IA_PET("ChIA-PET"),

    /**
     * binning and barcoding of large DNA fragments to facilitate assembly of the fragment
     * 
     */
    @XmlEnumValue("Synthetic-Long-Read")
    SYNTHETIC_LONG_READ("Synthetic-Long-Read"),
    @XmlEnumValue("Targeted-Capture")
    TARGETED_CAPTURE("Targeted-Capture"),
    @XmlEnumValue("Tethered Chromatin Conformation Capture")
    TETHERED_CHROMATIN_CONFORMATION_CAPTURE("Tethered Chromatin Conformation Capture"),

    /**
     *  Library strategy not listed. 
     * 
     */
    OTHER("OTHER");
    private final String value;

    TypeLibraryStrategy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeLibraryStrategy fromValue(String v) {
        for (TypeLibraryStrategy c: TypeLibraryStrategy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
