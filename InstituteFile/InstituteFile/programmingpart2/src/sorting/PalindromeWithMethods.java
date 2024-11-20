package sorting;

import java.util.Scanner;

public class PalindromeWithMethods 
{
	static Scanner sc=new Scanner(System.in);
	public static int[] createArray(int size)
	{
		int a[]=new int[size];
		return a;
	}
	public static int[] initialize(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static boolean isPalindrome(int n)
	{
		int rev=0;
		int temp=n;
		while(n!=0)
		{
			int dig=n%10;
			rev=rev*10+dig;
			n=n/10;
		}
		if(rev==temp )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int countPalindrome(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(isPalindrome(a[i]))
			{
				count++;
			}
		}
		return count;
	}
	public static int[] storePalindrome(int main[],int palin[])
	{
		int index=0;
		for(int i=0;i<main.length;i++)
		{
			if(isPalindrome(main[i]))
			{
				main[index++]=main[i];
			}
		}
		return palin;
	}
	public static int[] selectionSort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[index]>a[j])
				{
					index=j;
				}
			}
			if(index!=i)
			{
				int temp=a[index];
				a[index]=a[i];
				a[i]=temp;
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int size=sc.nextInt();
		int main[]=createArray(size);
		main=initialize(main);
		main=selectionSort(main);
		int palin[]=createArray(countPalindrome(main));
		palin=storePalindrome(main,palin);
		printArray(palin);
		
		
	}

}
