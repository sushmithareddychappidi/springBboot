let employee={
    name:"sushmitha",
    company:"accenture",
    email:"sush@gmail.com",
    fun:function(dept,loc){
       console.log("name is "+this.name+" working in "+this.company+" in dept as "+dept+" at loction "+loc+" and my mail id is "+this.email);
    },
};
employee.fun("analyst","banglore");