import React from 'react'

const Child2 = (props) => {
    console.log("child2 component");
  return (
    <div>
       <button onClick={props.fun}>{props.Children}</button>
    </div>
  )
}

export default React.memo(Child2);