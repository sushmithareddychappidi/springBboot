package org.jsp.mvcClassConfig.Service;

import org.jsp.mvcClassConfig.Model.student1;

public interface IStudentService 
{
	public String addStudent(student1 std);
	public String selectStudent(Integer sid);

}
