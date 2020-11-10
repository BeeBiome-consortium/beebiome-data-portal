CREATE OR REPLACE VIEW entity AS 
(
SELECT s.biosampleAcc AS biosampleAcc,
       p.bioprojectAcc AS bioprojectAcc,
       bp.id AS biosamplePackageId,
       bp.name AS biosamplePackageName,
       string_agg(DISTINCT e.libraryStrategy, ';') AS libraryStrategies,
       p.submittingOrganizationName AS submittingOrganizationName,
       string_agg(DISTINCT e.libraryLayout, ';') AS libraryLayouts,
       string_agg(DISTINCT e.librarySource, ';') AS librarySources,
       sp.id AS speciesId,
       sp.scientificName AS speciesScientificName,
       h.id AS hostId,
       h.scientificName AS hostScientificName,
       string_agg(DISTINCT e.platform, ';') AS platforms,
       l.name AS geoLocName,
       s.collectionDate AS collectionDate,
       string_agg(DISTINCT e.sraAcc, ';') AS experimentAccs,
       s.nucleotideCount AS nucleotideCount

FROM sample s
         INNER JOIN projectToSample ps ON (ps.biosampleAcc = s.biosampleAcc)
         INNER JOIN project p ON (p.bioprojectAcc = ps.bioprojectAcc)
         INNER JOIN biosamplePackage bp ON (bp.id = s.biosamplePackageId)
         INNER JOIN sampleToExperiment se ON (se.biosampleAcc = s.biosampleAcc)
         INNER JOIN experiment e ON (e.sraAcc = se.sraAcc)
         INNER JOIN species sp ON (sp.id = s.speciesId)
         INNER JOIN species h ON (h.id = s.hostSpeciesId)
         INNER JOIN location l ON (l.id = s.locationId)
--          INNER JOIN sampleToNucleotide stn ON (stn.biosampleAcc = s.biosampleAcc)

GROUP BY s.biosampleAcc, p.bioprojectAcc, bp.id, sp.id, h.id, l.name, s.collectionDate
);
