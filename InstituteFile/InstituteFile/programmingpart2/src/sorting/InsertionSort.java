package sorting;

import java.util.Scanner;

public class InsertionSort 
{
	static Scanner sc=new Scanner(System.in);
	public static int[] sort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			int ele=a[i];
			int pre=i-1;
			while(pre>=0 && ele<a[pre])
			{
				a[pre+1]=a[pre];
				pre--;
			}
			a[pre+1]=ele;
		}
		return a;
	}
	public static int binarySearch(int a[],int element)
	{
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(element==a[mid])
			{
				return mid;
			}
			else if(element>a[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;
	}
    public static void main(String[] args) 
    {
    	int a[]= {'l','k','m','p'};
    	a=sort(a);
    	if(binarySearch(a,'k')>-1)
    	{
    		System.out.println("near to vowel");
    	}
    	else
    	{
    		System.out.println("not near");
    	}
		
	}

}
