package com;
import java.util.ArrayList;

public class studentDriver 
{
	public static void main(String[] args) 
	{
	    Student s=new Student("sushmi",6,97);
		Student s1=new Student("ashwini",7,92);
		Student s2=new Student("vyshnavi",8,90);
		ArrayList <Student> al=new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		for(Student stu:al)
		{
			System.out.println(stu);
		}
	}
}
