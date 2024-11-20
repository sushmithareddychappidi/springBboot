package org.jsp.mvcClassConfig.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student1 
{
	@Id
	@Column(nullable=false,unique =true)
	private Integer sid;
	@Column(nullable=false)
	private String  sname;
	@Column(nullable=false)
	private String sbranch;
	@Column(nullable=false,unique =true)
	private String smail;
	@Column(nullable=false)
	private Double sper;
	@Column(nullable=false,unique =true)
	private String smobile;
	@Column(nullable=false)
	private Date sjDate;
	public student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	public String getSmail() {
		return smail;
	}
	public void setSmail(String smail) {
		this.smail = smail;
	}
	public Double getSper() {
		return sper;
	}
	public void setSper(Double sper) {
		this.sper = sper;
	}
	public String getSmobile() {
		return smobile;
	}
	public void setSmobile(String smobile) {
		this.smobile = smobile;
	}
	public Date getSjDate() {
		return sjDate;
	}
	public void setSjDate(Date sjDate) {
		this.sjDate = sjDate;
	}
	@Override
	public String toString() {
		return "student1 [sid=" + sid + ", sname=" + sname + ", sbranch=" + sbranch + ", smail=" + smail + ", sper="
				+ sper + ", smobile=" + smobile + ", sjDate=" + sjDate + "]";
	}
	

}
