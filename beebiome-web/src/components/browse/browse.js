import React, {Component} from 'react';
import Table from '../result/table';

class Browse extends Component {
    constructor() {
        super();
        this.state = {
            data: [],
            searchQuery: ""
        };
    }

    componentDidMount() {
        this.setState({data: []});
        console.log("Fetching data...");
        
        let searchQuery = new URLSearchParams(this.props.location.search).get("search_query");

        fetch(process.env.REACT_APP_API_URL + "/sample/all")
            .then(results => { return results.json()} )
            .then(data => {
                this.setState({data: data, searchQuery: searchQuery});
            })
            .catch(function(error) {
                // FIXME manage cathched error
                console.log('Fetch data: failed', error)
                // this.setState((state) => {
                //     return {content: state.content, data: [], hasResult: false, isFetching: false}
                // });
            });
    }

    render() {
        let result = "";
        if (this.state.data.length > 0) {
            result = <Table data={this.state.data} searchQuery={this.state.searchQuery}/>
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