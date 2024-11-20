let emp={
    name:"sushmi",
    age:21,
    branch:"banglore",
    company:{
        name:"tyss",
    }
};
console.log(emp);
console.log(Object.seal(emp));
let check=Object.isSealed(emp);
console.log(check);
//adding new property :not possible
emp.email="sush@gmail.com";
console.log(emp);
//change existy property:possible
emp.age=20;
console.log(emp.age);
//changing indirect obj property :possible
emp.company.name="firefliks";
console.log(emp.company.name);
//adding new property to the indirect obj:possible
emp.company.empid=1234;
console.log(emp.company);
