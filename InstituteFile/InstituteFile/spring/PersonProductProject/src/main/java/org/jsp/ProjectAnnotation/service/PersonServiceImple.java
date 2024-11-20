package org.jsp.ProjectAnnotation.service;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import org.jsp.ProjectAnnotation.Dao.PersonDao;

import org.jsp.ProjectAnnotation.Dao.PersonDaoImple;
import org.jsp.ProjectAnnotation.Entity.Person;
import org.jsp.ProjectAnnotation.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
@Component("person")
public class PersonServiceImple implements PersonService
{
	Scanner sc=new Scanner(System.in);
	@Autowired
	PersonDao dao;
	@Override
	public void admission() throws Exception
	{
		System.out.println("Enter the Person Name :");
		String name=sc.next();
		System.out.println("Enter the Person Address :");
		String address=sc.next();
		System.out.println("Enter the Person age :");
		int age=sc.nextInt();
		
		Person person=new Person();
		person.setName(name);
		person.setAddress(address);
		person.setAge(age);
		//student.setProduct(pro);
		dao.addToFile(person);
	}
	public void productAdded() throws Exception
	{
		System.out.println("Enter Product Name");
		String proName=sc.next();
		System.out.println("Enter Product Quantity");
		int quantity=sc.nextInt();
		
		Product product=new Product();
		product.setPro_name(proName);
		product.setQuantity(quantity);
		dao.addToFile(product);
		
	}

	@Override
	public void dispalyadmission() throws Exception
	{
		List<Person> ls = dao.getFromFile();
		if(ls!=null)
		{
			System.out.println("*** All Persons");
			System.out.println("--------------------------------");
			System.out.println("| Person Name  | Person Address |  Person Age | Product | ");
			System.out.println("__________________________________");
			ListIterator<Person> it=ls.listIterator();
			while(it.hasNext())
			{
				Person s=it.next();
				System.out.println(s.getName()+"|" +s.getAddress()+"|"+ s.getAge()+"|"+s.getProduct());
			}
			System.out.println("___________________________________");
		}
	}

	@Override
	public void updateAddressByName() throws Exception
	{
		Person per=getPerson();
		if(per!=null)
		{
			System.out.println("Enter The Person Address");
			String address=sc.next();
			dao.updateAddress(per.getName(),address);
		}
		else
		{
			System.out.println("*\n😩😩 Person Not Found 😩😩\n");
		}
	}

	@Override
	public Person getPerson() throws Exception
	{
		System.out.println("Enter the Person Name");
		String name=sc.next();
		Person person=dao.fetchPerson(name);
		return person;
	}

	@Override
	public void deleteByName() throws Exception
	{
		System.out.println("Enter the Person Name");
		String name=sc.next();
		if(dao.removePerson(name))
		{
			System.out.println("_________________________");
			System.out.println("Person Removed ");
		}
		else
		{
			System.out.println("-===========------------==");
			System.out.println("Person Not Found");
		}
	}

}
