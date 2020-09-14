
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typePacBioModel.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typePacBioModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PacBio RS"/>
 *     &lt;enumeration value="PacBio RS II"/>
 *     &lt;enumeration value="Sequel"/>
 *     &lt;enumeration value="Sequel II"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typePacBioModel")
@XmlEnum
public enum TypePacBioModel {

    @XmlEnumValue("PacBio RS")
    PAC_BIO_RS("PacBio RS"),
    @XmlEnumValue("PacBio RS II")
    PAC_BIO_RS_II("PacBio RS II"),
    @XmlEnumValue("Sequel")
    SEQUEL("Sequel"),
    @XmlEnumValue("Sequel II")
    SEQUEL_II("Sequel II");
    private final String value;

    TypePacBioModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypePacBioModel fromValue(String v) {
        for (TypePacBioModel c: TypePacBioModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
