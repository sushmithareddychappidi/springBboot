package practice;

import java.util.Scanner;

public class prime 
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
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
