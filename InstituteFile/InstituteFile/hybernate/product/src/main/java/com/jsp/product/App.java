package com.jsp.product;

import java.util.Scanner;

import com.jsp.dao.Daointerface;
import com.jsp.dao.producthelper;
import com.jsp.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n1.updateprice based on quantity\n2.update Quantity based on price\n3.update Brand based on product first name");
        System.out.println("Enter your choice");
        int choice=scan.nextInt();
        Product product=new Product();
        Daointerface proHelper = producthelper.proHelper();
        switch(choice)
        {
        case 1:
        {
        	System.out.println("Enter price");
        	double price=scan.nextDouble();
        	proHelper.updatePriceBasedOnDiscount(price);
        }
        break;
        case 2:
        {
        	System.out.println("Enter Quantity");
        	int quantity=scan.nextInt();
        	proHelper.updateQuantitybasedOnPrice(quantity);
        }
        break;
        case 3:
        {
        	System.out.println("Enter Brand");
        	String brand=scan.next();
        	System.out.println("Enter Product name");
            String pname=scan.next();
        	proHelper.updateBrandBasedOnProductName(brand, pname);
        }
        break;
        default:
        {
        	System.out.println("invalid input");
        }
        }
    }
}
