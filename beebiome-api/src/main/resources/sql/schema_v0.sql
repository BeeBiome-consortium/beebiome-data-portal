CREATE TABLE taxon
(
    id integer PRIMARY KEY,
    name text NOT NULL
    -- leftBound integer NOT NULL, -- to get lineage or species of one subtree
    -- rightBound integer NOT NULL -- to get lineage or species of one subtree
);

CREATE TABLE species
(
    id integer PRIMARY KEY,
    scientificName varchar(140) NOT NULL,
    parentTaxId integer, -- null if not apoidea
    parentSpeciesId integer, -- null if it's not a subspecies
    isApoidea boolean NOT NULL, -- can be sequenced Bacteria from microbiome of a bee
    FOREIGN KEY(parentTaxId) REFERENCES taxon(id) ON DELETE CASCADE,
    FOREIGN KEY(parentSpeciesId) REFERENCES species(id) ON DELETE CASCADE
);

CREATE TABLE speciesToName
(
    speciesId integer NOT NULL,
    name text NOT NULL,
    PRIMARY KEY (speciesId, name),
    FOREIGN KEY(speciesId) REFERENCES species(id) ON DELETE CASCADE
);

CREATE TABLE location
(
    -- geography geography(POINT) NOT NULL PRIMARY KEY,
    id varchar(50) PRIMARY KEY, -- id=lat_long - it's temporary, while waiting to use PostGIS 
    latitude varchar(125) NOT NULL, -- it's temporary, while waiting to use PostGIS
    longitude varchar(125) NOT NULL, -- it's temporary, while waiting to use PostGIS
    name text
);

-- CREATE TABLE location_test
-- (
--     geography geography(POINT) NOT NULL PRIMARY KEY,
--     name text
-- );

CREATE TYPE publicationSource AS ENUM ('PUBMED', 'DOI');

CREATE TABLE publication
(
    accession text PRIMARY KEY,
    source publicationSource NOT NULL
);

CREATE TABLE project
(
    bioprojectAcc varchar(20) PRIMARY KEY,
    title text NOT NULL,
    description text,
    submissionDate date NOT NULL,
    updateDate date NOT NULL,
    submittingOrganizationName text NOT NULL,
    grantId text,
    grantTitle text,
    grantAgency text
);

CREATE TABLE projectToPublication
(
    bioprojectAcc varchar(20) NOT NULL,
    publicationAcc text NOT NULL,
    PRIMARY KEY (bioprojectAcc, publicationAcc),
    FOREIGN KEY(bioprojectAcc) REFERENCES project(bioprojectAcc) ON DELETE CASCADE,
    FOREIGN KEY(publicationAcc) REFERENCES publication(accession) ON DELETE CASCADE 
);

CREATE TABLE sample
(
    biosampleAcc varchar(20) PRIMARY KEY,
    biosamplePackageId varchar(50) NOT NULL,
    locationId varchar(50), -- id=lat_long - see location table
    speciesId integer NOT NULL,
    hostSpeciesId integer NOT NULL,
    collectionDate date,
    -- hostBreed text,
    -- hostSex text, -- described using any child term of PATO_0000047
    -- hostAge text,
    -- hostDevStage text,
    -- hostTissue text, -- multiple attributes in biosample
    -- isCurated boolean NOT NULL,
    FOREIGN KEY(biosamplePackageId) REFERENCES biosamplePackage(id) ON DELETE CASCADE,
    FOREIGN KEY(speciesId) REFERENCES species(id) ON DELETE CASCADE,
    FOREIGN KEY(locationId) REFERENCES location(id) ON DELETE CASCADE
);

CREATE TABLE biosamplePackage
(
    id varchar(50) PRIMARY KEY,
    name text
);


CREATE TABLE projectToSample -- one sample can be part of several projects
(
    bioprojectAcc varchar(20) NOT NULL,
    biosampleAcc varchar(20) NOT NULL,
    PRIMARY KEY (bioprojectAcc, biosampleAcc),
    FOREIGN KEY(bioprojectAcc) REFERENCES project(bioprojectAcc) ON DELETE CASCADE,
    FOREIGN KEY(biosampleAcc) REFERENCES sample(biosampleAcc) ON DELETE CASCADE
);

-- FIXME define values
CREATE TYPE libraryStrategyType AS ENUM ('amplicon', 'wgs', 'TDB'); -- wgs, rna-seq, amplicon, etc.
CREATE TYPE libraryLayoutType AS ENUM ('single', 'paired');
CREATE TYPE librarySourceType AS ENUM ('metagenomic', 'TDB');

CREATE TABLE experiment
(
    sraAcc varchar(20) PRIMARY KEY,
    title text,
    platform text,
    libraryStrategy libraryStrategyType,
    libraryLayout libraryLayoutType,
    librarySource librarySourceType
    -- extractionProtocol text,
    -- libraryPreparationProtocol text,
    -- enrichment enum('TDB'), -- DNS, polyA, etc.
    -- sampleStorageProcessing text, -- see FAANG definition
    -- samplingToPreparationInterval text -- see FAANG definition
);

CREATE TABLE sampleToExperiment
(
    biosampleAcc varchar(20) NOT NULL,
    sraAcc varchar(20) NOT NULL,
    PRIMARY KEY (biosampleAcc, sraAcc),
    FOREIGN KEY(biosampleAcc) REFERENCES sample(biosampleAcc) ON DELETE CASCADE,
    FOREIGN KEY(sraAcc) REFERENCES experiment(sraAcc) ON DELETE CASCADE
);

CREATE TABLE recommendation
(
    id integer PRIMARY KEY,
    name varchar(100)
);

CREATE TABLE sampleToRecommendation
(
    biosampleAcc varchar(20) NOT NULL,
    recommendationId integer NOT NULL,
    PRIMARY KEY (biosampleAcc, recommendationId),
    FOREIGN KEY(biosampleAcc) REFERENCES sample(biosampleAcc) ON DELETE CASCADE,
    FOREIGN KEY(recommendationId) REFERENCES recommendation(id) ON DELETE CASCADE
);

CREATE TABLE sampleToNucleotide
(
    biosampleAcc varchar(20) NOT NULL,
    nucleotideLink text NOT NULL, -- we don’t want to store nucleotide data
    PRIMARY KEY (biosampleAcc, nucleotideLink),
    FOREIGN KEY(biosampleAcc) REFERENCES sample(biosampleAcc) ON DELETE CASCADE
);

CREATE VIEW entity AS 
(
    SELECT s.biosampleAcc AS biosampleAcc,
           p.bioprojectAcc AS bioprojectAcc,
           bp.id AS biosamplePackageId,
           bp.name AS biosamplePackageName,
           string_agg(DISTINCT e.libraryStrategy, ',') AS libraryStrategies,
           p.submittingOrganizationName AS submittingOrganizationName,
           string_agg(DISTINCT e.libraryLayout, ',') AS libraryLayouts,
           string_agg(DISTINCT e.librarySource, ',') AS librarySources,
           sp.id AS speciesId,
           sp.scientificName AS speciesScientificName,
           h.id AS hostId,
           h.scientificName AS hostScientificName,
           string_agg(DISTINCT e.platform, ',') AS platforms,
           l.name AS geoLocName,
           s.collectionDate AS collectionDate,
           string_agg(DISTINCT stn.nucleotideLink, ',') AS nucleotideLinks
           
    FROM sample s
             INNER JOIN projectToSample ps ON (ps.biosampleAcc == s.biosampleAcc)
             INNER JOIN project p ON (p.bioprojectAcc == ps.biosampleAcc)
             INNER JOIN biosamplePackage bp ON (bp.id == s.biosamplePackageId)
             INNER JOIN sampleToExperiment se ON (se.biosampleAcc == s.biosampleAcc)
             INNER JOIN experiment e ON (e.sraAcc == se.sraAcc)
             INNER JOIN species sp ON (sp.id == s.speciesId)
             INNER JOIN species h ON (h.id == s.hostSpeciesId)
             INNER JOIN location l ON (l.id == s.locationId)
             INNER JOIN sampleToNucleotide stn ON (stn.biosampleAcc == s.biosampleAcc)
);
