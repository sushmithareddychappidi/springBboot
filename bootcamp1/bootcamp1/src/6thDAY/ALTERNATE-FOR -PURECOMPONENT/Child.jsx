import React,{memo} from 'react'

const Child = (props) => {
    console.log("child component");
  return (
    <div>
        <h2>{props.name}</h2>
        </div>
  );
}

export default React.memo(Child);