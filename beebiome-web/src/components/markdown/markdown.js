import React, {Component} from 'react';
import Markdown from 'markdown-to-jsx';
import ReactGA from "react-ga";

export default class MarkdownPage extends Component {
    
    constructor(props) {
        super(props);
        this.state = {
            content: ''
        };
    }
    
    componentDidMount() {
        ReactGA.pageview(window.location.pathname + window.location.search);

        fetch(process.env.REACT_APP_API_URL + "contents/" + this.props.location.pathname)
            .then(results => { return results.text()} )
            .then(text => {
                this.setState({content: text});
            })
            .catch(function(error) {
                // FIXME manage catched error
                console.log('Fetch data: failed', error)
            });
    }
    
    render() {
        return (
            <div className={'row'}>
                <Markdown className={'col-sm-10 offset-sm-1'}>{this.state.content}</Markdown>
            </div>);
    }
}