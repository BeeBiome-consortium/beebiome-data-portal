import React from 'react'

const DataTable = ({ data }) => {
    return (
        <div>
            {data.map((d) => (
                <div key={d.id}>
                    <h5>Hello ID {d.id}! </h5>
                    <p>Your content: {d.content}</p>
                </div>
            ))}
        </div>
    )
};

export default DataTable
