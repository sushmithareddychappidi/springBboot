import React, { useState } from "react";
let Condition=()=>{
    let [num,setNum]=useState(3);
    let [cup,setCup]=useState(0);
    let print;
    if(num%2==0)
    {
        print="even Number";
    }
    else{
        print="odd number"
    }
    return <>
    <h1>{num}</h1>
    <h1>{print}</h1>
    {/* ternary operator */}
    {cup!==0?"we have cup":"get the cup next time"}
    </>
}
export default Condition;