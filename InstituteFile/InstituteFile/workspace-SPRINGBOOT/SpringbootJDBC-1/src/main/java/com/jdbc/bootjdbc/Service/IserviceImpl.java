package com.jdbc.bootjdbc.Service;
import java.sql.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.bootjdbc.Dao.Idao;
import com.jdbc.bootjdbc.Model.User;

@Service
public class IserviceImpl implements IService
{
    Scanner sc=new Scanner(System.in);
    @Autowired
    private Idao dao;
	@Override
	public void adduser() 
	{
		User u=new User();
		System.out.println("Enter User First name");
		u.setFirstname(sc.next());
		System.out.println("Enter User Last name");
		u.setLastname(sc.next());
		System.out.println("Enter User Mail");
		u.setMailid(sc.next());
		System.out.println("Enter User Mobile");
		u.setMobile(sc.next());
		System.out.println("Enter User Date of birth");
		u.setDob(Date.valueOf(sc.next()));
		System.out.println("Enter User Username");
		u.setUsername(sc.next());
		System.out.println("Enter User Password");
		u.setPassword(sc.next());
		int value=dao.insertuser(u);
		if(value>0)
		{
			System.out.println("User Added");
		}
	}
	

}
