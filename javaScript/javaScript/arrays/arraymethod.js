var a=[1,2,3];
console.log(a);
//push
var a1=a.push(4);
console.log(a);
//pop
var a2=a.pop();
console.log(a);
//shift
var b=a.shift();
console.log(a);
//unshift
var b1=a.unshift(4,5);
console.log(a);
//indexOf
var c=['hii','hello','good','bad']
console.log(c);
var c1=c.indexOf('hello');
console.log(c1);

//includes
var d=[1,2,3,4,5];
var d1=d.includes(4);
console.log(d1);

//slice
var e=[1,2,3,4,5];
var newe=e.slice(0,4);
console.log(e);

//splice
var f=["carrot","radish","beetroot"];
//var newf=f.splice(0,2,"tomato");
var newf=f.splice(0,2,"sushmi","sush");
console.log(f);

//concat
var fruits=["apple","mango","plum","dragon"];
var vegetables=["cucumber","chillies","potato"];
var d=fruits.concat(vegetables);
console.log(d);

//forEach
var g=[1,2,3,4,5];
var newa=g.forEach(function(n)
{
  console.log(n+1);
})

//map is an alternate method for forEach()
var h=[1,2,3];
var newh=h.map(function(n)
{
    console.log(n+1);
})

//filter()
var i=[1,2,3,4,5,6];
var newi=i.filter(function(n)
{
    return n%2==0;
})
console.log(newi);

//filter without return-->gives boolean values
var i1=[1,2,3,4,5,6];
var newi1=i1.filter(function(n)
{
    console.log(n%2==0);
})

//REDUCE
let j=[1,2,3,4,5];
let newj=j.reduce(function(acc,cur){
    return acc+cur;
})
console.log(newj);


