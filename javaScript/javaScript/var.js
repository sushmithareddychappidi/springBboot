//initialise with var
var name=10;
// reinitialise 
name=20;
//re declaration
var name;
console.log(name);


//initialise with let
let name1="sushmi";
//reinitialise
name1="sweety";
//re-declaration
//let name1;
console.log(name1);



//initialise with var
const name2="shusu";
//reinitialise
//name2="sushmi";
console.log(name2);

//global scope
if(true)
{
    var a=10;
    console.log(a);
}
console.log(a);

//block scope
if(true)
{
    let b=100;
    console.log(b);
}
//console.log(b);

//block scope
if(true)
{
    const c=200;
    console.log(c);
}
//console.log(c);

