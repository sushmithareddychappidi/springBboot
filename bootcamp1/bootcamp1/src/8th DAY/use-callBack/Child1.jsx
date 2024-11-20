import React from 'react'

const Child1 = (props) => {
    console.log("child1 component");
  return (
    <div>{props.count}</div>
  )
}

export default React.memo(Child1);