import React,{useEffect,useState} from 'react'

const LearnEffect = () => {
    let [state,setState]=useState("chintu");
    //1. without 2nd argument--acts like render();
    // useEffect(()=>{
    //     console.log("use effect hook");
    //     console.log(state);
    // });

    //2.  empty dependency list--acts like componentDidMount();
    // useEffect(()=>{
    //     console.log("use effect hook");
    //     console.log(state);
    // },[]);


    //3.dependency list with value
    useEffect(()=>{
        console.log("use effect hook");
        console.log(state);
    },[state]);
    let changeName=()=>{
        setState("bunty");
    }
  return (
    <div>
        <h2>{state}</h2>
        <button onClick={changeName}>change</button>
    </div>
  )
}

export default LearnEffect