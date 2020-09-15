import React, {Component} from 'react';
import 'datatables.net-dt/css/jquery.dataTables.min.css';

const $ = require('jquery');
$.DataTable = require('datatables.net');

const columns = [
    { title : 'BioProject acc', data: 'bioprojectAcc'},
    { title : 'BioSample acc', data: 'biosampleAcc'},
    { title : 'Assay types', data: 'libraryStrategies'}, // such as amplicon, wgs.. https://www.ebi.ac.uk/ena/submit/reads-library-strategy
    { title : 'Center name', data: 'submittingOrganizationName'},
    { title : 'Instruments', data: 'platforms'},
    { title : 'Library layouts', data: 'libraryLayouts'}, // paired single
    { title : 'Library sources', data: 'librarySources'}, // genomic, metagenomic... 
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
        $(this.refs.main).DataTable({
            order: [[ 0, 'asc'], [ 1, 'asc']],
            dom: "<'row'<'col-sm-3'i><'col-sm-3'l><'col-sm-6'f>>" +
                "<'row'<'data-table-wrapper col-sm-12'tr>>" +
                "<'row'<'col-sm-4'B><'col-sm-8'p>>",
            scrollX: true,
            data: this.props.data,
            columns,
            ordering: true
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
        return (<table className={'table table-striped table-hover'} ref="main" />)
    }
}

export default Table;
