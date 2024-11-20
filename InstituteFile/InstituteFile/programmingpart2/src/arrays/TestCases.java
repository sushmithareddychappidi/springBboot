package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestCases 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No Of Elements:");
		int size=sc.nextInt();
		int elements[]=new int[size];
		boolean isNeg=false;
		for(int i=0;i<size;i++)
		{
			elements[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(elements[i]%2==0 )
			{
				System.out.println(elements[i]);
			}
			else if(elements[i]%2==0 && elements[i]<0)
			{
				isNeg=true;
			}

	
			
			
			/*if(elements[i]%2==0 && elements[i]>0)
			{
				System.out.println(elements[i]);
			}
			else if(elements[i]%2==0 && elements[i]<0)
			{
				isNeg=true;
			}*/
		}
		if(isNeg==true)
		{
			System.out.println("Array Contains negative even numbers");
		}
	}
		
}

