package com.jsp.poly;

public class main 
{
	public static void main(String[] args)
	{
		inter a=new bimpleclass();
		a.add();
		inter b=new cimpleclass();
		b.add();
		inter c=new inter()
		{
			public void add()
			{
				System.out.println("anonymoums class");
			}
			public void test()
			{
				System.out.println("anonymous testing");
			}
		};
		c.add();
		c.test();
	}
}
