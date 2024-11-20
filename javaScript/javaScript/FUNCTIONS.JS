// function add(a,b)
// {
//    console.log(a+b);
// }
// add(5,5);
// add(10,20);
// sub(2,1);
// function  sub(a,b)
// {
//    console.log(a-b);
// }
// sub(10,5);
// add(6,6);
// function mul(a,b)
// {
//    console.log(a*b);
// }
// mul(2,3);
// function div(a,b)
// {
//    console.log(a/b);
// }
// div(10,2);
// add(7,9);


//even number with fun
// function prime_num(x)
// {
//    if(x%2==0)
//    {
//     console.log( x+" is even number");
//    }
//    else{
//     console.log(x+" is odd number");
//    }
// }
// prime_num(4);
// prime_num(21);



//function with return type
// function returntype(a,b)
// {
//    return a+b;
// }
// console.log(returntype(5,4));

//annonymous fun
// var add=function (a,b)
// {
//    console.log("anonymous function");
//    console.log(a+b);
// }
// (10,20);
// var sub=function (a,b)
// {
//    console.log("an fun");
//    console.log(a-b);
// }
// (200,100);
// (100,50);

// fun expression
// var add=function (a,b)
// {
//    console.log("anonymous function");
//    console.log(a+b);
// }
// add(10,20);
// var sub=function (a,b)
// {
//    console.log("an fun");
//    console.log(a-b);
// }
// sub(200,100);
// add(100,50);


//IIFE FUNCTION
// (function ()
// {
//    var a=5;
//    console.log(a);
// })
// ();

// (function ()
// {
//    let a=2;
//    console.log(a);
// })
// ();


//ARROW FUNCTION
// var exp=()=>
// {
//   var a=10;
//   console.log(a);
// }
// exp();
// var exp1=()=>{
//     let b=30;
//     console.log(b);
// }
// exp1();
// exp();

//implicit return for arrow fun
// var exp=(a,b)=>

//   a+b;

// console.log(exp(10,20));
// var exp1=(a,b)=>
    
//     a-b;

// console.log(exp1(200,100));
// console.log(exp(150,50));

//explicit return for arrow function
// var exp=(a,b)=>{

//   return a+b;
// }
// console.log(exp(10,20));


//HOF
// function operate(fun,val1,val2)
// {
//     return fun(val1,val2)
// }
// console.log(operate(add,100,200));
// function add(x,y)
// {
//    return x+y;
// }


//nested function
function outer(a,b){
    console.log(a);
    console.log(a+b);
    function inner(c)
    {

        console.log(c);
        console.log(b+c);
    }
    return inner(50);
}
outer(100,200);




