import React,{useContext} from "react";
import Global from "./GlobalData";
let Consumer=()=>{
    let {name,place}=useContext(Global);
    return (
        <div>
            <h1>{name}</h1>
            <h1>{place}</h1>
        </div>
    )
}
export default Consumer;