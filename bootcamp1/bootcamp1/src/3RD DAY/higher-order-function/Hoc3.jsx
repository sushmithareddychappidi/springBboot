import React from "react";
import Hoc1 from "./Hoc1"
const Hoc2=(props)=>{
    return (
        <div>
            <h2>{props.name}</h2>
        </div>
    )
}
export default Hoc1(Hoc3);