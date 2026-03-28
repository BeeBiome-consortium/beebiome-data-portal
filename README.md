[![Documentation Status](https://readthedocs.org/projects/beebiome/badge/?version=latest)](https://beebiome.readthedocs.io/en/latest/?badge=latest)


# BeeBiome-data-portal
A resource for scientists and the general public on bee-associated microbes/viruses and their impact on bee health.  

The dedicated BeeBiome web site is available here: [https://beebiome.org/](https://beebiome.org/)

See also
> **The BeeBiome data portal provides easy access to bee microbiome information.**
> Rech de Laval V, Dainat B, Engel P, Robinson-Rechavi M. 
> BMC Bioinformatics. 2025 Jul 29;26(1):198.
> PMID: [40731321](https://pubmed.ncbi.nlm.nih.gov/40731321/); PMCID: [PMC12309204](https://pmc.ncbi.nlm.nih.gov/articles/PMC12309204/).
> doi: 10.1186/s12859-025-06229-7.

## Directory structure

```
beebiome-data-portal/   The repository of BeeBiome Data Portal project
....beebiome-api/       The API to use a data source, such as a PostgreSQL database.
                        It is a Java/spring boot project. 
                        This includes classes used to generate and insert data into the BeeBiome database.
                        The war file generated from this module will be used to deploy the API on a server.
....beebiome-docs/      This repository houses the raw markdown content for the user documentation.
....beebiome-scripts/   This repository contains scripts for updating data in BeeBiome database.
....beebiome-web/       The view layer of the application written in React. 
                        The war file generated from this module will be used to deploy the web app on a server.
```
 
## Procedure to deploy WARs


<details>
  <summary>See procedure</summary>

  ## API WAR
  1. Save version in prod to be able to come back to the current version
  2. Uncompress war  
  ```unzip beebiome-api-0.1-SNAPSHOT.war -d beebiome```
  3. Compare properties files  
        ```sdiff /var/lib/tomcat8/webapps/beebiome/WEB-INF/classes/application.properties beebiome/WEB-INF/classes/application.properties```
        4. Set correctly properties in beebiome/WEB-INF/classes/application.properties or copy file from current version  
        ```cp -p /var/lib/tomcat8/webapps/beebiome/WEB-INF/classes/application.properties beebiome/WEB-INF/classes/application.properties```
        5. Empty repository in Tomcat  
        ```rm -rf /var/lib/tomcat8/webapps/beebiome/*```
        6. Copy repository in Tomcat  
        ```/bin/cp -pR beebiome/* /var/lib/tomcat8/webapps/beebiome/```
        7. Reload the api in Tomcat manager (application: /beebiome)

        ## Webapp WAR
        1. Save version in prod to be able to come back to the current version
        2. Uncompress war  
        ```unzip beebiome-web.war -d beebiome-web```
        3. Empty repository in Tomcat  
        ```rm -rf /var/lib/tomcat8/webapps/beebiome-web/*```
        4. Copy repository in Tomcat  
        ```/bin/cp -pR beebiome-web/* /var/lib/tomcat8/webapps/beebiome-web/```
  </details>