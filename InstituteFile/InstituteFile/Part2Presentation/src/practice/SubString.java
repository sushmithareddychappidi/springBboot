package practice;

public class SubString 
{
	public static void main(String[] args) 
	{
		String s="acbaxabcqrp";
		String rev=" ";
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+2;j<=s.length();j++)
			{
				String res=s.substring(i,j);
				for(int k=s.length()-1;k>=0;k--)
				{
					char ch=s.charAt(k);
					rev+=ch;
					if(rev==res)
					{
						System.out.println(rev);
					}
				}
			}

		}
		
	}
}
