package com;

public class Laptop 
{
	String brand;
	String color;
	int cost;
	int ram;
	public Laptop(String brand,String color,int cost,int ram)
	{
		this.brand=brand;
		this.color=color;
		this.cost=cost;
		this.ram=ram;
	}
	public void display()
	{
		System.out.println(brand);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(ram);
	}
	public String toString()
	{
		return brand+" "+color+" "+cost+" "+ram;
	}
	public static void main(String[] args)
	{
		Laptop l=new Laptop("hp","grey",50000,125);
		Laptop l1=new Laptop("asus","black",70000,225);
		Laptop l2=new Laptop("apple","grey",100000,355);
		Laptop l3=new Laptop("lenovo","grey",40000,205);
		System.out.println(l.toString());
		System.out.println(l1.toString());
		System.out.println(l2.equals(l3));
		System.out.println(l.hashCode());
		System.out.println(l3.hashCode());
		l.display();
	}
}
