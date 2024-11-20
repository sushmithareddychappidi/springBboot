package practice;

import java.util.Scanner;

public class SumOfSecondHalf 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=a.length/2;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		
	}

}
