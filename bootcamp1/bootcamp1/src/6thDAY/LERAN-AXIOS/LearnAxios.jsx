import React, { useEffect, useState } from 'react';
import axios from 'axios';

const LearnAxios = () => {
    let [state,setState]=useState([])
    useEffect(()=>{
        axios.get("https://api.github.com/users").then((res)=>{
            console.log(res.data);
            setState(res.data);

        }).catch(()=>{
            console.log("data is not fetched");
        })
    },[])

  return (
    <div>
        {state.map((data)=>{
            return <div key={data.id}>
                <h2>{data.login}</h2>
                <img src={data.avatar_url}></img>
            </div>
        })}
    </div>
  )
}

export default LearnAxios