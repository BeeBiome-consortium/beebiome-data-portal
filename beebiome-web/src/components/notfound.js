import React from 'react'
import ChangePageTitle from "./change-page-title";

class Notfound extends React.Component {

    render() {
        return <div>
            <ChangePageTitle pageTitle="BeeBiome - Page not found" />
            <h1>404 - Page not found</h1>
            <div className={'row'}>
                <div className={'col-sm-10 offset-sm-1'}>
                    <p>Sorry, but the page you were trying to view does not exist.</p>
                    <p>It looks like this was the result of either:</p>
                    <ul>
                        <li>a mistyped address</li>
                        <li>an out-of-date link</li>
                    </ul>
                </div>
            </div>
        </div>;
    }
}

export default Notfound
