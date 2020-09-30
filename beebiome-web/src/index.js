import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min';
import React from 'react';
import ReactDOM from 'react-dom';
import {BrowserRouter as Router, Link, Route, Switch} from 'react-router-dom'
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
import CookieConsent from "react-cookie-consent";

const routing = (
    <Router basename={process.env.REACT_APP_ROUTER_BASE || ''}>
        <Header />
        <Switch>
            <Route exact path="/" component={HomePage} />
            <Route path="/browse" component={Browse} />
            <Route path="/search" component={Search} />
            <Route path="/wiki" component={Wiki} />
            <Route path="/about/data-portal" component={About} />
            <Route path="/about/consortium" component={Consortium} />
            <Route path="/about/citing-beebiome" component={Citation} />
            <Route path="/about/privacy-notice" component={PrivacyNotice} />
            <Route component={Notfound} />
        </Switch>
        <Footer />
        <CookieConsent
            location="bottom"
            buttonText="Do not show this banner again"
            cookieName="beebiome-privacy-policy"
            cookieValue="1"
            style={{ backgroundColor: "rgba(0, 0, 0, 0.8)" }}
            buttonStyle={{ color: "#4e503b", fontSize: "13px" }}
            expires={365}
            sameSite={"strict"}
        >
            This website requires cookies, and limited processing of your personal data in order to function.
            By using the site you are agreeing to this as outlined in our <Link to="/about/privacy-notice">privacy notice</Link>.
        </CookieConsent>
        {/*<CookieConsent>This website uses cookies to enhance the user experience.</CookieConsent>*/}

    </Router>
);

ReactDOM.render(routing, document.getElementById('beebiome-body'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
