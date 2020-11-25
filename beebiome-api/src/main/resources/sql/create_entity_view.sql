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
         INNER JOIN projectToSample ps ON (ps.biosampleId = s.biosampleId)
         INNER JOIN project p ON (p.bioprojectId = ps.bioprojectId)
         INNER JOIN species sp ON (sp.id = s.speciesId)
         INNER JOIN species h ON (h.id = s.hostSpeciesId)
         LEFT JOIN sampleToExperiment se ON (se.biosampleAcc = s.biosampleAcc)
         LEFT JOIN experiment e ON (e.sraAcc = se.sraAcc)
         LEFT JOIN biosamplePackage bp ON (bp.id = s.biosamplePackageId)
         LEFT JOIN location l ON (l.id = s.locationId)

GROUP BY s.biosampleId, p.bioprojectId, bp.id, sp.id, h.id, l.name, s.collectionDate
);
