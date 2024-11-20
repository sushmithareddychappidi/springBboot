package Exceptions;
import java.util.Scanner;

public class StudentMainClass 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter rollNo");
		int rollNo=sc.nextInt();
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		while(true)
		{
			try
			{
				Student s=new Student(name,rollNo,marks);
				s.display();
				break;
			}
			catch(NameMisMatchException e)
			{
				System.out.println("Re-enter valid name");
				name=sc.next();					
			}
			catch(RollNoOutOfBoundsException e)
			{
				System.out.println("Re-enter valid Roll no");
				rollNo=sc.nextInt();								
			}
			catch(InvalidMarksException e)
			{
				System.out.println("Re-enter valid marks");
				marks=sc.nextInt();
				
			}
		}
	}
	

}
