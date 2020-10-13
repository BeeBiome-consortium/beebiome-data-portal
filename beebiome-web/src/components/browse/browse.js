import React, {Component} from 'react';
import Table from '../result/table';
import Loading from "../result/loading";
import ReactGA from "react-ga";

class Browse extends Component {
    constructor() {
        super();
        this.state = {
            data: null,
            searchQuery: "",
            isLoaded: false,
            errorMessage: null
        };
    }

    componentDidMount() {
        ReactGA.pageview(window.location.pathname + window.location.search);

        let self = this;
        self.setState({data: null, isLoaded: false, errorMessage: null});
        
        let searchQuery = new URLSearchParams(this.props.location.search).get("search_query");
        self.setState({searchQuery: searchQuery});

        console.log("Fetching data...");
        fetch(process.env.REACT_APP_API_URL + "/sample/all")
            .then(results => { return results.json()} )
            .then(data => {
                self.setState({data: data, isLoaded: true, errorMessage: null});
            })
            .catch(function(error) {
                self.setState({errorMessage: "Failed to get data from API."});
            });
    }

    render() {
        let result = "";
        if (this.state.isLoaded) {
            result = <Table data={this.state.data} searchQuery={this.state.searchQuery}/>
        } else if (this.state.errorMessage !== null) {
            result = <p>{this.state.errorMessage}</p>
        } else {
            result = <Loading/>
        }
        return (
            <div>
                <h1>Browse</h1>
                <div className='row'>
                    <div className='col-sm-10 offset-sm-1'>
                        {result}
                    </div>
                </div>
            </div>
        );
    }
}

export default Browse;