import React, { useState } from 'react';
import  ReactDOM from 'react-dom';
import Model from './Model';
import styles from "./form.module.css";

const Port = () => {
    let [click,setClick]=useState(false);
    let changeState=()=>{
        setClick(!click);
    }
  return (
     // ReactDOM.createPortal(<h1>hello</h1>,document.getElementById("portals"))   
    //ReactDOM.createPortal(<Model/>,document.getElementById("portals"))
    <div>
        {click?ReactDOM.createPortal(<Model/>,document.getElementById("portals")):""}
        <button className={click?styles.cancel:styles.signin} onClick={changeState}>
            {click?document.className="cancel":document.className="signin"}
        </button>
    </div> 
  )
}

export default Port