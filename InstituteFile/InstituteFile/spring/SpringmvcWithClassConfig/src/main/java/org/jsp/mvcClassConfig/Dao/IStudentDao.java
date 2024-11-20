package org.jsp.mvcClassConfig.Dao;

import org.jsp.mvcClassConfig.Model.student1;

public interface IStudentDao 
{
	public student1 insertStudent(student1 std);
	public student1 selectStudent(Integer sid);
}
