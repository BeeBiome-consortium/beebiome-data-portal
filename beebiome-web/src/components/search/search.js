import React, {Component} from 'react';
import Input from './form/input';
import Table from '../result/table';

class Search extends Component {
    constructor() {
        super();
        this.state = {
            data: []
        };
        this.onAddClick = this.onAddClick.bind(this);
    }

    onAddClick(sampleId) {
        this.setState({data: []});

        fetch(process.env.REACT_APP_API_URL + "/sample/" + sampleId)
            .then(results => { return results.json()} )
            .then(data => {
                this.setState({data: data});
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
            result =
                <div>
                    <h2>Results</h2>
                    <Table data={this.state.data}/>
                </div>
        }
        return (
            <div>
                <h1>Advanced search</h1>
                <div className='row'>
                    <div className='col-sm-10 offset-sm-1'>
                        <Input onAddClick={(sampleId) => { this.onAddClick(sampleId); }} />
                        {result}
                    </div>
                </div>
            </div>

        );
    }
}

export default Search;