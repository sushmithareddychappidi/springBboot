package practice;

import java.util.Scanner;

public class RemoveVowelsinEachWord 
{
	public static String remove(String s)
	{
		String res=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			ch=Character.toLowerCase(ch);
			if(Character.isAlphabetic(ch))
			{
				if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
				{
					res+=ch;
				}
			}
		}
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]+ " After removing vowels: "+remove(str[i]));
		}
		
	}

}
