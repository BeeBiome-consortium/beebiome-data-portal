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