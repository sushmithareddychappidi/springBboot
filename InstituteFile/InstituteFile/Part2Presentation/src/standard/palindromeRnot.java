package standard;

import java.util.Scanner;

public class palindromeRnot 
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
	public static int summation(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];//2 3 4
		}
		System.out.println(sum);
		return sum;
	}
	public static int count(int sum)
	{
		int count=0;
		int temp=sum;
	    while(sum!=0)
	    {
	    	count++;
	    	sum=sum/10;
	    }
	    System.out.println(count);
		return count;
	}
	public static int palindrome(int sum)
	{
		int temp=sum;
		int rev=0;
	    while(temp!=0)
	    {
	      int dig=temp%10;
	      rev=rev*10+dig;
	      temp=temp/10;	    	
	    }
	    System.out.println(rev);
	    if(rev==sum)
	    {
	    	System.out.println("palindrome");
	    }
		return rev; 
	}
	public static void conditions(int rev)
	{
		if(rev>3)
		{
			System.out.println("Good Palindrome");
		}
		else if(rev>2 && rev<=3)
		{
			System.out.println("Average Palindrome");
		}
		else 
		{
			System.out.println("Bad Palindrome");
		}
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
		public static int[] convert(int a[])
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<0)
				{
					a[i]=a[i]*-1;
				}
			}
			return a;
		}

	public static void main(String[] args)
	{
		System.out.println("Enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		a=initialize(a);
		zeroes(a);
		negative(a);
		convert(a);	
	    int sum=summation(a);
		count(sum);
		palindrome(sum);
		conditions(sum);	
	}

}
