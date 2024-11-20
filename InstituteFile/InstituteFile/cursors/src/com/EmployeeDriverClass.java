package com;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class EmployeeDriverClass 
{
	private Employee e;
	ArrayList<Employee> employee=new ArrayList<Employee>();
	public void addEmployee(Employee e)
	{
		employee.add(e);
		System.out.println("Employee Added Sucessfully");
	}
	public void displayEmp()
	{
		if(employee.isEmpty())
		{
			System.out.println("No employees");
		}
		else
		{
			for(Employee e:employee)
			{
				e.display();
			}
		}
	}
	public void SearchEmpBasedOnExp(int exp)
	{
		boolean isFound=false;
		if(employee.isEmpty())
		{
			System.out.println("No employees");
		}
		else
		{
			for(Employee e:employee)
			{
				if(e.getExp()==exp)
				{
					System.out.println("Employee exp: "+e.getExp());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new EmpExpMissMatchException();
		}
	}
	public void SearchEmpBasedOnSalAndDesignation(int sal,String designation)
	{
		boolean isSalFound=false;
		boolean isDesFound=false;
		if(employee.isEmpty())	
		{
			System.out.println("No Employees");
		}
		else
		{
			for(Employee e:employee)
			{
				if(e.getSal()==sal)
				{
					if(e.getDesignation().equalsIgnoreCase(designation))
					{
						System.out.println("Employee Salary: "+e.getSal());
						System.out.println("Employee Designation: "+e.getDesignation());
						isDesFound=true;
					}
					isSalFound=true;
				}
			}
		}
		if(isSalFound==false)
		{
			throw new EmpSalInvalidException();
		}
		if(isDesFound==false)
		{
			throw new EmpDesignationInvalidException();
		}
	}
	public void updateEmpSalBasedOnExperience(int newSal,int exp)
	{
		boolean isFound=false;
		boolean sal=false;
		if(employee.isEmpty())
		{
			System.out.println("No Employees");
		}
		else
		{
			for(Employee e:employee)
			{
				if(e.getExp()==exp)
				{
					e.setSal(newSal);
					sal=true;
					isFound=true;
					System.out.println("Employee Salary Updated To :"+newSal);
				}
			}
		}
		if(isFound==false)
		{
			throw new EmpExpMissMatchException();
		}
		if(sal==false)
		{
			throw new EmpSalInvalidException();
		}
	}
	public void updateCompanyNameBasedOnSalary(String newCompany,int sal)
	{
		boolean isFound=false;
		boolean companyName=false;
		if(employee.isEmpty())
		{
			System.out.println("No Employees");
		}
		else
		{
			for(Employee e:employee)
			{
				if(e.getSal()==sal)
				{
					e.setCompanyName(newCompany);
					companyName=true;
					isFound=true;
					System.out.println("Employee CompanyName Updated To :"+newCompany);
				}
			}
		}
		if(isFound==false)
		{
			throw new EmpSalInvalidException();
		}
		if(companyName==false)
		{
			throw new EmpCompanyMissMatchException();
		}
	}
	public void removeEmpBasedOnDesignation(String designation)
	{
		boolean isRemove=false;
		ListIterator<Employee> li=employee.listIterator();
		if(employee.isEmpty())
		{
			System.out.println("No employees");
		}
		else
		{
			while(li.hasNext())
			{
				Employee e=li.next();
				if(e.getDesignation().equalsIgnoreCase(designation))
				{
					li.remove();
					isRemove=true;
					System.out.println("Employee Removed");
				}
			}
		}
		if(isRemove==false)
		{
			throw new EmpDesignationInvalidException();
		}
	}
	
	public static void main(String[] args)
	{
		EmployeeDriverClass m=new EmployeeDriverClass();
		Scanner sc=new Scanner(System.in);
		boolean start=true;
		while(start)
		{
			System.out.println("Enter The Choice : \n 1. AddEmployee  \n 2. DisplayEmployee \n 3.searchEmployeeBasedOnExperience \n 4. searchEmployeeBasedOnSalAndDesignation \n 5. updateEmpSalBasedOnExperience \n 6.updateCpmpanyNameBasedOnSal \n 7.removeEmployeeBasedOnDesignation   \n 8. Exit ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter The Employee Name.....");
				String name=sc.next();
				System.out.println("Enter The Employee Id.....");
				String id=sc.next();
				System.out.println("Enter The Employee Salary.....");
				int sal=sc.nextInt();
				System.out.println("Enter The Employee Experience.....");
				int exp=sc.nextInt();
				System.out.println("Enter The Employee Location.....");
				String loc=sc.next();
				System.out.println("Enter The Employee CompanyName.....");
				String companyName=sc.next();
				System.out.println("Enter The Employee Designation.....");
				String designation=sc.next();
				while(true)
				{
					try
					{
						m.addEmployee(new Employee(name, id, sal,exp,loc,companyName, designation));
						break;
					}
					catch(EmpNameInvalidException e)
					{
						System.out.println("Re-enter The Employee Name");
						name=sc.next();
					}
					catch(EmpIdInvalidException e)
					{
						System.out.println("Re-enter The Employee Id");
						id=sc.next();
					}
					catch(EmpSalInvalidException e)
					{
						System.out.println("Re-enter The Employee Salary");
						sal=sc.nextInt();
					}
					catch(EmpExpMissMatchException e)
					{
						System.out.println("Re-enter The Employee Experience");
						exp=sc.nextInt();
					}
					catch(EmpLocMissMatchException e)
					{
						System.out.println("Re-enter The Employee Location");
						loc=sc.next();
					}
					catch(EmpCompanyMissMatchException e)
					{
						System.out.println("Re-enter The Employee CompanyName");
						companyName=sc.next();
					}
					catch(EmpDesignationInvalidException e)
					{
						System.out.println("Re-enter The Employee Designation");
						designation=sc.next();
					}
				}
			}
			break;
			case 2:
			{
				m.displayEmp();
			}
			break;
			case 3:
			{
				System.out.println("Enter The Experience to Search Employee Based On Experience");
				int exp=sc.nextInt();
				while(true)
				{
					try
					{
						m.SearchEmpBasedOnExp(exp);
						break;
					}
					catch(EmpExpMissMatchException e)
					{
						System.out.println("Re-enter The Experience....");
						exp=sc.nextInt();
					}
				}
			}
			break;
			case 4:
			{
				System.out.println("Enter The Salary and Designation to Search Employee");
				int sal=sc.nextInt();
				String designation=sc.next();
				while(true)
				{
					try
					{
						m.SearchEmpBasedOnSalAndDesignation(sal,designation);
						break;
					}
					catch(EmpSalInvalidException e)
					{
						System.out.println("Re-enter The Salary....");
						sal=sc.nextInt();
					}
					catch(EmpDesignationInvalidException e)
					{
						System.out.println("Re-enter The Designation....");
						designation=sc.next();
					}
				}
			}
			break;
			case 5:
			{
				System.out.println("Enter The Salary");
				int sal=sc.nextInt();
				System.out.println("Enter The Experience");
				int exp=sc.nextInt();
				try
				{
					m.updateEmpSalBasedOnExperience(sal,exp);
					break;
				}
				
				catch(EmpSalInvalidException e)
				{
					System.out.println("Re-enter The Employee Salary");
					sal=sc.nextInt();
				}
				catch(EmpExpMissMatchException e)
				{
					System.out.println("Re-enter The Employee Experience....");
					exp=sc.nextInt();
				}
			}
			break;
			case 6:
			{
				System.out.println("Enter The CompanyName");
				String companyName=sc.next();
				System.out.println("Enter The Salary");
				int sal=sc.nextInt();
				try
				{
					m.updateCompanyNameBasedOnSalary(companyName,sal);
					break;
				}
				catch(EmpCompanyMissMatchException e)
				{
					System.out.println("Re-enter The Employee Company Name....");
					companyName=sc.next();
				}
				catch(EmpSalInvalidException e)
				{
					System.out.println("Re-enter The Employee Salary");
					sal=sc.nextInt();
				}
			}
			break;
			case 7:
			{
				System.out.println("Enter The Designation to Remove Employee Based On Designation");
				String designation=sc.next();
				while(true)
				{
					try
					{
						m.removeEmpBasedOnDesignation(designation);
						break;
					}
					catch(EmpDesignationInvalidException e)
					{
						System.out.println("Re-enter The Designation....");
						designation=sc.next();
					}
				}
			}
			
			case 8:
			{
				start=false;
				System.out.println("Thank You ......:)");
			}
			break;
			default:
			{
				System.out.println("Enter Valid Choice ....:(");
			}
			}
		}
	}

}
