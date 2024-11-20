package ArrayWithNewOperator;

import java.util.Scanner;

public class HighestSalary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int sal[]=new int[size];
		for(int i=0;i<sal.length;i++)
		{
			sal[i]=sc.nextInt();
		}
		int highest=sal[0];
		for(int i=0;i<sal.length;i++)
		{
			if(highest<sal[i])
			{
				highest=sal[i];
			}
		}
		System.out.println(highest);
	}

}
