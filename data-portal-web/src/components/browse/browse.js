import React, { Component } from 'react';
import DataTable from "./data-table/data-table";


class Browse extends Component {

    constructor() {
        super();
        this.state = { data: [] };
    }

    componentDidMount() {
        fetch("http://localhost:8080/greeting/all")
            .then(results => { return results.json()} )
            .then(data => {
                this.setState({data: data});
                console.log("state", this.state.data);
            })
            .catch(function(error) {
                console.log('Request failed', error)
            });
    }
    
    render() {
        return (
            <div className="beebiome-data">
                <h1>Data</h1>
                <DataTable data={this.state.data} />
            </div>
        );
    }
}

export default Browse;
