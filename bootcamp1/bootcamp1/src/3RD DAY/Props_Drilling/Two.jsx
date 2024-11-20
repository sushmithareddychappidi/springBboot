import React from "react";
import Three from "./Three";
let Two=(prop)=>{
    return <>
    <div>
        {/* <h1>{prop.name}</h1> */}
         <Three name={prop.name}/> 
        </div>
    </>
}
export default Two;