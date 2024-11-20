import React,{useMemo,useState} from 'react';


const UseMemoLearn = () => {
    let [count1,setCount1]=useState(0);
    let [count2,setCount2]=useState(50);
    let increaseCount1=()=>{
        setCount1(count1+1);
    }
    let increaseCount2=()=>{
        setCount2(count2+5);
    }
    let isEven=useMemo(()=>{
        let i=0;
        while(i<9999999999) i++;
        return count1%2==0;
    },[count1])
  return (
    <div>
        <h2>{count1}</h2>
        {isEven?"even":"odd"}
        <button onClick={increaseCount1}>increaseCount1</button>
        <h2>{count2}</h2>
        <button onClick={increaseCount2}>increaseCount2</button>
    </div>
  )
}

export default UseMemoLearn