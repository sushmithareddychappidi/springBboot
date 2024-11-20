package org.jsp.ProjectAnnotation.service;

import org.jsp.ProjectAnnotation.Entity.Student;

public interface StudentService 
{
	void admission() throws Exception;
	void dispalyadmission() throws Exception;
	void updateNameById() throws Exception;
	Student getStudent() throws Exception;
	void deleteById() throws Exception;

}
