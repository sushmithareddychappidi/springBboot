package com.jsp.JPAData.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the usertable database table.
 * 
 */
@Entity
@Table(name="usertable")
@NamedQuery(name="Usertable.findAll", query="SELECT u FROM Usertable u")
public class Usertable  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=45)
	private String mobile;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dob;

	@Column(nullable=false, length=30)
	private String firstname;

	@Column(nullable=false, length=45)
	private String lastname;

	@Column(nullable=false, length=45)
	private String mailid;

	@Column(nullable=false, length=45)
	private String password;

	@Column(nullable=false, length=45)
	private String username;

	public Usertable() {
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMailid() {
		return this.mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Usertable [mobile=" + mobile + ", dob=" + dob + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", mailid=" + mailid + ", password=" + password + ", username=" + username + "]";
	}
	

}