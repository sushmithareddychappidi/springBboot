package org.jsp.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class bankBeanClass 
{
	private String name;
	private String branch;
	private String ifsc;
	@Autowired
	private Address address;
	@Autowired
	//@Qualifier("sa")
	private Account acc;
	public bankBeanClass() {
		System.out.println("No Argument Constructor of Bank Class");
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	@Override
	public String toString() {
		return "bankBeanClass [name=" + name + ", branch=" + branch + ", ifsc=" + ifsc + ", address=" + address
				+ ", acc=" + acc + "]";
	}
	
	
	

}
