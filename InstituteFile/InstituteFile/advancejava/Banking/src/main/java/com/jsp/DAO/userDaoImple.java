package com.jsp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import com.jsp.model.BankStatement;
import com.jsp.model.BankUserInfo;

public class userDaoImple implements userInterface 
{
	String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
    Random random=new Random();
	@Override
	public boolean registration(BankUserInfo bankuserinfo) {
		
		String insert="insert into bankuserinformation(username, userMobileNo, userMailId, userAddress, userGender, userDateOfBirth, typeofaccount, useraccountnum, bankifsc_code, userpassword, useraccountbalance) values(?,?,?,?,?,?,?,?,?,?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(insert);
			ps.setString(1,bankuserinfo.getUsername());
			ps.setString(2,bankuserinfo.getUserMobileNo() );
			ps.setString(3,bankuserinfo.getUserMailId() );
			ps.setString(4,bankuserinfo.getUserAddress());
			ps.setString(5, bankuserinfo.getUserGender());
			ps.setDate(6, bankuserinfo.getUserDateOfBirth());
			ps.setString(7, bankuserinfo.getTypeofaccount());
			int accnum=random.nextInt(10000000);
			if(accnum<1000000)
			{
				accnum+=1000000;
			}
			ps.setInt(8,accnum);
			ps.setString(9,"SBI98345");
			int password=random.nextInt(10000);
			if(password<1000)
			{
				password+=1000;
			}
			ps.setInt(10, password);
			ps.setDouble(11,bankuserinfo.getUseraccountbalance() );
			int insertedrows=ps.executeUpdate();
			if(insertedrows!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
	}
	@Override
	public BankUserInfo login(String emailorphno, int password) 
	{
		String select="select * from bankuserinformation where (userMailId=? or userMobileNo=?) and userpassword=? ";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(select);
			ps.setString(1, emailorphno);
			ps.setString(2,emailorphno);
			ps.setInt(3,password);
			ResultSet rs = ps.executeQuery();
			if(rs.isBeforeFirst())
			{
				if(rs.next())
				{
					BankUserInfo user=new BankUserInfo();
					user.setBankifsc_code(rs.getString("bankifsc_code"));
					user.setTypeofaccount(rs.getString("useraccountnum"));
					user.setUseraccountbalance(rs.getDouble("useraccountbalance"));
					user.setUseraccountnum(rs.getInt("useraccountnum"));
					user.setUserAddress(rs.getString("userAddress"));
					user.setUserDateOfBirth(rs.getDate("userDateOfBirth"));
					user.setUserGender(rs.getString("userGender"));
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
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	@Override
	public boolean debit(int password, BankStatement bankStatement) 
	{
		String update="update bankuserinformation set useraccountbalance=? where useraccountnum=? and userpassword=?";
		String insert="insert into statement (username, dateoftransaction, timeoftransaction, useraccpountnum, transactionamount, balanceamount) values(?,?,?,?,?,?)";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps1 = connection.prepareStatement(update);
			ps1.setDouble(1, bankStatement.getBalanceamount());
			ps1.setInt(2, bankStatement.getUseraccpountnum());
			ps1.setInt(3, password);
			int updatedrows=ps1.executeUpdate();
			if(updatedrows!=0)
			{
				PreparedStatement ps2 = connection.prepareStatement(insert);
				ps2.setString(1,bankStatement.getUsername());
				ps2.setDate(2, bankStatement.getDateoftransaction());
				ps2.setTime(3, bankStatement.getTimeoftransaction());
				ps2.setInt(4, bankStatement.getTransactionid());
				ps2.setDouble(5,bankStatement.getTransactionamount());
				ps2.setDouble(6,bankStatement.getBalanceamount());
				int updatedRows=ps2.executeUpdate();
				if(updatedRows!=0)
				{
					return true;
					//System.out.println("Amount Debited Successfully.....");
				}
				else
				{
					return false;
					//System.out.println("Transaction Failed..");
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
	}

}
