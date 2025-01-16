import React from 'react';
import './home-page.css';
import Hero from "./hero/hero";
import Intro from "./intro/intro";
import Stats from "./stats/stats";

export default function HomePage() {
    return ( 
        <main>
            <Hero />
            <div className="row beebiome-section">
                <div className="col-md-4 offset-md-2">
                    <Intro />
                </div>
                <div className="col-md-4">
                    <Stats className="col-md-4" />
                </div>
            </div>
        </main>
    );
}