import React from "react";
import Child from "./Child"
let Parent=()=>
{
    return (
         <div>
        <h1>Parent Component</h1>
        <Child/>
        <Child/>
        <h1>next line</h1>
        <Child/>
    </div>
    )
}
export default Parent;