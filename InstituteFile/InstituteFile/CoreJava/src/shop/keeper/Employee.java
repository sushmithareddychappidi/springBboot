package shop.keeper;

import java.util.Scanner;
public class Employee
{
	private int empId;
	private String empName;
	private int salary;
	private double empYOE;
	public void Employee()
	{
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getEmpYOE() {
		return empYOE;
	}
	public void setEmpYOE(double empYOE) {
		this.empYOE = empYOE;
	}
	public Employee(int empId,String empName,int salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	public Employee(int empId,String empName,int salary,double empYOE)
	{
		this(empId,empName,salary);
		this.empYOE=empYOE;
	}
	public void empInfo()
	{
		System.out.println("Employee Id:"+empId);
	    System.out.println("Employee Name:"+empName);
		System.out.println("Employee salary:"+salary);
		if(empYOE>0.0)
		{
			System.out.println("Employee YOF:"+empYOE);
		}
		System.out.println("-------------------");
	}
}



