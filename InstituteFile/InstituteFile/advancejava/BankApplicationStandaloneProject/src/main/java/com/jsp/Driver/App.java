package com.jsp.Driver;

import java.sql.Date;
import java.util.Scanner;

import com.jsp.Dao.UserDao;
import com.jsp.Dao.userdaoHelper;
import com.jsp.Model.BankUserInformation;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws InterruptedException
	{
		System.out.println( "Welcome to Bank Application");
		Scanner scan=new Scanner(System.in);
		UserDao userdao = userdaoHelper.userDao();
		char status=' ';
		do
		{
		System.out.println("Enter \n1. For Login \n2. For Registration");
		int userchoice=scan.nextInt();
	
		switch(userchoice)
		{
		case 1:
		{
			System.out.println("Enter your emailid");
			String email=scan.next();
			System.out.println("Enter your Password");
			int password=scan.nextInt();
			BankUserInformation userinfo =userdao.login(email, password);
			if(userinfo!=null)
			{
				Thread.sleep(60);
				System.out.print("Loading");
				for(int i=0;i<=5;i++)
				{
					Thread.sleep(1000);
					System.out.print(".");
				}
				System.out.println("");
				System.out.println("Enter \n1.For Credit \n2.For Debit \n3.Check Statement \n4.Check balance \n5.Mobile to Mobile \n6.Delete account");
				int userchoiceforoperation=scan.nextInt();
				switch(userchoiceforoperation)
				{
				case 1:
				{
					System.out.println("Credit Operation");
					System.out.println("Enter user Account number");
					int acc_num=scan.nextInt();
					System.out.println("Enter user Password");
					int pass=scan.nextInt();
					System.out.println("Enter Amount to be Credited");
					double amount=scan.nextDouble();
					if(acc_num==userinfo.getUseraccountnum())
					{
						if(pass==userinfo.getUserpassword())
						{
							if(amount>0)
							{
								double databaseamount=userinfo.getUseraccountbalance();
								databaseamount+=amount;
								userinfo.setUseraccountbalance(databaseamount);
								if(userdao.credit(amount, userinfo))
								{
									Thread.sleep(1000);
									System.out.print("Loading");
									for(int i=0;i<=5;i++)
									{
										Thread.sleep(60);
										System.out.print(".");
									}
									System.out.println("");
									System.out.println("Amount Credited Successfully");
								}
								else
								{
									System.out.println("Transaction Failed....");
								}
							}
							else
							{
								System.out.println("Invalid Amount.. please provide valid amount to credit");
							}
						}
						else
						{
							System.out.println("Invalid Password .. please provide valid password");
						}
					}
					else
					{
						System.out.println("Invalid Account num .... please provide valid Accountnumber");
					}
				}
				break;
				case 2:
				{
					System.out.println("Debit Operation");
				}
				break;
				case 3:
				{
					System.out.println("check statement Operation");
				}
				break;
				case 4:
				{
					System.out.println("check balance Operation");
				}
				break;
				case 5:
				{
					System.out.println("Mobile to Mobile  Operation");
				}
				break;
				case 6:
				{
					System.out.println("Delete Account Operation");
				}
				break;
				default:
				{
					System.out.println("enter valid operation");
				}
				break;      
				}
			}
			else
			{
				System.out.println("Login Failed... entyer valid credentials");
			}
		}
		break;

		case 2:
		{
			//System.out.println("Registration operation");
			System.out.println("Enter username");
			String username=scan.next();
			System.out.println("Enter user MobileNum");
			String phno=scan.next();
			System.out.println("Enter user MailId");
			String mailid=scan.next();
			System.out.println("Enter user Address");
			String address=scan.next();
			System.out.println("Enter user Gender");
			String gender=scan.next();
			System.out.println("Enter user Date Of Birth");
			String dateofbirth=scan.next();
			Date  dob=Date.valueOf(dateofbirth);
			System.out.println("Enter user Type of account");
			String toa=scan.next();
			
			BankUserInformation userinfo=new BankUserInformation();
			
			userinfo.setUsername(username);
			userinfo.setUserMobileNo(phno);
			userinfo.setUserMailId(mailid);
			userinfo.setUserAddress(address);
			userinfo.setUserGender(gender);
			userinfo.setUserDateOfBirth(dob);
			userinfo.setTypeofaccount(toa);
			
			UserDao userdaointerfaceorv = userdaoHelper.userDao();
			
			if(userdaointerfaceorv.registration(userinfo))
			{
				System.out.println("Registration Successful...");
			}
			else
			{
				System.out.println("Registration Failed..");
			}
		
		}
		break;
		default:
		{
			System.out.println("Enter valid input");
		}
		break;
		}
		System.out.println("");
		System.out.println("Do you want to Continue with Bank Application");
		System.out.println("Press \n 'yes' to continue  \n 'No' for exit from bank application");
		String input=scan.next();
		status=input.charAt(0);
		}
		while(status=='y');
		{
			System.out.println("Thank you! for visiting Bank Application");
		}
	}
}
