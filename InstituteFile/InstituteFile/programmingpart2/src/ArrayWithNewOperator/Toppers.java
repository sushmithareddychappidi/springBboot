package ArrayWithNewOperator;

import java.util.Scanner;

public class Toppers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students");
		int students=sc.nextInt();
		String names[]=new String[students];
		int score[]=new int[students];
		for(int i=0;i<students;i++)
		{
			System.out.println("Enter student "+(i+1)+ ": ");
			names[i]=sc.next();
			System.out.println("Enter score "+(i+1)+ ": ");
			score[i]=sc.nextInt();
		}
		String firstTopper="";
		String secondTopper="";
		int highest=Integer.MIN_VALUE;
		for(int i=0;i<students;i++)
		{
			if(score[i]>highest)
			{
				secondTopper=firstTopper;
				firstTopper=names[i];
				highest=score[i];
			}
			else if(scores[i]>)
		}
		
	}

}
