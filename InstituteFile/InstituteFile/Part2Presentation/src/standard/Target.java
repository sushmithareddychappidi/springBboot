package standard;

import java.util.Scanner;

public class Target 
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
		int target=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)//2 5 5 8
			{
				if(a[i]+a[j]==target)
				{
					count++;
					System.out.println(a[i]+" ,"+a[j]);
				}
			}
		}
		if(count==0)
		{
			System.out.println("pair not found");
		}		
	}

}
