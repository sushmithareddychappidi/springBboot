import React,{useEffect,useState} from 'react';
import axios from 'axios';
import {useParams} from "react-router-dom";
import styles from "./project2.module.css"
const Order = () => {
    let [state,setState]=useState(null);
    let [count,setCount]=useState(0);
    let {id}=useParams();
    let incre=()=>{
      setCount(count+1);
    }
    let decre=()=>{
      if(count<=1){
      }
      else{
        setCount(count-1)
      }
    }
    let totalPrice=()=>{
      return count*state.price;
    }
    useEffect(()=>{
        axios.get(`https://fakestoreapi.com/products/${id}`).then((res)=>{
            setState(res.data);
        }).catch(()=>{
            console.log("loading.....");
        })
    },[])
  return (
    <div>
        {state==null?"nothing":(<div key={state.id}>
            <p>{state.title}</p>
            <p>{state.category}</p>
            {/* <img src={state.image}/> */}
            <p>Price:{state.price}</p>
            {/* <p>{state.rating.rate}</p>
            <p>{state.rating.count}</p> */}
            <div className={styles.btn}>
              <button onClick={decre} className={styles.decre}>-</button>  <h1>{count}</h1> <button onClick={incre} className={styles.incre}>+</button>
               
            </div>
            <p>Total Price-{totalPrice()}</p>
            <button>paynow</button>
         
        </div>)}
    </div>
  )
}

export default Order