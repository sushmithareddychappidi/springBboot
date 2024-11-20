package org.jsp.mvcClassConfig.Service;

import org.jsp.mvcClassConfig.Dao.IStudentDao;
import org.jsp.mvcClassConfig.Model.student1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IStudentServiceImple implements IStudentService
{

	@Autowired
	private IStudentDao sdao;
	@Override
	public String addStudent(student1 std) 
	{
		student1 s = sdao.insertStudent(std);
		if(s!=null)
		{
			return "Student Added!!!";
		}
		else
		{
			return "Student Not Added!!";
		}
	}

	@Override
	public String selectStudent(Integer sid) 
	{
		student1 student = sdao.selectStudent(sid);
		if(student!=null)
		{
			return "Student Login Successful!";
		}
		else
		{
			return "Invalid Student Details";
		}
	}
	


}
