package Exceptions; 

public class Employee1 
{
	private String name;
	private int id;
	private int salary;
	private String loc;
	public Employee1(String name,int id,int salary,String loc)
	{
		if((name.equalsIgnoreCase("scott")) || (name.equalsIgnoreCase("tiger")) || (name.equalsIgnoreCase("mark")))
		{
			this.name=name;
		}
		else
		{
			throw new Emp1NameMissMatchException();
		}
		if(id>5 && id<15)
		{
			this.id=id;
		}
		else
		{
			throw new Emp1InvalidIdException();			
		}
		if(salary>10000 && salary<50000)
		{
			this.salary=salary;
		}
		else
		{
			throw new Emp1InvalidSalaryException();			
		}
		if((loc.equalsIgnoreCase("hyderabad")) || (loc.equalsIgnoreCase("Banglore")) || (loc.equalsIgnoreCase("Pune")))
		{
			this.loc=loc;			
		}
		else
		{
			throw new Emp1LocMissMatchException();
		}
	}
	public void info()
	{
		System.out.println("Name of the Employee :"+name);
		System.out.println("Id of the Employee :"+id);
		System.out.println("Salary of the Employee :"+salary);
		System.out.println("Loc of the Employee :"+loc);
	}

}
