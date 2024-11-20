package com.jsp.JPAData.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.JPAData.entity.Usertable;

public interface userRepository extends JpaRepository<Usertable, String>
{
	public Usertable findByfirstname(String fname);
	public List findBydobBetween(String d,String d1);
	public Usertable findBymailidandpassword(String mail,String pass);
}
