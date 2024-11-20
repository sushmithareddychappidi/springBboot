import React from "react";
import Receive from "./Receive";
const Send1=()=>{
    return(
        <div>
            <h1>hiii</h1>
            <Receive name="sushmi" age={"21"} />
            <Receive name="siri" age={21} />
            <Receive/>
            <Receive/>
        </div>
    )
}
export default Send1;