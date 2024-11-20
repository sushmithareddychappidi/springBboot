package com;

import java.util.ArrayList;

public class LaptopMainClass 
{
	public static void main(String[] args) 
	{
		LaptopBeanClass l1=new LaptopBeanClass("hp",60000,16,"black",2);	
		LaptopBeanClass l2=new LaptopBeanClass("asus",60000,16,"black",2);
		LaptopBeanClass l3=new LaptopBeanClass("dell",60000,16,"black",2);
		
		ArrayList<LaptopBeanClass> al=new ArrayList<LaptopBeanClass>();
		al.add(l1);
		al.add(l2);
		al.add(l3);
		for(LaptopBeanClass lap:al)
		{
			if(lap.getCost()>50000)
			{
				System.out.println("Cost: "+lap.getCost());
			}
		}
		System.out.println("--------------------");
		for(LaptopBeanClass lap:al)
		{
			if(lap.getRam()>30)
			{
				System.out.println("Brand: "+lap.getBrand());
				System.out.println("Cost: "+lap.getCost());				
			}
		}
		System.out.println("---------------------");
		for(LaptopBeanClass lap:al)
		{
			if(lap.getBrand().equalsIgnoreCase("dell"))
			{
				lap.setColor("msd");
			}
		}
		
	}

}
