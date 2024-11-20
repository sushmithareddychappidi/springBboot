package com.jsp.Dao;

public interface PersonDao 
{
	void personDetails();
	void dispalyBasedOnId( int id);
	void displayFirstLastNamePHNoAadharnobasedOnAdharNo(long aadhar);
	void updateMobileBasedOnaadharNoPresentInPerson(String mobileno,long aadhar);

}
