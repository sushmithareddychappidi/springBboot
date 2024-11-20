package com.jsp.DAO;

import com.jsp.model.BankStatement;
import com.jsp.model.BankUserInfo;

public interface userInterface 
{
	boolean registration(BankUserInfo bankuserinfo);
	BankUserInfo login(String emailorphno,int password);
	boolean debit(int password,BankStatement bankStatement);
}
