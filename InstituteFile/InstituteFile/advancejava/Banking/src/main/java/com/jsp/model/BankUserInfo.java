package com.jsp.model;

import java.sql.Date;

public class BankUserInfo 
{
	private int userId;
	private String username;
	private String userMobileNo;
	private String userMailId;
	private String userAddress;
	private String userGender; 
	private Date userDateOfBirth;
	private String typeofaccount;
	private int  useraccountnum;
	private String bankifsc_code;
	private int userpassword;
	private double useraccountbalance;
	public BankUserInfo(int userId, String username, String userMobileNo, String userMailId, String userAddress,
			String userGender, Date userDateOfBirth, String typeofaccount, int useraccountnum, String bankifsc_code,
			int userpassword, double useraccountbalance) {
		super();
		this.userId = userId;
		this.username = username;
		this.userMobileNo = userMobileNo;
		this.userMailId = userMailId;
		this.userAddress = userAddress;
		this.userGender = userGender;
		this.userDateOfBirth = userDateOfBirth;
		this.typeofaccount = typeofaccount;
		this.useraccountnum = useraccountnum;
		this.bankifsc_code = bankifsc_code;
		this.userpassword = userpassword;
		this.useraccountbalance = useraccountbalance;
	}
	public BankUserInfo()
	{
		
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public String getUserMailId() {
		return userMailId;
	}
	public void setUserMailId(String userMailId) {
		this.userMailId = userMailId;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public Date getUserDateOfBirth() {
		return userDateOfBirth;
	}
	public void setUserDateOfBirth(Date userDateOfBirth) {
		this.userDateOfBirth = userDateOfBirth;
	}
	public String getTypeofaccount() {
		return typeofaccount;
	}
	public void setTypeofaccount(String typeofaccount) {
		this.typeofaccount = typeofaccount;
	}
	public int getUseraccountnum() {
		return useraccountnum;
	}
	public void setUseraccountnum(int useraccountnum) {
		this.useraccountnum = useraccountnum;
	}
	public String getBankifsc_code() {
		return bankifsc_code;
	}
	public void setBankifsc_code(String bankifsc_code) {
		this.bankifsc_code = bankifsc_code;
	}
	public int getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(int userpassword) {
		this.userpassword = userpassword;
	}
	public double getUseraccountbalance() {
		return useraccountbalance;
	}
	public void setUseraccountbalance(double useraccountbalance) {
		this.useraccountbalance = useraccountbalance;
	}
	@Override
	public String toString() {
		return "BankUserInfo [userId=" + userId + ", username=" + username + ", userMobileNo=" + userMobileNo
				+ ", userMailId=" + userMailId + ", userAddress=" + userAddress + ", userGender=" + userGender
				+ ", userDateOfBirth=" + userDateOfBirth + ", typeofaccount=" + typeofaccount + ", useraccountnum="
				+ useraccountnum + ", bankifsc_code=" + bankifsc_code + ", userpassword=" + userpassword
				+ ", useraccountbalance=" + useraccountbalance + "]";
	}

}
