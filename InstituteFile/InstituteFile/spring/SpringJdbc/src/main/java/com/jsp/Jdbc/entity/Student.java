package com.jsp.Jdbc.entity;

import java.util.Date;

public class Student
{
	private int std_id;
	private String std_name;
	private String std_mail;
	private String std_mobile;
	private Date std_dob;
	private String std_stream;
	private double std_per;
	public Student() {

	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
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
	public String getStd_mobile() {
		return std_mobile;
	}
	public void setStd_mobile(String std_mobile) {
		this.std_mobile = std_mobile;
	}
	public Date getStd_dob() {
		return std_dob;
	}
	public void setStd_dob(Date std_dob) {
		this.std_dob = std_dob;
	}
	public String getStd_stream() {
		return std_stream;
	}
	public void setStd_stream(String std_stream) {
		this.std_stream = std_stream;
	}
	public double getStd_per() {
		return std_per;
	}
	public void setStd_per(double std_per) {
		this.std_per = std_per;
	}
	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", std_mail=" + std_mail + ", std_mobile="
				+ std_mobile + ", std_dob=" + std_dob + ", std_stream=" + std_stream + ", std_per=" + std_per + "]";
	}
	
	
	
}
