package com.jsp.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class selectUserDetails 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("firstjpaproject");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		UserInfo info = manager.find(UserInfo.class, 10);
		if(info!=null)
		{
			System.out.println("User Name:"+info.getFirstname());
			System.out.println("User mail Id:"+info.getEmailid());
			System.out.println("User Mobile num:"+info.getMobilenum());			
		}
		else
		{
			System.out.println("User Data Not Found");
		}
		
		
		
		manager.close();
		factory.close();
		
	}

}
