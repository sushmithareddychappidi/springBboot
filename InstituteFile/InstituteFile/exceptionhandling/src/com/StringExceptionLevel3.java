package com;

import java.util.Scanner;

public class StringExceptionLevel3 
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		System.out.println("enter index position");
		int i=sc.nextInt();
		int count=0;
		while(true)
		{
			try
			{
				System.out.println(s.charAt(i));
				break;
			}
			catch(StringIndexOutOfBoundsException e)
			{
				if(count==3)
				{
					System.out.println("you have reached maximum limit account blocked");
					break;
				}
				System.out.println("you have "+(3-count)+" chances left");
				System.out.println("enter valid index position");
				i=sc.nextInt();
				count++;
			}
		}
		System.out.println("main ends");
		sc.close();
	}

}

