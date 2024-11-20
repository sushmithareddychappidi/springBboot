package com.jsp.JPAData.Service;

import java.sql.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.JPAData.Dao.userDao;
import com.jsp.JPAData.entity.Usertable;

@Service("userservice")
public class userServiceImpl implements userService 
{
	Scanner sc=new Scanner(System.in);
	@Autowired
    private userDao dao;
	@Override
	public void registration() 
	{
		Usertable user=new Usertable();
		System.out.println("Enter First name");
		user.setFirstname(sc.next());
		System.out.println("Enter Last name");
		user.setLastname(sc.next());
		System.out.println("Enter Mail id");
		user.setMailid(sc.next());
		System.out.println("Enter Mobile number");
		user.setMobile(sc.next());
		System.out.println("Enter Date of birth");
		user.setDob(Date.valueOf(sc.next()));
		System.out.println("Enter Username");
		user.setUsername(sc.next());
		System.out.println("Enter Password");
		user.setPassword(sc.next());
		dao.add(user);
	}
	@Override
	public void displayAll() 
	{
		List<Usertable> ls=dao.fetchAll();
		if(!ls.isEmpty())
		{
			System.out.println("----------All User Details--------------");
			System.out.println("_________________________________________");
			System.out.println("|First Name  |Lst  Name  |Mail Id  |Mobile number  |DATe Of Birth Name  |User Name  |Password  ");
			System.out.println("____________________________________________");
			ListIterator<Usertable> it=ls.listIterator();
			while(it.hasNext())
			{
				Usertable u=it.next();
				
				System.out.println(u.getFirstname()+"|"+u.getLastname()+"|"+u.getMailid()+"|"+u.getMobile()+"|"+u.getDob()+"|"+u.getUsername()+"|"+u.getPassword());
				System.out.println("____________________________");
			}
			System.out.println("----------------------------------------------------");
		}
		else
		{
			System.out.println("User Not Found ");
		}
	}
	@Override
	public void changeLastNameById() 
	{
		System.out.println("Enter Mobile number");
		String mb=sc.next();
		System.out.println("Enter Last Name");
		String lname=sc.next();
		Usertable u = dao.updateLastNameById(mb,lname);
		if(u!=null)
		{
			System.out.println("-----------------------------------------");
			System.out.println("User Last Name Updated");
			System.out.println("-------------------------------------------");
		}
		
		else
		{
			System.out.println("--------------------------");
			System.out.println("User Not Found");
			System.out.println("----------------------------");
		}
			
		
	}
	@Override
	public void removeUserById() 
	{
		System.out.println("Enter Mobile number");
		String mb=sc.next();
		if(dao.removeById(mb))
		{
			System.out.println("-----------------------------------------");
			System.out.println("User Deleted ");
			System.out.println("-------------------------------------------");
		}
		
		else
		{
			System.out.println("--------------------------");
			System.out.println("User Not Found");
			System.out.println("----------------------------");
		}
	}
	@Override
	public void displayBFirstName() 
	{
		System.out.println("Enter First Name");
		String fname=sc.next();
		Usertable u = dao.fetchByFirstName(fname);
		if(u!=null)
		{
			System.out.println(u);
		}
		else
		{
			System.out.println("User Not Found With the given First Name");
		}
	}
	@Override
	public void displayBydob() 
	{
		System.out.println("Enter Date Of Birth");
		String d=sc.next();
		System.out.println("Enter Date Of Birth");
		String d1=sc.next();
		List dob = dao.fetchByDOB(d,d1);
		if(!dob.isEmpty())
		{
			System.out.println(dob);
		}
		else
		{
			System.out.println("Users Not Found in the dob");
		}
	}
	/*@Override
	public void deleteBymailandPass() 
	{
		System.out.println("Enter Mail Id");
		String mail=sc.next();
		System.out.println("Enter Password");
		String p=sc.next();
		if(dao.fetchByMailandpassword(mail,p))
		{
			
		}
	}*/

}
