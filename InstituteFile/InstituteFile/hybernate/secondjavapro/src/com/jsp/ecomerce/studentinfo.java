package com.jsp.ecomerce;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="student_details")
public class studentinfo 
{
	@Column (name="student_name")
	private String studentname;
	@Column (name="student_mail_id" ,unique = true,nullable = false,length = 50)
	private String studentmailid;
	@Column (name="student_Password",unique = true,nullable = false,length = 6)
	private String studentpassword;
	@Column (name="student_Mobilenum" ,unique = true,nullable = false,length = 10)
	private String studentmobilenum;
	@Column (name="Branch")
	private String branch;
	
	private double percentage;
	private String gender;
	@Id
	@Column (name="rollNum")
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int rollnum;
	
	public studentinfo() {
	
	}
	public studentinfo(String studentname, String studentmailid, String studentpassword, String studentmobilenum,
			String branch, double percentage, String gender, int rollnum) {
	
		this.studentname = studentname;
		this.studentmailid = studentmailid;
		this.studentpassword = studentpassword;
		this.studentmobilenum = studentmobilenum;
		this.branch = branch;
		this.percentage = percentage;
		this.gender = gender;
		this.rollnum = rollnum;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentmailid() {
		return studentmailid;
	}
	public void setStudentmailid(String studentmailid) {
		this.studentmailid = studentmailid;
	}
	public String getStudentpassword() {
		return studentpassword;
	}
	public void setStudentpassword(String studentpassword) {
		this.studentpassword = studentpassword;
	}
	public String getStudentmobilenum() {
		return studentmobilenum;
	}
	public void setStudentmobilenum(String studentmobilenum) {
		this.studentmobilenum = studentmobilenum;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	@Override
	public String toString() {
		return "studentinfo [studentname=" + studentname + ", studentmailid=" + studentmailid + ", studentpassword="
				+ studentpassword + ", studentmobilenum=" + studentmobilenum + ", branch=" + branch + ", percentage="
				+ percentage + ", gender=" + gender + ", rollnum=" + rollnum + "]";
	}
	

}
