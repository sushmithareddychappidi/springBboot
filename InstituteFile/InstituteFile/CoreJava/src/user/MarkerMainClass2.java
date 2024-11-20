package user;

import java.util.Scanner;

import shop.keeper.Marker;

public class MarkerMainClass2 
{
	public static void show(Marker m)
	{
		m.display();
		m.convert();
	}
	public static void main(String[] args)
	{
		char status=' ';
		do
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter how many pens you want to buy?");
			int numberOfPens=scan.nextInt();
			for(int i=1;i<=numberOfPens;i++)
			{
				System.out.println("Enter pen "+i+" detals");
				System.out.println("enter color");
				String color=scan.next();
				System.out.println("enter height");
				int height=scan.nextInt();
				System.out.println("enter brand");
				String brand=scan.next();
				while(true)
				{
					try
					{
						//show(new Marker(color,height,brand));
						Marker marker=new Marker(color,height,brand);
						show(marker);
						break;
					}
					catch(ColorMissMatchException e)
					{
						System.out.println("Re-enter The Marker Color");
						color=scan.next();					
					}
					catch(InavalidHeightException e)
					{
						System.out.println("Re-enter The Marker Height");
						height=scan.nextInt();						
					}
					catch(CompanyMissMatchException e)
					{
						System.out.println("Re-enter The Marker Brand");
						brand=scan.next();						
					}
				}
			}
			System.out.println("Enter Yes to continue");
			System.out.println("Enter No to continue");
			String input=scan.next();
			status=input.charAt(0);
	   }while(status=='y');
	   {
		   System.out.println("Thank you,visit us again");
	   }
	}
}
