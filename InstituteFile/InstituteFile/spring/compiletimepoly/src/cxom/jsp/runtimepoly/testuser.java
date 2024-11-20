package cxom.jsp.runtimepoly;

import java.util.Scanner;

public class testuser 
{
	public static user getuser1()
	{
		return new user1();		
	}
	public static user getuser2()
	{
		return new user2();
	}
	public static void main(String [] args)
	{
		user u;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1 ->
		{
			u=getuser1();
			u.details();
		}
		case 2 ->
		{
			u=getuser2();
			u.details();
		}
		}
		
	}

}
