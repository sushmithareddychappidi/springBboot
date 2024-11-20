package com;

import java.util.Scanner;

public class demo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		while(true)
		{
			
			try
			{
				System.out.println(a/b);
				break;
			}
			catch(ArithmeticException e)
			{
				System.out.println("enter b value");
				b=sc.nextInt();
			}
		}
		
	}
}
