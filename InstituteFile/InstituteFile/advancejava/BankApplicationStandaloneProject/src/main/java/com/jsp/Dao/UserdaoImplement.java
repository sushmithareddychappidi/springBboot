package com.jsp.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

import com.jsp.Model.BankStatement;
import com.jsp.Model.BankUserInformation;

public class UserdaoImplement implements UserDao
{

	String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
	Random random=new Random();
	@Override
	public BankUserInformation login(String email, int password) 
	{		
		String select="select * from bankuserinformation where userMailId=? and userpassword=?";
		try
		{
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(select);
			ps.setString(1, email);
			ps.setInt(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.isBeforeFirst())
			{
				BankUserInformation user = new BankUserInformation();
				if(rs.next())
				{
					user.setBankifsc_code(rs.getString("bankifsc_code"));//columnnames
					user.setTypeofaccount(rs.getString("typeofaccount"));
					user.setUseraccountbalance(rs.getDouble("useraccountbalance"));
					user.setUseraccountnum(rs.getInt("useraccountnum"));
					user.setUserAddress(rs.getString("userAddress"));
					user.setUserDateOfBirth(rs.getDate("userDateOfBirth"));
					user.setUserGender(rs.getString("userGender"));
					user.setUserId(rs.getInt("userId"));
					user.setUserMailId(rs.getString("userMailId"));
					user.setUserMobileNo(rs.getString("userMobileNo"));
					user.setUsername(rs.getString("username"));
					user.setUserpassword(rs.getInt("userpassword"));
					return user;
				}
			}
			else
			{
				return null;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean registration(BankUserInformation bankuserinfo) {
		String insert="insert into bankuserinformation (username, userMobileNo, userMailId, userAddress, userGender, userDateOfBirth, typeofaccount, useraccountnum, bankifsc_code, userpassword, useraccountbalance) values(?,?,?,?,?,?,?,?,?,?,?)";
		try
		{
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(insert);
			ps.setString(1,bankuserinfo.getUsername());
			ps.setString(2, bankuserinfo.getUserMobileNo());
			ps.setString(3, bankuserinfo.getUserMailId());
			ps.setString(4, bankuserinfo.getUserAddress());
			ps.setString(5,bankuserinfo.getUserGender());
			ps.setDate(6, bankuserinfo.getUserDateOfBirth());
			ps.setString(7,bankuserinfo.getTypeofaccount());
			int accnum=random.nextInt(10000000);
			if(accnum<1000000)
			{
				accnum+=1000000;
			}
			ps.setInt(8, accnum);
			ps.setString(9,"SBI65439");
			int password=random.nextInt(10000);
			if(password<1000)
			{
				password+=1000;
			}
			ps.setInt(10, password);
			ps.setDouble(11,bankuserinfo.getUseraccountbalance());
			int insertrows = ps.executeUpdate();
			if(insertrows!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean credit(double amount, BankUserInformation user) {
		String update="update bankuserinformation set useraccountbalance=? where useraccountnum=? and userpassword=?";
		String insert="insert into statement (username, dateoftransaction, timeoftransaction, useraccpountnum, transactionamount, balanceamount) values(?,?,?,?,?,?)";
		
		try
		{
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(update);
			ps.setDouble(1,user.getUseraccountbalance());
			ps.setInt(2, user.getUseraccountnum());
			ps.setInt(3, user.getUserpassword());
			int updaterows = ps.executeUpdate();
			if(updaterows!=0)
			{
				PreparedStatement ps1 = connection.prepareStatement(insert);
				ps1.setString(1,user.getUsername());
				ps1.setDate(2,Date.valueOf(LocalDate.now()));
				ps1.setTime(3, Time.valueOf(LocalTime.now()));
				ps1.setInt(4, user.getUseraccountnum());
				ps1.setDouble(5, amount);
				ps1.setDouble(6,user.getUseraccountbalance());
				
				int insertedRows=ps1.executeUpdate();
				if(insertedRows!=0)
				{
					return true;
					//System.out.println("Amount Credited Successfully.....");
				}
				else
				{
					return false;
					//System.out.println("Transaction Failed..");
				}
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
		
	}


}
