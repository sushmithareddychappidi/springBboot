import React from "react";
const ChangeColorTask=()=>{
    let col="red";
    let Change=()=>{
    if(col=="red")
    {
        let d=document.getElementById("root");
        
        d.style.backgroundColor="red"; 
        col="black";
    }
    else
    {
        let d=document.getElementById("root");
        d.style.backgroundColor="black";
        col="red";
    }
}

    return (
        <div>
            {/* <h1>hii</h1> */}
            <button onClick={Change}>Change</button>
        </div>
    )
}
export default ChangeColorTask;