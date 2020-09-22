import React, {Component} from 'react';
import Table from '../result/table';

class Browse extends Component {
    constructor() {
        super();
        this.state = {
            data: []
        };
    }

    componentDidMount() {
        this.setState({data: []});
        console.log("Fetching data...");

        fetch(process.env.REACT_APP_API_URL + "/sample/all")
            .then(results => { return results.json()} )
            .then(data => {
                this.setState({data: data});
                console.log("Fetch data: done", this.state.data);
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
            result = <Table data={this.state.data}/>
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