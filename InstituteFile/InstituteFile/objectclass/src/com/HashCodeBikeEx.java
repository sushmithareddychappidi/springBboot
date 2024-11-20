package com;

public class HashCodeBikeEx 
{
	private String brand;
	private int cost;
	private int milage;
	private String color;
	private int chasiNo;
	public HashCodeBikeEx()
	{
		
	}
	public HashCodeBikeEx(String brand, int cost, int milage, String color, int chasiNo) {
		this.brand = brand;
		this.cost = cost;
		this.milage = milage;
		this.color = color;
		this.chasiNo = chasiNo;
	}
	public String getBrand() {
		return brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getChasiNo() {
		return chasiNo;
	}
	public void setChasiNo(int chasiNo) {
		this.chasiNo = chasiNo;
	}
	public void display()
	{
		System.out.println("Bike Brand: "+getBrand());
		System.out.println("Bike Cost: "+getCost());
		System.out.println("Bike Milage: "+getMilage());
		System.out.println("Bike Color: "+getColor());
		System.out.println("Bike ChasiNo: "+getChasiNo());
	}
	
	@Override
	public String toString() {
		return "HashCodeBikeEx [cost=" + cost + ", milage=" + milage + "]";
	}
	public boolean equals(Object o)
	{
		HashCodeBikeEx b3=(HashCodeBikeEx)o;
		return this.getBrand().equalsIgnoreCase(b3.getBrand());
	}
	public int hashCode()
	{
		return chasiNo;
	}

}
