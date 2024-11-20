package org.jsp.customerproject;

import java.util.Date;

public class customerBeanClass 
{
	private String name;
	private Date date;
	private String Mobileno;
	private Addressinterface address;
	private ProductInterface product;
	private String email;
	private String username;
	private String password;
	public customerBeanClass() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMobileno() {
		return Mobileno;
	}
	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}
	public Addressinterface getAddress() {
		return address;
	}
	public void setAddress(Addressinterface address) {
		this.address = address;
	}
	public ProductInterface getProduct() {
		return product;
	}
	public void setProduct(ProductInterface product) {
		this.product = product;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "customerBeanClass [name=" + name + ", date=" + date + ", Mobileno=" + Mobileno + ", address=" + address
				+ ", product=" + product + ", email=" + email + ", username=" + username + ", password=" + password
				+ "]";
	}
	public void createDate()
	{
		int  Date1=date.getDate();
		System.out.println(Date1);
	}
	
	

}
