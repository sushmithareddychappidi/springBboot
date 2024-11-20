package arrays;

import java.util.Scanner;

public class Leader 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int ele[]=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=sc.nextInt();
		}	
		for(int i=0;i<size;i++)
		{
			if(ele[0]>ele[i])
			{
				System.out.println(ele[i]);
			}
		}
	}
}
