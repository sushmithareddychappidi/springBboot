package sorting;

import java.util.Scanner;

public class Students 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int size=sc.nextInt();
		int score[]=new int[size];
		for(int i=0;i<score.length;i++)
		{
			score[i]=sc.nextInt();
		}
		for(int i=0;i<score.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<score.length;j++)//79 90 89 67
			{
				if(score[index]>score[j])
				{
					index=j;
				}
			}
			if(index!=i)
			{
				int temp=score[index];
				score[index]=score[i];
				score[i]=temp;
			}
		}
		System.out.println("Sorted scores: ");
		for(int i=0;i<score.length;i++)
		{
			System.out.println(score[i]+" ");
		}
	}

}
