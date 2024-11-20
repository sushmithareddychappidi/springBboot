package Exceptions;

public class Emp1NameMissMatchException extends RuntimeException
{
	public String toString()
	{
		return "Name must be scott/tiger/mark";
	}

}
