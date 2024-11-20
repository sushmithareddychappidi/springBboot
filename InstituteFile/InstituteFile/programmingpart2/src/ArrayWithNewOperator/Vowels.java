package ArrayWithNewOperator;

import java.util.Scanner;

public class Vowels 
{
	public static void main(String[] args) 
	{
		char ch[]= new char[10];
		for(int x:ch) System.out.println(x);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		for(char x:ch)
		{
			System.out.println(x);
		}	
	}

}
