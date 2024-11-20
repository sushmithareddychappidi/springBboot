package org.jsp.componentinjectionusingConstructor;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Mobile 
{
	private String brand;
	private double price;
	private int memory;
	private Date date;
	public Mobile() 
	{
		System.out.println("No-Argument Constructor");
	}
	
//	public Mobile(@Value("poco")String brand, @Value("30000")double price,@Value("3") int memory, Date date) {
//		System.out.println("Argument constructor");
//		this.brand = brand;
//		this.price = price;
//		this.memory = memory;
//		this.date = date;
//	}

	public String getBrand() {
		return brand;
	}
	//@Value("Realme")
	public void setBrand(String brand) {
		System.out.println("Setter of Brand");
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	//@Value("10000")
	public void setPrice(double price) {
		System.out.println("Setter of Price");
		this.price = price;
	}
	public int getMemory() {
		return memory;
	}
	//@Value("100")
	public void setMemory(int memory) {
		System.out.println("Setter of Memory");
		this.memory = memory;
	}
	public Date getDate() {
		return date;
	}
	@Autowired
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", memory=" + memory + ", date=" + date + "]";
	}
	
	
}
