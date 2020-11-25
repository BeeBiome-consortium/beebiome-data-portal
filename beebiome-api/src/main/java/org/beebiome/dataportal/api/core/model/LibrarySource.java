package org.beebiome.dataportal.api.core.model;

public enum LibrarySource {
    GENOMIC("GENOMIC"),
    GENOMIC_SINGLE_CELL("GENOMIC SINGLE CELL"),
    TRANSCRIPTOMIC("TRANSCRIPTOMIC"),
    TRANSCRIPTOMIC_SINGLE_CELL("TRANSCRIPTOMIC SINGLE CELL"),
    METAGENOMIC("METAGENOMIC"),
    METATRANSCRIPTOMIC("METATRANSCRIPTOMIC"),
    SYNTHETIC("SYNTHETIC"),
    VIRAL_RNA("VIRAL RNA"),
    OTHER("OTHER");

    private final String name;

    LibrarySource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static LibrarySource getEnumFromString(String s) {
        for (LibrarySource value: LibrarySource.values()) {
            if (value.getName().equalsIgnoreCase(s)) {
                return value;
            }
        }
        return null;
    }
}
