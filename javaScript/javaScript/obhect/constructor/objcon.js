function Emp(name,age,phno,city){
    // console.log(name);
    // console.log(age);
    this.name=name;
    this.age=age;
    this.phno=phno;
    this.city=city;
}
let e1=new Emp("shrey",21,12345,"delhi");
console.log(e1.name);
console.log(e1.age);
console.log(e1.phno);
console.log(e1.city);