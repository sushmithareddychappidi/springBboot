package com.example.helloworld;

import org.springframework.stereotype.Component;

@Component
public class Customer 
{
	private int custid;
	private String custname;
	private String course;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void display()
	{
		System.out.println("Customer Object Created Successfully");
	}
	

}