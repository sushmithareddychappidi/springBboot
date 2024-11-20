package com.jsp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class PersonManyToMany 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personid;
	private String name;
	private String emailid;
	private String password;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="PersonParent")
	private List<MobileM2M> mobile;
	public PersonManyToMany() {

	}
	public PersonManyToMany(int personid, String name, String emailid, String password, List<MobileM2M> mobile) {
		super();
		this.personid = personid;
		this.name = name;
		this.emailid = emailid;
		this.password = password;
		this.mobile = mobile;
	}
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public List<MobileM2M> getMobile() {
		return mobile;
	}
	public void setMobile(List<MobileM2M> mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "PersonManyToMany [personid=" + personid + ", name=" + name + ", emailid=" + emailid + ", password="
				+ password + ", mobile=" + mobile + "]";
	}
	
	
	
	
}
