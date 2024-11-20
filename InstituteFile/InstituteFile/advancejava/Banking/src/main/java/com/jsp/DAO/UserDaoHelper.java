package com.jsp.DAO;

public class UserDaoHelper 
{
	public static userInterface userdao()
	{
		userInterface ui=new userDaoImple();
		return ui;	
	}

}
