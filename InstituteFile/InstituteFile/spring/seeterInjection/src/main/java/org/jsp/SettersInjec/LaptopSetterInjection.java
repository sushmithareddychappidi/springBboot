package org.jsp.SettersInjec;

public class LaptopSetterInjection
{
	private String brand;
	private String color;
	private double price;
	private String proccessor;
	private int ram;
	private int ssd;
	private int display;
	public LaptopSetterInjection() {
		System.out.println("No Argument Constructor of laptop class");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		System.out.println("Setter Method Of brand ");
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		System.out.println("Setter Method Of color");
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("Setter Method Of price ");
		this.price = price;
	}
	public String getProccessor() {
		return proccessor;
	}
	public void setProccessor(String proccessor) {
		System.out.println("Setter Method Of processor");
		this.proccessor = proccessor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		System.out.println("Setter Method Of ram");
		this.ram = ram;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		System.out.println("Setter Method Of ssd ");
		this.ssd = ssd;
	}
	public int getDisplay() {
		return display;
	}
	public void setDisplay(int display) {
		System.out.println("Setter Method Of display");
		this.display = display;
	}
	@Override
	public String toString() {
		return "LaptopSetterInjection [brand=" + brand + ", color=" + color + ", price=" + price + ", proccessor="
				+ proccessor + ", ram=" + ram + ", ssd=" + ssd + ", display=" + display + "]";
	}
	
	
	
}
