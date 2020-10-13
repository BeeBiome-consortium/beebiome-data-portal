import React from 'react';
import ReactGA from "react-ga";

export default class Wiki extends React.Component {

    componentDidMount() {
        ReactGA.pageview(window.location.pathname + window.location.search);
    }

    render() {
        return (
            <h1>Wiki</h1>
        );
    }
}
