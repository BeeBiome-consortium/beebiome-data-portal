import React from "react";
import './footer.css';
import Obfuscate from 'react-obfuscate';

class Footer extends React.Component {
    render() {
        return (
            <footer id="beebiome-footer">
                <nav className="navbar navbar-expand navbar-dark bg-dark fixed-bottom">
                    <div className="collapse navbar-collapse">
                        <ul className="nav navbar-nav navbar-right ml-auto">
                            <li className="nav-item">
                                {/*<button onClick={displayContactUs} >Perform action</button>*/}
                                <Obfuscate email={process.env.REACT_APP_CONTACT_MAIL}
                                           headers={{subject: '[beebiome data  portal] '}}
                                >
                                    <p>Contact us</p>
                                </Obfuscate>
                            </li>
                        </ul>
                    </div>
                </nav>
            </footer>
        );
    }
}

export default Footer;
