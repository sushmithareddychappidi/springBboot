package com.jsp.Dao;

public class productHelper 
{
	public static productDao getProHelper()
	{
		productDao productdao=new productImple();
		return productdao;
	}

}
