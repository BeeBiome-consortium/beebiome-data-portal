import React, {Component} from 'react';
import './table.css';
import "datatables.net-dt/css/jquery.dataTables.min.css"
import "datatables.net-buttons-dt/css/buttons.dataTables.min.css"
import "datatables.net-responsive-dt/css/responsive.dataTables.css"
import cc0_logo from "../../assets/images/cc-zero_logo.png";

const $ = require('jquery');
require( 'datatables.net-dt' );
require( 'datatables.net-buttons-dt' );
require( 'datatables.net-buttons/js/buttons.html5.min.js' );
require( 'datatables.net-responsive' );

const columns = [
    { 
        className: 'control',
        orderable: false,
        data: null,
        render: function ( data, type, full ) {
            return '';
        },
        targets:   -1
    },
    { title : 'BioProject acc.', data: 'bioprojectAcc',
        render: function ( data, type, full ) {
            return '<a href="https://www.ncbi.nlm.nih.gov/bioproject/' + data + '" target="_blank">'
                + data + '</a>';
        }
    },
    { title : 'BioSample acc.', data: 'biosampleAcc',
        render: function ( data, type, full ) {
            return '<a href="https://www.ncbi.nlm.nih.gov/biosample/' + data + '" target="_blank">'
                + data + '</a>';
        }
    },
    { title : 'SRA experiment entries', data: 'experimentAccs[, ]',
        render: function ( data, type, full ) {
            if (data) {
                return ' <a href="https://www.ncbi.nlm.nih.gov/sra?term=' + full.biosampleAcc +
                    '%5BBioSample%5D" target="_blank">' + data.split(", ").length + '</a>';
            }
            return '0';
        }
    },
    { title : 'NCBI Nucleotide entries', data: 'nucleotideCount',
        render: function ( data, type, full ) {
            if (data) {
                return ' <a href="https://www.ncbi.nlm.nih.gov/nucleotide?term=' + full.biosampleAcc +
                    '%5BBioSample%5D" target="_blank">' + data + '</a>';
            }
            return '0';
        }
    },
    { title : 'Host', data: 'host.scientificName'},
    { title : 'Organism', data: 'organism.scientificName'},
    { title : 'Collection date', data: 'collectionDate'},
    { title : 'Geo. location name', data: 'geoLocation',
        render: function ( data, type, full ) {
            if (data) {
                return data.name;
            }
            return '';
        }
    },
    { title : 'Library source(s)', data: 'librarySources[, ]'}, // genomic, metagenomic... 
    { title : 'Library layout(s)', data: 'libraryLayouts[, ]'}, // paired or single
    { title : 'Library strategy(ies)', data: 'libraryStrategies[, ]'}, // such as amplicon, wgs.. https://www.ebi.ac.uk/ena/submit/reads-library-strategy
    { title : 'Instrument(s)', data: 'platforms[, ]'},
    { title : 'Center name', data: 'submittingOrganizationName'},
    { title : 'BioSample package acc.', data: 'biosamplePackage.id'}
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
            order: [[1, 'asc'], [2, 'asc']],
            dom:"<'row'<'col-sm-4'l><'col-sm-4'i><'col-sm-4 browse-search'f>>" +
                "<'row'<'data-table-wrapper col-sm-12'tr>>" +
                "<'row'<'col-sm-6 btn-download'B><'col-sm-6'p>>",
            oLanguage: {
                sSearch: "Filter:"
            },
            lengthMenu: [[10, 25, 50, -1], [10, 25, 50, "All"]],
            data: this.props.data,
            columns,
            responsive: {
                details: {
                    type: 'column',
                    target: 'tr'
                }
            },
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
        if (this.props.searchQuery) {
            table.search(this.props.searchQuery).draw();
        }
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
        let link = "/about/citing-beebiome";
        if (process.env.REACT_APP_ROUTER_BASE) {
            link = process.env.REACT_APP_ROUTER_BASE + link;
        }
        return (
            <div>
                <div className={"result-info mb-3"}>
                    <p>Results are ordered by 'BioProject acc.', then 'BioSample acc.'.
                        The order could be changed by clicking on one column, then press shift and click on another column.</p>
                    <p>Clicking on the '+' sign shows the full information for each sample.</p>
                </div>
                <table id="result" className={'table table-sm table-striped table-bordered table-hover '} ref="main" />
                <div className={"copyright"}>
                    <p>
                        This work is published under the <a href={"https://creativecommons.org/publicdomain/zero/1.0/"} 
                                                            target='_blank' rel='noopener noreferrer'>
                        Creative Commons Zero license (CC0)</a> from Switzerland. 
                        Although CC0 doesn’t legally require users of the data to cite the source,
                        if you intend to use data from BeeBiome, it would be nice to cite us (see <a href={link}>Citing us</a> page).
                    </p>
                    <p>
                        <a rel="license noopener noreferrer"
                           href="https://creativecommons.org/publicdomain/zero/1.0/"
                           target="_blank">
                            <img src={cc0_logo} alt="CC0"/>
                        </a>
                    </p>
                </div>
            </div>
        )
                
    }
}

export default Table;
