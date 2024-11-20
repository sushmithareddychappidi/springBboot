package user;

public class CarInfoMissMatchException extends RuntimeException
{
	public String toString()
	{
		return "either series name/speed/time are Invalid";
	}

}
