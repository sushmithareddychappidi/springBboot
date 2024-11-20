package com.jsp.Jdbc.dao;

import com.jsp.Jdbc.entity.Student;

public interface studentDao 
{
	void insertStudent(Student s);
	void updateNameById(int id,String name);
	void fetchStudentToDisplay(int id);
	void fetchAllStudents();
	void deleteStudentById(int id);
	void selectStudentBasedOnStream(String stream);
	void fetchAllStudentBasedOnStream(String stream);

}
