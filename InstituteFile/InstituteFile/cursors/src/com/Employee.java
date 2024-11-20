package com;

public class Employee 
{
	private String name;
	private String id;
	private int sal;
	private int exp;
	private String location;
	private String companyName;
	private String designation;
	public Employee()
	{
		
	}
	public Employee(String name, String id, int sal, int exp, String location, String companyName, String designation) {
		if(name.equalsIgnoreCase("Anushka")||name.equalsIgnoreCase("Virat")||name.equalsIgnoreCase("Akay"))
		{
			this.name = name;
		}
		else
		{
			throw new EmpNameInvalidException();
		}
		if(id.equalsIgnoreCase("wip123")||id.equalsIgnoreCase("Tcs456")||id.equalsIgnoreCase("Inf789")||id.equalsIgnoreCase("Hcl109"))
		{
			this.id = id;
		}
		else
		{
			throw new EmpIdInvalidException();
		}
		if(sal>=15000 && sal<=90000)
		{
			this.sal = sal;
		}
		else
		{
			throw new EmpSalInvalidException();
		}
		if(exp>=1 && exp<=5)
		{
			this.exp = exp;
		}
		else
		{
			throw new EmpExpMissMatchException();
		}
		if(location.equalsIgnoreCase("Hyderabad")||location.equalsIgnoreCase("Hyderabad")||location.equalsIgnoreCase("Banglore")||location.equalsIgnoreCase("Pune"))
		{
			this.location = location;
		}
		else
		{
			throw new EmpLocMissMatchException();
		}
	    if(companyName.equalsIgnoreCase("Wipro")||companyName.equalsIgnoreCase("Wipro")||companyName.equalsIgnoreCase("Tcs")||companyName.equalsIgnoreCase("Infosys")||companyName.equalsIgnoreCase("Hcl"))
	    {
	    	this.companyName = companyName;
	    }
	    else
	    {
	    	throw new EmpCompanyMissMatchException();
	    }
	    if(designation.equalsIgnoreCase("JavaDeveloper")||designation.equalsIgnoreCase("PegaDeveloper")||designation.equalsIgnoreCase("DBA")||designation.equalsIgnoreCase("Tester"))
	    {
	    	this.designation = designation;
	    }
	    else
	    {
	    	throw new EmpDesignationInvalidException();
	    }
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		if(exp>=1)
		{
			if(sal>=50000 && sal<=90000)
			{
				this.sal=sal;
			}
			else
			{
				throw new EmpSalInvalidException();
			}
		}
		else
		{
			throw new EmpExpMissMatchException();
		}
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		if(sal>=15000 && sal<=90000)
		{
			if(companyName.equalsIgnoreCase("dxc")||companyName.equalsIgnoreCase("delloite")||companyName.equalsIgnoreCase("google"))
			{
				this.companyName = companyName;
			}
			else
			{
				throw new EmpCompanyMissMatchException();
			}
		}
		else
		{
			throw new EmpSalInvalidException();
		}
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void display()
	{
		System.out.println("Employee Name: "+getName());
		System.out.println("Employee Id: "+getId());
		System.out.println("Employee Sal: "+getSal());
		System.out.println("Employee Experience: "+getExp());
		System.out.println("Employee Location: "+getLocation());
		System.out.println("Employee CompanyName: "+getCompanyName());
		System.out.println("Employee Designation: "+getDesignation());
	}
	
	
}
