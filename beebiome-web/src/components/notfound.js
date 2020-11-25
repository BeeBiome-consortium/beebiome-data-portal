import React from 'react'
import ReactGA from "react-ga";

class Notfound extends React.Component {

    componentDidMount() {
        ReactGA.pageview(window.location.pathname + window.location.search);
    }

    render() {
        return <div>
            <h1>404 - Page not found</h1>
            <div className={'row'}>
                <div className={'col-sm-10 offset-sm-1'}>
                    <p>Sorry, but the page you were trying to view does not exist.</p>
                    <p>It looks like this was the result of either:
                        <ul>
                            <li>a mistyped address</li>
                            <li>an out-of-date link</li>
                        </ul>
                    </p>
                </div>
            </div>
        </div>;
    }
}

export default Notfound
