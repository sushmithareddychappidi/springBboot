package com.jsp.dao;

public interface Daointerface 
{
	void updatePriceBasedOnDiscount(double price);
	void updateQuantitybasedOnPrice(int quantity);
	void updateBrandBasedOnProductName(String brand,String productname);

}
