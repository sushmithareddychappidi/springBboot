package ArrayWithNewOperator;

import java.util.Scanner;

public class RemoveElement 
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
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		int removeElement=sc.nextInt();
		int indexToRemove=-1;
		for(int i=0;i<size;i++)
		{
			if(a[i]==removeElement)
			{
				indexToRemove=i;
				break;
			}
		}
		if(indexToRemove!=-1)
		{
			for(int i=indexToRemove;i<size-1;i++)
			{
				a[i]=a[i+1];
			}
			size--;
			for(int i=0;i<size;i++)
			{
				System.out.println(a[i]);
			}
		}
		else
		{
			System.out.println("element not found");
		}
	}
}
