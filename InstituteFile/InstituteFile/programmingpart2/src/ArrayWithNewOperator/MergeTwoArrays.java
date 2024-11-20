package ArrayWithNewOperator;

import java.util.Scanner;

public class MergeTwoArrays 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size1=sc.nextInt();
		int a[]=new int[size1];
		for(int i=0;i<size1;i++)
		{
			a[i]=sc.nextInt();
		}
		int size2=sc.nextInt();
		int b[]=new int[size2];
		for(int i=0;i<size2;i++)
		{
			b[i]=sc.nextInt();
		}
		int sizeMerged=size1+size2;
		int merge[]=new int[sizeMerged];
		//copy 1st array
		for(int i=0;i<size1;i++)
		{
			merge[i]=a[i];
		}
        //copy 2nd array
		for(int i=0;i<size2;i++)
		{
			merge[size1+i]=b[i];
		}
		//merged Array
		for(int i=0;i<sizeMerged;i++)
		{
			System.out.println(merge[i]);
		}
		
		
	}

}
