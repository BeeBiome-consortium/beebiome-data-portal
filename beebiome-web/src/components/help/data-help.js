import React, {Component} from 'react';
import ReactGA from "react-ga";

export default class DataHelp extends Component {

    componentDidMount() {
        ReactGA.pageview(window.location.pathname + window.location.search);
    }

    render() {
        let browse_link = "/browse";
        if (process.env.REACT_APP_ROUTER_BASE) {
            browse_link = process.env.REACT_APP_ROUTER_BASE + browse_link;
        }

        let search_link = "/search";
        if (process.env.REACT_APP_ROUTER_BASE) {
            search_link = process.env.REACT_APP_ROUTER_BASE + search_link;
        }
        return (
            <div className={'row'}>
                <div className={'col-sm-10 offset-sm-1'}>
                    <h1>Documentation</h1>

                    <h2>Contents of BeeBiome Data Portal</h2>

                    <p>BeeBiome Data Portal contains metadata of datasets from NCBI having a host which is a species under the NCBI taxonomic level '<a
                        href={"https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=34735"} target={"_blank"}>Apoidea</a>'.
                    </p>
                    <p>Based on this set of metadata, you can find the following pages:
                        <ul>
                            <li><a href={browse_link}>Browse page</a> where you can see and download all metadata with a basic text-search;</li>
                            <li><a href={search_link}>Advanced search page</a> where you can see and download metadata from a request based on a text-based search on each fields and combine them using a 'AND' boolean logic.</li>
                        </ul>
                    </p>

                    <h2>Definition of metadata fields</h2>
                    <dl>
                        <dt>BioProject acc.</dt>
                        <dd>Accession from <a href={"https://www.ncbi.nlm.nih.gov/bioproject"} target="_blank">NCBI BioProject</a> (a collection of biological data related to a single initiative).</dd>

                        <dt>BioSample acc.</dt>
                        <dd>Accession from <a href={"https://www.ncbi.nlm.nih.gov/biosample"} target="_blank">NCBI BioSample</a> (a database containing descriptions of biological source materials used in experimental assays).</dd>

                        <dt>SRA experiment entries</dt>
                        <dd>Count of entries from <a href={"https://www.ncbi.nlm.nih.gov/sra"} target="_blank">NCBI Sequence Read Archive (SRA)</a> (a repository of high throughput sequencing data).</dd>

                        <dt>NCBI Nucleotide entries</dt>
                        <dd>Count of entries from <a href={"https://www.ncbi.nlm.nih.gov/nucleotide"} target="_blank">NCBI Nucleotide</a> (a collection of genome, gene and transcript sequence data).</dd>

                        <dt>Host</dt>
                        <dd>Scientific name of the natural (as opposed to laboratory) host to the organism from which the sample was obtained.</dd>

                        <dt>Organism</dt>
                        <dd>Scientific name of the organism that harbours the host.</dd>

                        <dt>Collection date</dt>
                        <dd>Date on which the sample was collected.</dd>

                        <dt>Geo. loc. name</dt>
                        <dd>Geographical origin where the sample was collected.</dd>

                        <dt>Library source</dt>
                        <dd>Type of source material that is being sequenced.</dd>

                        <dt>Library layout</dt>
                        <dd>Whether to expect SINGLE or PAIRED end reads.</dd>

                        <dt>Library strategy</dt>
                        <dd>Sequencing technique intended for the library.</dd>

                        <dt>Instrument</dt>
                        <dd>Sequencing instrument for library.</dd>

                        <dt>Center name</dt>
                        <dd>Organization involved into the project.</dd>

                        <dt>BioSample package acc.</dt>
                        <dd>Accession of a type of sample and specifies the list of attributes by which it should be described (<a href={"https://www.ncbi.nlm.nih.gov/biosample/docs/packages/"} target="_blank">more details</a>).</dd>
                    </dl>
                </div>
            </div>);
    }
}