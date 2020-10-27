import React, {Component} from 'react';
import './markdown.css';
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

        fetch(process.env.REACT_APP_API_URL + "/contents/" + this.props.location.pathname)
            .then(results => { return results.text()} )
            .then(text => {
                this.setState({content: text});
            })
            .catch(function(error) {
                // FIXME manage catched error
                console.log('Fetch data: failed', error)
            });

        
    }

    componentDidUpdate() {
        let tables = document.getElementsByTagName("table");
        Array.from(tables).forEach(table => {
            table.classList.add("table")
            table.classList.add("table-striped")
            table.classList.add("table-hover")
            table.classList.add("table-sm")
            table.classList.add("table-bordered")
            table.classList.add("markdown-table")
        })

    }
    
    render() {
        return (
            <div className={'row'}>
                <Markdown className={'col-sm-10 offset-sm-1'}>{this.state.content}</Markdown>
            </div>);
    }
}