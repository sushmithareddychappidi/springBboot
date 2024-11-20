package org.jsp.laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class laptop 
{
	private String name;
	private String brand;
	private String color;
	private double price;
	private Keyboard keyboard;
	private Mouse mouse;
	private Cpu cpu;
	public laptop() {
	}
	public laptop(String name, String brand, String color, double price, Keyboard keyboard, Mouse mouse, Cpu cpu) {
		super();
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.keyboard = keyboard;
		this.mouse = mouse;
		this.cpu = cpu;
	}
	public String getName() {
		return name;
	}
	@Value("hp pavilion")
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	@Value("hp")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	@Value("grey")
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	@Value("50000")
	public void setPrice(double price) {
		this.price = price;
	}
	public Keyboard getKeyboard() {
		return keyboard;
	}
	@Autowired
	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	public Mouse getMouse() {
		return mouse;
	}
	@Autowired
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public Cpu getCpu() {
		return cpu;
	}
	@Autowired
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return "laptop [name=" + name + ", brand=" + brand + ", color=" + color + ", price=" + price + ", keyboard="
				+ keyboard + ", mouse=" + mouse + ", cpu=" + cpu + "]";
	}
	
	

}
