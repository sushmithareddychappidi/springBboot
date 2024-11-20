package com.jsp.Dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.jsp.Entity.Userinformation;

public class userDaoImple implements UserDaoInterface{

	@Override
	public void userRegistration(Userinformation userdetail) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		manager.persist(userdetail);
		System.out.println("Data Inserted");
		transaction.commit();
		manager.close();
		factory.close();
	}

	@Override
	public void getSingleUserDetails(int userid) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Userinformation userdetail = manager.find(Userinformation.class, userid);
		if(userdetail!=null)
		{
			System.out.println(userdetail);
		}
		else
		{
			System.out.println("Data Not Found");
		}
		
		manager.close();
		factory.close();
		
	}

	@Override
	public void updatePasswordByusingId(int userid, String password) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Userinformation userdetails = manager.find(Userinformation.class, userid);
		if(userdetails!=null)
		{
			System.out.println(userdetails);
			userdetails.setPassword(password);
			System.out.println(userdetails);
		}
		else
		{
			System.out.println("Data not found");
		}
		transaction.commit();
		manager.close();
		factory.close();
	}
	@Override
	public void deleteAccountBasedOnId(int userid)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Userinformation userdetails = manager.find(Userinformation.class, userid);
		if(userdetails!=null)
		{
				manager.remove(userdetails);	
				System.out.println("Object is Deleted");
		}
		else
		{
			System.out.println("Data not found");
		}
		transaction.commit();
		manager.close();
		factory.close();
		
	}

	@Override
	public void updatedetails(int id) 
	{
		Scanner scan=new Scanner(System.in);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Userinformation userdetails = manager.find(Userinformation.class, id);
		if(userdetails!=null)
		{
				updateMyDetails(id);		
		}
		else
		{
			System.out.println("Data not found");
		}
		transaction.commit();
		manager.close();
		factory.close();		
		
	}

	@Override
	public void updateMyDetails(int id) 
	{
		Scanner scan=new Scanner(System.in);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Userinformation userdetails = manager.find(Userinformation.class, id);
		if(userdetails!=null)
		{
			System.out.println("Enter your choice to update details");	
			System.out.println("\n1.update firstname\n2.mailid \n3.password\n4.mobileno");
			int inp=scan.nextInt();
			switch(inp)
			{
			case 1:
			{
				System.out.println("Enter firstname");
				String fname=scan.next();
				userdetails.setFirstName(fname);
				System.out.println("updated Successfully");
			}
			break;
			case 2:
			{
				System.out.println("Enter mailId");
				String mail=scan.next();
				userdetails.setFirstName(mail);
				System.out.println("updated Successfully");
			}
			break;
			case 3:
			{
				System.out.println("Enter password");
				String pw=scan.next();
				userdetails.setFirstName(pw);
				System.out.println("updated Successfully");
			}
			break;
			case 4:
			{
				System.out.println("Enter Mobileno");
				String ph=scan.next();
				userdetails.setFirstName(ph);
				System.out.println("updated Successfully");
			}
			break;
			default:
			{
				System.out.println("invalid choice");
			}
			}
		}
		else
		{
			System.out.println("Data not found");
		}
		transaction.commit();
		manager.close();
		factory.close();		
		
	}

	
      //jpql
	@Override
	public void updatePasswordByUsingEmailId(String password, String mailid) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String update="update Userinformation ui set ui.password=?1 where ui.email_id=?2";
		
		//Converting the JPQL to SQL
		Query query = manager.createQuery(update);
		query.setParameter(1, password);
		query.setParameter(2, mailid);
		
		/*after converting the JPQL to SQL
		update userinformation set password=? where email_id=?*/
		
		//To perform the write operation make use of executeUpdate()
		int executeUpdate = query.executeUpdate();
		if(executeUpdate!=0)
		{
			System.out.println("Updated Successfully");
		}
		else
		{
			System.out.println("Data Not Updated");
		}
		
		transaction.commit();
		manager.close();
		factory.close();
		
	}

	@Override
	public void updateMobilenoBasedOnMailId(String mobile, String mailid)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String update="update Userinformation ui set ui.mobileNumber=:mobile where ui.email_id=:mail";
		
		//Converting the JPQL to SQL
		Query query = manager.createQuery(update);
		query.setParameter("mobile", mobile);
		query.setParameter("mail", mailid);
	
		//To perform the write operation make use of executeUpdate()
		int executeUpdate = query.executeUpdate();
		if(executeUpdate!=0)
		{
			System.out.println("Mobile Number Updated Successfully");
		}
		else
		{
			System.out.println("Data Not Updated");
		}
		
		transaction.commit();
		manager.close();
		factory.close();
		
		
	}

	@Override
	public void selectUserDetailsbasedOnPassword(String pasword)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");	
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		String select="select user from Userinformation user where user.password=:pass";
		
		Query query = manager.createQuery(select);
		query.setParameter("pass", pasword);
		
		try
		{
			Userinformation result = (Userinformation) query.getSingleResult();
			System.out.println("First name: "+result.getFirstName());
			System.out.println("mobile number: "+result.getMobileNumber());
		}
		catch(Exception e)
		{
			System.out.println("Invalid Password");
		}		
	}

	@Override
	public void selectLastFirstNameOfUserBasedOnMailId(String mailid) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");	
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		String select="select firstName,lastName from Userinformation user where user.email_id=?1";
		
		Query query = manager.createQuery(select);
		query.setParameter(1, mailid);
		
		try
		{
			Userinformation result = (Userinformation) query.getSingleResult();
			System.out.println("First name: "+result.getFirstName());
			System.out.println("lastname: "+result.getLastName());
		}
		catch(Exception e)
		{
			System.out.println("Invalid MailId");
		}
	}

	@Override
	public void displayLastNameFirstNameByUsingEmail(String emailid) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String select="select user.firstName,user.lastName from Userinformation user where user.email_id=?1";
		 TypedQuery<Object[]> typedQuery = manager.createQuery(select,Object [].class);
		 typedQuery.setParameter(1, emailid);
		 
		 List<Object[]> resultList = typedQuery.getResultList();
		 for(Object [] objects:resultList)
		 {
			 String firstname=(String) objects[0];
			 String lastname=(String) objects[1];
			 System.out.println(firstname);
			 System.out.println(lastname);
		 }
	}

	@Override
	public void getAllUserDetails() 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String select="select user from Userinformation user";
		Query query = manager.createQuery(select);
		try
		{
			 List result = query.getResultList();
			System.out.println(result);
//			System.out.println("Id: "+result.getId());
//			System.out.println("Emailid: "+result.getEmail_id());
//			System.out.println("FirstName :"+result.getFirstName());
//			System.out.println("Gender: "+result.getGender());
//			System.out.println("Lastname: "+result.getLastName());
//			System.out.println("Mobile Number :"+result.getMobileNumber());
//			System.out.println("Password :"+result.getPassword());
		}
		catch(Exception e)
		{
			System.out.println("Data Not Present");
		}
		
	}

	@Override
	public void getAllUserDetailsByNamedQuery() 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("Userinformation.findAll");
		List<Userinformation>resultList = query.getResultList();
		System.out.println(resultList);
	}

	@Override
	public void LoginUser(String mailid, String password) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("login");
		query.setParameter("mail", mailid);
		query.setParameter("pass", password);
		
		try
		{
			Userinformation result = (Userinformation) query.getSingleResult();
			System.out.println("Login Successful");
		}
		catch(Exception e)
		{
			System.out.println("Invalid Credentials");
		}
	}

	@Override
	public void changePassword(String pass, String emailid) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("userManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("changepassword");
		query.setParameter("pw", pass);
		query.setParameter("mailId", emailid);
		int update = query.executeUpdate();
		if(update!=0)
		{
			System.out.println("Updated Successfully");
		}
		else
		{
			System.out.println("Invalid mailid");
		}
		transaction.commit();
		manager.close();
		factory.close();
		
	}
	
}
