package org.jsp.ProjectAnnotation.Dao;

import java.util.List;

import org.jsp.ProjectAnnotation.Entity.Person;

public interface PersonDao 
{
	Person fetchPerson(String name) throws Exception;
	void updateAddress(String name, String address) throws Exception;
	void addToFile(Person std) throws Exception;
	List<Person> takeOld() throws Exception;
	List<Person> getFromFile() throws Exception;
	//List<Student> getAdmissions() ;
	boolean removePerson(String name) throws Exception;
	void storeListToFile(List<Person> list) throws Exception;

	
}

