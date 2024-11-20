// let student={
//     name:"sushmi",
//     age:21,
//     inst:"jspiders",
//     branch:"jntu",
// }
// console.log(student);
// student.email="sush@gmail.com";//adding a property
// console.log(student);

// //Object.freeze(student);//for freezing the obj
// console.log(Object.isFrozen(student));//checking whether it is freeze r not

// student.phone=1234567890;
// console.log(student);
// student.name="swpna";//replacing the value of a property
// console.log(student.name);

let shoe={
    brand:"nike",
    price:7000,
    color:{
        option1:"black",
        option2:"orange",
    }
}
console.log(shoe.brand);
console.log(shoe.price);
console.log(shoe.color.option2);
console.log(Object.freeze(shoe));
console.log(Object.isFrozen(shoe));

shoe.color.option2="white";//here we can change the value of a child obj after freezed also but not main object
console.log(shoe.color.option2);
shoe.color.opt3="pink";
console.log(shoe.color);
shoe.brand="puma";//here obj is freezed so we cannot update
console.log(shoe.brand);
//adding new property to indirect obj is possible
shoe.color.option3="blue";
console.log(shoe.color);