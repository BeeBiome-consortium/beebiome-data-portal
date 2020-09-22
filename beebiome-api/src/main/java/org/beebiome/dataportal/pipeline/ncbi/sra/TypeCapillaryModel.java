
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeCapillaryModel.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCapillaryModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AB 3730xL Genetic Analyzer"/>
 *     &lt;enumeration value="AB 3730 Genetic Analyzer"/>
 *     &lt;enumeration value="AB 3500xL Genetic Analyzer"/>
 *     &lt;enumeration value="AB 3500 Genetic Analyzer"/>
 *     &lt;enumeration value="AB 3130xL Genetic Analyzer"/>
 *     &lt;enumeration value="AB 3130 Genetic Analyzer"/>
 *     &lt;enumeration value="AB 310 Genetic Analyzer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeCapillaryModel")
@XmlEnum
public enum TypeCapillaryModel {

    @XmlEnumValue("AB 3730xL Genetic Analyzer")
    AB_3730_X_L_GENETIC_ANALYZER("AB 3730xL Genetic Analyzer"),
    @XmlEnumValue("AB 3730 Genetic Analyzer")
    AB_3730_GENETIC_ANALYZER("AB 3730 Genetic Analyzer"),
    @XmlEnumValue("AB 3500xL Genetic Analyzer")
    AB_3500_X_L_GENETIC_ANALYZER("AB 3500xL Genetic Analyzer"),
    @XmlEnumValue("AB 3500 Genetic Analyzer")
    AB_3500_GENETIC_ANALYZER("AB 3500 Genetic Analyzer"),
    @XmlEnumValue("AB 3130xL Genetic Analyzer")
    AB_3130_X_L_GENETIC_ANALYZER("AB 3130xL Genetic Analyzer"),
    @XmlEnumValue("AB 3130 Genetic Analyzer")
    AB_3130_GENETIC_ANALYZER("AB 3130 Genetic Analyzer"),
    @XmlEnumValue("AB 310 Genetic Analyzer")
    AB_310_GENETIC_ANALYZER("AB 310 Genetic Analyzer");
    private final String value;

    TypeCapillaryModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCapillaryModel fromValue(String v) {
        for (TypeCapillaryModel c: TypeCapillaryModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
