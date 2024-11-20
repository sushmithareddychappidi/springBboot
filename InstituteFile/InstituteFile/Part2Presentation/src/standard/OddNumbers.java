package standard;

import java.util.Scanner;

public class OddNumbers 
{
	static Scanner sc=new Scanner(System.in);
	public static int[] getOddNumbers(int start,int end)
	{
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
				count++;
			}
		}
		int oddnumbers[]=new int[count];
		int tempIndex=0;
		for(int j=start;j<=end;j++)
		{
			if(j%2!=0)
			{
				oddnumbers[tempIndex++]=j;
			}
		}
		return oddnumbers;
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
	//negative
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
	public static void main(String[] args)
	{
		System.out.println("Enter start,end:");
		int start=sc.nextInt();
		int end=sc.nextInt();
		int main[]=getOddNumbers(start,end);
		for(int x:main)
		{
			System.out.println(x+" ");
		}
		negative(main);
		//zeroes(main);
		

	}

}
