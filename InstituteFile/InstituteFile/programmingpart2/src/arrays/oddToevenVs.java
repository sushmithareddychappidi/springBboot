package arrays;

public class oddToevenVs 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5,6,4};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				int odd=a[i]+1;
				System.out.println(odd);
			}
			else
			{
				int even=a[i]+1;
				System.out.println(even);
			}
		}
		
	}

}
