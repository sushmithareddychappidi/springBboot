import React from "react";
import ChildProp from "./ChildProp";
import s from "./props.module.css";
const ParentProp=()=>{
    return (
        <div className={s.div1}>
            <ChildProp>Good Evening</ChildProp>
        </div>
    )

}
export default ParentProp;