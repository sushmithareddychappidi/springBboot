package practice;

import java.util.Scanner;

public class productOdd 
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
		int pro=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				if(a[i]%3==0 && a[i]%5==0)
				{
					pro=pro*a[i];
				}
			}
		}
		System.out.println(pro);
	}

}
