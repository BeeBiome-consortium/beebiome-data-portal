import React from 'react';
import ReactGA from "react-ga";
import MarkdownPage from "../markdown/markdown";

class WikiPage extends React.Component {
    
    constructor(props, key) {
        super();
        this.state = {
            page: props.location.pathname
        };
    }
    
    componentDidMount() {
        ReactGA.pageview(window.location.pathname + window.location.search);
    }

    render() {
        return (
            <MarkdownPage relativePath={this.state.page}/>
        );
    }
}
export default WikiPage;