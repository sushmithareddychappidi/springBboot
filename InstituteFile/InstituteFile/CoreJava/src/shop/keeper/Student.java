package shop.keeper;

public class Student 
{
	private static String clgName="cmr";
	private String stdName;
	public Student(String stdName)
	{
		int countAlpha=0;
		for(int i=0;i<=stdName.length()-1;i++)
		{
			char ch=stdName.charAt(i);
			if(Character.isAlphabetic(ch) || ch==' ')
			{
				countAlpha++;
			}
			else
			{
				System.out.println("invalid name");
			}
		}
		if(countAlpha==stdName.length())
		{
			this.stdName=stdName;
		}
		else
		{
			System.out.println("invalid data");
		}
		
	}
	public void display()
	{
		System.out.println("Student details---------");
		System.out.println("college name:"+clgName);
		System.out.println("student name:"+stdName);
	}

}
