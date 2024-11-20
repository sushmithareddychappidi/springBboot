package com.jsp.user;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class userregister 
{
	public static void main(String[] args) 
	{
		UserInfo userinfo=new UserInfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		userinfo.setFirstname(sc.next());
		System.out.println("Enter Lat Name");
		userinfo.setLastname(sc.next());
		System.out.println("Enter Mobile num");
		userinfo.setMobilenum(sc.next());
		System.out.println("Enter Mail Id");
		userinfo.setEmailid(sc.next());
		System.out.println("Enter Password");
		userinfo.setPassword(sc.next());
		System.out.println("Enter Gender");
		userinfo.setGender(sc.next());
		System.out.println(userinfo);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("firstjpaproject");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(userinfo);
		System.out.println("Data Inserted");
		transaction.commit();
		manager.close();
		factory.close();

	}

}
