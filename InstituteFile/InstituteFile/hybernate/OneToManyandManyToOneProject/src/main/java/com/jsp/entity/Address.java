package com.jsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressid;
	private String village;
	private String city;
	private String state;
	private int pincode;
	private DetailsOfPerson persondetails;
	public Address() {
	
	}
	public Address(int addressid, String village, String city, String state, int pincode) {
		super();
		this.addressid = addressid;
		this.village = village;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.persondetails=persondetails;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public DetailsOfPerson getPersondetails() {
		return persondetails;
	}
	public void setPersondetails(DetailsOfPerson persondetails) {
		this.persondetails = persondetails;
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", village=" + village + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", persondetails=" + persondetails + "]";
	}
	
	
	

}
