# How to run locally with IntelliJ
1. Configure a Spring boot application:  
    Run > Edit Configurations > + > Spring boot
    - name: beebiome-api
    - main class: org.beebiome.dataportal.api.DataPortalApiApplication
    - use classpath module: beebiome-api
    - VM options `-Djavax.xml.accessExternalDTD=all`

2. Set properties in `beebiome-api/src/main/resources/application.properties`:
    - `spring.datasource.username`  
    - `spring.datasource.password`  

3. Run the application:  
    Run > Run 'beebiome-api'

# How to build the war API
1. Set properties in `beebiome-api/src/main/resources/application.properties`:
- `spring.datasource.username`  
- `spring.datasource.password`  
- `github.token`
  
**WARNING: These properties should not be commited as they should not be available on GitHub**

These properties can be set after the decompression of the war and before the deployment in Tomcat.

2. Build the war from beebiome-api directory: `cd beebiome-api ; mvn -DskipTests clean install`

# Some links to retrieve data
- `<api_url>/sample/all`: to retrieve all metadata.
- `<api_url>/sample/1234`: to retrieve metadata with the Biosample accession containing '1234'.
- `<api_url>/sample/advanced-search`: to retrieve metadata with filters using a 'AND' boolean logic. Filters (see https://beebiome.org/help/browse-search for definitions):
    * bioSampleAcc
    * bioProjectAcc
    * organism
    * host
    * collectionDate
    * geoLocationName
    * librarySources
    * libraryLayouts
    * libraryStrategies
    * centerName
    * instruments
    * biosamplePackageAcc
    * biosamplePackageName

