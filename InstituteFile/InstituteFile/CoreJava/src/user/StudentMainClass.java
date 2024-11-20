package user;
import java.util.Scanner;
import shop.keeper.Student;

public class StudentMainClass 
{
	public static void info(Student s)
	{
		s.display();
	}
	public static void main(String[] args) 
	{
		char status=' ';
		do
		{
			Scanner sc=new Scanner(System.in);
		    System.out.println("enter how many students you want to initialize");
		    int num=sc.nextInt();
			for(int i=1;i<=num;i++)
				{
				System.out.println("Enter Student "+i+" details");
				System.out.println("Enter student name");
			    String name=sc.next();
			    Student s1=new Student(name);
			    info(s1);
		        }
				System.out.println("press YES to continue");
				System.out.println("press No to continue");
				String input=sc.next();
				status=input.charAt(0);
		}
		while (status=='y');
		System.out.println("exit");
		/*info(new Stu("sushmi"));
		info(new Stu("sushmitha Reddy"));*/
	}

}
