package Exceptions;

public class Emp1InvalidIdException extends RuntimeException
{
	public String toString()
	{
		return "Id must be between 5 to 15";
	}

}
