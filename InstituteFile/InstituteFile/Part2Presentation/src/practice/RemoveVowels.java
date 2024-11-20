package practice;

public class RemoveVowels 
{
	public static void main(String[] args) 
	{
		String s="iouae123";
		String s1=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			ch=Character.toLowerCase(ch);
			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
			{
				s1+=ch;
			}
		}
		System.out.println(s1);
	}

}
