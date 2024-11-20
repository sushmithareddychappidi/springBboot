package com;

public class EmpDesignationInvalidException extends RuntimeException
{
	public String toString()
	{
		return "Designation Should be JavaDeveloper/Pega Developer/Dba/Tester";
	}

}
