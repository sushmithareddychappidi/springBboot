package user;

public class CompanyMissMatchException extends RuntimeException
{
	public String toString()
	{
		return "copany must be cello / parker/ Reynolds";
	}

}
