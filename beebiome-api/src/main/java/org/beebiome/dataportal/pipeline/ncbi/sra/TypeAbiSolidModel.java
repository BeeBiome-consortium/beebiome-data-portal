
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeAbiSolidModel.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAbiSolidModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AB SOLiD System"/>
 *     &lt;enumeration value="AB SOLiD System 2.0"/>
 *     &lt;enumeration value="AB SOLiD System 3.0"/>
 *     &lt;enumeration value="AB SOLiD 3 Plus System"/>
 *     &lt;enumeration value="AB SOLiD 4 System"/>
 *     &lt;enumeration value="AB SOLiD 4hq System"/>
 *     &lt;enumeration value="AB SOLiD PI System"/>
 *     &lt;enumeration value="AB 5500 Genetic Analyzer"/>
 *     &lt;enumeration value="AB 5500xl Genetic Analyzer"/>
 *     &lt;enumeration value="AB 5500xl-W Genetic Analysis System"/>
 *     &lt;enumeration value="AB 5500xl-W Genetic Analysis System"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeAbiSolidModel")
@XmlEnum
public enum TypeAbiSolidModel {


    /**
     * Undifferentiated early AB SOLiD system
     * 
     */
    @XmlEnumValue("AB SOLiD System")
    AB_SO_LI_D_SYSTEM("AB SOLiD System"),
    @XmlEnumValue("AB SOLiD System 2.0")
    AB_SO_LI_D_SYSTEM_2_0("AB SOLiD System 2.0"),
    @XmlEnumValue("AB SOLiD System 3.0")
    AB_SO_LI_D_SYSTEM_3_0("AB SOLiD System 3.0"),
    @XmlEnumValue("AB SOLiD 3 Plus System")
    AB_SO_LI_D_3_PLUS_SYSTEM("AB SOLiD 3 Plus System"),
    @XmlEnumValue("AB SOLiD 4 System")
    AB_SO_LI_D_4_SYSTEM("AB SOLiD 4 System"),
    @XmlEnumValue("AB SOLiD 4hq System")
    AB_SO_LI_D_4_HQ_SYSTEM("AB SOLiD 4hq System"),
    @XmlEnumValue("AB SOLiD PI System")
    AB_SO_LI_D_PI_SYSTEM("AB SOLiD PI System"),
    @XmlEnumValue("AB 5500 Genetic Analyzer")
    AB_5500_GENETIC_ANALYZER("AB 5500 Genetic Analyzer"),
    @XmlEnumValue("AB 5500xl Genetic Analyzer")
    AB_5500_XL_GENETIC_ANALYZER("AB 5500xl Genetic Analyzer"),
    @XmlEnumValue("AB 5500xl-W Genetic Analysis System")
    AB_5500_XL_W_GENETIC_ANALYSIS_SYSTEM("AB 5500xl-W Genetic Analysis System");
    private final String value;

    TypeAbiSolidModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAbiSolidModel fromValue(String v) {
        for (TypeAbiSolidModel c: TypeAbiSolidModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
