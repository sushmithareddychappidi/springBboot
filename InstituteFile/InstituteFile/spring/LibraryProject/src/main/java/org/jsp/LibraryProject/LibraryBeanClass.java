package org.jsp.LibraryProject;

public class LibraryBeanClass 
{
	private String name;
	private Type type;
	private Address address;
	private int noOfBooks;
	private String opentime;
	private String closetime;
	private Reader reader;
	private Admin admin;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	public String getOpentime() {
		return opentime;
	}
	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	public String getClosetime() {
		return closetime;
	}
	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "LibraryBeanClass [name=" + name + ", type=" + type + ", address=" + address + ", noOfBooks=" + noOfBooks
				+ ", opentime=" + opentime + ", closetime=" + closetime + ", reader=" + reader + ", admin=" + admin
				+ "]";
	}
	
	
	

}
