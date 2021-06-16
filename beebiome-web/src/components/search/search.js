import React, {Component} from 'react';
import Table from '../result/table';
import './search.css';
import Loading from "../result/loading";
import ReactGA from "react-ga";

const examples = {
    bioProjectAcc: ['PRJNA392822'],
    bioSampleAcc: ['SAMN07311030'],
    host: ['Apis mellifera'],
    organism: ['Lactobacillus'],
    collectionDate: ['2014-12-14'],
    geoLocationName: ['Switzerland'],
    librarySources: ['GENOMIC'],
    libraryLayouts: ['PAIRED'],
    libraryStrategies: ['WGS'],
    instruments: ['Illumina'],
    centerName: ['University of Lausanne'],
    bioSamplePackageAcc: ['MIGS.ba.host-associated.5.0']
};

class Search extends Component {
    constructor() {
        super();
        this.state = {
            data: null,
            isLoaded: false,
            isFetching: false,
            errorMessage: null
        };
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit(e) {
        e.preventDefault();
        let self = this;
        self.setState({data: null, isFetching: true, isLoaded: false, errorMessage: null});

        let params = "";
        params = this.addParam("bioSampleAcc", self.state.bioSampleAcc, params);
        params = this.addParam("bioProjectAcc", self.state.bioProjectAcc, params);
        params = this.addParam("host", self.state.host, params);
        params = this.addParam("organism", self.state.organism, params);
        params = this.addParam("collectionDate", self.state.collectionDate, params);
        params = this.addParam("geoLocName", self.state.geoLocName, params);
        params = this.addParam("librarySources", self.state.librarySources, params);
        params = this.addParam("libraryLayouts", self.state.libraryLayouts, params);
        params = this.addParam("libraryStrategies", self.state.libraryStrategies, params);
        params = this.addParam("centerName", self.state.centerName, params);
        params = this.addParam("instruments", self.state.instruments, params);
        params = this.addParam("biosamplePackageAcc", self.state.bioSamplePackageAcc, params);

        // TODO: update to post request 
        fetch(process.env.REACT_APP_API_URL + "/sample/advanced-search?" + params)
            .then(results => { return results.json()} )
            .then(data => {
                this.setState({data: data, isFetching: false, isLoaded: true, errorMessage: null});
                const y = document.getElementById("result").getBoundingClientRect().top
                    + window.pageYOffset - 300;
                window.scrollTo({top: y, behavior: 'smooth'});
            })
            .catch(function(error) {
                self.setState({isFetching: false, errorMessage: "Failed to get data from API."});
            });
    }

    addParam(paramKey, paramValue, params) {
        let newParams = params;
        if (typeof paramValue !== "undefined" && paramValue !== "") {
            if (newParams !== "") {
                newParams = newParams + "&";
            }
            newParams = newParams + paramKey + "=" + paramValue;
        }
        return newParams;
    }

    handleChange(fieldName, value) {
        this.setState({
            [fieldName]: value
        })
    }

    componentDidMount() {
        ReactGA.pageview(window.location.pathname + window.location.search);
    }

    updateValue(id, val) {
        document.getElementById(id).value = val;
        this.handleChange(id, val);
    }

    getInputGroup(id, label) {
        var exampleLinks = [];
        for (const el of examples[id]) {
            exampleLinks.push(
                <button className="btn btn-link btn-sm no-style" type="button"
                        onClick={(e) => {
                            this.updateValue(id, el) }}>
                    {el}
                </button>
            )
        }
        return <div className="form-group col-md-4">
            <label htmlFor={id} className="col-form-label">{label}</label>
            <input id={id} className="form-control form-control-sm" type="text"
                   onChange={(e) => {
                       this.handleChange(id, e.target.value)
                   }}/>
            <small className="text-muted">Ex: {exampleLinks}</small>
        </div>;
    }
    
    render() {
        let result = "";
        if (this.state.isLoaded) {
            result = <Table data={this.state.data}/>
        } else if (this.state.errorMessage !== null) {
            result = <p>{this.state.errorMessage}</p>
        } else if (this.state.isFetching) {
            result = <Loading/>
        }
        let doc_link = "/help/data";
        if (process.env.REACT_APP_ROUTER_BASE) {
            doc_link = process.env.REACT_APP_ROUTER_BASE + doc_link;
        }

        return (
            <div>
                <h1>Advanced search</h1>
                <div className='row'>
                    <div className='col-10 offset-1'>
                        <div>
                            <p>This advanced search interface allows to do a text-based search on each field and combine them using a 'AND' boolean logic.
                                More details on each field are available in our <a href={doc_link}>help page</a>.</p>
                        </div>
                        <div className="mb-3">
                            <form onSubmit={this.handleSubmit}>
                                <div className="form-row">
                                    {this.getInputGroup('bioProjectAcc', 'BioProject accession')}
                                    {this.getInputGroup('bioSampleAcc', 'BioSample accession')}
                                    {this.getInputGroup('host', 'Host')}
                                </div>
                                <div className="form-row">
                                    {this.getInputGroup('organism', 'Organism')}
                                    {this.getInputGroup('collectionDate', 'Collection date')}
                                    {this.getInputGroup('geoLocationName', 'Geo. location name')}
                                </div>
                                <div className="form-row">
                                    {this.getInputGroup('librarySources', 'Library sources')}
                                    {this.getInputGroup('libraryLayouts', 'Library layouts')}
                                    {this.getInputGroup('libraryStrategies', 'Library strategies')}
                                </div>
                                <div className="form-row">
                                    {this.getInputGroup('instruments', 'Instruments')}
                                    {this.getInputGroup('centerName', 'Center name')}
                                    {this.getInputGroup('bioSamplePackageAcc', 'Sample package accession')}

                                </div>
                                <button className="btn btn-sm btn-secondary col-sm-2 offset-sm-5"
                                        type='submit'>Submit
                                </button>
                                <button className="btn btn-sm btn-link col-sm-1"
                                        type='reset'>Clear form
                                </button>

                            </form>
                        </div>
                        {result}
                    </div>
                </div>
            </div>
        );
    }
}

export default Search;