import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min';
import React from 'react';
import ReactDOM from 'react-dom';
import ReactGA from 'react-ga';
import {BrowserRouter as Router, Link, Route, Switch} from 'react-router-dom'
import './index.css';
import * as serviceWorker from './serviceWorker';
import HomePage from "./components/home-page/home-page";
import Browse from "./components/browse/browse";
import Notfound from "./components/notfound";
import Search from "./components/search/search";
import Header from "./components/navs/header";
import Footer from "./components/navs/footer";
import CookieConsent from "react-cookie-consent";
import MarkdownPage from "./components/markdown/markdown";
import PrivacyNotice from "./components/privacy-notice/privacy-notice";

const routing = (
    <Router basename={process.env.REACT_APP_ROUTER_BASE || ''}>
        <Header />
        <Switch>
            <Route exact path="/" component={HomePage} />
            <Route path="/browse" component={Browse} />
            <Route path="/search" component={Search} />
            <Route path='/wiki/:page' component={(props) => <MarkdownPage {...props} key={window.location.pathname} />} />
            <Route exact path="/about/privacy-notice" component={PrivacyNotice} />
            <Route path='/help/:page' component={(props) => <MarkdownPage {...props} key={window.location.pathname} />} />
            <Route path="/about/:page" component={(props) => <MarkdownPage {...props} key={window.location.pathname} />} />
            <Route path="/consortium/:page" component={(props) => <MarkdownPage {...props} key={window.location.pathname} />} />
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

const isLocalhost = Boolean(
    window.location.hostname === 'localhost' ||
    // [::1] is the IPv6 localhost address.
    window.location.hostname === '[::1]' ||
    // 127.0.0.1/8 is considered localhost for IPv4.
    window.location.hostname.match(
        /^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/
    )
);
ReactGA.initialize("UA-180272382-1", {
    testMode: isLocalhost,
    gaOptions: {
        cookieFlags: "SameSite=None; Secure",
        cookieExpires: "7200"
    }
});

ReactGA.pageview(window.location.pathname + window.location.search);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
