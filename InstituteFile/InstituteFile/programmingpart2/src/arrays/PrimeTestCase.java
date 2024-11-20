package arrays;

import java.util.Scanner;

public class PrimeTestCase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int ele[]=new int[size];
		int esum=0;
		int osum=0;
		for(int i=0;i<ele.length;i++)
		{
			ele[i]=sc.nextInt();
			if(i%2==0 && i>0)
			{
				esum=esum+ele[i];
			}
			if(i%2!=0 && i>0)
			{
				osum=osum+ele[i];
			}
			else if(ele[i]==0)
			{
				System.out.println("Array contains zero elements");
			}
		}
		System.out.println(esum);
		System.out.println(osum);
		int count=0;
        for(int i=0;i<size;i++)
        {
            for(int j=1;j<=osum;j++)
		    {
		    	if(osum%j==0)
			    {
			    	count++;
			    }
		    }
            if(count==2)
    		{
    			System.out.println("jsp");
    		}
    		else
    		{
    			System.out.println("qsp");
    		}
        }	
	}

}
