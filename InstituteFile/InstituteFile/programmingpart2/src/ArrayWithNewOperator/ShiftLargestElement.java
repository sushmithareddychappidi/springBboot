package ArrayWithNewOperator;

import java.util.Scanner;

public class ShiftLargestElement 
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
	public static int[] shift(int arr[])
	{
		int b[]=new int[arr.length];
		int index=0;//1
		int highest=0;//50
		for(int i=0;i<arr.length;i++)
		{
		   if(highest<arr[i])
		   {
			   highest=arr[i];
			   index=i;//10 50 30
		   }
		}
		for(int i=index;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=highest;
		return arr;
	}
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
    public static void main(String[] args)
    {
    	System.out.println("Enter Size: ");
    	int size=sc.nextInt();
    	int a[]=new int[size];
    	a=initialize(a);
    	print(a);
    	int b[]=shift(a);
    	print(b);    	
    }

}
