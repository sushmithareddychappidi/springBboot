package com.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.entity.MobileM2M;
import com.jsp.entity.PersonManyToMany;

@Component
public class PersonDaoImplementation implements personDao{

	@Autowired
	EntityTransaction transaction;
	@Autowired
	EntityManager manager;
	@Override
	public void registration() 
	{
		transaction.begin();
		PersonManyToMany person1=new PersonManyToMany();
		person1.setName("sushmitha");
		person1.setEmailid("csushmi06@gmail.com");
		person1.setPassword("234");
		
		PersonManyToMany person2=new PersonManyToMany();
		person2.setName("vennela");
		person2.setEmailid("vennela@gmail.com");
		person2.setPassword("765");
		
		MobileM2M mobile1=new MobileM2M();
		mobile1.setMobilename("vivo-cs4");
		mobile1.setMobilebrand("Vivo");
		mobile1.setMobileprice(19000);
		
		MobileM2M mobile2=new MobileM2M();
		mobile2.setMobilename("nothing-s2");
		mobile2.setMobilebrand("Nothing");
		mobile2.setMobileprice(19000);
		
		List<PersonManyToMany> personlist=new ArrayList<PersonManyToMany>();
		personlist.add(person1);
		personlist.add(person2);
		
		List<MobileM2M> mobilelist=new ArrayList<MobileM2M>();
		mobilelist.add(mobile1);
		mobilelist.add(mobile2);
		
		person1.setMobile(mobilelist);
		person2.setMobile(mobilelist);
		
		mobile1.setPersons(personlist);
		mobile2.setPersons(personlist);
		
		manager.persist(person1);
		manager.persist(person2);
		System.out.println("Data Inserted");
		transaction.commit();
		
	}

}
