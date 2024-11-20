package org.jsp.ProjectAnnotation.Entity;

import java.io.Serializable;

public class Person implements Serializable
{
	private String name;
	private String address;
	private int age;
	private Product product;
	public Person() {
	
	}
	public Person(String name, String address, int age, Product product) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	

}
