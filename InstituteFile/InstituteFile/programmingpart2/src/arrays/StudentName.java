package arrays;

public class StudentName
{
	public static void main(String[] args) 
	{
		char name[]= {'a','@','$','e','i','s','o','w','u','t','v','r'};
		for(int i=0;i<name.length;i++)
		{
			if(name[i]=='a' || name[i]=='e' || name[i]=='i' || name[i]=='o' || name[i]=='u')				
			{
				System.out.println(name[i]);				
			}
		}
	}

}
