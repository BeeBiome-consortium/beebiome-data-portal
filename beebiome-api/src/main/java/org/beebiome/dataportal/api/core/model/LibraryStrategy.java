package org.beebiome.dataportal.api.core.model;

public enum LibraryStrategy {

    WGS("WGS"),
    WGA("WGA"),
    WXS("WXS"),
    RNAS_SEQ("RNA-Seq"),
    SSRNA_SEQ("ssRNA-seq"),
    MIRNA_SEQ("miRNA-Seq"),
    NCRNA_SEQ("ncRNA-Seq"),
    FL_CDNA("FL-cDNA"),
    EST("EST"),
    Hi_C ("Hi-C"),
    ATAC_SEQ("ATAC-seq"),
    WCS("WCS"),
    RAD_SEQ("RAD-Seq"),
    CLONE("CLONE"),
    POOLCLONE("POOLCLONE"),
    AMPLICON("AMPLICON"),
    CLONEEND("CLONEEND"),
    FINISHING("FINISHING"),
    CHIP_SEQ("ChIP-Seq"),
    MNASE_SEQ("MNase-Seq"),
    DNASE_HYPERSENSITIVITY("DNase-Hypersensitivity"),
    BISULFITE_SEQ("Bisulfite-Seq"),
    CTS("CTS"),
    MRE_SEQ("MRE-Seq"),
    MeDIP_SEQ("MeDIP-Seq"),
    MBD_SEQ("MBD-Seq"),
    TN_SEQ("Tn-Seq"),
    VALIDATION("VALIDATION"),
    FAIRE_SEQ("FAIRE-seq"),
    SELEX("SELEX"),
    RIP_SEQ("RIP-Seq"),
    CHIA_PET("ChIA-PET"),
    SYNTHETIC_LONG_READ("Synthetic-Long-Read"),
    TARGETED_CAPTURE("Targeted-Capture"),
    TETHERED_CHROMATIN_CONFORMATION_CAPTURE("Tethered Chromatin Conformation Capture"),
    OTHER("OTHER");
    
    private final String name;
    
    LibraryStrategy(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public static LibraryStrategy getEnumFromString(String s) {
        for (LibraryStrategy value: LibraryStrategy.values()) {
            if (value.getName().equalsIgnoreCase(s)) {
                return value;
            }
        }
        return null;
    }

}
