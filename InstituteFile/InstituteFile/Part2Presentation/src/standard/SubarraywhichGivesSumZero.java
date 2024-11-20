package standard;

import java.util.Scanner;

public class SubarraywhichGivesSumZero 
{
	static Scanner sc=new Scanner(System.in);
	public static int[] initialize(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static void print(int a[],int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
	}
	public static void subArray(int a[])
	{
		boolean status=false;
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum==0)
				{
					print(a,i,j);
					status=true;
				}
			}
		}
		if(!status)
		{
			System.out.println("No subarray with zero found");
		}
	}
	public static void main(String[] args) 
	{
		int size=sc.nextInt();
		int a[]=new int[size];
        a=initialize(a);
        subArray(a);
        //print(a,start,end);
	}

}
