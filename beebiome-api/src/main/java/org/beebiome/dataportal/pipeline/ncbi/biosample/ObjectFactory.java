
package org.beebiome.dataportal.pipeline.ncbi.biosample;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.beebiome.dataportal.pipeline.ncbi.taxonomy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BioSampleSet_QNAME = new QName("", "BioSampleSet");
    private final static QName _BioSampleTypeLinksLink_QNAME = new QName("", "Link");
    private final static QName _NameTypeLast_QNAME = new QName("", "Last");
    private final static QName _NameTypeSuffix_QNAME = new QName("", "Suffix");
    private final static QName _NameTypeFirst_QNAME = new QName("", "First");
    private final static QName _NameTypeMiddle_QNAME = new QName("", "Middle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.beebiome.dataportal.pipeline.ncbi.taxonomy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BioSampleType }
     * 
     */
    public BioSampleType createBioSampleType() {
        return new BioSampleType();
    }

    /**
     * Create an instance of {@link BioSampleSetType }
     * 
     */
    public BioSampleSetType createBioSampleSetType() {
        return new BioSampleSetType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link IdType }
     * 
     */
    public IdType createIdType() {
        return new IdType();
    }

    /**
     * Create an instance of {@link ContactsType }
     * 
     */
    public ContactsType createContactsType() {
        return new ContactsType();
    }

    /**
     * Create an instance of {@link CommentType }
     * 
     */
    public CommentType createCommentType() {
        return new CommentType();
    }

    /**
     * Create an instance of {@link OwnerType }
     * 
     */
    public OwnerType createOwnerType() {
        return new OwnerType();
    }

    /**
     * Create an instance of {@link ModelsType }
     * 
     */
    public ModelsType createModelsType() {
        return new ModelsType();
    }

    /**
     * Create an instance of {@link OrganismType }
     * 
     */
    public OrganismType createOrganismType() {
        return new OrganismType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link PackageType }
     * 
     */
    public PackageType createPackageType() {
        return new PackageType();
    }

    /**
     * Create an instance of {@link AttributesType }
     * 
     */
    public AttributesType createAttributesType() {
        return new AttributesType();
    }

    /**
     * Create an instance of {@link IdsType }
     * 
     */
    public IdsType createIdsType() {
        return new IdsType();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link LinksType }
     * 
     */
    public LinksType createLinksType() {
        return new LinksType();
    }

    /**
     * Create an instance of {@link BioSampleType.Links }
     * 
     */
    public BioSampleType.Links createBioSampleTypeLinks() {
        return new BioSampleType.Links();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BioSampleSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BioSampleSet")
    public JAXBElement<BioSampleSetType> createBioSampleSet(BioSampleSetType value) {
        return new JAXBElement<BioSampleSetType>(_BioSampleSet_QNAME, BioSampleSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Link", scope = BioSampleType.Links.class)
    public JAXBElement<LinkType> createBioSampleTypeLinksLink(LinkType value) {
        return new JAXBElement<LinkType>(_BioSampleTypeLinksLink_QNAME, LinkType.class, BioSampleType.Links.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Last", scope = NameType.class)
    public JAXBElement<String> createNameTypeLast(String value) {
        return new JAXBElement<String>(_NameTypeLast_QNAME, String.class, NameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Suffix", scope = NameType.class)
    public JAXBElement<String> createNameTypeSuffix(String value) {
        return new JAXBElement<String>(_NameTypeSuffix_QNAME, String.class, NameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "First", scope = NameType.class)
    public JAXBElement<String> createNameTypeFirst(String value) {
        return new JAXBElement<String>(_NameTypeFirst_QNAME, String.class, NameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Middle", scope = NameType.class)
    public JAXBElement<String> createNameTypeMiddle(String value) {
        return new JAXBElement<String>(_NameTypeMiddle_QNAME, String.class, NameType.class, value);
    }

}
