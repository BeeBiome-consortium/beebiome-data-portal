#!/bin/sh

export HOME_DIR=/home/beebiome 
export WORK_DIR=$HOME_DIR/beebiome-update 
export LOG_DIR=$WORK_DIR/logs
export OUTPUT_DIR=$WORK_DIR/data
export SCRIPT_DIR=$HOME_DIR/beebiome-data-portal/beebiome-scripts
export TAXON_LEVEL="Apoidea" # warning: use underscore to replace spaces such as Bombus_impatiens
export STARTING_TIMEPOINT=$(date "+%Y%m%d-%H%M")

## Retrieve data from NCBI
perl $SCRIPT_DIR/retrieve_metadata.pl $OUTPUT_DIR $TAXON_LEVEL 1 $STARTING_TIMEPOINT > $LOG_DIR/retrieve_beebiome_metadata.$STARTING_TIMEPOINT.log

## Build option for the curl from file list to be parsed to fill the db
i=1
while true
do
    options=''
    fileCount=0
    for f in "$OUTPUT_DIR"/"$TAXON_LEVEL"/*.$i.*
    do
        options="$options -F files=@${f}"
        fileCount=$((fileCount + 1))
    done

    if [ $fileCount -eq 1 ]
    then
        break;
    fi
    options=$options' -F files=@'$OUTPUT_DIR'/'$TAXON_LEVEL'/'$TAXON_LEVEL'_taxonomy.xml' 
    curl -X POST $options https://beebiome.org/beebiome/import >> $LOG_DIR/save_beebiome_metadata.$STARTING_TIMEPOINT.log
    i=$((i + 1))
done

MAIL="beebiome@unil.ch"
echo "Dear BeeBiome maintainers,\n\nBeeBiome database has been updated.\n\nThe BeeBiome team" | mailx -s "BeeBiome update" "$MAIL"