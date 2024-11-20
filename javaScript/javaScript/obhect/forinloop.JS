let sub={
    name:"physics",
    dur:40,
    trainer:"mahendra",
    n0ofChap:7,
    isAssignmentGiven:true
}
for(let s in sub){
    //console.log(s);//it will give only key values
    console.log(sub[s]);//we get values here
    //it will give key and value alternatly becoz object is a collection of key value pair
}
let arr=[100,200,300,400,500,600];
for (let a in arr){
    //console.log(a);//here we get array index values when we call with variable name
    console.log(arr[a]);//here we call with arr name we get array values here
}