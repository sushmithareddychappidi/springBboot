import React, { useCallback, useState } from 'react';
import Child1 from './Child1';
import Child2 from './Child2';

const Parent1 = () => {
    let [salary,setSalary]=useState(5000);
    let [exp,setExp]=useState(1);

    let changeSalary =useCallback(()=>{
        setSalary(salary+1000);
    },[salary]);
    let changeExp =useCallback(()=>{
        setExp(exp+1);        
    },[exp]);
    console.log("parent component");
  return (
    <div>
        <Child1 count={salary}/>
        <Child2 fun={changeSalary}>changesal</Child2>
        <Child1 count={exp}/>
        <Child2 fun={changeExp}>changeexp</Child2>
    </div>
  )
}

export default Parent1