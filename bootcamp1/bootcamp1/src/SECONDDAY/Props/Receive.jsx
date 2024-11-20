//DESTRUCTURING OF PROPS
// import React from "react";
// let Receive=(prop)=>{
//     return (
//         <div>
//             <h1>Receiving data send by the send</h1>
//             <h1>{prop.name}</h1>
//             <h1>{prop.age}</h1>
//         </div>
//     )
// }
// export default Receive;
import React from "react";
import Ptype from "prop-types"
let Receive =({name,age})=>{
    return (
        <div>
            <h2>name:{name}<br/>age:{age}</h2>
        </div>
    )
}
//default props
Receive.defaultProps={
    name:"gayathri",
    age:35
}
Receive.propTypes={
    name:Ptype.string,
    age:Ptype.number,
}
export default Receive;