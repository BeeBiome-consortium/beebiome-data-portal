
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeArchive.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeArchive">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NCBI"/>
 *     &lt;enumeration value="EBI"/>
 *     &lt;enumeration value="DDBJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeArchive", namespace = "SP.common")
@XmlEnum
public enum TypeArchive {

    NCBI,
    EBI,
    DDBJ;

    public String value() {
        return name();
    }

    public static TypeArchive fromValue(String v) {
        return valueOf(v);
    }

}
