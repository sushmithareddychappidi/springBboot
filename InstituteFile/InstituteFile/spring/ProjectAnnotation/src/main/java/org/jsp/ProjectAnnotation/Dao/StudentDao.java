package org.jsp.ProjectAnnotation.Dao;

import java.util.List;

import org.jsp.ProjectAnnotation.Entity.Student;

public interface StudentDao 
{
	//void insertStudent(Student student);
	Student fetchStudent(String id) throws Exception;
	void updateName(String std_id, String name) throws Exception;
	void addToFile(Student std) throws Exception;
	List<Student> takeOld() throws Exception;
	List<Student> getFromFile() throws Exception;
	//List<Student> getAdmissions() ;
	boolean removeStudent(String id) throws Exception;
	void storeListToFile(List<Student> list) throws Exception;

	
}

