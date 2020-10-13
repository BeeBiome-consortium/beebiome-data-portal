import React from "react";
import './footer.css';
import cc0_logo from '../../assets/images/cc-zero_logo.png';

function Footer() {
    return (
        <footer id="beebiome-footer">
            <nav className="navbar navbar-expand navbar-dark bg-dark fixed-bottom">
                <div className="collapse navbar-collapse">
                    <ul className="navbar-nav mr-auto">
                        <li className="nav-item">
                            {/*Using target="_blank" without rel="noopener noreferrer" is a security risk: see https://mathiasbynens.github.io/rel-noopener*/}
                            <a rel="license noopener noreferrer"
                               href="https://creativecommons.org/publicdomain/zero/1.0/"
                               target="_blank">
                                <img src={cc0_logo} alt="CC0" />
                            </a>
                        </li>
                    </ul>
                    <ul className="nav navbar-nav navbar-right">
                        <li className="nav-item">
                            <a href="javascript:location='mailto:\u0063\u006f\u006e\u0074\u0061\u0063\u0074\u0040\u0062\u0065\u0065\u0062\u0069\u006f\u006d\u0065\u002e\u006f\u0072\u0067';void 0">Contact us</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </footer>
    );
}

export default Footer;
