import React from "react";
let Second=(props)=>{
    return <div>
        <h1>{props.c}</h1>
        <button onClick={props.f}>increment</button>
    </div>
}

export default Second;