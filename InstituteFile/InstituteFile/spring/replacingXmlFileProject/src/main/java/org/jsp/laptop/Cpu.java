package org.jsp.laptop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cpu 
{
	private String brand;
	private String memory;
	public Cpu() {
	}
	public Cpu(String brand, String memory) {
		super();
		this.brand = brand;
		this.memory = memory;
	}
	
	public String getBrand() {
		return brand;
	}
	@Value("asus")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMemory() {
		return memory;
	}
	@Value("69")
	public void setMemory(String memory) {
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "Cpu [brand=" + brand + ", memory=" + memory + "]";
	}
	
	
	

}
