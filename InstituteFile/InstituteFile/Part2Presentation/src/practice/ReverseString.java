package practice;

import java.util.Scanner;

public class ReverseString 
{
	public static String reverse(String s)
	{
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev+=ch;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String sentence=String.join(" ", reverse(str[i]));
			System.out.println(sentence);
			//System.out.println(str[i]+ " after reverse "+reverse(str[i]));
		}		
	}

}
