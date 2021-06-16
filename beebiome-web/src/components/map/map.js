import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';

import React, {Component} from 'react';

export default class WorldMap extends Component {
    constructor() {
        super();
        this.state = {
            markGroups: null,
            samplesWithoutCoord: null
        };
    }

    componentDidMount() {
        var markGroups = {};
        var samplesWithoutCoord = [];
        for (const entity of this.props.data) {
            if (entity.geoLocation && entity.geoLocation.latitude && entity.geoLocation.longitude) {
                let {key, obj} = this.getLocationFromEntity(entity);
                if (!markGroups[key]) {
                    markGroups[key] = [];
                }
                markGroups[key].push(obj);
            } else {
                samplesWithoutCoord.push(entity.biosampleAcc);
            }
        }
        if (markGroups.length === 0 ) {
            markGroups = null;
        }
        if (samplesWithoutCoord.length === 0 ) {
            samplesWithoutCoord = null;
        }
        this.setState({markGroups: markGroups, samplesWithoutCoord: samplesWithoutCoord});
    }

    getLocationFromEntity(entity) {
        let key = entity.geoLocation.latitude + "_" + entity.geoLocation.longitude
        let obj = {
            name: entity.biosampleAcc, geoLocName: entity.geoLocation.name,
            geoLocLat: entity.geoLocation.latitude, geoLocLong: entity.geoLocation.longitude
        };
        return {key, obj};
    }
    
    getLocationFromSearch(acc, name, x, y) {
        let key = x + "_" + y
        let obj = {name: acc, geoLocName: name, geoLocLat: x, geoLocLong: y};
        return {key, obj};
    }

    render() {
        var markers = [];

        if (this.state.markGroups) {
            let markGroups = this.state.markGroups;
            for (const key in markGroups) {
                var popupText = <Popup>{markGroups[key][0].name}</Popup>;
                if (markGroups[key].length > 1) {
                    popupText = <Popup>{markGroups[key].length} BioSample(s)</Popup>;
                }
                markers.push(
                    <Marker key={key}
                            position={[markGroups[key][0].geoLocLat, markGroups[key][0].geoLocLong]}>
                        {popupText}
                    </Marker>);
            }
        }

        var noCoordSamples = "";
        if (this.state.samplesWithoutCoord) {
            if(this.state.samplesWithoutCoord.length === 1) {
                noCoordSamples = <p>There is 1 BioSample without precise geo. coordinates: {this.state.samplesWithoutCoord}</p>;    
            } else {
                noCoordSamples = <div>
                    <p>There are {this.state.samplesWithoutCoord.length} BioSamples without precise geo. coordinates&nbsp;
                        <a data-toggle="collapse"
                           href="#samplesWithoutCoord" role="button" aria-expanded="false"
                           aria-controls="samplesWithoutCoord">
                            see BioSample accessions
                        </a>

                    </p>
                    <div id="samplesWithoutCoord" className="collapse">
                        <div className="card card-body mb-3">
                            {this.state.samplesWithoutCoord.join(', ')}
                        </div>
                    </div>
                </div>
            }
        }
        return (
            <div className="map_container">
                {noCoordSamples}
                <MapContainer center={[0, 0]} zoom={2} className={'col-sm-12'} style={{ height: "60vh" }}>
                    <TileLayer
                        attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
                        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                    />
                    {markers}
                </MapContainer>
            </div>);
    }
}

