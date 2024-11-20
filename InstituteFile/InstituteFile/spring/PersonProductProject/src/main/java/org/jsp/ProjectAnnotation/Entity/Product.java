package org.jsp.ProjectAnnotation.Entity;

public class Product 
{
	private String pro_name;
	private int quantity;
	public Product() {
	}
	public Product(String pro_name, int quantity) {
		this.pro_name = pro_name;
		this.quantity = quantity;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [pro_name=" + pro_name + ", quantity=" + quantity + "]";
	}
	

}
