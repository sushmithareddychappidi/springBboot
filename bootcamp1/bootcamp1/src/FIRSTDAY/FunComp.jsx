// import React from "react";
// const FunComp=()=>{
//     return <h1>React Js</h1>
// }
// export default FunComp;
//useState()
import React, { useState } from "react";
const FunComp=()=>{
    //let a=useState();
    //console.log(a);
    
    //destructure useState()
    let [x,y]=useState("react");
    //x is initial value ,y is function to update initial value
    let change=()=>{
        y("node js");
    }
    return <div>
        <h2>{x}</h2>
        <button onClick={change}>change</button>
    </div>
}
export default FunComp;