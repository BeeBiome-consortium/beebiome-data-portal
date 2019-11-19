import React, {Component} from 'react';
import Markdown from 'markdown-to-jsx';

export default class MarkdownPage extends Component {
    
    constructor(props) {
        super(props);
        this.state = {
            content: ''
        };
    }
    
    componentDidMount() {
        fetch("http://localhost:8080/contents/" + this.props.relativePath + "?branch=initial-devs")
            .then(results => { return results.text()} )
            .then(text => {
                this.setState({content: text});
                console.log("Fetch text: done", this.state.content);
            })
            .catch(function(error) {
                // FIXME manage catched error
                console.log('Fetch data: failed', error)
                // this.setState((state) => {
                //     return {content: state.content, data: [], hasResult: false, isFetching: false}
                // });
            });
    }
    
    render() {
        return (
            <div className={'row'}>
                <Markdown className={'col-sm-10 offset-sm-1'}>{this.state.content}</Markdown>
            </div>);
    }
}