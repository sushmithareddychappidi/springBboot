import React from 'react';
import styles from "./project2.module.css";
import {NavLink} from "react-router-dom";

const NavBar = () => {
  return (
    <div className={styles.nav}>
      <artilcle className={styles.left}>logo</artilcle>
      <article className={styles.right}>
        <NavLink to="/">Products</NavLink>
        <NavLink to="/cart">cart</NavLink>
        <NavLink to="/order">order</NavLink>
        <NavLink to="/checkout">Checkout</NavLink>
      </article>
    </div>
  )
}

export default NavBar