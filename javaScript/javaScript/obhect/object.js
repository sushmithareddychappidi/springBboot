var student={
    name:"sushmitha",
    rollno:123,
    phno:1234567809,
    email:"sush@gmail.com",
    marks:function(){
        var english=90;
        var math=89;
        var science=91;
        var social=89;
    
    console.log("my marks are:");
    console.log(english);
    console.log(math);
    console.log(science);
    console.log(social);
    },
};
console.log(student.name);
console.log(student.rollno);
console.log(student.phno);
console.log(student.email);
student.marks();