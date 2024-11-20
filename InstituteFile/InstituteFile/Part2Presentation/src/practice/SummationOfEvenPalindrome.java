package practice;

import java.util.Scanner;

public class SummationOfEvenPalindrome 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int rev=0;
			int temp=a[i];
			if(a[i]%2!=1)
			{
				while(a[i]!=0)
				{
					int dig=a[i]%10;
					rev=rev*10+dig;
					a[i]=a[i]/10;
				}
			}
			if(rev==temp)
			{
				sum=sum+rev;
			}
		}
		System.out.println(sum);
	}
}