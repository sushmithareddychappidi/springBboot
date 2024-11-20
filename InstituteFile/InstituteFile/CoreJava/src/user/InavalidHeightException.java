package user;

public class InavalidHeightException extends RuntimeException 
{
	public String toString()
	{
		return "Height should be between 7 to 10";
	}

}
