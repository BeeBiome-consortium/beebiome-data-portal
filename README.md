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
