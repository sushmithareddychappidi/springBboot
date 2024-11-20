package com;

public class EmpSalInvalidException extends RuntimeException
{
	public String toString()
	{
		return "Salary Should be 15000 to 90000";
	}

}
