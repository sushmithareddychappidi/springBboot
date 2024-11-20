package arrays;

public class evenPalindromeSum 
{
	public static void main(String[] args) 
	{
		int a[]= {22,44,33,66,77,88,99};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int reverse=0;
			if(a[i]%2==0)
			{
				while(a[i]!=0)
				{
					int dig=a[i]%10;
					reverse=reverse*10+dig;
					a[i]=a[i]/10;
				}
				if(temp==reverse)
				{
					System.out.println(temp);
					sum=sum+reverse;
				}
			}
		}
		System.out.println(sum);
		
		
	}

}
