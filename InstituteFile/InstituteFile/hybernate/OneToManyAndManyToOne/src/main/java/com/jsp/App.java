package com.jsp;

import java.util.Scanner;

import com.jsp.Dao.PersonDao;
import com.jsp.Dao.PersonDaoImple;
import com.jsp.entity.PersonDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your choice 1.todisplayPersondetails\n2.display based on id\n3.display First,Last,Mobile,aadhar details Based on aadhar num");
    	int choice=sc.nextInt();
    	PersonDao person=new PersonDaoImple();
    	switch(choice)
    	{
    	case 1:
    	{
            person.personDetails();
    	}
    	break;
    	case 2:
    	{
    		System.out.println("Enter id");
    		int id=sc.nextInt();
    		person.dispalyBasedOnId(id);
    	}
    	break;
    	case 3:
    	{
    		System.out.println("Enter aadhar Number");
    		long aadhar=sc.nextLong();
    		person.displayFirstLastNamePHNoAadharnobasedOnAdharNo(aadhar);
    	}
    	break;
    	case 4:
    	{
    		System.out.println("Enter Mobile Number");
    		String mobileno=sc.next();
    		System.out.println("Enter aadhar Number");
    		long aadhar=sc.nextLong();
    		person.updateMobileBasedOnaadharNoPresentInPerson(mobileno,aadhar);
    	}
    	break;
    	default:
    	{
    		System.out.println("Invalid input");
    	}
    	}
        
    }
}
