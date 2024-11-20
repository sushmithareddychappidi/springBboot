package ArrayWithNewOperator;

import java.util.Scanner;

public class AddingNewElement 
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
		int addElement=sc.nextInt();
		int newArray[]=new int[size+1];
		for(int i=0;i<size;i++)
		{
			newArray[i]=a[i];
		}
		newArray[size]=addElement;
		for(int i=0;i<newArray.length;i++)
		{
			System.out.println(newArray[i]);
		}
	}

}
