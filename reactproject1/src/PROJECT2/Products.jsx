import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

const Products = () => {
  let [state,setState]=useState([]);
  useEffect(()=>{
    axios.get("https://fakestoreapi.com/products").then((res)=>{
      setState(res.data);
    }).catch(()=>{
      console.log("loading.....");
    });
  },[])
  return (
    <div>   
        {state.map((data)=>{
          return <div key={data.id}>
            <img src={data.image}/>
            <p>Title:{data.title}</p>
            <p>Price:{data.price}</p>
            <p>Category:{data.category}</p>
            <Link to={`/cart/${data.id}`}>go to cart</Link>
          </div>
      })}
    </div>
  )
}

export default Products