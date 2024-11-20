package sorting;

import java.util.Scanner;

public class PalindromeSort 
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
		System.out.println("Sorted array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		int count=0;
		int index=0;
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int rev=0;
			int temp=a[i];
			while(temp!=0)
			{
				int dig=temp%10;
				rev=rev*10+dig;
				temp=temp/10;
			}
			if(rev==a[i])
			{
				count++;
				b[index++]=a[i];
			}
		}
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println(b[i]);
		}
	
		
	}

}
