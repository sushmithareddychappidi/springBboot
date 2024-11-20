package com.jsp.JPAData.Dao;

import java.util.List;

import com.jsp.JPAData.entity.Usertable;

public interface userDao 
{
	void add(Usertable u);

	List<Usertable> fetchAll();

	Usertable updateLastNameById(String mb, String lname);

	boolean removeById(String mb);

	Usertable fetchByFirstName(String fname);

	List fetchByDOB(String d,String d1);

	Usertable fetchByMailandpassword(String mail, String p);

}
