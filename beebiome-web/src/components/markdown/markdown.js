import React, {Component} from 'react';
import './markdown.css';
import Markdown from 'markdown-to-jsx';
import Notfound from "../notfound";
import ChangePageTitle from "../change-page-title";

export default class MarkdownPage extends Component {
    
    constructor(props) {
        super(props);
        this.state = {
            content: null,
            errorMessage: null
        };
    }
    
    componentDidMount() {
        this.setState({content: null, errorMessage: null});

        fetch(process.env.REACT_APP_API_URL + "/contents" + this.props.location.pathname)
            .then(results => {
                if (!results.ok) {
                    this.setState({errorMessage: "Fail to get data from BeeBiome API"});
                    return null;
                }
                return results.text()} )
            .then(text => {
                this.setState({content: text});
            })
            .catch(function(error) {
                this.setState({errorMessage: error});
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
        let id = this.props.location.pathname.replaceAll("/", "-").substring(1);
        let text = "";
        if (this.state.errorMessage == null && this.state.content != null) {
            let title = "BeeBiome - " + this.state.content.substring(this.state.content.search(/[A-Za-z]/), this.state.content.search(/\n/));
            text =
                <div id={id} className={'row markdown-page'}>
                    <ChangePageTitle pageTitle={title} />
                    <Markdown className={'col-sm-10 offset-sm-1'}>{this.state.content}</Markdown>
                </div>
        } else if (this.state.errorMessage != null) {
            text = <Notfound />
        }
        return <div>{text}</div>
    }
}