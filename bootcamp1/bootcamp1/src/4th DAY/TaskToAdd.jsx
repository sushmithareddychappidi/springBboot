import React,{useState} from 'react';
import style from "./Task.module.css";

const TaskToAdd = () => {
    let [state,setState]=useState("");
    let [text,setText]=useState([]); 
    let [editText,setEdit]=useState(0)   
    const add=(e)=>{
        setState(e.target.value);
    }
    const addItem=(e)=>{
        e.preventDefault();
        //console.log(state);
       if(state=="")
       {

       }
       else
       {
        let newText=[...text,state];
        setText(newText);
        setState("");
       }
    }
    let deleteHandler=(id)=>{
        let updatedList=text.filter((ele,index)=>{
            console.log(ele);
            return id!=index;
        });
        setText(updatedList);
    }
    let edit=(id)=>{
        let editTodo=text.find((i)=>i.index===id);
        setState(editTodo.state);
        setEdit(id);
    }
  return (
    <div>
        <h1>To Do App</h1>
    
                <input type="text" name="state" value={state} onChange={add}></input>
                <button onClick={addItem}>{editText?"edit":"add"}</button>           

        <div id={style.div1}>
            {text.map((data,index)=>{
                return <div key={index}>
                         <input type="text" value={data}></input>
                         <button onClick={()=>deleteHandler(index)}>delete</button>
                         <button onClick={()=>edit(data)}>edit</button>
                         </div>
            })}
        </div>
    </div>
  )
}

export default TaskToAdd