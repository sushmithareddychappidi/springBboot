package practice;

public class SortString 
{
	public static void main(String[] args) 
	{
		String s="Sushmitha Sushmitha reddy";
		String str[]=s.split(" ");
		int count=0;
		String res=" ";
		for(int i=0;i<str.length;i++)
		{		
			if((str[i]==str[i+1]))
			{
				count++;
			}
			System.out.println(str[i]);
		}
		if(count>1)
		{
			res+=str[];
		}
	}
}
