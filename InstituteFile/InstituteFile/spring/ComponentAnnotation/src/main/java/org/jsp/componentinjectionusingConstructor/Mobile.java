package org.jsp.componentinjectionusingConstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile 
{
	private String brand;
	private double price;
	private int memory;
//	public Mobile() 
//	{
//		System.out.println("No-Argument Constructor");
//	}
	public Mobile(@Value("Samsung")String brand,@Value("30000") double price,@Value("60") int memory) 
	{
		System.out.println("Argument Constructor");
		this.brand = brand;
		this.price = price;
		this.memory = memory;
		System.out.println(brand);
		System.out.println(price);
		System.out.println(memory);
	}
	public String getBrand() {
		return brand;
	}
	@Value("Realme")
	public void setBrand(String brand) {
		System.out.println("Setter of Brand");
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	@Value("10000")
	public void setPrice(double price) {
		System.out.println("Setter of Price");
		this.price = price;
	}
	public int getMemory() {
		return memory;
	}
	@Value("100")
	public void setMemory(int memory) {
		System.out.println("Setter of Memory");
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", memory=" + memory + "]";
	}
	
	
}
