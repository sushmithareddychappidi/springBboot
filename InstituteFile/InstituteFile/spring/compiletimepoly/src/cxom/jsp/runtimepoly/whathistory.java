package cxom.jsp.runtimepoly;

import java.util.Scanner;

public class whathistory 
{
	public static whatsapp getw1chatlist1()
	{
		return new w1();
	}
	public static whatsapp getw2chatlist2()
	{
		return new w2();
	}
	public static void main(String [] args)
	{
		whatsapp w;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1->
		{
			w=getw1chatlist1();
			w.showchartlist();
		}
		case 2->
		{
			w=getw2chatlist2();
			w.showchartlist();
		}
		}
		
	}
}
