package org.jsp.ProjectAnnotation.service;

import org.jsp.ProjectAnnotation.Entity.Person;

public interface PersonService 
{
	void admission() throws Exception;
	void dispalyadmission() throws Exception;
	void updateAddressByName() throws Exception;
	Person getPerson() throws Exception;
	void deleteByName() throws Exception;

}
