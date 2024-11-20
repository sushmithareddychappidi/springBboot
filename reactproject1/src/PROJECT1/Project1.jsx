import React, { useEffect, useState } from 'react';
import axios from 'axios';
import styles from "./project.module.css";

const Project1 = () => {
    let [barcode,setBarcode]=useState("");
    let [items,setItems]=useState([]);
    let handleChange=(e)=>{
        setBarcode(e.target.value)
    }
    let getProducts=()=>{
        if(barcode){
              axios.get(`https://world.openfoodfacts.org/api/v2/product/${barcode}.json`).then((res)=>{
              console.log(res.data.product);
              if(res.data && res.data.product)
              {
                setItems([res.data.product]);
              }
              else{
                setItems([]);
                console.log("data is not found");
              }

        }).catch(()=>{
            console.log("data is not fetched");
        })
    }
    }
    
  return (
    <div className={styles.div1}>
        <h2 id={styles.h2}>Enter Your Barcode Here</h2>
        <input id={styles.inp} type="text" value={barcode} name="barcode" onChange={handleChange}/>
        <button id={styles.btn} onClick={getProducts}>check</button>

        {items.map((d)=>{
            return <div id={styles.div} key={d._id}>
                <p className={styles.p}>Name-{d.product_name}</p>
                <img className={styles.img} src={d.image_url}/>
                <p className={styles.p1}>Country of origin-{d.countries}</p>
                <p className={styles.p2}>Categories-{d.categories_tags}</p>
                <p className={styles.p3}>Creator-{d.creator}</p>

            </div>
        })}
    
          
    </div>
  )
}


export default Project1;