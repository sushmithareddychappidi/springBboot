package com.jsp.Dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.entity.Address;
import com.jsp.entity.DetailsOfPerson;

@Component
public class persondaoImple implements PersonDao
{
	@Autowired
	EntityManagerFactory entitymanagerfactory;	
	@Autowired
	EntityManager entitymanager;
	@Autowired
	EntityTransaction entitytransaction;

	@Override
	public void registration() 
	{
		entitytransaction.begin();
		DetailsOfPerson persondetails=new DetailsOfPerson();
		persondetails.setFirstname("sushmi");
		persondetails.setLastname("chappidi");
		persondetails.setEmailid("sushmi06@gmail.com");
		persondetails.setPassword("12345");
		persondetails.setMobilenumber("9845674321");
		persondetails.setDateOfBirth(Date.valueOf("2021-03-21"));
		persondetails.setGender("female");
		
		Address address1=new Address();
		address1.setVillage("dondlavagu");
		address1.setCity("pulivendula");
		address1.setState("ap");
		address1.setPincode(500321);
		
		Address address2=new Address();
		address2.setVillage("miyapur");
		address2.setCity("hyderabad");
		address2.setState("ts");
		address2.setPincode(500072);
		
		List<Address> list=new ArrayList<Address>();
		list.add(address1);
		list.add(address2);
		
		persondetails.setAddresses(list);
		address1.setPersondetails(persondetails);
		address2.setPersondetails(persondetails);
		
		entitymanager.persist(persondetails);
		System.out.println("Data Inserted");
		entitytransaction.commit();
		entitymanager.close();
		entitymanagerfactory.close();	
		
	}

	@Override
	public void getUserDetailsByUserId(int id) 
	{
		entitytransaction.begin();
		DetailsOfPerson detailsOfPerson = entitymanager.find(DetailsOfPerson.class, id);
		System.out.println("First Name: "+detailsOfPerson.getFirstname());
		System.out.println("Last Name: "+detailsOfPerson.getLastname());
		
		List<Address> address=detailsOfPerson.getAddresses();
		for(Address addres:address)
		{
			System.out.println("Village: "+addres.getVillage());
			System.out.println("City: "+addres.getCity());
			System.out.println("Pincode: "+addres.getPincode());
		}
		entitymanager.close();
		entitymanagerfactory.close();
		
	}
	

}
