import React, {Component} from 'react';
import ReactGA from "react-ga";
import Obfuscate from "react-obfuscate";

export default class PrivacyNotice extends Component {

    componentDidMount() {
        ReactGA.pageview(window.location.pathname + window.location.search);
    }

    render() {
        return (
            <div className={'row'}>
                <div className={'col-sm-10 offset-sm-1'}>
                    <h1>BeeBiome privacy notice</h1>

                    <p>The University of Lausanne is committed to the privacy of individuals whose personal data are processed at one time or another for the purpose of their relationship with the University.</p>
                    <p>Article 15 of the Constitution of the Canton of Vaud (Cst-VD; BLV 101.01) and the cantonal Act of 11 September 2007 on personal data protection (LPrD; BLV 172.65) provide that everyone has the right to protection of their privacy and to be protected from unlawful use of their personal data.</p>
                    <p>The University of Lausanne complies with these requirements in its capacity as a processor.
                        As data controller when using BeeBiome, the Department of Fundamental Microbiology of the Faculty of Biology and Medicine of UNIL respects these prerogatives.</p>
                    <p>By using this website, you signify that you have read this privacy policy and agree to our processing your personal data as described in this privacy policy.</p>
                    <p>This policy concerns the processing of your data collected as a user of the website https://beebiome.org/.</p>
                    <p>This policy is dated May, 2021. However, it is likely to be updated on a regular basis; if so, you will be informed via the website https://beebiome.org/. Any use of our services after this notification has been published will be deemed acceptance of the latest version of this policy.</p>

                    <h2>What is meant by personal data?</h2>
                    <p>Personal data are any data that can be used to identify an individual. These data may be able to identify you directly (for example, your last name and first name, e-mail address or OASI (Old Age and Survivors' Insurance) number or indirectly, by cross-referencing various kinds of information about you (for example, your computer's IP address, your credit card number or your phone number).</p>

                    <h2>What type of personal data is collected by BeeBiome?</h2>
                    <p>The list below provides a summary of the type of data we collect:</p>
                    <ul>
                        <li>IP address</li>
                        <li>Email address</li>
                        <li>Name</li>
                    </ul>

                    <h2>What are the reasons for which we might process it?</h2>
                    <p>Your personal data are processed by BeeBiome for the following purposes:</p>
                    <ul>
                        <li>To provide the user access to the service</li>
                        <li>To answer questions from users</li>
                        <li>To better understand the needs of the users and guide future improvements of the service</li>
                        <li>To conduct and monitor data protection activities</li>
                        <li>To conduct and monitor security activities</li>
                    </ul>
                    <p>The processing of your data indicated above is necessary to fulfil the public duties incumbent on the University of Lausanne, in particular the development of science through teaching and research.</p>
                    <p>Data analyzes are carried out to find out the characteristics of BeeBiome users. These are however carried out on fully anonymized data.</p>

                    <h2>With whom do we share your data?</h2>
                    <p>The data you communicate to us may be shared between the various departments of the University of Lausanne.</p>
                    <p>Your personal data are not communicated abroad or to third parties. <strong>Your data will not be sold to third parties under any circumstances, and in particular, for marketing or promotional purposes</strong>.</p>
                    <p>BeeBiome may also be required to disclose your data in order to fulfil its statutory obligations, in response to a request from a judicial or administrative authority or in accordance with its statutory obligations or in relation to legal proceedings.</p>

                    <h2>How does BeeBiome protect your data?</h2>
                    <p>We do our utmost to ensure the security of your data and avoid any inappropriate access, use, modification or disclosure of your personal information. We also do our utmost to ensure that any third party to whom your data are process them securely to ensure their confidentiality and integrity.</p>
                    <p>BeeBiome is stored on a secure University of Lausanne's server. Our website use TLS certificates authenticated by a third party to guarantee the confidentiality of the data exchanged, in particular during the delivery of an online service. These certificates also provide a means of checking that your computer is communicating correctly with the server. IP addresses are removed from log files or anonymized before being stored in case they are needed.</p>


                    <h2>Cookies</h2>
                    <p>The user is informed that cookies may be stored on the hard drive of his/her/its computer to record information about his/her/its visits to this portal. Cookies are used to identify the user and to facilitate and customize this portal's use by memorizing certain parameters. Cookies are used, in particular, to obtain information on the visits to the pages of this portal and the date and time of consultation.</p>
                    <p>The user can at any time prevent the recording and storage of cookies on her/his/its computer by disabling the option in her/his/its browser. However, some features of this portal may require the mandatory use of cookies (customization, warnings, etc.). Otherwise, the use of this portal may be impaired or even impossible.</p>
                    <p>BeeBiome uses Google Analytics as a third-party analytics service to collect information about website performance and how users navigate through and use our site to help us design better interfaces. The list below provides a summary of the type of data Google Analytics collects:</p>
                    <ul>
                        <li>Geographical origin</li>
                        <li>Pages viewed and behavior flow</li>
                        <li>Date and time of a visit to the service</li>
                        <li>Operating system</li>
                        <li>Browser</li>
                    </ul>
                    <p>We do not use Google Analytics to track you individually or collect personal data. Personal data send to Google Analytics are anonymized upstream.</p>

                    <h2>How long do we keep your personal data?</h2>
                    <p>Personal data are destroyed or made anonymous as soon as it is no longer necessary for the purpose for which they were collected.</p>

                    <h2>How to modify and delete your personal data?</h2>
                    <p>In accordance with Article 25 LPrD, anyone may ask to see the data it holds on them and, if necessary, request that they are updated, rectified or erased.</p>
                    <p>Any requests of this kind should be sent by e-mail to:</p>
                    <p>
                        Philipp Engel, BeeBiome Principal Investigator and Professor at University of Lausanne (
                        <Obfuscate email= {process.env.REACT_APP_PI1_EMAIL}
                                   headers={{subject: '[beebiome data portal] Privacy notice'}}>e-mail</Obfuscate>)<br />
                        Department of Fundamental Microbiology<br />
                        University of Lausanne, 1015 Lausanne, Switzerland
                    </p>

                    <h2>Contact</h2>
                    <p>You can contact the BeeBtiome team with any questions you may have about this policy by sending an&nbsp;
                        <Obfuscate email= {process.env.REACT_APP_CONTACT_EMAIL}
                                   headers={{subject: '[beebiome data portal] Privacy notice'}}>e-mail</Obfuscate>.</p>

                    <p>Additional terms: privacy policy</p>
                </div>
            </div>);
    }
}