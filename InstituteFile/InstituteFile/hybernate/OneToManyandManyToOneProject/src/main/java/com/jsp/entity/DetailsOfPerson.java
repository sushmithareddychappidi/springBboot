package com.jsp.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class DetailsOfPerson 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personid;
	private String firstname;
	private String lastname;
	private String emailid;
	private String password;
	private String mobilenumber;
	private Date dateOfBirth;
	private String gender;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Address> addresses;
	public DetailsOfPerson() {

	}
	
	public DetailsOfPerson(int personid, String firstname, String lastname, String emailid, String password,
			String mobilenumber, Date dateOfBirth, String gender, List<Address> addresses) {
		super();
		this.personid = personid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.addresses = addresses;
	}

	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "DetailsOfPerson [personid=" + personid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", emailid=" + emailid + ", password=" + password + ", mobilenumber=" + mobilenumber
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + "]";
	}

	
	
	
	

}
