#!/bin/sh

export HOME_DIR=/home/beebiome 
export WORK_DIR=$HOME_DIR/beebiome-update 
export LOG_DIR=$WORK_DIR/logs
export OUTPUT_DIR=$WORK_DIR/data
export SCRIPT_DIR=$HOME_DIR/beebiome-data-portal/beebiome-scripts
export TAXON_LEVEL="Apoidea" # warning: use underscore to replace spaces such as Bombus_impatiens

## Retrieve data from NCBI
perl $SCRIPT_DIR/retrieve_metadata.pl $OUTPUT_DIR $TAXON_LEVEL 1 > $LOG_DIR/retrieve_beebiome_metadata.$(date "+%Y%m%d-%H%M").log

## Build option for the curl from file list to be parsed to fill the db
options=''
for f in "$OUTPUT_DIR"/"$TAXON_LEVEL"/*; do options="$options -F files=@${f}"; done;

curl -X POST $options https://beebiome.org/import > $LOG_DIR/save_beebiome_metadata.$(date "+%Y%m%d-%H%M").log

MAIL="beebiome@unil.ch"
echo "Dear BeeBiome maintainers,\n\nBeeBiome database has been updated.\n\nThe BeeBiome team" | mailx -s "BeeBiome update" "$MAIL"