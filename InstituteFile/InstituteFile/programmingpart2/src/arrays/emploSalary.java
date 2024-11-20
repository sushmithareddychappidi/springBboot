package arrays;

public class emploSalary 
{
	public static void main(String[] args) 
	{
		int sal[]= {200,300,434,505,600,700};
		int count=0;
		for(int i=0;i<sal.length;i++)
		{
			int reverse=0;
			int temp=sal[i];
			while(temp!=0)
			{
				reverse=reverse*10+(temp%10);
				temp=temp/10;				
			}
			if(sal[i]==reverse)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
