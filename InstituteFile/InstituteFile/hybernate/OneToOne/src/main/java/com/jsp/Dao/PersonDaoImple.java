package com.jsp.Dao;

import java.sql.Date;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.entity.AadharDetails;
import com.jsp.entity.PersonDetails;

public class PersonDaoImple implements PersonDao
{

	@Override
	public void personDetails() 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OneToOne");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		PersonDetails persondetails=new PersonDetails();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your FirstName");
		persondetails.setFirstname(scanner.next());
		System.out.println("Enter Your LasttName");
		persondetails.setLastname(scanner.next());
		System.out.println("Enter Your EmaildId");
		persondetails.setMailid(scanner.next());
		System.out.println("Enter Your Password");
		persondetails.setPassword(scanner.next());
		System.out.println("Enter Your Gender");
		persondetails.setGender(scanner.next());
		
		AadharDetails aadhardetails =new AadharDetails();
		System.out.println("Enter Aadhar Number");
		aadhardetails.setAadharno(scanner.nextLong());
		System.out.println("Enter Address");
		aadhardetails.setAddress(scanner.next());
		System.out.println("Enter Mobile Number");
		aadhardetails.setMobilenum(scanner.next());
		System.out.println("Enter Date Of Birth");
		aadhardetails.setDob(Date.valueOf(scanner.next()));
		System.out.println("Enter Pincode");
		aadhardetails.setPincode(scanner.next());
		persondetails.setAadhardetails(aadhardetails);
		aadhardetails.setPersondetails(persondetails);
		
		manager.persist(persondetails);
		System.out.println("Data Inserted");
		transaction.commit();
		manager.close();
		factory.close();
		
	}

	@Override
	public void dispalyBasedOnId(int id) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OneToOne");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
	    String select="select person from PersonDetails person where  person.personid=:id";
	    Query query = manager.createQuery(select);
	    query.setParameter("id", id);
	    try
	    {
	    	PersonDetails result = (PersonDetails) query.getSingleResult();
	    	System.out.println(result);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Invalid Id");
	    }
	    manager.close();
	    factory.close();
	    
	}

	@Override
	public void displayFirstLastNamePHNoAadharnobasedOnAdharNo(long aadhar)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OneToOne");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		AadharDetails aadharDetails = manager.find(AadharDetails.class, aadhar);
		System.out.println("First Name: "+aadharDetails.getPersondetails().getFirstname());
		System.out.println("Last Name: "+aadharDetails.getPersondetails().getLastname());
		System.out.println("Mobile Number: "+aadharDetails.getMobilenum());
		System.out.println("Aadhar Number: "+aadharDetails.getAadharno());
		manager.close();
		factory.close();
		
	}

	@Override
	public void updateMobileBasedOnaadharNoPresentInPerson(String mobileno, long aadhar) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OneToOne");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String update="upadte AadharDetails aadhar set aadhar.mobilenum=:ph where ";
	}

}
