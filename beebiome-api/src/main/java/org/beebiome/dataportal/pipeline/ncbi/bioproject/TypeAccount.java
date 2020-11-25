
package org.beebiome.dataportal.pipeline.ncbi.bioproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeAccount complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{}typeContactInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="account_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="user_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="authority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAccount", propOrder = {
    "contact"
})
public class TypeAccount {

    @XmlElement(name = "Contact")
    protected TypeContactInfo contact;
    @XmlAttribute(name = "account_id")
    protected String accountId;
    @XmlAttribute(name = "user_name", required = true)
    protected String userName;
    @XmlAttribute(name = "authority")
    protected String authority;

    /**
     * Obtient la valeur de la propriété contact.
     * 
     * @return
     *     possible object is
     *     {@link TypeContactInfo }
     *     
     */
    public TypeContactInfo getContact() {
        return contact;
    }

    /**
     * Définit la valeur de la propriété contact.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeContactInfo }
     *     
     */
    public void setContact(TypeContactInfo value) {
        this.contact = value;
    }

    /**
     * Obtient la valeur de la propriété accountId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Définit la valeur de la propriété accountId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Obtient la valeur de la propriété userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Définit la valeur de la propriété userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Obtient la valeur de la propriété authority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Définit la valeur de la propriété authority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

}
