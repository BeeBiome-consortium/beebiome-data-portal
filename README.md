# BeeBiome-data-portal
A resource for scientists and the general public on bee-associated microbes/viruses and their impact on bee health.  

The dedicated BeeBiome web site is available here: [https://beebiome.org/](https://beebiome.org/)

See also
> **The Bee Microbiome: Impact on Bee Health and Model for Evolution and Ecology of Host-Microbe Interactions**  
> Philipp Engel, Waldan K. Kwong, Quinn McFrederick, Kirk E. Anderson, Seth Michael Barribeau, James Angus Chandler, R. Scott Cornman, Jacques Dainat, Joachim R. de Miranda, Vincent Doublet, Olivier Emery, Jay D. Evans, Laurent Farinelli, Michelle L. Flenniken, Fredrik Granberg, Juris A. Grasis, Laurent Gauthier, Juliette Hayer, Hauke Koch, Sarah Kocher, Vincent G. Martinson, Nancy Moran, Monica Munoz-Torres, Irene Newton, Robert J. Paxton, Eli Powell, Ben M. Sadd, Paul Schmid-Hempel, Regula Schmid-Hempel, Se Jin Song, Ryan S. Schwarz, Dennis vanEngelsdorp, Benjamin Dainat.  
> mBio Apr 2016, 7 (2) e02164-15; DOI: 10.1128/mBio.02164-15 - https://mbio.asm.org/content/7/2/e02164-15

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
