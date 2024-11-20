package ArrayWithNewOperator;

import java.util.Scanner;

public class ReplaceElement 
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
	public static int[] add(int arr[])
	{
		int b[]=new int[arr.length];
		int elementToReplace=sc.nextInt();
		int replaceElement=sc.nextInt();
		int tempIndex=0;
		for(int i=0;i<b.length;i++)
		{
				if(arr[i]==elementToReplace)
				{
					b[i]=replaceElement;
				}
				else
				{
					b[i]=arr[tempIndex++];
				}
		}
		return b;
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
    	int added[]=add(a);
    	print(added);
    	
    }

}
