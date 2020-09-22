
package org.beebiome.dataportal.pipeline.ncbi.taxonomy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherNamesType", propOrder = {
    "synonym","blastName", "includes", "genbankSynonym", "genbankCommonName", "name", "equivalentName", "commonName"
})
public class OtherNamesType {

    @XmlElement(name = "Synonym", required = false)
    protected String synonym;
    @XmlElement(name = "BlastName", required = false)
    protected String blastName;
    @XmlElement(name = "Includes", required = false)
    protected String includes;
    @XmlElement(name = "GenbankSynonym", required = false)
    protected String genbankSynonym;
    @XmlElement(name = "GenbankCommonName", required = false)
    protected String genbankCommonName;
    @XmlElement(name = "Name", required = false)
    protected NameType name;
    @XmlElement(name = "EquivalentName", required = false)
    protected String equivalentName;
    @XmlElement(name = "CommonName", required = false)
    protected String commonName;

    public String getSynonym() {
        return synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public String getBlastName() {
        return blastName;
    }

    public void setBlastName(String blastName) {
        this.blastName = blastName;
    }

    public String getIncludes() {
        return includes;
    }

    public void setIncludes(String includes) {
        this.includes = includes;
    }

    public String getGenbankSynonym() {
        return genbankSynonym;
    }

    public void setGenbankSynonym(String genbankSynonym) {
        this.genbankSynonym = genbankSynonym;
    }

    public String getGenbankCommonName() {
        return genbankCommonName;
    }

    public void setGenbankCommonName(String genbankCommonName) {
        this.genbankCommonName = genbankCommonName;
    }

    public NameType getName() {
        return name;
    }

    public void setName(NameType name) {
        this.name = name;
    }

    public String getEquivalentName() {
        return equivalentName;
    }

    public void setEquivalentName(String equivalentName) {
        this.equivalentName = equivalentName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }
}
