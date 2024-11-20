package org.jsp.SettersInjec;

public class LaptopInterfaceBeanClass 
{
	private String brand;
	private String color;
	private double price;
	private int ram;
	private int ssd;
	private int display;
	private  processor Procecessor;
	public LaptopInterfaceBeanClass() {
		System.out.println("No argument Constructor of Laptopclass");
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		System.out.println("Setter of brand");
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		System.out.println("Setter of color");
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("Setter of price");
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		System.out.println("Setter of ram");
		this.ram = ram;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		System.out.println("Setter of ssd");
		this.ssd = ssd;
	}
	public int getDisplay() {
		return display;
	}
	public void setDisplay(int display) {
		System.out.println("Setter of display");
		this.display = display;
	}
	public processor getProcecessor() {
		return Procecessor;
	}
	public void setProcecessor(processor procecessor) {
		System.out.println("Setter of proccessor");
		Procecessor = procecessor;
	}
	@Override
	public String toString() {
		return "LaptopInterfaceBeanClass [brand=" + brand + ", color=" + color + ", price=" + price + ", ram=" + ram
				+ ", ssd=" + ssd + ", display=" + display + ", Procecessor=" + Procecessor + "]";
	}
	
	

}
