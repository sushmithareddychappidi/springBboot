let i=document.getElementById("a");
console.log(i);
i.innerHTML="<h1>GOOD MORNING!</h1>";
let j=document.getElementById("b");
console.log(j);
j.innerHTML="<h1>GOOD EVENING!</h1>";
let k=document.querySelectorAll(".c");
console.log(k);
for(k1=0;k1=k.length;k1++){
    k[0].innerHTML="<h3>JAVA SCRIPT</h3>";

}
let l=document.getElementsByClassName("d");
console.log(l);
for(l1=0;l1=l.length;l1++){
    l[l1].innerHTML="<h3>JAVA SCRIPT</h3>";
}
let n=document.getElementsByTagName("h4");
console.log(n);
for(n1=0;n1=n.length;n1++){
    n[0].innerHTML="<h3>JAVA SCRIPT</h3>";

}
let m=document.createElement("e");
m.innerHTML="<h5>CREATE ELEMENT</h5>";
document.body.appendChild(m);
// let o=document.createElement("");
// o.innerHTML="web TEChnology!";


