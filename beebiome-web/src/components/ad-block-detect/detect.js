import React, { Component } from 'react';

function detected () {
    const className = 'twitter-timeline';
    let blockedElement = document.querySelector('.' + className);
    if (!blockedElement) {
        blockedElement = document.createElement('div');
        blockedElement.className = className;
        blockedElement.setAttribute('style', 'position: absolute; top: -10px; left: -10px; width: 1px; height: 1px;');
        document.body.appendChild(blockedElement);
    }

    return window.document.body.getAttribute('abp') != null ||
        blockedElement.offsetParent == null ||
        blockedElement.offsetHeight === 0 ||
        blockedElement.offsetLeft === 0 ||
        blockedElement.offsetTop === 0 ||
        blockedElement.offsetWidth === 0 ||
        blockedElement.clientHeight === 0 ||
        blockedElement.clientWidth === 0
}

class AdBlockDetect extends Component {
    constructor() {
        super();
        this.state = {
            detected: false
        }
    }

    componentDidMount() {
        this.setState({
            detected: detected()
        });
    }

    render() {
        return this.state.detected ?
            <p>We have detected that your are using an ad blocker. To see our news, you must deactivate it.</p>
            : null
    }
}

export default AdBlockDetect;