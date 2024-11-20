package ArrayWithNewOperator;

import java.util.Scanner;

public class LeastLargestPositiveNUm 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int leastHighest=a[0];
		for(int i=0;i<size;i++)
		{
			if(leastHighest>a[i])
			{
				leastHighest=a[i];//10,30,60,5,4
			}
		}
	}
}
