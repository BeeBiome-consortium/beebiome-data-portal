import React from 'react';
import cc0_logo from "../../assets/images/cc-zero_logo.png";

export default function Copyright() {
    let link = "/about/citing-beebiome";
    if (process.env.REACT_APP_ROUTER_BASE) {
        link = process.env.REACT_APP_ROUTER_BASE + link;
    }

    return <div className={"copyright"}>
        <p>
            This work is published under the <a
            href={"https://creativecommons.org/publicdomain/zero/1.0/"}
            target='_blank' rel='noopener noreferrer'>
            Creative Commons Zero license (CC0)</a> from Switzerland.
            Although CC0 doesn’t legally require users of the data to cite the source,
            if you intend to use data from BeeBiome, it would be nice to cite us (see <a
            href={link}>Citing us</a> page).
        </p>
        <a rel="license noopener noreferrer" target="_blank"
           href="https://creativecommons.org/publicdomain/zero/1.0/">
            <img src={cc0_logo} alt="CC0"/>
        </a>
    </div>;
}
