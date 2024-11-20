package RandomClass;
import java.util.Random;

public class random 
{
	public static void main(String[] args) 
	{
		Random r=new Random();
		int s=r.nextInt();
		System.out.println(s);
		int s1=r.nextInt(10000);
		if(s1<1000)
		{
			s1+=1000;
		}
		System.out.println(s1);
		
		
	}

}
