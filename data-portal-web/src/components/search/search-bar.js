import React from 'react';

export default function SearchBar() {
    return (
        <div className="container search-bar mt-3">
            <div className="form-group text-center">
                <div className="input-group col-sm-4 m-auto">
                    <input className="form-control form-control-sm" type="text" placeholder="Search..." />
                    <button type="submit" className="btn btn-sm btn-light">Search</button>
                </div>
            </div>
        </div>
    );
}
