package org.jsp.mvcClassConfig.Dao;

import org.jsp.mvcClassConfig.Model.student1;
import org.jsp.mvcClassConfig.Repository.StrudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IStudentDaoImple implements IStudentDao{
    @Autowired
	private StrudentRepository srepo;
	@Override
	public student1 insertStudent(student1 std) 
	{
		return srepo.save(std);
	}

	@Override
	public student1 selectStudent(Integer sid) 
	{
		try
		{
			return srepo.getById(sid);
		}
		catch(Exception e)
		{
			return null;
		}
	}

}
