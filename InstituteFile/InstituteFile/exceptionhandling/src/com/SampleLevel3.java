package com;

import java.util.Scanner;

public class SampleLevel3 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		int count=0;
		while(true)
		{
			
			try
			{
				System.out.println(a/b);
				break;
			}
			catch(ArithmeticException e)
			{
				if(count==3)
				{
					System.out.println("you have reached the maximum limit");
					break;				
				}
				System.out.println("you have only"+(3-count)+"1left");
				System.out.println("enter b value");
				b=sc.nextInt();
				count++;
			}
		}
		
	}
}
