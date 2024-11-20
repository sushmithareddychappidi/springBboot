package com;
import java.util.Scanner;

public class BottleMainClass
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a b c d");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		String d=sc.next();
		Bottle bottle1=new Bottle(a,b,c,d);
		/*int a1=sc.nextInt();
		int b1=sc.nextInt();
		int c1=sc.nextInt();
		String d1=sc.next();
		Bottle bottle2=new Bottle(a1,b1,c1,d1);*/
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		int c2=sc.nextInt();
		String d2=sc.next();
		Bottle bottle3=new Bottle(a2,b2,c2,d2);
		System.out.println(bottle1.toString());
		System.out.println(bottle3.toString());
		bottle3.display();
		System.out.println(d.equals(d2));
		sc.close();
	}
}
