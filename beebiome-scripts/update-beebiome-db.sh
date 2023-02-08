#!/bin/sh

export HOME_DIR=$1
export PROPERTIES_FILE=$2
export WORK_DIR=$HOME_DIR/beebiome-update 
export LOG_DIR=$WORK_DIR/logs
export OUTPUT_DIR=$WORK_DIR/data
export SCRIPT_DIR=$HOME_DIR/beebiome-data-portal/beebiome-scripts
export TAXON_LEVEL="Apoidea" # warning: use underscore to replace spaces such as Bombus_impatiens
export STARTING_TIMEPOINT=$(date "+%Y%m%d-%H%M")

pwd=`cat ${PROPERTIES_FILE} | grep 'import.password' | cut -d'=' -f2`

MAIL=`cat ${PROPERTIES_FILE} | grep 'team.email' | cut -d'=' -f2`

echo "Start BeeBiome database update..."

## Retrieve data from NCBI

perl $SCRIPT_DIR/retrieve_metadata.pl $OUTPUT_DIR $TAXON_LEVEL 1 > $LOG_DIR/retrieve_beebiome_metadata.$STARTING_TIMEPOINT.log

retrieve_success=`grep 'End retrieve data\.' $LOG_DIR/retrieve_beebiome_metadata.$STARTING_TIMEPOINT.log`
if [ -z "$retrieve_success" ]
then 
    echo "Dear BeeBiome maintainers,\n\nData recovery for BeeBiome database encountered an error.\n\nThe BeeBiome team" | mailx -s "BeeBiome update - ERROR" "$MAIL"
    exit 1;
fi

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

    # Fix SRA files containing several xml tags.
    echo "Start correction of SRA file $i"
    perl -i -0pe 's/<\/EXPERIMENT_PACKAGE_SET>\n<\?xml version="1.0" encoding="UTF-8"  \?>\n<EXPERIMENT_PACKAGE_SET>//g' "$OUTPUT_DIR"/"$TAXON_LEVEL"/"$TAXON_LEVEL"_sra.$i.xml
    echo "End correction of SRA file $i"

    echo "Start load set $i"
    curl -X POST $options https://beebiome.org/beebiome/import >> $LOG_DIR/save_beebiome_metadata.$STARTING_TIMEPOINT.log
    echo "End load set $i"
    
    i=$((i + 1))
done

echo "New release done. Import release version:"
curl https://beebiome.org/beebiome/import/new-release-version?pwd=$pwd >> $LOG_DIR/save_beebiome_metadata.$STARTING_TIMEPOINT.log

echo "\nEnd BeeBiome database update"

save_exception=`grep 'exception' $LOG_DIR/save_beebiome_metadata.$STARTING_TIMEPOINT.log`
if [ -z "$save_exception" ]
then 
    echo "Dear BeeBiome maintainers,\n\nBeeBiome database has been updated.\n\nThe BeeBiome team" | mailx -s "BeeBiome update - SUCCESS" "$MAIL"
else
    echo "Dear BeeBiome maintainers,\n\nUpdate of BeeBiome database encountered an error.\n\nThe BeeBiome team" | mailx -s "BeeBiome update - ERROR" "$MAIL"
    exit 1;
fi