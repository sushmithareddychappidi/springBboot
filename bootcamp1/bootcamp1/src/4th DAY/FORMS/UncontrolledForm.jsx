import React,{useRef} from 'react'

const UncontrolledForm = () => {
    let nameRef=useRef();
    let emailRef=useRef();
    let passwordRef=useRef();
    let maleRef=useRef();
    let femaleRef=useRef();
    let othersRef=useRef();
    let htmlRef=useRef();
    let cssRef=useRef();
    let jsRef=useRef();
    let reactRef=useRef();
    

    let handleSubmit=(e)=>{
        //console.log(e);
        e.preventDefault();
        let name=nameRef.current.value;
        let email=emailRef.current.value;
        let pw=passwordRef.current.value;
        let gender=maleRef.current.checked?"male":femaleRef.current.checked?"female":othersRef.current.checked?"others":"null";
        let SkillArray=[];
        if(htmlRef.current.checked)SkillArray.push("html");
        if(cssRef.current.checked)SkillArray.push("css");
        if(jsRef.current.checked)SkillArray.push("js");
        if(reactRef.current.checked)SkillArray.push("react");

        console.log(name,email,pw,gender,SkillArray);
        
    }
  return (
    <div>
        <form onSubmit={handleSubmit}>
            <input type="text" placeholder='enter your name' ref={nameRef} /><br/><br/>
            <input type="text" placeholder='enter your email' ref={emailRef}/><br/><br/>
            <input type="text" placeholder='enter your password' ref={passwordRef}/><br/><br/>
            <div>
                <label htmlFor='gen'>Gender:</label>
                <input type="radio" id="gen" ref={maleRef} name="gender" value="male"  />Male
                <input type="radio" id="gen" ref={femaleRef} name="gender" value="female" />Female
                <input type="radio" id="gen" ref={othersRef} name="gender" value="others" />Others
            </div>
            <div>
                <label htmlFor='skill'>Skills</label>
                <input type="checkbox" id="skill" ref={htmlRef} />Html
                <input type="checkbox" id="skill" ref={cssRef} />Css
                <input type="checkbox" id="skill" ref={jsRef} />JavaScript
                <input type="checkbox" id="skill" ref={reactRef} />React
            </div>
            <input type="submit"></input><br/><br/>
            <input type="reset"></input>
        </form>
    </div>
  )
}

export default UncontrolledForm