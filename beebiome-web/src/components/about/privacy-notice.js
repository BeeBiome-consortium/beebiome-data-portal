import React from 'react';
import MarkdownPage from "../markdown/markdown";
import ReactGA from "react-ga";

export default class PrivacyNotice extends React.Component {
    
    componentDidMount() {
        ReactGA.pageview(window.location.pathname + window.location.search);
    }

    render() {
        return (
            <MarkdownPage relativePath={'generalities/privacy_notice'}/>
        );
    }
}
