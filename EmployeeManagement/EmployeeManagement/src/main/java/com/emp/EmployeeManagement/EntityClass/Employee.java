package com.emp.EmployeeManagement.EntityClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String roll;
	private double salary;
	
	public Employee() 
	{
	}
	public Employee(long id, String name, String roll, double salary) 
	{
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", roll=" + roll + ", salary=" + salary + "]";
	}
	
}
