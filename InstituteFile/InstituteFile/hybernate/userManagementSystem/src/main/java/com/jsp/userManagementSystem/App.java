package com.jsp.userManagementSystem;

import java.util.Scanner;

import com.jsp.Dao.UserDaoInterface;
import com.jsp.Dao.userHelper;
import com.jsp.Entity.Userinformation;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("1. insert\n2.select based on id \n3.update\n4.delete\n5.To Update details\n6.to update password using mailid\n7.to Update mobile number based on mailid \n8.To dispaly user details based on Password\n9.To display first & last Nmae Based On mailid\n10.toget  user firstname and lastname by mailid\n11.to get all userdetails\n12. to get All details By NamedQuery\n13.to get details by email and password\n14.change password");
		System.out.println("Enter you choice");
		int choice=scan.nextInt();
		Userinformation userdetail=new Userinformation();
		UserDaoInterface user=userHelper.userhelper();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter your First Name");
			userdetail.setFirstName(scan.next());
			System.out.println("Enter your Last Name");
			userdetail.setLastName(scan.next());
			System.out.println("Enter your MailId");
			userdetail.setEmail_id(scan.next());
			System.out.println("Enter your Mobile Number");
			userdetail.setMobileNumber(scan.next());
			System.out.println("Enter your Password");
			userdetail.setPassword(scan.next());
			System.out.println("Enter your Gender");
			userdetail.setGender(scan.next());
			user.userRegistration(userdetail);
		}
		break;
		case 2:
		{
			System.out.println("Enter id");
			int id=scan.nextInt();
			user.getSingleUserDetails(id);
		}
		break;
		case 3:
		{
			System.out.println("Enter id");
			int userid=scan.nextInt();
			System.out.println("Enter password");
			String password=scan.next();
			user.updatePasswordByusingId(userid,password);
		}
		break;
		case 4:
		{
			System.out.println("Enter id");
			int userid=scan.nextInt();
			user.deleteAccountBasedOnId(userid);
		}
		break;
		case 5:
		{
			System.out.println("Enter id");
			int id=scan.nextInt();
			user.updatedetails(id);
		}
		break;
		case 6:
		{
			System.out.println("Enter password");
			String password=scan.next();
			System.out.println("Enter mailid");
			String mailId=scan.next();
			user.updatePasswordByUsingEmailId(password, mailId);
		}
		break;
		case 7:
		{
			System.out.println("Enter mobilenumber");
			String ph=scan.next();
			System.out.println("Enter mailid");
			String mailId=scan.next();
			user.updateMobilenoBasedOnMailId(ph, mailId);
		}
		break;
		case 8:
		{
			System.out.println("Enter Password");
			String pass=scan.next();
			user.selectUserDetailsbasedOnPassword(pass);
		}
		break;
		case 9://not working
		{
			System.out.println("Enter MailId");
			String mail=scan.next();
			user.selectLastFirstNameOfUserBasedOnMailId(mail);
		}
		break;
		case 10:
		{
			System.out.println("Enter MailId");
			String mail=scan.next();
			user.displayLastNameFirstNameByUsingEmail(mail);;
		}
		break;
		case 11:
		{
			user.getAllUserDetails();
		}
		break;
		case 12:
		{
			user.getAllUserDetailsByNamedQuery();
		}
		break;
		case 13:
		{
			System.out.println("Enter mailid");
			String mail=scan.next();
			System.out.println("Enter password");
			String pass=scan.next();
			user.LoginUser(mail, pass);
		}
		break;
		case 14:
		{
			System.out.println("Enter password");
			String pass=scan.next();
			System.out.println("Enter mailid");
			String mail=scan.next();
			user.changePassword(pass, mail);
		}
		break;
		default:
		{
			System.out.println("Invalid input");
		}
		}
	}
}

