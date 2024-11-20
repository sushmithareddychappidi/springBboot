package com;
import java.util.Scanner;

public class Sample 
{
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter A value");
	  int a=sc.nextInt();
	  System.out.println("Enter B value");
	  int b=sc.nextInt();
	  try
	  {
		System.out.println(a/b);		
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("Re-enter B value");
		  b=sc.nextInt();
		  try
		  {
			  System.out.println(a/b);			  
		  }
		  catch(ArithmeticException e1)
		  {
			  System.out.println("Re-enter B value");
			  b=sc.nextInt();
			  try
			  {
				  System.out.println(a/b);			  
			  }
			  catch(ArithmeticException e2)
			  {
				  System.out.println("Re-enter B value");
				  b=sc.nextInt();
				  try
				  {
					  System.out.println(a/b);			  
				  }
				  catch(ArithmeticException e3)
				  {
					  System.out.println("Re-enter B value");
					  b=sc.nextInt();
					  System.out.println(a/b);
				  }
			  }
		  }
		  
	  }
	}
}
