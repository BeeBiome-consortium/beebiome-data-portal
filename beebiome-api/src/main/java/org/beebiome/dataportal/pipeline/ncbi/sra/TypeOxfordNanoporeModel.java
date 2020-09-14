
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeOxfordNanoporeModel.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOxfordNanoporeModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MinION"/>
 *     &lt;enumeration value="GridION"/>
 *     &lt;enumeration value="PromethION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOxfordNanoporeModel")
@XmlEnum
public enum TypeOxfordNanoporeModel {

    @XmlEnumValue("MinION")
    MIN_ION("MinION"),
    @XmlEnumValue("GridION")
    GRID_ION("GridION"),
    @XmlEnumValue("PromethION")
    PROMETH_ION("PromethION");
    private final String value;

    TypeOxfordNanoporeModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOxfordNanoporeModel fromValue(String v) {
        for (TypeOxfordNanoporeModel c: TypeOxfordNanoporeModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
