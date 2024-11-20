package com.jsp.Model;

import java.sql.Date;
import java.sql.Time;

public class BankStatement 
{
	private String username; 
	private Date dateoftransaction;
	private Time timeoftransaction;
	private int useraccpountnum;
	private int transactionid;
	private Double transactionamount;
	private Double balanceamount;
	public BankStatement()
	{
	
	}
	public BankStatement(String username, Date dateoftransaction, Time timeoftransaction, int useraccpountnum,
			int transactionid, Double transactionamount, Double balanceamount) {
		super();
		this.username = username;
		this.dateoftransaction = dateoftransaction;
		this.timeoftransaction = timeoftransaction;
		this.useraccpountnum = useraccpountnum;
		this.transactionid = transactionid;
		this.transactionamount = transactionamount;
		this.balanceamount = balanceamount;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDateoftransaction() {
		return dateoftransaction;
	}
	public void setDateoftransaction(Date dateoftransaction) {
		this.dateoftransaction = dateoftransaction;
	}
	public Time getTimeoftransaction() {
		return timeoftransaction;
	}
	public void setTimeoftransaction(Time timeoftransaction) {
		this.timeoftransaction = timeoftransaction;
	}
	public int getUseraccpountnum() {
		return useraccpountnum;
	}
	public void setUseraccpountnum(int useraccpountnum) {
		this.useraccpountnum = useraccpountnum;
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public Double getTransactionamount() {
		return transactionamount;
	}
	public void setTransactionamount(Double transactionamount) {
		this.transactionamount = transactionamount;
	}
	public Double getBalanceamount() {
		return balanceamount;
	}
	public void setBalanceamount(Double balanceamount) {
		this.balanceamount = balanceamount;
	}
	@Override
	public String toString() {
		return "BankStatement [username=" + username + ", dateoftransaction=" + dateoftransaction
				+ ", timeoftransaction=" + timeoftransaction + ", useraccpountnum=" + useraccpountnum
				+ ", transactionid=" + transactionid + ", transactionamount=" + transactionamount + ", balanceamount="
				+ balanceamount + "]";
	}
	

}
