package ArrayWithNewOperator;

import java.util.Scanner;

public class ShiftZeroesToLast 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int tempIndex=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[tempIndex++]=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
