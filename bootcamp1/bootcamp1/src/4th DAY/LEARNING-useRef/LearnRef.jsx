import React,{useRef} from 'react'

const LearnRef = () => {
    let inputRef=useRef();
    //console.log(inputRef);
    let changeColor=()=>{
        inputRef.current.style.background="yellow";
        inputRef.current.style.color="black";
        inputRef.current.focus();
    }
  return (
  <div>
    <input ref={inputRef}></input>
    <button onClick={changeColor}>change</button>
    </div>

    
  )
}

export default LearnRef