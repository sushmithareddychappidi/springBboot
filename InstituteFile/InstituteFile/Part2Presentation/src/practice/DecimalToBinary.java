package practice;

import java.util.Scanner;

public class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int base=1;
		int count=0;
		while(n!=0)
		{
			int rem=n%2;
			sum=sum+(rem*base);
			base=base*10;
			n=n/2;
		}
		System.out.println("Binary digit: "+sum);
		while(sum!=0)
		{
			int ld=sum%10;
			if(ld==1)
			{
				count++;
			}
			sum=sum/10;
		}
		System.out.println("Number of 1's: "+count);
		if(count%2==0)
		{
			System.out.println("It is an Evil number");
		}
		else
		{
			System.out.println("It is not an Evil number");
		}
		
	}

}
