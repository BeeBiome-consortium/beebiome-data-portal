
package org.beebiome.dataportal.pipeline.ncbi.sra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlignmentDirectivesType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlignmentDirectivesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="alignment_includes_unaligned_reads" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="alignment_marks_duplicate_reads" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="alignment_includes_failed_reads" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlignmentDirectivesType", propOrder = {

})
public class AlignmentDirectivesType {

    @XmlElement(name = "alignment_includes_unaligned_reads")
    protected boolean alignmentIncludesUnalignedReads;
    @XmlElement(name = "alignment_marks_duplicate_reads")
    protected boolean alignmentMarksDuplicateReads;
    @XmlElement(name = "alignment_includes_failed_reads")
    protected boolean alignmentIncludesFailedReads;

    /**
     * Obtient la valeur de la propriété alignmentIncludesUnalignedReads.
     * 
     */
    public boolean isAlignmentIncludesUnalignedReads() {
        return alignmentIncludesUnalignedReads;
    }

    /**
     * Définit la valeur de la propriété alignmentIncludesUnalignedReads.
     * 
     */
    public void setAlignmentIncludesUnalignedReads(boolean value) {
        this.alignmentIncludesUnalignedReads = value;
    }

    /**
     * Obtient la valeur de la propriété alignmentMarksDuplicateReads.
     * 
     */
    public boolean isAlignmentMarksDuplicateReads() {
        return alignmentMarksDuplicateReads;
    }

    /**
     * Définit la valeur de la propriété alignmentMarksDuplicateReads.
     * 
     */
    public void setAlignmentMarksDuplicateReads(boolean value) {
        this.alignmentMarksDuplicateReads = value;
    }

    /**
     * Obtient la valeur de la propriété alignmentIncludesFailedReads.
     * 
     */
    public boolean isAlignmentIncludesFailedReads() {
        return alignmentIncludesFailedReads;
    }

    /**
     * Définit la valeur de la propriété alignmentIncludesFailedReads.
     * 
     */
    public void setAlignmentIncludesFailedReads(boolean value) {
        this.alignmentIncludesFailedReads = value;
    }

}
