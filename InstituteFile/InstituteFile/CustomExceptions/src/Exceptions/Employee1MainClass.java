package Exceptions;
import java.util.Scanner;

public class Employee1MainClass
{
	public static void display(Employee1 e)
	{
		e.info();
	}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many Students data you want");
		int numOfStudents=sc.nextInt();
		for(int i=1;i<=numOfStudents;i++)
		{
			System.out.println("Enter student "+i+" details");
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter Id");
			int id=sc.nextInt();
			System.out.println("enter salary");
			int salary=sc.nextInt();
			System.out.println("enter location");
			String loc=sc.next();
			while(true)
			{
				try
				{
						Employee1 emplo=new Employee1(name,id,salary,loc);
						display(emplo);						
					    break;
				}
				catch(Emp1NameMissMatchException e)
				{
					System.out.println("Re-enter name");
					name=sc.next();					
				}
				catch(Emp1InvalidIdException e)
				{
					System.out.println("Re-enter id");
					id=sc.nextInt();					
				}
				catch(Emp1InvalidSalaryException e)
				{
					System.out.println("Re-enter salary");
					salary=sc.nextInt();					
				}
				catch(Emp1LocMissMatchException e)
				{
					System.out.println("Re-enter location");
					loc=sc.next();					
				}
			}
		}
	}

}
