package com;

import java.util.Scanner;

public class StringExceptionLevel1 
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String value");
		String s=sc.next();
		System.out.println("enter index position");
		int i=sc.nextInt();
		try
		{
			System.out.println(s.charAt(i));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("enter valid index position");
			i=sc.nextInt();
			try
			{
				System.out.println(s.charAt(i));
			}
			catch(StringIndexOutOfBoundsException e1)
			{
				System.out.println("enter valid index position");
				i=sc.nextInt();
				try
				{
					System.out.println(s.charAt(i));
				}
				catch(StringIndexOutOfBoundsException e2)
				{
					System.out.println("enter valid index position");
					i=sc.nextInt();
					System.out.println(s.charAt(i));
				}
			}
		}
		System.out.println("main ends");
		sc.close();
	}
}
