package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class productImple implements productDao
{

	@Override
	public void getProductNameBrandQuantity() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String select="select pro.p_Name,pro.p_Brand,pro.quantity from Product pro";
		TypedQuery<Object[]> typedQuery = manager.createQuery(select,Object [].class);
		List<Object[]> resultList = typedQuery.getResultList();
		for(Object [] objects:resultList)
		{
			String productname=(String) objects[0];
			String productbrand=(String) objects[1];
			int productquantity= (int) objects[2];
			System.out.println("Product Name: "+productname);
			System.out.println("Product Brand: "+productbrand);
			System.out.println("Product Quantity: "+productquantity);
			System.out.println("---------------------------------------");
		}
		
		
	}

}
