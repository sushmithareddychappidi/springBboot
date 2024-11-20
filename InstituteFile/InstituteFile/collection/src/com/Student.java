package com;

public class Student 
{
	private String name;
	private int rollNo;
	private int marks;
	public Student(String name,int rollNo,int marks)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
	}
	public void display()
	{
		System.out.println("Name of the student: "+name);
		System.out.println("Rollno of the student: "+rollNo);
		System.out.println("Marks of the student: "+marks);		
	}

}
