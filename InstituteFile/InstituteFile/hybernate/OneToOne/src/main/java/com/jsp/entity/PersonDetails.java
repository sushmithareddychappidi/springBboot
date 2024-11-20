package com.jsp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PersonDetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int personid;
	private String firstname;
	private String lastname;
	private String mailid;
	private String password;
	private String gender;
	@OneToOne(cascade=CascadeType.ALL)
	private AadharDetails aadhardetails;
	public PersonDetails() {
		
	}
	public PersonDetails(int personid, String firstname, String lastname, String mailid, String password,
			String gender, AadharDetails aadhardetails) {
		super();
		this.personid = personid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mailid = mailid;
		this.password = password;
		this.gender = gender;
		this.aadhardetails = aadhardetails;
	}
	public long getPersonid() {
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
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public AadharDetails getAadhardetails() {
		return aadhardetails;
	}
	public void setAadhardetails(AadharDetails aadhardetails) {
		this.aadhardetails = aadhardetails;
	}
	@Override
	public String toString() {
		return "PersonDetails [personid=" + personid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", mailid=" + mailid + ", password=" + password + ", gender=" + gender + "]";
	}
}
