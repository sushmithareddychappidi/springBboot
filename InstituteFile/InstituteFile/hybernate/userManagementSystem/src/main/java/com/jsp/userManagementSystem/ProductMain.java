package com.jsp.userManagementSystem;

import java.util.Scanner;

import com.jsp.Dao.productDao;
import com.jsp.Dao.productHelper;
import com.jsp.Entity.Product;

public class ProductMain 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("1.to display product name,brand,quantity");	
		System.out.println("Enter Your choice");
		int choice=scan.nextInt();
		Product pro=new Product();
		productDao helper = productHelper.getProHelper();
		switch(choice)
		{
		case 1:
		{
			helper.getProductNameBrandQuantity();
		}
		break;
		default:
		{
			System.out.println("Invalid Input");
		}
		}
		
	}

}
