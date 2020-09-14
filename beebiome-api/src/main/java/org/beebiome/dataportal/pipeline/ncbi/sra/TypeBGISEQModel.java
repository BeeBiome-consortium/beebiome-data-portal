
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeBGISEQModel.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeBGISEQModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BGISEQ-500"/>
 *     &lt;enumeration value="DNBSEQ-G400"/>
 *     &lt;enumeration value="DNBSEQ-T7"/>
 *     &lt;enumeration value="DNBSEQ-G50"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeBGISEQModel")
@XmlEnum
public enum TypeBGISEQModel {

    @XmlEnumValue("BGISEQ-500")
    BGISEQ_500("BGISEQ-500"),
    @XmlEnumValue("DNBSEQ-G400")
    DNBSEQ_G_400("DNBSEQ-G400"),
    @XmlEnumValue("DNBSEQ-T7")
    DNBSEQ_T_7("DNBSEQ-T7"),
    @XmlEnumValue("DNBSEQ-G50")
    DNBSEQ_G_50("DNBSEQ-G50");
    private final String value;

    TypeBGISEQModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeBGISEQModel fromValue(String v) {
        for (TypeBGISEQModel c: TypeBGISEQModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
