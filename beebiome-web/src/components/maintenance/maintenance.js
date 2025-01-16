import React from 'react'
import ChangePageTitle from "../change-page-title";
import './maintenance.css';
import logo from "../../assets/images/beebiome_logo.png";

class Maintenance extends React.Component {

    render() {
        return <div>
            <ChangePageTitle pageTitle="BeeBiome - Maintenance page" />
            <div className={'row'}>
                <div className={'col-4 offset-4 justify-content-center text-center'}>
                    <img src={logo} className="beebiome-logo m-4" alt="logo" />
                    <p className={'font-weight-bold'}>BeeBiome is currently down for maintenance.</p>
                    <p>Thanks for your patience.</p>
                </div>
            </div>
        </div>
            ;
    }
}

export default Maintenance
