package RandomClass;

import java.util.Random;
import java.util.Scanner;

public class OtpGeneration 
{
	public static void main(String[] args) {
		Random r=new Random();
		int num=r.nextInt(1000000);
		if(num<100000)
		{
			num+=100000;
		}
		System.out.println(num);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter otp");
		int user=sc.nextInt();
		if(user==num)
		{
			System.out.println("verified");
		}
		else
		{
			System.out.println("wrong otp");
		}
		
	}

}
