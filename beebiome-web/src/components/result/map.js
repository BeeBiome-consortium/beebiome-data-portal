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
    
    getBiosampleLink(acc) {
        let url = "https://www.ncbi.nlm.nih.gov/biosample/" + acc;
        return <a href={url} rel="noopener noreferrer" target="_blank">{acc}</a>
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

        return (
            <div className="map_container">
                {this.getNoCoordMessage(this.state.samplesWithoutCoord)}
                <MapContainer center={[20, 20]} zoom={2} className={'col-sm-12'} style={{height: "60vh"}}>
                    <TileLayer
                        attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
                        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                    />
                    {markers}
                </MapContainer>
            </div>);
    }

    getNoCoordMessage(samplesWithoutCoord) {
        if (samplesWithoutCoord) {
            if (this.state.samplesWithoutCoord.length === 1) {
                return <p>There is 1 BioSample without precise geographical coordinates: {this.getBiosampleLink(this.state.samplesWithoutCoord)}</p>;
            } else {
                return <div>
                    <p>There are {this.state.samplesWithoutCoord.length} BioSamples without
                        precise geographical coordinates&nbsp;
                        <a data-toggle="collapse"
                           href="#samplesWithoutCoord" role="button" aria-expanded="false"
                           aria-controls="samplesWithoutCoord">
                            see BioSample accessions
                        </a>

                    </p>
                    <div id="samplesWithoutCoord" className="collapse">
                        <div className="alert alert-warning mb-3">
                            {this.state.samplesWithoutCoord.map((value, index) => {
                                var sep = "";
                                if (index < this.state.samplesWithoutCoord.length - 1) {
                                    sep = ", ";
                                } 
                                return <span key={index}>{this.getBiosampleLink(value)}{sep}</span>
                            })}
                        </div>
                    </div>
                </div>
            }
        }
        return "";
    }
}

