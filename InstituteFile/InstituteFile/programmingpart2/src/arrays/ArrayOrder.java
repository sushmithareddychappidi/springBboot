package arrays;

import java.util.Scanner;

public class ArrayOrder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int ele[]=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			boolean status=true;
			for(int j=i+1;j<ele.length;j++)
			{
			   if(ele[i]<ele[j])
			   {
				   status=false;
				   break;
			   }
			}
			if(status)
			{
				System.out.println(ele[i]);
			}
		}
		
	}

}
