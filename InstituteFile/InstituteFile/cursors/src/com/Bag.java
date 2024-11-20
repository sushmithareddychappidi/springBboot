package com;

public class Bag 
{
	private String brand;
	private int cost;
	private String color;
	private int noOfCompartments;
	public Bag()
	{
		
	}
	public Bag(String brand, int cost, String color, int noOfCompartments) 
	{
		if(brand.equalsIgnoreCase("adidas") || brand.equalsIgnoreCase("puma") || brand.equalsIgnoreCase("skybags") || brand.equalsIgnoreCase("wildcraft"))
		{
			this.brand = brand;
		}
		else
		{
			throw new brandMissMatchException();			
		}
		if(cost>=400 && cost<=1500)
		{
			this.cost = cost;
		}
		else
		{
			throw new InvalidCostException();						
		}
		if(color.equalsIgnoreCase("black") || color.equalsIgnoreCase("orange") || color.equalsIgnoreCase("blue"))
		{
			this.color = color;
		}
		else
		{
			throw new colorMissMatchException();			
		}
		if(noOfCompartments>=1 && noOfCompartments<=5)
		{
			this.noOfCompartments = noOfCompartments;
		}
		else
		{
			throw new InvalidNoOfCompartments();			
		}
	}
	public String getBrand() 
	{
		return brand;
	}
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
	public int getCost() 
	{
		return cost;
	}
	public void setCost(int cost) 
	{
		if(noOfCompartments>=1)
		{
			this.cost = cost;
		}
		else
		{
			throw new InvalidNoOfCompartments();
		}
	}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	public int getNoOfCompartments() 
	{
		return noOfCompartments;
	}
	public void setNoOfCompartments(int noOfCompartments) 
	{
		this.noOfCompartments = noOfCompartments;
	}
	public void display()
	{
		System.out.println("Bag Brand: "+getBrand());
		System.out.println("Bag Brand: "+getCost());
		System.out.println("Bag Brand: "+getColor());
		System.out.println("Bag Brand: "+getNoOfCompartments());
	}
	

}
