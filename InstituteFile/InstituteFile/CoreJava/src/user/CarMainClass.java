package user;
import shop.keeper.Car;
import java.util.Scanner;

public class CarMainClass 
{
	public static void displayInfo(Car c)
	{
		c.carInfo();
	}
	public static void main(String[] args) 
	{
		char status=' ';
		do
		{
			Scanner sc=new Scanner(System.in);
		    System.out.println("Enter how many cars you want");
		    int num=sc.nextInt();
		    for(int i=1;i<=num;i++)
				{
				System.out.println("Enter Car "+i+" details");
			    System.out.println("Enter Series name");
			    String seriesName=sc.next();
			    System.out.println("Enter Speed");
			    int speed=sc.nextInt();
			    System.out.println("Enter Time");
			    int time=sc.nextInt();
			   while(true)
			   {
				   try
				   {
					   Car c1=new Car(seriesName,speed,time);
					   displayInfo(c1);
					   break;
				   }
				   catch(CarInfoMissMatchException e)
				   {
					   System.out.println("Re-enter Series Name");	
					   seriesName=sc.next();
					   System.out.println("Re-enter Car Speed");	
					   speed=sc.nextInt();
					   System.out.println("Re-enter Time Taken");	
					   time=sc.nextInt();
					   
				   }
			   }
				}
				System.out.println("Enter Yes to continue");
			    System.out.println("Enter No to continue");
			    String input=sc.next();
			    status=input.charAt(0);
		}
		while (status=='y');
		System.out.println("exit");
		/*CarMainClass5 cm1=new CarMainClass5();
		cm1.displayInfo(new Car("20",120,5));
		cm1.displayInfo(new Car("G7",70,7));*/	
	}

}
