import React from 'react';

export default function SearchBar() {
    let action = "/browse";
    if (process.env.REACT_APP_ROUTER_BASE) {
        action = process.env.REACT_APP_ROUTER_BASE + "/browse";
    }
    return (
        <form className="form-inline search-bar mt-3" action={action}>
            <div className="form-row align-items-center">
                <div className="col-auto">
                    <input type="text" className="form-control form-control-sm mb-2"
                           name="search_query" />
                </div>
                <div className="col-auto">
                    <button type="submit" className="btn btn-sm btn-light mb-2">Basic search</button>
                </div>
            </div>
        </form>
    );
}
