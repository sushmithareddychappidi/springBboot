package com;

import java.util.Scanner;

public class StringExceptionLevel2 
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		System.out.println("enter index position");
		int i=sc.nextInt();
		while(true)
		{
			try
			{
				System.out.println(s.charAt(i));
				break;
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("enter valid index position");
				i=sc.nextInt();
			}
		}
		System.out.println("main ends");
		sc.close();
	}

}
