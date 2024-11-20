package com;

import java.util.ArrayList;

public class evenOddprinting 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(2);
		al.add(7);
		al.add(3);
		al.add(4);
		al.add(6);
		//System.out.println(al);
		for(int i=0;i<=al.size()-1;i++)
		{
			Object o=al.get(i);
			Integer data=(Integer)o;
			if(data%2==0)
			{
				al.remove(data);
			}
		}
		System.out.println(al);
		
	}

}
