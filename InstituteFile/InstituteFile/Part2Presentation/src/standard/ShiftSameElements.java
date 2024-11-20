package standard;

import java.util.Scanner;

public class ShiftSameElements 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					int temp=a[j];
					for(int k=j;k>=i+1;k--)
					{
						a[k]=a[k-1];
					}
					a[i+1]=temp;
					i++;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
