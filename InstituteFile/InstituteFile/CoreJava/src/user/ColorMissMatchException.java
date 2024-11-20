package user;

public class ColorMissMatchException extends RuntimeException
{
	public String toString()
	{
	   return "color must be white||blue||black";
	}
}
