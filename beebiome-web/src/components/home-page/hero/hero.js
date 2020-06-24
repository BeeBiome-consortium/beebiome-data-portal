import React from 'react';
import './hero.css';
import logo from '../../../assets/images/beebiome_logo.png';
import SearchBar from "./search-bar";

function Hero() {
  return (
      <div className="beebiome-hero">
          <img src={logo} className="beebiome-logo  m-2" alt="logo" />
          <SearchBar />
      </div>
  );
}

export default Hero;
