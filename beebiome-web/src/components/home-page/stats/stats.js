import React from 'react';
import Loading from "../../result/loading";

export default class Stats extends React.Component {

    constructor() {
        super();
        this.state = {
            data: null,
            isLoaded: false,
            errorMessage: null
        };
    }

    componentDidMount() {
        let self = this;
        self.setState({data: null, isLoaded: false, errorMessage: null});

        fetch(process.env.REACT_APP_API_URL + "/statistics/all")
            .then(results => { return results.json()} )
            .then(data => {
                self.setState({data: data, isLoaded: true, errorMessage: null});
            })
            .catch(function(error) {
                self.setState({errorMessage: "Failed to get data from API."});
            });
    }

    render() {
        let text = "";
        if (this.state.isLoaded) {
            let tmp = "BeeBiome contains " + this.state.data.sampleCount + " BioSamples (unique entries), " +
                "encompassing " + this.state.data.projectCount + " Bioprojects " +
                "and " + this.state.data.experimentCount + " SRA experiments. " +
                "This represents data for " + this.state.data.hostCount + " Apoidea hosts. " +
                "The current release was updated on " + this.state.data.releaseVersion.date + "."
            text = <p>{tmp}</p>
        } else if (this.state.errorMessage !== null) {
            text = <p>{this.state.errorMessage}</p>
        } else {
            text = <Loading/>
        }

        return (
            <section className="beebiome-stats">
                <h2>Statistics</h2>
                {text}
            </section>
        );
    }
}

 