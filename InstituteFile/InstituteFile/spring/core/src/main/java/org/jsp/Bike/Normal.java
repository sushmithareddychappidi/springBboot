package org.jsp.Bike;

public class Normal implements petrol 
{
	private String brand;
	private double cost;
	private int mileage;
	public Normal() {
		
	}
	public Normal(String brand, double cost, int mileage) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.mileage = mileage;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Normal [brand=" + brand + ", cost=" + cost + ", mileage=" + mileage + "]";
	}
	public void details()
	{
		System.out.println(toString());
	}
	@Override
	public void getInfo() {

		
	}

}
