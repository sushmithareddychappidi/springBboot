package user;
import shop.keeper.Employee;

import java.util.Scanner;

public class EmployeeMainClass 
{
	public static void info(Employee e)
	{
		e.empInfo();
	}
	public static void main(String[] args) 
	{
		char status=' ';
		do
		{
			Scanner sc=new Scanner(System.in);
		    System.out.println("Enter how many Employees you want");
		    int num=sc.nextInt();
		    for(int i=1;i<=num;i++)
				{
				System.out.println("Enter Employee "+i+" details");
			    System.out.println("Enter empid");
			    int empId=sc.nextInt();
			    System.out.println("Enter empName");
			    String empName=sc.next();
			    System.out.println("Enter salary");
			    int salary=sc.nextInt();
				System.out.println("Enter YOE");
			    int yoe=sc.nextInt();
			    Employee e=new Employee(empId,empName,salary,yoe);
			    info(e);
				}
				System.out.println("Enter Yes to continue");
			    System.out.println("Enter No to continue");
			    String input=sc.next();
			    status=input.charAt(0);
		}
		while (status=='y');
		System.out.println("exit");

		/*info(new Employee(1,"sushmi",50000));
		info(new Employee(2,"sushmitha",70000,1.2));*/
	}

}
