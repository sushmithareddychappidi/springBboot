package com.jsp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class MobileM2M 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mobileid;
	private String mobilename;
	private String mobilebrand;
	private double mobileprice;
	@ManyToMany
	@JoinTable(name="MobileParent")
	private List<PersonManyToMany> persons;
	public MobileM2M() {
	}
	public MobileM2M(int mobileid, String mobilename, String mobilebrand, double mobileprice,
			List<PersonManyToMany> persons) {
		super();
		this.mobileid = mobileid;
		this.mobilename = mobilename;
		this.mobilebrand = mobilebrand;
		this.mobileprice = mobileprice;
		this.persons = persons;
	}
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	public String getMobilename() {
		return mobilename;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	public String getMobilebrand() {
		return mobilebrand;
	}
	public void setMobilebrand(String mobilebrand) {
		this.mobilebrand = mobilebrand;
	}
	public double getMobileprice() {
		return mobileprice;
	}
	public void setMobileprice(double mobileprice) {
		this.mobileprice = mobileprice;
	}
	public List<PersonManyToMany> getPersons() {
		return persons;
	}
	public void setPersons(List<PersonManyToMany> persons) {
		this.persons = persons;
	}
	@Override
	public String toString() {
		return "MobileM2M [mobileid=" + mobileid + ", mobilename=" + mobilename + ", mobilebrand=" + mobilebrand
				+ ", mobileprice=" + mobileprice + "]";
	}
	
	
}
