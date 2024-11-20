package org.jsp.laptop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Keyboard 
{
	private String brand;
	private String color;
	
	public Keyboard() {
		super();
		
	}

	public Keyboard(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
    @Value("logi")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}
    @Value("pink")
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Keyboard [brand=" + brand + ", color=" + color + "]";
	}
	

}
