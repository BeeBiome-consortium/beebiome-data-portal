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

        fetch(process.env.REACT_APP_API_URL + "/sample/" + self.state.sampleId)
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
        
        // let result = "";
        // if (this.state.data !== null && this.state.data.length === 0) {
        //     result = <p className="no-data-message">No data found</p>
        // } else if (this.state.data !== null) {
        //     result = <Table data={this.state.data}/>
        // }
        return (
            <div>
                <h1>Advanced search</h1>
                <div className='row'>
                    <div className='col-sm-10 offset-sm-1'>
                        <div className="row mb-3">
                            <form onSubmit={this.handleSubmit}>
                                <div className="form-row align-items-center">
                                    <div className="col-auto">
                                        <label htmlFor={'sampleId'} className="col-form-label mr-3">Sample ID</label>
                                        <input id='sampleId' className="mr-3" type="text"
                                               onChange={(e) => {
                                                   this.handleChange('sampleId', e.target.value) }} />
                                    </div>
                                    <div className="col-auto">
                                        <button className="btn btn-sm btn-secondary" 
                                                type='submit'>Submit</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div className="row">
                            <div id="search-result" class="col-sm-12">
                                {result}
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Search;