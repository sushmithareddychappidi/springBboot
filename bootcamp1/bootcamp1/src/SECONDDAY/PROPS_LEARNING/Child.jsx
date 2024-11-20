import React from "react";
import GrandChild from "./GrandChild";
let child=()=>{
    return <div>
        <h1>Child Component</h1>
        <GrandChild/>
    </div>
}
export default child;