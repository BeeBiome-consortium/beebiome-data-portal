
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeHelicosModel.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeHelicosModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Helicos HeliScope"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeHelicosModel")
@XmlEnum
public enum TypeHelicosModel {

    @XmlEnumValue("Helicos HeliScope")
    HELICOS_HELI_SCOPE("Helicos HeliScope");
    private final String value;

    TypeHelicosModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeHelicosModel fromValue(String v) {
        for (TypeHelicosModel c: TypeHelicosModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
