#!/bin/sh

# Usage: ./update-beebiome-db.sh <proxy_directory> <beebiome-data-portal_repository>

export LOG_DIR=$1/logs
export OUTPUT_DIR=$1/data
export WORK_DIR=$2/beebiome-scripts
export TAXON_LEVEL="Bombus_impatiens" # warning: use underscore to replace spaces such as Bombus_impatiens

## Retrieve data from NCBI
perl $WORK_DIR/retrieve_metadata.pl $OUTPUT_DIR $TAXON_LEVEL 1 > $LOG_DIR/retrieve_beebiome_metadata.$(date "+%Y%m%d-%H%M").log

## Build option for the curl from file list to be parsed to fill the db
options=''
for f in "$OUTPUT_DIR"/"$TAXON_LEVEL"/*; do options="$options -F files=@${f}"; done;

curl -X POST $options http://localhost:8080/import > $LOG_DIR/save_beebiome_metadata.$(date "+%Y%m%d-%H%M").log

MAIL="beebiome@unil.ch"
echo "Dear BeeBiome maintainers,\n\nBeeBiome database has been updated.\n\nThe BeeBiome team" | mailx -s "BeeBiome update" "$MAIL"