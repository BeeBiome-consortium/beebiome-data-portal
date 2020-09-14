
package org.beebiome.dataportal.pipeline.ncbi.bioproject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeRepresentation.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRepresentation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="eReference"/>
 *     &lt;enumeration value="eAlternate"/>
 *     &lt;enumeration value="eOther"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeRepresentation")
@XmlEnum
public enum TypeRepresentation {

    @XmlEnumValue("eReference")
    E_REFERENCE("eReference"),
    @XmlEnumValue("eAlternate")
    E_ALTERNATE("eAlternate"),
    @XmlEnumValue("eOther")
    E_OTHER("eOther");
    private final String value;

    TypeRepresentation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRepresentation fromValue(String v) {
        for (TypeRepresentation c: TypeRepresentation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
