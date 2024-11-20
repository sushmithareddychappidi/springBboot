package com.jsp.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int p_Id;

	private int discount;

	@Column(length=50)
	private String p_Brand;

	@Column(length=50)
	private String p_Category;

	@Column(nullable=false, length=40)
	private String p_Name;

	@Column(nullable=false)
	private double p_Price;

	@Column(length=5)
	private String p_Review;

	private int quantity;

	public Product() {
	}

	public int getP_Id() {
		return this.p_Id;
	}

	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}

	public int getDiscount() {
		return this.discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getP_Brand() {
		return this.p_Brand;
	}

	public void setP_Brand(String p_Brand) {
		this.p_Brand = p_Brand;
	}

	public String getP_Category() {
		return this.p_Category;
	}

	public void setP_Category(String p_Category) {
		this.p_Category = p_Category;
	}

	public String getP_Name() {
		return this.p_Name;
	}

	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}

	public double getP_Price() {
		return this.p_Price;
	}

	public void setP_Price(double p_Price) {
		this.p_Price = p_Price;
	}

	public String getP_Review() {
		return this.p_Review;
	}

	public void setP_Review(String p_Review) {
		this.p_Review = p_Review;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
//wrap to display the quantity of the product if the brand is puma