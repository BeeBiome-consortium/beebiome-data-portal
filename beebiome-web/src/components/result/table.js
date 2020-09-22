import React, {Component} from 'react';
import './table.css';
import { useLocation } from "react-router-dom";

const $ = require('jquery');
require( 'datatables.net-buttons-bs4' );
require( 'datatables.net-buttons/js/buttons.html5.js' );

const columns = [
    { title : 'BioProject acc', data: 'bioprojectAcc',
        render: function ( data, type, row ) {
            return '<a href="https://www.ncbi.nlm.nih.gov/bioproject/' + data + '" target="_blank">'
                + data + '</a>';
        }
    },
    { title : 'BioSample acc', data: 'biosampleAcc',
        render: function ( data, type, full, row ) {
            return '<a href="https://www.ncbi.nlm.nih.gov/biosample/' + data + '" target="_blank">'
                + data + '</a>';
        }
    },
    { title : 'Assay types', data: 'libraryStrategies[, ]'}, // such as amplicon, wgs.. https://www.ebi.ac.uk/ena/submit/reads-library-strategy
    { title : 'Center name', data: 'submittingOrganizationName'},
    { title : 'Instruments', data: 'platforms'},
    { title : 'Library layouts', data: 'libraryLayouts[, ]'}, // paired single
    { title : 'Library sources', data: 'librarySources[, ]'}, // genomic, metagenomic... 
    { title : 'Organism', data: 'organism.scientificName'},
    { title : 'Host', data: 'host.scientificName'},
    { title : 'Platform', data: 'platforms'},
    { title : 'Geo. loc. name', data: 'geoLocName'},
    { title : 'Collection date', data: 'collectionDate'}
];

function reloadTableData(samples) {
    const table = $('.data-table-wrapper').find('table').DataTable();
    table.clear();
    table.rows.add(samples);
    table.draw();
}

function updateTable(samples) {
    const table = $('.data-table-wrapper').find('table').DataTable();
    let dataChanged = false;
    table.rows().every(function () {
        const oldSampleData = this.data();
        const newSampleData = samples.find((sampleData) => {
            return sampleData.bioprojectAcc === oldSampleData.bioprojectAcc;
        });
        // if (oldSampleData.nickname !== newSampleData.nickname) {
            dataChanged = true;
            this.data(newSampleData);
        // }
        return true;
    });

    if (dataChanged) {
        table.draw();
    }
}

class Table extends Component {
    
    componentDidMount() {
        let table = $(this.refs.main).DataTable({
            order: [[ 0, 'asc'], [ 1, 'asc']],
            dom:"<'row'<'col-sm-4'l><'col-sm-4'i><'col-sm-4 browse-search'f>>" +
                "<'row'<'data-table-wrapper col-sm-12'tr>>" +
                "<'row'<'col-sm-6'p><'col-sm-6 btn-download'B>>",

            scrollX: true,
            lengthMenu: [[10, 25, 50, -1], [10, 25, 50, "All"]],
            data: this.props.data,
            columns,
            ordering: true,
            buttons: [
                {
                    extend: 'copyHtml5',
                    text: 'Copy to clipboard'
                },
                {
                    extend: 'csvHtml5',
                    fieldSeparator: '\t',
                    extension: '.tsv',
                    text: 'TSV',
                    title: 'BeeBiome data portal export'
                }
            ]
        });
    }

    componentWillUnmount(){
        $('.data-table-wrapper').find('table').DataTable().destroy(true);
    }

    shouldComponentUpdate(nextProps) {
        if (nextProps.data.length !== this.props.data.length) {
            reloadTableData(nextProps.data);
        } else {
            updateTable(nextProps.data);
        }
        return false;
    }

    render() {
        return (
            <div>
                <p>Results are ordered by 'BioProject acc', then 'BioSample acc'.
                    The order could be changed by clicking on one column, then press shift and click on another column.</p>
                <table className={'table table-sm table-striped table-bordered table-hover '} ref="main" />
            </div>
        )
                
    }
}

export default Table;
