package com;

public class LaptopBeanClass 
{
	private String brand;
	private int cost;
	private int ram;
	private String color;
	private int storage;
	public LaptopBeanClass()
	{
		
	}
	public LaptopBeanClass(String brand, int cost, int ram, String color, int storage) 
	{
		if(brand.equalsIgnoreCase("hp")|| brand.equalsIgnoreCase("dell")|| brand.equalsIgnoreCase("asus"))
		{
			this.brand = brand;			
		}
		else
		{
			System.out.println("invalid brand");
		}
		if(cost>=30000 && cost<=90000)
		{
			this.cost = cost;			
		}
		else
		{
			System.out.println("invalid cost");
		}
		if(ram>=15 && ram<=64)
		{
			this.ram = ram;
		}
		else
		{
			System.out.println("invalid ram");
		}
		if(color.equalsIgnoreCase("black")||color.equalsIgnoreCase("white") || color.equalsIgnoreCase("red")||color.equalsIgnoreCase("blue"))
		{
			this.color = color;	
		}
		if(storage>=1 && storage<=100)
		{
			this.storage = storage;	
		}
		else
		{
			System.out.println("Invalid Storage");
		}
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public int getCost()
	{
		return cost;
	}
	public void setRam(int ram)
	{
		this.ram=ram;
	}
	public int getRam()
	{
		return ram;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public void setStorage(int storage)
	{
		this.storage=storage;
	}
	public int getStorage()
	{
		return storage;
	}
	public void display()
	{
		System.out.println("Laptop Brand: "+getBrand());
		System.out.println("Laptop Cost: "+getCost());
		System.out.println("Laptop Ram: "+getRam());
		System.out.println("Laptop Color: "+getColor());
		System.out.println("Laptop Storage: "+getStorage());
	}
	@Override
	public String toString()
	{
		return "\n  Brand: "+getBrand()+
				"\n  Cost: "+getCost()+
				"\n  Ram: "+getRam()+
				"\n  Color: "+getColor()+
				"\n  Storage: "+getStorage()+
				"\n----------------------------";
	}

}
