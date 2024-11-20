package com.jsp.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the userinformation database table.
 * 
 */
@Entity
@Table(name="userinformation")
@NamedQuery(name="Userinformation.findAll", query="SELECT u FROM Userinformation u")
@NamedQueries({@NamedQuery(name="login" ,query="select user from Userinformation user where user.email_id=:mail and user.password=:pass") ,@NamedQuery(name="changepassword", query="update Userinformation userdetails set userdetails.password=:pw where userdetails.email_id=:mailId")})
public class Userinformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=30)
	private String email_id;

	@Column(name="first_name", nullable=false, length=60)
	private String firstName;

	@Column(length=255)
	private String gender;

	@Column(name="last_name", nullable=false, length=50)
	private String lastName;

	@Column(name="mobile_number", nullable=false, length=10)
	private String mobileNumber;

	@Column(nullable=false, length=4)
	private String password;

	public Userinformation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail_id() {
		return this.email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Userinformation [id=" + id + ", email_id=" + email_id + ", firstName=" + firstName + ", gender="
				+ gender + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + ", password=" + password + "]";
	}

	

}