package arrays;

import java.util.Scanner;

public class ArrayHighestPositiveNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int ele[]=new int[size];
		int highest=ele[0];
		for(int i=0;i<size;i++)
		{
			ele[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(highest<ele[i])
			{
				highest=ele[i];
			}
		}
		System.out.println(highest);
		int high=0;
		for(int i=0;i<size;i++)
		{
			if(high<ele[i])
			{
				if(ele[i]%2==0)
				{
					high=ele[i];
				}
			}
		}
		System.out.println(high);
		
	}

}
