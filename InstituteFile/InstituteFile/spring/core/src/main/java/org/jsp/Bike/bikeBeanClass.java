package org.jsp.Bike;

public class bikeBeanClass
{
	private String name;
	private double cost;
	private String color;
	private petrol petrol;
	public bikeBeanClass() {
		
	}
	public bikeBeanClass(String name, double cost, String color, org.jsp.Bike.petrol petrol) {
		super();
		this.name = name;
		this.cost = cost;
		this.color = color;
		this.petrol = petrol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public petrol getPetrol() {
		return petrol;
	}
	public void setPetrol(petrol petrol) {
		this.petrol = petrol;
	}
	@Override
	public String toString() {
		return "bikeBeanClass [name=" + name + ", cost=" + cost + ", color=" + color + ", petrol=" + petrol + "]";
	}
	public void details()
	{
		System.out.println(toString());
	}
	
	
	

}
