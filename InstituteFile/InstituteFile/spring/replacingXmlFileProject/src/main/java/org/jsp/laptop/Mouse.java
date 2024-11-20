package org.jsp.laptop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Mouse 
{
	private String brand;
	private String type;
	
	public Mouse() {
	}

	public Mouse(String brand, String type) {
		super();
		this.brand = brand;
		this.type = type;
	}
	

	public String getBrand() {
		return brand;
	}
    @Value("logitech")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}
    @Value("wired")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Mouse [brand=" + brand + ", type=" + type + "]";
	}
	
	

}
