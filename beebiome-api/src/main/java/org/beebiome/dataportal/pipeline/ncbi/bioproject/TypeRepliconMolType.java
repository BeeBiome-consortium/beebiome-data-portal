
package org.beebiome.dataportal.pipeline.ncbi.bioproject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeRepliconMolType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRepliconMolType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="eChromosome"/>
 *     &lt;enumeration value="ePlasmid"/>
 *     &lt;enumeration value="eLinkageGroup"/>
 *     &lt;enumeration value="eSegment"/>
 *     &lt;enumeration value="eOther"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeRepliconMolType")
@XmlEnum
public enum TypeRepliconMolType {

    @XmlEnumValue("eChromosome")
    E_CHROMOSOME("eChromosome"),
    @XmlEnumValue("ePlasmid")
    E_PLASMID("ePlasmid"),
    @XmlEnumValue("eLinkageGroup")
    E_LINKAGE_GROUP("eLinkageGroup"),
    @XmlEnumValue("eSegment")
    E_SEGMENT("eSegment"),
    @XmlEnumValue("eOther")
    E_OTHER("eOther");
    private final String value;

    TypeRepliconMolType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRepliconMolType fromValue(String v) {
        for (TypeRepliconMolType c: TypeRepliconMolType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
