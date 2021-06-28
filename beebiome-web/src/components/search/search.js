import React, {Component} from 'react';
import Table from '../result/table';
import './search.css';
import Loading from "../result/loading";
import ReactGA from "react-ga";
import WorldMap from "../map/map";
import Copyright from "../result/copyright";

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
        params = this.addParam("geoLocationName", self.state.geoLocationName, params);
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

    render() {
        let result = this.getResultDisplay();
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
                                <div className="form-group row">
                                    <label htmlFor={'bioSampleAcc'} className="col-form-label col-md-2 text-md-right offset-md-1">BioSample accession</label>
                                    <input id='bioSampleAcc' className="form-control form-control-sm col-md-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('bioSampleAcc', e.target.value) }} />
                                    <label htmlFor={'bioProjectAcc'} className="col-form-label col-md-2 text-md-right">BioProject accession</label>
                                    <input id='bioProjectAcc' className="form-control form-control-sm col-md-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('bioProjectAcc', e.target.value) }} />
                                </div>
                                <div className="form-group row">
                                    <label htmlFor={'host'} className="col-form-label col-md-2 text-md-right offset-md-1">Host</label>
                                    <input id='host' className="form-control form-control-sm col-md-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('host', e.target.value) }} />
                                    <label htmlFor={'organism'} className="col-form-label col-md-2 text-md-right">Organism</label>
                                    <input id='organism' className="form-control form-control-sm col-md-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('organism', e.target.value) }} />
                                </div>
                                <div className="form-group row">
                                    <label htmlFor={'collectionDate'} className="col-form-label col-md-2 text-md-right offset-md-1">Collection date</label>
                                    <input id='collectionDate' className="form-control form-control-sm col-md-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('collectionDate', e.target.value) }} />
                                    <label htmlFor={'geoLocationName'} className="col-form-label col-md-2 text-md-right">Geo. location name</label>
                                    <input id='geoLocationName' className="form-control form-control-sm col-md-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('geoLocationName', e.target.value) }} />
                                </div>
                                <div className="form-group row">
                                    <label htmlFor={'librarySources'} className="col-form-label col-md-2 text-md-right offset-md-1">Library sources</label>
                                    <input id='librarySources' className="form-control form-control-sm col-md-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('librarySources', e.target.value) }} />
                                    <label htmlFor={'libraryLayouts'} className="col-form-label col-md-2 text-md-right">Library layouts</label>
                                    <input id='libraryLayouts' className="form-control form-control-sm col-md-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('libraryLayouts', e.target.value) }} />
                                </div>
                                <div className="form-group row">
                                    <label htmlFor={'libraryStrategies'} className="col-form-label col-md-2 text-md-right offset-md-1">Library strategies</label>
                                    <input id='libraryStrategies' className="form-control form-control-sm col-md-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('libraryStrategies', e.target.value) }} />
                                    <label htmlFor={'instruments'} className="col-form-label col-md-2 text-md-right">Instruments</label>
                                    <input id='instruments' className="form-control form-control-sm col-md-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('instruments', e.target.value) }} />
                                </div>
                                <div className="form-group row">
                                    <label htmlFor={'centerName'} className="col-form-label col-md-2 text-md-right offset-md-1">Center name</label>
                                    <input id='centerName' className="form-control form-control-sm col-md-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('centerName', e.target.value) }} />
                                               <label htmlFor={'bioSamplePackageAcc'} className="col-form-label col-md-2 text-md-right">BioSample package accession</label>
                                    <input id='bioSamplePackageAcc' className="form-control form-control-sm col-md-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('bioSamplePackageAcc', e.target.value) }} />
                                </div>
                                <div className="form-group row">
                                    <button className="btn btn-sm btn-secondary col-sm-2 offset-sm-5"
                                            type='submit'>Submit</button>
                                    <button className="btn btn-sm btn-link col-sm-1"
                                            type='reset'>Clear form</button>
                                </div>
                            </form>
                        </div>
                        {result}
                    </div>
                </div>
            </div>
        );
    }

    getResultDisplay() {
        let result = "";
        if (this.state.isLoaded) {
            if (this.state.data && this.state.data.length > 0) {
                result =
                    <div>
                        <div id="accordion">
                            <div className={"alert alert-success"}>
                                Results are displayed in a <a href={"#result-table"}>table</a> or
                                a <a
                                href={"#result-map"}>world map</a>.
                                It is possible to hide the desired format by clicking on the title
                            </div>
                            <div className="card mb-1">
                                <div className="card-header pt-0 pb-0" id="headingTable">
                                    <button className="btn btn-link" data-toggle="collapse"
                                            data-target="#result-table" aria-expanded="true"
                                            aria-controls="result-table">Table</button>
                                </div>
                                <div id="result-table" className="collapse show"
                                     aria-labelledby="headingTable"
                                     data-parent="#accordion">
                                    <div className="card-body mt-0 ">
                                        <Table data={this.state.data}/>
                                    </div>
                                </div>
                            </div>
                            <div className="card">
                                <div className="card-header pt-0 pb-0" id="headingMap">
                                    <button className="btn btn-link collapsed"
                                            data-toggle="collapse"
                                            data-target="#result-map" aria-expanded="true"
                                            aria-controls="result-map">Map</button>
                                </div>
                                <div id="result-map" className="collapse show"
                                     aria-labelledby="headingMap"
                                     data-parent="#accordion">
                                    <div className="card-body">
                                        <WorldMap data={this.state.data}/>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <Copyright/>
                    </div>
            } else {
                result =
                    <div className={"alert alert-danger"}>
                        Sorry, no results found for your search.
                    </div>
            }
        } else if (this.state.errorMessage !== null) {
            result = <p>{this.state.errorMessage}</p>
        } else if (this.state.isFetching) {
            result = <Loading/>
        }
        return result;
    }
}

export default Search;