import React, { useState ,setState} from 'react'

const ControlledForm = () => {
    let [state,setState]=useState({name:"",password:"",gender:""});
    let [skills,setSkills]=useState([]);
    let {name,password,gender}=state;
    let handleSubmit=(e)=>{
        //console.log(e);
        e.preventDefault();
        console.log(state);
        console.log(skills);
    }
    let handleChange=(e)=>{
        let {name,value}=e.target;
        setState({...state,[name]:value});
    }
    let handleSkills=(e)=>{
        setSkills([...skills,e.target.value])
    }
  return (
    <div>
        <form onSubmit={handleSubmit}>
            <input id="text" placeholder='enter your username' value={name} name="name" onChange={handleChange}></input><br/><br/>
            <input id="text" placeholder='enter your password' value={password} name="password" onChange={handleChange}></input><br/><br/>
            <div onChange={handleChange} value={gender} name="gender">
                <input type="radio" name="gender" value="male" />male
                <input type="radio" name="gender" value="female" />female
                <input type="radio" name="gender" value="others" />others
            </div>
            <div value={skills} name="skills" onChange={handleSkills}>
                <input type="checkbox" name="skills" value="html" />html
                <input type="checkbox" name="skills" value="css" />css
                <input type="checkbox" name="skills" value="js" />js
                <input type="checkbox" name="skills" value="react" />react

            </div>
            <input type="submit"></input>
        </form>
    </div>
  )
}

export default ControlledForm