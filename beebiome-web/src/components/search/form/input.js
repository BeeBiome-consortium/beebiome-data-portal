import React, {Component} from 'react';

class Input extends Component {

    constructor(props) {
        super(props);
        this.state = {
            sampleId: ''
        };
        this.updateValue = this.updateValue.bind(this);
        this.onAddClick = this.onAddClick.bind(this);
    }

    updateValue(fieldName, value) {
        this.setState({
            [fieldName]: value
        })
    }

    onAddClick() {
        this.props.onAddClick(this.state.sampleId);
    }

    render() {
        return (
            <div className="form-row align-items-center">
                <div className="col-auto">
                    <label htmlFor={'sampleId'} className="col-form-label mr-3">Sample ID</label>
                    <input id='sampleId' className="mr-3" type="text"
                           onChange={(e) => {
                               this.updateValue('sampleId', e.target.value)
                           }} />
                </div>
                <div className="col-auto">
                        <button className="btn btn-sm btn-secondary"
                                onClick={() => { this.onAddClick() }}>Submit</button>
                </div>
            </div>
        );
    }
}

export default Input;
