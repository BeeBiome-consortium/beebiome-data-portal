import React from 'react';
import './hero.css';
import logo from '../../../assets/images/beebiome_logo_complete.jpg';

function Hero() {
  return (
      <div className="beebiome-hero">
          <img src={logo} className="beebiome-logo" alt="logo" />
      </div>
  );
}

export default Hero;
