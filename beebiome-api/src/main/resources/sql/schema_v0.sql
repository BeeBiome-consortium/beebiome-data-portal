CREATE DATABASE beebiome_v0;

\c beebiome_v0;

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
    id varchar(255) PRIMARY KEY, -- id=lat_long - it's temporary, while waiting to use PostGIS 
    latitude varchar(20), -- it's temporary, while waiting to use PostGIS
    longitude varchar(20), -- it's temporary, while waiting to use PostGIS
    name text
);

CREATE TYPE publicationSource AS ENUM ('PUBMED', 'DOI');

CREATE TABLE publication
(
    accession text PRIMARY KEY,
    source text NOT NULL
);

CREATE TABLE project
(
    bioprojectId integer PRIMARY KEY,
    bioprojectAcc varchar(20) UNIQUE,
    title text NOT NULL,
    description text,
    submissionDate date,
    updateDate date,
    submittingOrganizationName text NOT NULL,
    grantId text,
    grantTitle text,
    grantAgency text
);

CREATE TABLE projectToPublication
(
    bioprojectId integer NOT NULL,
    publicationAcc text NOT NULL,
    PRIMARY KEY (bioprojectId, publicationAcc),
    FOREIGN KEY(bioprojectId) REFERENCES project(bioprojectId) ON DELETE CASCADE,
    FOREIGN KEY(publicationAcc) REFERENCES publication(accession) ON DELETE CASCADE 
);

CREATE TABLE biosamplePackage
(
    id varchar(50) PRIMARY KEY,
    name text
);

CREATE TABLE sample
(
    biosampleId integer PRIMARY KEY,
    biosampleAcc varchar(20) UNIQUE,
    biosamplePackageId varchar(50) NOT NULL,
    locationId varchar(255), -- id=lat_long - see location table
    speciesId integer NOT NULL,
    hostSpeciesId integer NOT NULL,
    collectionDate varchar(10),
    nucleotideCount integer NOT NULL,
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

CREATE TABLE projectToSample -- one sample can be part of several projects
(
    bioprojectId integer NOT NULL,
    biosampleId integer NOT NULL,
    PRIMARY KEY (bioprojectId, biosampleId),
    FOREIGN KEY(bioprojectId) REFERENCES project(bioprojectId) ON DELETE CASCADE,
    FOREIGN KEY(biosampleId) REFERENCES sample(biosampleId) ON DELETE CASCADE
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
    libraryStrategy text, -- fixme use libraryStrategyType,
    libraryLayout text, -- fixme use libraryLayoutType,
    librarySource text -- fixme use librarySourceType
    -- extractionProtocol text,
    -- libraryPreparationProtocol text,
    -- enrichment enum('TDB'), -- DNS, polyA, etc.
    -- sampleStorageProcessing text, -- see FAANG definition
    -- samplingToPreparationInterval text -- see FAANG definition
);

CREATE TABLE sampleToExperiment
(
    biosampleAcc varchar(20) NOT NULL, -- we use accession and not id because we don't have relation BioSample/SRA using IDs in files
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
    biosampleId integer NOT NULL,
    recommendationId integer NOT NULL,
    PRIMARY KEY (biosampleId, recommendationId),
    FOREIGN KEY(biosampleId) REFERENCES sample(biosampleId) ON DELETE CASCADE,
    FOREIGN KEY(recommendationId) REFERENCES recommendation(id) ON DELETE CASCADE
);

CREATE TABLE releaseVersion
(
    id SERIAL PRIMARY KEY,
    date TIMESTAMP,
    name varchar(20) -- version name is the date. Currently, it will be the date of the last update. Format yyyy-mm-dd
);