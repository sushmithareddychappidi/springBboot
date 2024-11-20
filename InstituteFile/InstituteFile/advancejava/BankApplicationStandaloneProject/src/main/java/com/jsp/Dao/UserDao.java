package com.jsp.Dao;

import com.jsp.Model.BankStatement;
import com.jsp.Model.BankUserInformation;

public interface UserDao
{
	BankUserInformation login(String email,int password);
	boolean registration(BankUserInformation bankuserinfo);
	boolean credit(double amount,BankUserInformation user);
}
