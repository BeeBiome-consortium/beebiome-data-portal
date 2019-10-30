import React from 'react';
import './home-page.css';
import Hero from "./hero/hero";
import Intro from "./intro/intro";
import News from "./news/news";
import Stats from "./stats/stats";

export default function HomePage() {
    return ( 
        <main>
            <Hero />
            <div className="row beebiome-section">
                <div className="col-md-4">
                    <Intro />
                </div>
                <div className="col-md-4">
                    <Stats className="col-md-4" />
                </div>
                <div className="col-md-4">
                    <News className="col-md-4" />
                </div>
            </div>
        </main>
    );
}

{/*<div className="row">*/}
{/*    <div className="col-md-4">*/}
{/*        <h2>Heading</h2>*/}
{/*        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus*/}
{/*            commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam*/}
{/*            porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>*/}
{/*        <p><a className="btn btn-secondary" href="#" role="button">View details »</a></p>*/}
{/*    </div>*/}
{/*    <div className="col-md-4">*/}
{/*        <h2>Heading</h2>*/}
{/*        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus*/}
{/*            commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam*/}
{/*            porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>*/}
{/*        <p><a className="btn btn-secondary" href="#" role="button">View details »</a></p>*/}
{/*    </div>*/}
{/*    <div className="col-md-4">*/}
{/*        <h2>Heading</h2>*/}
{/*        <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam.*/}
{/*            Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus*/}
{/*            commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>*/}
{/*        <p><a className="btn btn-secondary" href="#" role="button">View details »</a></p>*/}
{/*    </div>*/}
{/*</div>*/}