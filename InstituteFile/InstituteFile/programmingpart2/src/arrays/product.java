package arrays;

public class product 
{
	public static void main(String[] args) 
	{
		int a[]= {1,3,15,20,30};
        int pro=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0 && a[i]%3==0 && a[i]%5==0)
			{
				pro=pro*a[i];
			}
		}
		System.out.println(pro);
		
	}

}
