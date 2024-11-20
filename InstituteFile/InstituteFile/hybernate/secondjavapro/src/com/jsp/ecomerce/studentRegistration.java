package com.jsp.ecomerce;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class studentRegistration 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		studentinfo info=new studentinfo();
		System.out.println("Enter student name");
		info.setStudentname(sc.next());
		System.out.println("Enter student mailid");
		info.setStudentmailid(sc.next());
		System.out.println("Enter student password");
		info.setStudentpassword(sc.next());
		System.out.println("Enter student mobilenum");
		info.setStudentmobilenum(sc.next());
		System.out.println("Enter student Branch");
		info.setBranch(sc.next());
		System.out.println("Enter student percentage");
		info.setPercentage(sc.nextDouble());
		System.out.println("Enter student gender");
		info.setGender(sc.next());
		System.out.println(info);
		//establish the connection
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("secondjavapro");
		//creation of platform
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		//operations can done between
		manager.persist(info);
		System.out.println("Data Inserted");
		transaction.commit();
		
	}
}
