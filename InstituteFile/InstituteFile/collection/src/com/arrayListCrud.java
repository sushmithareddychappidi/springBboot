package com;

import java.util.ArrayList;

public class arrayListCrud 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("sushmi");
		al.add(25.1);
		al.add(true);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(700);
		al.add(8,600);
		al.add('a');
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			al.get(i);
		}
		System.out.println(al);
		al.set(3,false);
		System.out.println(al);
		al.remove(new String("sushmi"));
		System.out.println(al);
		al.add(null);
		System.out.println(al);
		
		
		
	}

}
