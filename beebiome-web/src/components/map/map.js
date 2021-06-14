import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';

import React, {Component} from 'react';
import ReactGA from "react-ga";

export default class WorldMap extends Component {
    constructor() {
        super();
        this.state = {
            marks: null,
            isLoaded: false,
            errorMessage: null
        };
    }

    componentDidMount() {
        ReactGA.pageview(window.location.pathname + window.location.search);
        let self = this;
        self.setState({data: null, isLoaded: false, errorMessage: null});
        fetch(process.env.REACT_APP_API_URL + "/sample/all")
            .then(results => { return results.json()} )
            .then(entities => {
                var marks = {};
                var entitycount = 0;
                for (const entity of entities) {
                    if (entity.geoLocation && entity.geoLocation.latitude && entity.geoLocation.longitude) {
                        let key = entity.geoLocation.latitude + "_" + entity.geoLocation.longitude
                        if (!marks[key]) {
                            marks[key] = [];
                        }
                        marks[key].push({name:entity.biosampleAcc, geoLocName: entity.geoLocation.name,
                            geoLocLat : entity.geoLocation.latitude, geoLocLong: entity.geoLocation.longitude});
                    }
                    entitycount ++;
                }
                if (marks.length === 0 ) {
                    marks = null;
                }
                self.setState({data: marks, isLoaded: true, errorMessage: null});
            })
            .catch(function(error) {
                self.setState({errorMessage: "Failed to get data from API."});
            });
    }

    render() {
        var markers = [];
        if (this.state.isLoaded && this.state.data) {
            let marks = this.state.data;
            for (const key in marks) {
                markers.push(<Marker key={key} position={[marks[key][0].geoLocLat, marks[key][0].geoLocLong]}>
                                <Popup>{marks[key].length} BioSample(s)<br />{marks[key][0].geoLocName}</Popup>
                             </Marker>);
            }
        }

        return (
            <div className={'row'}>
                <div className={'col-sm-10 offset-sm-1'}>
                    <h1>Datasets on map</h1>
                    <div className="map_container">
                        <MapContainer center={[0, 0]} zoom={2} className={'col-sm-12'} style={{ height: "680px" }}>
                            <TileLayer
                                attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
                                url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                            />
                            {markers}
                        </MapContainer>
                    </div>
                </div>
            </div>);
    }
}

