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

                    <p>This privacy notice explains what personal data are collected by the specific service
                        you are requesting, for what purposes, how they are processed, and how we keep them secure.</p>

                    <h2>Who controls your personal data and how to contact us?</h2>
                    <dl>
                        <dt>The BeeBiome data controller's contacts</dt>

                        <dd>
                            Benjamin Dainat, BeeBiome Principal Investigator at Agroscope (
                            <Obfuscate email={process.env.REACT_APP_EMAIL_PI1}
                                       headers={{subject: '[beebiome data  portal] '}}>e-mail</Obfuscate>)<br />
                            Département fédéral de l’économie, de la formation et de la recherche DEFR<br />
                            Agroscope, Schwarzenburgstrasse 161, CH - 3003 Berne Switzerland
                        </dd>

                        <dd>Philipp Engel, BeeBiome Principal Investigator and Professor at University of Lausanne (
                            <Obfuscate email= {process.env.REACT_APP_EMAIL_PI2}
                                       headers={{subject: '[beebiome data  portal] '}}>e-mail</Obfuscate>)<br />
                            Department of Fundamental Microbiology<br />
                            University of Lausanne, 1015 Lausanne, Switzerland
                        </dd>
                    </dl>
                    <dl>
                        <dt>The University of Lausanne Data Protection Officer's contact</dt>
                        <dd>Gwenaëlle Gilliéron, Responsable Service Juridique (
                            <Obfuscate email= {process.env.REACT_APP_DPO_UNIL}>e-mail</Obfuscate>)<br />
                            Service Juridique, University of Lausanne, 1015 Lausanne, Switzerland</dd>
                    </dl>
                    <dl>
                        <dt>The Agroscope Protection Officer's contact</dt>
                        <dd>DPO Agroscope (
                            <Obfuscate email= {process.env.REACT_APP_DPO_AGROSCOPE}>e-mail</Obfuscate>)<br />
                            Address DPO Agroscope</dd>
                    </dl>

                    <h2>Which is the lawful basis for processing personal data?</h2>
                    <p>Processing your personal data is necessary for our legitimate interests in
                        providing services to you, to help improve our resources and for the purposes
                        of day-to-day running of the BeeBiome data portal and underlying infrastructure.</p>

                    <h2>What personal data is collected from users of the service? How do we use these personal data?</h2>
                    <p>The personal data collected from the services listed below is as follows:</p>
                    <ul>
                        <li>Website and API</li>
                        <li>IP address</li>
                        <li>Email address</li>
                        <li>Date and time of a visit to the service</li>
                        <li>Operating system</li>
                        <li>Browser</li>
                        <li>Amount of data transmitted</li>
                        <li>Help desk</li>
                        <li>Name</li>
                        <li>Email address</li>
                    </ul>
                    <p>The data controller will use your personal data for the following purposes:</p>
                    <ul>
                        <li>To provide the user access to the service</li>
                        <li>To answer questions from users</li>
                        <li>To better understand the needs of the users and guide future improvements of the service</li>
                        <li>To create anonymous usage statistics</li>
                        <li>To conduct and monitor data protection activities</li>
                        <li>To conduct and monitor security activities</li>
                    </ul>

                    <h2>Who will have access to your personal data?</h2>
                    <p>Personal data will only be disclosed to authorized staff of BeeBiome.
                        Your personal data are stored internally and not exposed to third parties or countries.
                        IP addresses are removed from log files or anonymized before being stored in case they are needed.</p>

                    <h2>Will your personal data be transferred to third parties/countries (i.e. countries not part of EU/EAA) and/or international organisations?</h2>
                    <p>There are no personal data transfers to international organisations outside of BeeBiome.</p>
                    <p>BeeBiome uses Google Analytics as a third-party analytics service to collect information
                        about website performance and how users navigate through and use our site to help us
                        design better interfaces. We do not use Google Analytics to track you individually
                        or collect personal data. Personal data send to Google Analytics are anonymized upstream.</p>

                    <h2>How long do we keep your personal data?</h2>
                    <p>Any personal data directly obtained from you will be retained as long as the service is live,
                        even if you stop using the service. We will keep the personal data for the minimum
                        amount of time possible to ensure legal compliance and to facilitate internal
                        and external audits if they arise.</p>
                    <p>Most data are kept maximum 24 months (26 months for Google Analytics statistics).</p>
                    <p>Only help desk data are kept longer.</p>

                    <h2>Cookies</h2>
                    <p>The user is informed that cookies may be stored on the hard drive of his/her/its computer
                        to record information about his/her/its visits to this portal.</p>
                    <p>Cookies are used to identify the user and to facilitate and customize this portal's
                        use by memorizing certain parameters. Cookies are used, in particular,
                        to obtain information on the visits to the pages of this portal and
                        the date and time of consultation.</p>
                    <p>The user can at any time prevent the recording and storage of cookies on
                        her/his/its computer by disabling the option in her/his/its browser. However,
                        some features of this portal may require the mandatory use of cookies
                        (customization, warnings, etc.). Otherwise the use of this portal may be impaired
                        or even impossible.</p>

                    <h2>The joint Data Controllers provide these rights regarding your personal data</h2>
                    <p>You have the right to:</p>
                    <ol>
                        <li>Not be subject to decisions based solely on an automated processing of data
                            (i.e. without human intervention) without you having your views taken into consideration.</li>
                        <li>Request at reasonable intervals and without excessive delay or expense,
                            information about the personal data processed about you. Under your request
                            we will inform you in writing about, for example, the origin of the personal
                            data or the preservation period.</li>
                        <li>Request information to understand data processing activities when the results
                            of these activities are applied to you.</li>
                        <li>Object at any time to the processing of your personal data unless we can demonstrate
                            that we have legitimate reasons to process your personal data.</li>
                        <li>Request free of charge and without excessive delay rectification or erasure
                            of your personal data if we have not been processing it respecting the data
                            protection policies of the respective controllers.</li>
                        <li>Requests and objections can be sent using 'Contact us' link in the footer of this page.</li>
                    </ol>
                    <p>It must be clarified that rights 4 and 5 are only available whenever
                        the processing of your personal data is not necessary to:</p>
                    <ul>
                        <li>Comply with a legal obligation.</li>
                        <li>Perform a task carried out in the public interest.</li>
                        <li>Exercise authority as a data controller.</li>
                        <li>Archive for purposes in the public interest, or for historical research purposes, or for statistical purposes.</li>
                        <li>Establish, exercise or defend legal claims.</li>
                    </ul>
                    <p>Additional terms: privacy policy</p>
                </div>
            </div>);
    }
}