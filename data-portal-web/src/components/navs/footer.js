import React from "react";
import './footer.css';

function Footer() {
    return (
        <footer id="beebiome-footer">
            <nav className="navbar navbar-expand navbar-dark bg-dark fixed-bottom">
                <div className="collapse navbar-collapse" id="navbarCollapse">
                    <ul className="navbar-nav mr-auto">
                        <li className="nav-item">
                            <a rel="license"
                               href="https://creativecommons.org/publicdomain/zero/1.0/"
                               target="_blank">
                                <img src="https://bgee.org/img/cc-zero.png" alt="CC0" />
                            </a>
                        </li>
                    </ul>
                    <ul className="nav navbar-nav navbar-right">
                        <li className="nav-item">
                            <a href="mailto:null@beebiome.org">Contact us</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </footer>
    );
}

export default Footer;
