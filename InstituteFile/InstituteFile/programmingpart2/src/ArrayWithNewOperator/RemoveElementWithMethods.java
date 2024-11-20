package ArrayWithNewOperator;

import java.util.Scanner;

public class RemoveElementWithMethods 
{
	static Scanner sc=new Scanner(System.in);
	public static int[] remove(int arr[])
	{
		int count=0;
		int b[]=new int[arr.length-count];
		int elementToBeREmoved=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==elementToBeREmoved)
			{
				count++;
			}
		}
		return b;
	}
	public static int[]
	

}
