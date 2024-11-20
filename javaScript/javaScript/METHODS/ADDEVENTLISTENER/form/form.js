let a=document.getElementById("form");
a.addEventListener("submit",(e)=>{
    console.log("form is submited");
    e.preventDefault();
    console.log(e);
})
a.addEventListener("reset",()=>{
    console.log("form is not submitted");
})