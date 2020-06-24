
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeCGModel.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCGModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Complete Genomics"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeCGModel")
@XmlEnum
public enum TypeCGModel {

    @XmlEnumValue("Complete Genomics")
    COMPLETE_GENOMICS("Complete Genomics");
    private final String value;

    TypeCGModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCGModel fromValue(String v) {
        for (TypeCGModel c: TypeCGModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
