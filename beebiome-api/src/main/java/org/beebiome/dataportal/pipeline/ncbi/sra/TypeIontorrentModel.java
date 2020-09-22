
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeIontorrentModel.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeIontorrentModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ion Torrent PGM"/>
 *     &lt;enumeration value="Ion Torrent Proton"/>
 *     &lt;enumeration value="Ion Torrent S5"/>
 *     &lt;enumeration value="Ion Torrent S5 XL"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeIontorrentModel")
@XmlEnum
public enum TypeIontorrentModel {

    @XmlEnumValue("Ion Torrent PGM")
    ION_TORRENT_PGM("Ion Torrent PGM"),
    @XmlEnumValue("Ion Torrent Proton")
    ION_TORRENT_PROTON("Ion Torrent Proton"),
    @XmlEnumValue("Ion Torrent S5")
    ION_TORRENT_S_5("Ion Torrent S5"),
    @XmlEnumValue("Ion S5")
    ION_S_5("Ion Torrent S5"),
    @XmlEnumValue("Ion Torrent S5 XL")
    ION_TORRENT_S_5_XL("Ion Torrent S5 XL"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    TypeIontorrentModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeIontorrentModel fromValue(String v) {
        for (TypeIontorrentModel c: TypeIontorrentModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
