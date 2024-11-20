import React, { useState } from 'react'

const LearnKeys = () => {
    let [state,setState]=useState([
        {
            name:"sushmi",
            id:101,
            place:"hyderabad"
        },
        {
            name:"siri",
            id:102,
            place:"goa"
        },
        {
            name:"gayathri",
            id:103,
            place:"banglore"
        }
    ]);
  return (
    <div>
        {state.map((data)=>{
            return  <ul key={data.id}>
                <li>{data.id}</li>
                <li>{data.name}</li>
                <li>{data.place}</li>
            </ul>
        })}
    </div>
  )
}

export default LearnKeys