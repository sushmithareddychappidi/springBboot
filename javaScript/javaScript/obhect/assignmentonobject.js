let card={
    type:"debit",
    name:"sbi",
    card_No:1234567895432,
    expireDate:"01/28",
    cardHolderName:"sushmitha",
    transactions:function(){
        var amountCredited=100000;
        var amountDebited=25000;
        console.log(amountDebited);
        console.log(amountCredited);
    },
};
console.log(card.type);
console.log(card.name);
console.log(card.card_No);
console.log(card.expireDate);
console.log(card.cardHolderName);
card.transactions();

//
let person={
    name:"sushmitha",
    age:21,
    height:5.2,
    color:"white",
    haircolor:"black",
    abilities:function(){
        var occupation="farmer";
        console.log(occupation); 
    },
};
console.log(person.name);
console.log(person.age);
console.log(person.height);
console.log(person.color);
console.log(person.haircolor);
person.abilities();

//
let car={
    color:"red",
    model:"bmw",
    speed:1000,
    airbags:"yes",
    seater:7,
    functionalities:function(){
        var transport="people";
        console.log(transport);
    },
};
console.log(car.color);
console.log(car.model);
console.log(car.speed);
console.log(car.airbags);
console.log(car.seater);
car.functionalities();

//
let laptop={
    color:"grey",
    model:"hp",
    version:"i7",
    dimensions:"56*45",
    usb_cabels:3,
    apps:function(){
        var vstudio="code";
        var sqlplus="sql";
        console.log(vstudio);
        console.log(sqlplus);
    },
};
console.log(laptop.color);
console.log(laptop.model);
console.log(laptop.version);
console.log(laptop.dimensions);
console.log(laptop.usb_cabels);
laptop.apps();

//
let atm={
    name:"sbi",
    type:"withdraw",
    color:"grey",
    screentype:"touch",
    bills:function(){
        var withdrawl=2000; 
        console.log(withdrawl);
    },
};
console.log(atm.name);
console.log(atm.type);
console.log(atm.color);
console.log(atm.screentype);
atm.bills();