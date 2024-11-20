package com.jsp.Dao;

import com.jsp.Entity.Userinformation;

public class userHelper
{
	public static UserDaoInterface userhelper()
	{
		UserDaoInterface user=new userDaoImple();
		return user;
	}

}
