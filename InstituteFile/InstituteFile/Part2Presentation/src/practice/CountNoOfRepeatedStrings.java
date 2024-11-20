package practice;

import java.util.Scanner;

public class CountNoOfRepeatedStrings 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str[]=s.split(" ");
		//array to  keep track of word counts
		int []wordCount=new int[str.length];
		for(int i=0;i<wordCount.length;i++)
		{
			wordCount[i]=0;
		}
		for(int i=0;i<str.length;i++)
		{
			if(wordCount[i]!=-1)
			{
				int count=1;
				for(int j=i+1;j<str.length;j++)
				{
					if(str[i].equalsIgnoreCase(str[j]))
					{
						count++;
						wordCount[j]=-1;
					}
				}
				if(count>1)
				{
					System.out.println(str[i]+" is repeated :" +count+" times");
				}
			}
		}
	}
}
