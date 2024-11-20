package standard;

import java.util.Scanner;

public class primeNum 
{
	static Scanner sc=new Scanner(System.in);
	public static int[] initialize(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	//zeroes
	public static int[] zeroes(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
		if(count==arr.length)
		{
			System.out.println("Array contains zeroes");
		}
		return arr;
	}
	//negative num
	public static int[] negative(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				count++;
			}
		}
		if(count==arr.length)
		{
			System.out.println("Array contains Negative numbers");
		}
		return arr;
	}
	//prime
	public static void prime(int arr[])
	{
		int count1=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==2 && arr[i]>0 )
			{
				count1++;
				System.out.println(arr[i]+" ");
			}
		}
		if(count1==0)
		{
			System.out.println("No prime Elements are present");
		}

	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		a=initialize(a);
		zeroes(a);
		negative(a);
		prime(a);

	}

}
