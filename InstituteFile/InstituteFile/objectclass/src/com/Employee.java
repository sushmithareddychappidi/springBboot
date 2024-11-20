package com;

public class Employee
{
	String name;
	int id;
	int sal;
	public Employee(String name,int id,int sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public void display()
	{
		System.out.println("name of the employee:"+name);
		System.out.println("id of the employee:"+id);
		System.out.println("sal of the employee:"+sal);
	}
	public String toString()
	{
		return name+" "+id+" "+sal;
	}
	public boolean equals(Object o)
	{
		Employee e3=(Employee)o;
		return this.id==e3.id;
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee("sushmi",1,500000);
		Employee e2=new Employee("jasmi",2,600000);
		System.out.println(e1.toString());
		String res=e2.toString();
		System.out.println(res);
		System.out.println(e1.equals(e2));
	}
}

