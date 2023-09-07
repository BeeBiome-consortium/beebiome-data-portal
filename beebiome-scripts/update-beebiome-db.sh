#!/bin/sh

export HOME_DIR=$1
export PROPERTIES_FILE=$2
export WORK_DIR=$HOME_DIR/beebiome-update 
export LOG_DIR=$WORK_DIR/logs
export OUTPUT_DIR=$WORK_DIR/data
export SCRIPT_DIR=$HOME_DIR/beebiome-data-portal/beebiome-scripts
export TAXON_LEVEL="Apoidea" # warning: use underscore to replace spaces such as Bombus_impatiens
export STARTING_TIMEPOINT=$(date "+%Y%m%d-%H%M")
export LOG_FILE=$LOG_DIR/load_beebiome_metadata.$STARTING_TIMEPOINT.log

pwd=`cat ${PROPERTIES_FILE} | grep 'import.password' | cut -d'=' -f2`

MAIL=`cat ${PROPERTIES_FILE} | grep 'team.email' | cut -d'=' -f2`

echo "Start BeeBiome database update..." > $LOG_FILE

## Retrieve data from NCBI
echo "Start to retrieve data from NCBI..." >> $LOG_FILE

perl $SCRIPT_DIR/retrieve_metadata.pl $OUTPUT_DIR $TAXON_LEVEL 1 > $LOG_DIR/retrieve_beebiome_metadata.$STARTING_TIMEPOINT.log

retrieve_success=`grep 'End retrieve data\.' $LOG_DIR/retrieve_beebiome_metadata.$STARTING_TIMEPOINT.log`
if [ -z "$retrieve_success" ]
then 
    echo "Dear BeeBiome maintainers,\n\nData recovery for BeeBiome database encountered an error.\n\nThe BeeBiome team" | mailx -s "BeeBiome update - ERROR" "$MAIL"
    exit 1;
fi

echo "End to retrieve data from NCBI." >> $LOG_FILE

## Build option for the curl from file list to be parsed to fill the db
echo "Start to load data into database..." >> $LOG_FILE
i=0
while true
do
    i=$((i + 1))
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
    
    echo "Load set $i:" >> $LOG_FILE
    biosampleFileName="$OUTPUT_DIR"/"$TAXON_LEVEL"/"$TAXON_LEVEL"_biosample.$i.xml
    biosampleFileSize=`stat -c %s ${biosampleFileName}`
    if [ $biosampleFileSize -eq 0 ]
    then
        echo "WARN BioSample file $biosampleFileName is empty\n" >> $LOG_FILE
        continue;
    fi

    options=$options' -F files=@'$OUTPUT_DIR'/'$TAXON_LEVEL'/'$TAXON_LEVEL'_taxonomy.xml -F pwd='$pwd

    # Fix SRA files containing several xml tags.
    echo "INFO Correction of SRA file $i" >> $LOG_FILE
    perl -i -0pe 's/<\/EXPERIMENT_PACKAGE_SET>\n<\?xml version="1.0" encoding="UTF-8"  \?>\n<EXPERIMENT_PACKAGE_SET>//g' "$OUTPUT_DIR"/"$TAXON_LEVEL"/"$TAXON_LEVEL"_sra.$i.xml >> $LOG_FILE

    echo "INFO Import of set $i" >> $LOG_FILE
    curl --no-progress-meter -X POST $options https://beebiome.org/beebiome/import >> $LOG_FILE
    
    error=`tail -n 1 $LOG_FILE | grep 'exception'`
    if [ -z "$error" ]
    then
        echo "\nSUCCESS Set $i loaded\n" >> $LOG_FILE
    else
        echo "\nERROR Set $i not loaded\n" >> $LOG_FILE
    fi

done

echo "End load of data into database." >> $LOG_FILE

echo "New release done. Import release version:" >> $LOG_FILE
curl https://beebiome.org/beebiome/import/new-release-version?pwd=$pwd >> $LOG_FILE

save_exception=`grep 'exception' $LOG_FILE`
if [ -z "$save_exception" ]
then 
    echo "Dear BeeBiome maintainers,\n\nBeeBiome database has been updated.\n\nThe BeeBiome team" | mailx -s "BeeBiome update - SUCCESS" "$MAIL"
else
    echo "Dear BeeBiome maintainers,\n\nUpdate of BeeBiome database encountered an error.\n\nThe BeeBiome team" | mailx -s "BeeBiome update - ERROR" "$MAIL"
    exit 1;
fi

echo "\nEnd BeeBiome database update" >> $LOG_FILE
