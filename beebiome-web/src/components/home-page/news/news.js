import React from 'react';
import './news.css';
import { TwitterTimelineEmbed } from 'react-twitter-embed';

const News = () => {
    return (
        <section className="beebiome-news">
            <h2>News</h2>
            <div className="twitter-embed">
                <TwitterTimelineEmbed sourceType="profile" screenName="BeeMicrobiome"
                                      options={{tweetLimit: "5", lang: "en", dnt: "true", cards: "hidden"}}
                />
            </div>
        </section>
    );
};

export default News;
