package org.jsp.ProjectAnnotation.Entity;

import java.io.Serializable;

public class Student implements Serializable
{
	private String std_id;
	private String std_name;
	private String std_mail;
	private String std_phno;
	private int std_marks;
	private String std_branch;
	public Student() {
	
	}
	public String getStd_id() {
		return std_id;
	}
	public void setStd_id(String std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_mail() {
		return std_mail;
	}
	public void setStd_mail(String std_mail) {
		this.std_mail = std_mail;
	}
	public String getStd_phno() {
		return std_phno;
	}
	public void setStd_phno(String std_phno) {
		this.std_phno = std_phno;
	}
	public int getStd_marks() {
		return std_marks;
	}
	public void setStd_marks(int std_marks) {
		this.std_marks = std_marks;
	}
	public String getStd_branch() {
		return std_branch;
	}
	public void setStd_branch(String std_branch) {
		this.std_branch = std_branch;
	}
	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", std_mail=" + std_mail + ", std_phno="
				+ std_phno + ", std_marks=" + std_marks + ", std_branch=" + std_branch + "]";
	}
	
	

}
