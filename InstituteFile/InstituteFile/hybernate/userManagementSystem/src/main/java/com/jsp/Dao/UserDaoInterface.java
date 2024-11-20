package com.jsp.Dao;

import com.jsp.Entity.Userinformation;

public interface UserDaoInterface
{
    void userRegistration(Userinformation userdetail);
    void getSingleUserDetails(int userid);
    void updatePasswordByusingId(int userid,String password);
    void deleteAccountBasedOnId(int userid);
    void updatedetails(int id);
    void updateMyDetails( int id);
    void updatePasswordByUsingEmailId(String password,String mailid);
    void updateMobilenoBasedOnMailId(String mobile,String mailid);
    void selectUserDetailsbasedOnPassword(String pasword);
    void selectLastFirstNameOfUserBasedOnMailId(String mailid);
    void displayLastNameFirstNameByUsingEmail(String emailid);
    void getAllUserDetails();
    void getAllUserDetailsByNamedQuery();
    void LoginUser(String mailid,String password);
    void changePassword(String pass,String emailid);
}
