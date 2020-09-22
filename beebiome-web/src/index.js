import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min';
import React from 'react';
import ReactDOM from 'react-dom';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import './index.css';
import * as serviceWorker from './serviceWorker';
import HomePage from "./components/home-page/home-page";
import Browse from "./components/browse/browse";
import Notfound from "./components/notfound"
import Wiki from "./components/wiki/wiki";
import Search from "./components/search/search";
import About from "./components/about/about";
import Header from "./components/navs/header";
import Footer from "./components/navs/footer";
import Consortium from "./components/about/consortium";
import Citation from "./components/about/citation";
import PrivacyNotice from "./components/about/privacy-notice";

const routing = (
    <Router basename={process.env.REACT_APP_ROUTER_BASE || ''}>
        <Header />
        <Switch>
            <Route exact path="/" component={HomePage} />
            <Route exact path="/browse" component={Browse} />
            <Route exact path="/search" component={Search} />
            <Route exact path="/wiki" component={Wiki} />
            <Route exact path="/about/data-portal" component={About} />
            <Route exact path="/about/consortium" component={Consortium} />
            <Route exact path="/about/citing-beebiome" component={Citation} />
            <Route exact path="/about/privacy-notice" component={PrivacyNotice} />
            <Route component={Notfound} />
        </Switch>
        <Footer />
    </Router>
);

ReactDOM.render(routing, document.getElementById('beebiome-body'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
