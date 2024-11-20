package com;

public class EmpExpMissMatchException extends RuntimeException
{
	public String toString()
	{
		return "Experience Should be between 1 to 5 years";
	}

}
