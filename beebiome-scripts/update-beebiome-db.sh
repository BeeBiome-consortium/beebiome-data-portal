#!/bin/sh

export HOME_DIR=$1
export WORK_DIR=$HOME_DIR/beebiome-update 
export LOG_DIR=$WORK_DIR/logs
export OUTPUT_DIR=$WORK_DIR/data
export SCRIPT_DIR=$HOME_DIR/beebiome-data-portal/beebiome-scripts
export TAXON_LEVEL="Apoidea" # warning: use underscore to replace spaces such as Bombus_impatiens
export STARTING_TIMEPOINT=$(date "+%Y%m%d-%H%M")

export PROPERTIES_FILE=$2

pwd=`cat ${PROPERTIES_FILE} | grep 'import.password' | cut -d'=' -f2`

echo "Start BeeBiome database update..."

## Retrieve data from NCBI
perl $SCRIPT_DIR/retrieve_metadata.pl $OUTPUT_DIR $TAXON_LEVEL 1 > $LOG_DIR/retrieve_beebiome_metadata.$STARTING_TIMEPOINT.log

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
    
    options=$options' -F files=@'$OUTPUT_DIR'/'$TAXON_LEVEL'/'$TAXON_LEVEL'_taxonomy.xml -F pwd='$pwd

    echo "Start load set $i"
    curl -X POST $options https://beebiome.org/beebiome/import >> $LOG_DIR/save_beebiome_metadata.$STARTING_TIMEPOINT.log
    echo "End load set $i"
    
    i=$((i + 1))
done

echo "New release done. Import release version:"
curl https://beebiome.org/beebiome/import/new-version?pwd=$pwd >> $LOG_DIR/save_beebiome_metadata.$STARTING_TIMEPOINT.log

echo "\nEnd BeeBiome database update"

MAIL="beebiome@unil.ch"
echo "Dear BeeBiome maintainers,\n\nBeeBiome database has been updated.\n\nThe BeeBiome team" | mailx -s "BeeBiome update" "$MAIL"