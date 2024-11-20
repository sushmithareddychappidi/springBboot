package org.jsp.customerproject;

public class shirtImple implements ProductInterface
{
	private String type;
	private String color;
	private double cost;
	private int quantity;
	private String size;
	

	public shirtImple() {
		System.out.println("No argument constructor of shirt");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		System.out.println("Setter of type");
		this.type = type;
	}
    public String getColor() {
		return color;
	}
	public void setColor(String color) {
		System.out.println("Setter of color");
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		System.out.println("Setter of cost");
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		System.out.println("Setter of quantity");
		this.quantity = quantity;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		System.out.println("Setter of size");
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "shirtImple [type=" + type + ", color=" + color + ", cost=" + cost + ", quantity=" + quantity + ", size="
				+ size + "]";
	}
	@Override
	public void getInfo() {
		
		System.out.println(toString());
	}

}
