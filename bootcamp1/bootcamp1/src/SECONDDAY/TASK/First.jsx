import React, { useState } from "react";
import Second from "./Second"
let First=()=>{
    let [count,setCount]=useState(0);
    let update=()=>{
        setCount(count+1);
    }
    return <div>
              <Second c={count} f={update}/> 
    </div>
}
export default First;