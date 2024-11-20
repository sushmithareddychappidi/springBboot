//normal function
// function even(a)
// {
//     if(a%2==0)
//     {
//         console.log(a+" is even number");
//     }
//     else
//     console.log(a+" is not even number");
// }
// even(3);

// function naturalNum(n)
// {
//     for(var a=0;a<=n;a++)
//     {
//         console.log(a);
//     }
// }
// naturalNum(5);

//anonymoums function
// var add=function (x,y)
// {
//     console.log(x+y);
// }
// add(10,20);

// var a=function (age)
// {
//     if(age>=18)
//     {
//         console.log("eligible for voting");
//     }
// }
// a(18);

// var num=function (a)
// {
//     while(a<=10)
//     {
//         console.log(a);
//         a++;
//     }
// }
// num(5)

//iife function
(function (a,b,c)
{
    if(a>b && a>c)
    {
        console.log(a+" is largest num");
    }
    else if(b>c)
    {
        console.log(b+" is largest num");
    }
    else
    console.log(c+" is largest num");
})
(43,56,23);

(function (a)
{
    while(a<=5)
    {
        console.log("SUSHMITHA");
        a++;
    }
})
(4);

