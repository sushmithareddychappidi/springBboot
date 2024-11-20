package com.jsp.Dao;

public class userdaoHelper 
{
	public static UserDao userDao()
	{
		UserDao userdao = new UserdaoImplement();
		return userdao;
	}
}
