package practice;

import java.util.Scanner;

public class SumOfEachDigit 
{
	public static int sum(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				sum+=Character.getNumericValue(ch);
			}
		}
		///sush234 456reddy
		
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]+"  sum  of digits: "+sum(str[i]));
		}
		
	}

}
