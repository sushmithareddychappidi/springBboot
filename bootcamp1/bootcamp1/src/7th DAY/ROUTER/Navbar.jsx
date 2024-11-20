import React from 'react';
import styles from "./navbar.module.css";
import { NavLink } from 'react-router-dom';

const Navbar = () => {
  return (
    <div className={styles.nav}>
        <NavLink to="/home">Home</NavLink>
        <NavLink to="/products">Products</NavLink>
        <NavLink to="/login">Login</NavLink>
        <NavLink to="/about">About</NavLink>

    </div>
  )
}

export default Navbar