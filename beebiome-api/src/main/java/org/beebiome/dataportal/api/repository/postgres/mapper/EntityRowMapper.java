package org.beebiome.dataportal.api.repository.postgres.mapper;

import org.beebiome.dataportal.api.core.model.BioSamplePackage;
import org.beebiome.dataportal.api.core.model.Entity;
import org.beebiome.dataportal.api.core.model.LibraryLayout;
import org.beebiome.dataportal.api.core.model.LibrarySource;
import org.beebiome.dataportal.api.core.model.LibraryStrategy;
import org.beebiome.dataportal.api.core.model.Species;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class EntityRowMapper implements RowMapper<Entity> {

    private final static String SEPARATOR = ",";
    
    public Entity mapRow(ResultSet rs, int i) throws SQLException {
        Set<LibraryStrategy> libraryStrategies =
                Arrays.stream(rs.getString("libraryStrategies").split(SEPARATOR))
                        .map(LibraryStrategy::getEnumFromString)
                        .collect(Collectors.toSet());
        Set<LibraryLayout> libraryLayouts =
                Arrays.stream(rs.getString("libraryLayouts").split(SEPARATOR))
                        .map(LibraryLayout::valueOf)
                        .collect(Collectors.toSet());
        Set<LibrarySource> librarySources =
                Arrays.stream(rs.getString("librarySources").split(SEPARATOR))
                        .map(LibrarySource::getEnumFromString)
                        .collect(Collectors.toSet());

        return new Entity(
                rs.getString("biosampleAcc"),
                rs.getString("bioprojectAcc"),
                new BioSamplePackage(rs.getString("biosamplePackageId"), rs.getString("biosamplePackageName")),
                libraryStrategies,
                rs.getString("submittingOrganizationName"),
                libraryLayouts,
                librarySources,
                new Species(rs.getInt("speciesId"), rs.getString("speciesScientificName")),
                new Species(rs.getInt("hostId"), rs.getString("hostScientificName")),
                Arrays.stream(rs.getString("platforms").split(SEPARATOR)).collect(Collectors.toSet()),
                rs.getString("geoLocName"),
                rs.getString("collectionDate"),
                null); // FIXME Arrays.stream(rs.getString("nucleotideLinks").split(SEPARATOR)).collect(Collectors.toSet()));
    }

}
