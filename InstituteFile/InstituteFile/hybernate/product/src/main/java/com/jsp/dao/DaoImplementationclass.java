package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DaoImplementationclass implements Daointerface
{

	@Override
	public void updatePriceBasedOnDiscount(double price) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("product");	
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String update="update Product pr set pr.p_Price=?1 where pr.discount<50";
		Query query = manager.createQuery(update);
		query.setParameter(1, price);
		//query.setParameter(2, discount);
		int executeUpdate = query.executeUpdate();
		if(executeUpdate!=0)
		{
			System.out.println("Price Updated");
		}
		else
		{
			System.out.println("Data Not Updated");
		}
		transaction.commit();
		manager.close();
		factory.close();
		
	}

	@Override
	public void updateQuantitybasedOnPrice(int quantity) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("product");	
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String update="update Product pr set pr.quantity=?1 where pr.p_Price>=16";
		Query query = manager.createQuery(update);
		query.setParameter(1, quantity);
		//query.setParameter(2, discount);
		int executeUpdate = query.executeUpdate();
		if(executeUpdate!=0)
		{
			System.out.println("Quantity Updated");
		}
		else
		{
			System.out.println("Data Not Updated");
		}
		transaction.commit();
		manager.close();
		factory.close();
		
	}

	@Override
	public void updateBrandBasedOnProductName(String brand, String productname)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("product");	
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String update="update Product pr set pr.p_Brand=?1 where pr.p_Name like ?2%";
		Query query = manager.createQuery(update);
		query.setParameter(1, brand);
		query.setParameter(2, productname);
		int executeUpdate = query.executeUpdate();
		if(executeUpdate!=0)
		{
			System.out.println("Brand Updated");
		}
		else
		{
			System.out.println("Data Not Updated");
		}
		transaction.commit();
		manager.close();
		factory.close();
		
	}
	

}
