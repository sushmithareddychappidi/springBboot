package com;
public class Bottle
{
	int capacity;
	int length;
	int cost;
	String brand;
	public Bottle(int capacity,int length,int cost,String brand)
	{
		this.capacity=capacity;
		this.length=length;
		this.cost=cost;
		this.brand=brand;
	}
	public String toString()
	{
		return capacity+" "+length+" "+cost+" "+brand;
	}
	public boolean equals(Object o)
	{
		Bottle b3=(Bottle)o;
		return this.brand.equalsIgnoreCase(b3.brand);
	}
	public void display()
	{
		System.out.println("capacity of the bottle:"+capacity);
		System.out.println("length of the bottle:"+length);
		System.out.println("Cost of the bottle:"+cost);
		System.out.println("Brand of the bottle:"+brand);
	}
}

