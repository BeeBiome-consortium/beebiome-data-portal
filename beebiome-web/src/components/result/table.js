import React, {Component} from 'react';
import 'datatables.net-dt/css/jquery.dataTables.min.css';

const $ = require('jquery');
$.DataTable = require('datatables.net');

const columns = [
    { title : 'SRA study', data: 'id'},
    { title : 'SRA sample', data: 'study'},
    { title : 'Assay type', data: 'assayType'},
    { title : 'Center name', data: 'centerName'},
    { title : 'Instrument', data: 'instrument'},
    { title : 'Library layout', data: 'libraryLayout'},
    { title : 'Library source', data: 'librarySource'},
    { title : 'Organism', data: 'organism'},
    { title : 'Platform', data: 'platform'},
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
            return sampleData.study === oldSampleData.study;
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
            dom: "<'row'<'col-sm-3'i><'col-sm-3'l><'col-sm-6'f>>" +
                "<'row'<'data-table-wrapper col-sm-12'tr>>" +
                "<'row'<'col-sm-4'B><'col-sm-8'p>>",
            scrollX: true,
            data: this.props.data,
            columns,
            ordering: false
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
        return (<table className={'stripe'} ref="main" />)
    }
}

export default Table;
