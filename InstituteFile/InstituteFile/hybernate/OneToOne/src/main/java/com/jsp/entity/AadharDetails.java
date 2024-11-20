package com.jsp.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AadharDetails 
{
	@Id
	private long aadharno;
	private String address;
	private String mobilenum;
	private Date Dob;
	private String pincode;
	private PersonDetails persondetails;
	public AadharDetails() {

	}

	public AadharDetails(long aadharno, String address, String mobilenum, Date dob, String pincode,
			PersonDetails persondetails) {
		super();
		this.aadharno = aadharno;
		this.address = address;
		this.mobilenum = mobilenum;
		Dob = dob;
		this.pincode = pincode;
		this.persondetails = persondetails;
	}

	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public PersonDetails getPersondetails() {
		return persondetails;
	}

	public void setPersondetails(PersonDetails persondetails) {
		this.persondetails = persondetails;
	}

	@Override
	public String toString() {
		return "AadharDetails [aadharno=" + aadharno + ", address=" + address + ", mobilenum=" + mobilenum + ", Dob="
				+ Dob + ", pincode=" + pincode + ", persondetails=" + persondetails + "]";
	}

}
