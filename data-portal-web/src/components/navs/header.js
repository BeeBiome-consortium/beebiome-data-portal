import React from "react";
import { Link } from "react-router-dom";
import './header.css';
import Logo from "../../assets/images/beebiome_logo_light.png";

function Header() {
    return (
        <header>
            <nav id="beebiome-header" className="navbar navbar-expand-md navbar-light fixed-top">
                <button className="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarCollapse" aria-controls="navbarCollapse"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"/>
                </button>
                <Link to="/" className="navbar-brand" href="#">
                    <img src={Logo} className="d-inline-block align-top" alt="logo"/>
                    <span className="beebiome-name">BeeBiome</span>
                </Link>
                <div className="collapse navbar-collapse" id="navbarCollapse">
                    <ul className="navbar-nav mr-auto">
                        <li className="nav-item">
                            <Link to="/browse" className="nav-link">Browse</Link>
                        </li>
                        <li className="nav-item">
                            <Link to="/search" className="nav-link">Search</Link>
                        </li>
                        <li className="nav-item">
                            <Link to="/wiki" className="nav-link">Wiki</Link>
                        </li>
                        <li className="nav-item dropdown">
                            <a className="nav-link dropdown-toggle" data-toggle="dropdown" href="/"
                               role="button" aria-haspopup="true" aria-expanded="false">About</a>
                            <div className="dropdown-menu">
                                <Link to="/about/data-portal" className="dropdown-item">BeeBiome data portal</Link>
                                <Link to="/about/consortium" className="dropdown-item">BeeBiome consortium</Link>
                                <Link to="/about/citing-beebiome" className="dropdown-item">Citing us</Link>
                                <Link to="/about/privacy-notice" className="dropdown-item">Privacy notice</Link>
                            </div>

                        </li>
                    </ul>
                </div>
            </nav>
        </header>
    );
}
export default Header;
