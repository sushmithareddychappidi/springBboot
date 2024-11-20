package com.jsp.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userInformation")
public class UserInfo 
{
	@Id
	@Column (name="Id")
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int id;
	@Column (name="first_name", nullable=false,length=60)
	private String firstname;
	@Column (name="last_name", nullable=false,length=50)
	private String lastname;
	@Column (name="Email_id", nullable=false,length=30)
	private String emailid;
	@Column (name="Password",unique=true, nullable=false,length=4)
	private String password;
	@Column (name="mobile_number",unique=true, nullable=false,length=10)
	private String mobilenum;
	private String gender;
	
	public UserInfo() {

	}
	public UserInfo(String firstname, String lastname, String emailid, String password, String mobilenum,
			String gender) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.password = password;
		this.mobilenum = mobilenum;
		this.gender = gender;
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
	public String getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "userinfo [firstname=" + firstname + ", lastname=" + lastname + ", emailid=" + emailid + ", password="
				+ password + ", mobilenum=" + mobilenum + ", gender=" + gender + "]";
	}
	
	
}
