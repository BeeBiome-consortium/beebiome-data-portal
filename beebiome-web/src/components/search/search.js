import React, {Component} from 'react';
import Table from '../result/table';
import './search.css';
import Loading from "../result/loading";
import ReactGA from "react-ga";

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
        if (typeof self.state.bioSampleAcc !== "undefined" ||
            self.state.bioSampleAcc !== "") {
            params = "bioSampleAcc=" + self.state.bioSampleAcc;
        }
        if (typeof self.state.bioProjectAcc !== 'undefined' &&
            self.state.bioProjectAcc !== "") {
            if (params !== "") {
                params = params + "&";
            }
            params = params + "bioProjectAcc=" + self.state.bioProjectAcc;
        }
        if (typeof self.state.assayTypes !== "undefined" && self.state.assayTypes !== "") {
            if (params !== "") {
                params = params + "&";
            }
            params = params + "assayTypes=" + self.state.assayTypes;
        }
        if (typeof self.state.centerName !== "undefined" && self.state.centerName !== "") {
            if (params !== "") {
                params = params + "&";
            }
            params = params + "centerName=" + self.state.centerName;
        }
        if (typeof self.state.instruments !== "undefined" && self.state.instruments !== "") {
            if (params !== "") {
                params = params + "&";
            }
            params = params + "instruments=" + self.state.instruments;
        }
        if (typeof self.state.libraryLayouts !== "undefined" && self.state.libraryLayouts !== "") {
            if (params !== "") {
                params = params + "&";
            }
            params = params + "libraryLayouts=" + self.state.libraryLayouts;
        }
        if (typeof self.state.librarySources !== "undefined" && self.state.librarySources !== "") {
            if (params !== "") {
                params = params + "&";
            }
            params = params + "librarySources=" + self.state.librarySources;
        }
        if (typeof self.state.organism !== "undefined" && self.state.organism !== "") {
            if (params !== "") {
                params = params + "&";
            }
            params = params + "organism=" + self.state.organism;
        }
        if (typeof self.state.host !== "undefined" && self.state.host !== "") {
            if (params !== "") {
                params = params + "&";
            }
            params = params + "host=" + self.state.host;
        }
        if (typeof self.state.geoLocName !== "undefined" && self.state.geoLocName !== "") {
            if (params !== "") {
                params = params + "&";
            }
            params = params + "geoLocName=" + self.state.geoLocName;
        }
        if (typeof self.state.collectionDate !== "undefined" && self.state.collectionDate !== "") {
            if (params !== "") {
                params = params + "&";
            }
            params = params + "collectionDate=" + self.state.collectionDate;
        }
        fetch(process.env.REACT_APP_API_URL + "/sample/multi-search?" + params)
            .then(results => { return results.json()} )
            .then(data => {
                this.setState({data: data, isFetching: false, isLoaded: true, errorMessage: null});
            })
            .catch(function(error) {
                self.setState({isFetching: false, errorMessage: "Failed to get data from API."});
            });
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
        let result = "";
        if (this.state.isLoaded) {
            result = <Table data={this.state.data}/>
        } else if (this.state.errorMessage !== null) {
            result = <p>{this.state.errorMessage}</p>
        } else if (this.state.isFetching) {
            result = <Loading/>
        }

        return (
            <div>
                <h1>Advanced search</h1>
                <div className='row'>
                    <div className='col-sm-10 offset-sm-1'>
                        <div className="mb-3">
                            <form onSubmit={this.handleSubmit}>
                                <div className="form-group row">
                                    <label htmlFor={'bioSampleAcc'} className="col-form-label offset-sm-1 col-sm-2">BioSample accession</label>
                                    <input id='bioSampleAcc' className="form-control form-control-sm col-sm-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('bioSampleAcc', e.target.value) }} />
                                    <label htmlFor={'bioProjectAcc'} className="col-form-label col-sm-2">BioProject accession</label>
                                    <input id='bioProjectAcc' className="form-control form-control-sm col-sm-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('bioProjectAcc', e.target.value) }} />
                                </div>
                                <div className="form-group row">
                                    <label htmlFor={'organism'} className="col-form-label offset-sm-1 col-sm-2">Organism</label>
                                    <input id='organism' className="form-control form-control-sm col-sm-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('organism', e.target.value) }} />
                                    <label htmlFor={'host'} className="col-form-label col-sm-2">Host</label>
                                    <input id='host' className="form-control form-control-sm col-sm-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('host', e.target.value) }} />
                                </div>
                                <div className="form-group row">
                                    <label htmlFor={'collectionDate'} className="col-form-label offset-sm-1 col-sm-2">Collection date</label>
                                    <input id='collectionDate' className="form-control form-control-sm col-sm-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('collectionDate', e.target.value) }} />
                                    <label htmlFor={'geoLocName'} className="col-form-label col-sm-2">Geo. loc. name</label>
                                    <input id='geoLocName' className="form-control form-control-sm col-sm-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('geoLocName', e.target.value) }} />
                                </div>
                                <div className="form-group row">
                                    <label htmlFor={'librarySources'} className="col-form-label offset-sm-1 col-sm-2">Library sources</label>
                                    <input id='librarySources' className="form-control form-control-sm col-sm-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('librarySources', e.target.value) }} />
                                    <label htmlFor={'libraryLayouts'} className="col-form-label col-sm-2">Library layouts</label>
                                    <input id='libraryLayouts' className="form-control form-control-sm col-sm-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('libraryLayouts', e.target.value) }} />
                                </div>
                                <div className="form-group row">
                                    <label htmlFor={'assayTypes'} className="col-form-label offset-sm-1 col-sm-2">Assay types</label>
                                    <input id='assayTypes' className="form-control form-control-sm col-sm-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('assayTypes', e.target.value) }} />
                                    <label htmlFor={'centerName'} className="col-form-label col-sm-2">Center name</label>
                                    <input id='centerName' className="form-control form-control-sm col-sm-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('centerName', e.target.value) }} />
                                </div>
                                <div className="form-group row">
                                    <label htmlFor={'instruments'} className="col-form-label offset-sm-1 col-sm-2">Instruments</label>
                                    <input id='instruments' className="form-control form-control-sm col-sm-3" type="text"
                                           onChange={(e) => {
                                               this.handleChange('instruments', e.target.value) }} />
                                </div>
                                <div className="form-group row">
                                    <button className="btn btn-sm btn-secondary col-sm-2 offset-sm-5"
                                            type='submit'>Submit</button>

                                </div>
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