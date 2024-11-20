package arrays;

public class employeeId 
{
	public static void main(String[] args) 
	{
		int empid[]= {100,101,102,103,104,105,106,107,108,109};
		for(int i=0;i<empid.length;i++)
		{
			int count=0;
			for(int j=1;j<=empid[i];j++)
			{
				if(empid[i]%j==0)
				{
					count++;
				}
			}
			if(count>2)
			{
				System.out.println(empid[i]);
			}
		}
		
		
	}

}
