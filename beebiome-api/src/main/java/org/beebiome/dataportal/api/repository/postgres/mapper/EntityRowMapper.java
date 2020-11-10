package org.beebiome.dataportal.api.repository.postgres.mapper;

import org.apache.commons.lang3.StringUtils;
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
import java.util.function.Function;
import java.util.stream.Collectors;

public class EntityRowMapper implements RowMapper<Entity> {

    private final static String DELIMITER = ";";
    
    public Entity mapRow(ResultSet rs, int i) throws SQLException {
        Set<LibraryStrategy> libraryStrategySet = getEnumSet(rs, "libraryStrategies",
                LibraryStrategy::getEnumFromString);

        Set<LibraryLayout> libraryLayoutSet = getEnumSet(rs, "libraryLayouts",
                LibraryLayout::valueOf);

        Set<LibrarySource> librarySourceSet = getEnumSet(rs, "librarySources", 
                LibrarySource::getEnumFromString);

        Set<String> platforms = getStrings(rs, "platforms");
        Set<String> experimentAccs = getStrings(rs, "experimentAccs");
        
        BioSamplePackage bioSamplePackage = null;
        String biosamplePackageId = rs.getString("biosamplePackageId");
        String biosamplePackageName = rs.getString("biosamplePackageName");
        if (StringUtils.isNotEmpty(biosamplePackageId) && StringUtils.isNotEmpty(biosamplePackageName)) {
            bioSamplePackage = new BioSamplePackage(biosamplePackageId, biosamplePackageName);
        }
        Species species = getSpecies(rs, "speciesId", "speciesScientificName");
        Species host = getSpecies(rs, "hostId", "hostScientificName");

        return new Entity(rs.getString("biosampleAcc"), rs.getString("bioprojectAcc"), bioSamplePackage,
                libraryStrategySet, rs.getString("submittingOrganizationName"), libraryLayoutSet,
                librarySourceSet, species, host, platforms, rs.getString("geoLocName"),
                rs.getString("collectionDate"), experimentAccs, rs.getInt("nucleotideCount"));
    }

    private Species getSpecies(ResultSet rs, String spIdColumnLabel, String spNameColumnLabel)
            throws SQLException {
        Species host = null;
        int id = rs.getInt(spIdColumnLabel);
        String name = rs.getString(spNameColumnLabel);
        if (id != 0 && StringUtils.isNotEmpty(name)) {
            host = new Species(id, name);
        }
        return host;
    }

    private Set<String> getStrings(ResultSet rs, String field) throws SQLException {
        Set<String> set = null;
        String input = rs.getString(field);
        if (StringUtils.isNotEmpty(input)) {
            set = Arrays.stream(input.split(DELIMITER)).collect(Collectors.toSet());
        }
        return set;
    }

    private <T extends Enum<T>> Set<T> getEnumSet(ResultSet rs, String columnLabel,
                                                  Function<String, T> stringToEnumFunc)
            throws SQLException {
        String input = rs.getString(columnLabel);
        Set<T> set = null;
        if (StringUtils.isNotEmpty(input)) {
            set = Arrays.stream(input.split(DELIMITER)).map(stringToEnumFunc).collect(Collectors.toSet());
        }
        return set;
    }
}
