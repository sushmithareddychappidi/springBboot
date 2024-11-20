package Exceptions;

public class Emp1InvalidSalaryException extends RuntimeException
{
	public String toString()
	{
		return "Salary must be between 10000 to 50000";
	}

}
