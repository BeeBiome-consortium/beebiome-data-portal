
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeGenapsysModel.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeGenapsysModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENIUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeGenapsysModel")
@XmlEnum
public enum TypeGenapsysModel {

    GENIUS;

    public String value() {
        return name();
    }

    public static TypeGenapsysModel fromValue(String v) {
        return valueOf(v);
    }

}
