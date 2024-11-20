let employee={
    name:"sushmi",
    age:21,
    salary:40000,
    location:"banglore",
    fun:function(inc){
      console.log(inc);
      var total=inc+this.salary;
      console.log(total);
    },

    fun2:function(){
        console.log(this.name);
        //local variables cannot be accessed outside the block,so we will get error,undefined respectivelly
        //console.log(inc);
        //console.log(this.inc);
    },
    fun3:function(eid,location){
        console.log(eid);
        console.log(location);
        console.log(this.location);
    }
};
console.log(employee.name);
console.log(employee.age);
console.log(employee.salary);
employee.fun(5000);
employee.fun2();
employee.fun3(123,"hyderabad");