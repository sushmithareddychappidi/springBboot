function Stud(name,age){
    this.name=name;
    this.age=age;

}
let s1=new Stud("sidhu",23);
console.log(s1.name);
console.log(s1.age);
//one object with multiple references
let s2=new Stud("rahul");
console.log(s2.name);