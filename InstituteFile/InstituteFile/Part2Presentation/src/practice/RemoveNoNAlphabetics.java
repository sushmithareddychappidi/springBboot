package practice;

import java.util.Scanner;

public class RemoveNoNAlphabetics 
{
	public static String removeAlphabets(String s)
	{
		String res=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				res=res+ch;
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
			System.out.println(str[i]+" After Removing: " + removeAlphabets(str[i]));
		}
	}

}
