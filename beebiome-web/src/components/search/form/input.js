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
            <div className="app-input">
                <div className="form-group">
                    <label htmlFor={'sampleId'} className="form-label">Sample ID</label>
                    <input id='sampleId' type="text" onChange={(e) => {
                        this.updateValue('sampleId', e.target.value)
                    }} />
                </div>
                <button onClick={() => { this.onAddClick() }}>Submit</button>
            </div>
        );
    }
}

export default Input;
