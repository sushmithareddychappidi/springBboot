package advancejava;
import java.util.Random;

public class random
{
public static void main(String[] args)
{
	Random r=new Random();
	int s=r.nextInt();
	if(s>0)
	{
		System.out.println(s);
	}	
}
}
