package com.jsp.ecomerce;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class selectStudentDetails 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("secondjavapro");	
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		studentinfo studentdetails = manager.find(studentinfo.class, 1);
		//System.out.println(studentdetails);
		
		if(studentdetails!=null)
		{
			System.out.println("Student NAme: "+ studentdetails.getStudentname());
			System.out.println("Student Email Id:"+studentdetails.getStudentmailid());
		}
		else
		{
			System.out.println("Student details not Found");
		}
		
		
		manager.close();
		factory.close();
	}

}
