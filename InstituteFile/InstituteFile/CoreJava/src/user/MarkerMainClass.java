package user;
import shop.keeper.Marker;

import java.util.ArrayList;
import java.util.Scanner;

public class MarkerMainClass 
{
	public static void show(Marker m)
	{
		m.display();
		m.convert();
	}
	public static void main(String[] args)
	{
		Marker m1=new Marker("black",9,"reynolds");
		Marker m2=new Marker("white",9,"parker");
		Marker m3=new Marker("blue",10,"cello");
		ArrayList<Marker> al=new ArrayList<Marker>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		for(Marker mar:al)
		   {
			   if(mar.getColor().equalsIgnoreCase("green"))
			   {
				   System.out.println("Height :" +mar.getHeight());
			   }
		   }
		   for(Marker mar:al)
		   {
			   if(mar.getCompany().equalsIgnoreCase("natraj"))
			   {
				   mar.setHeight(12);
				   mar.display();
			   }
		   }
		   for(Marker mar:al)
		   {
			   if(mar.getHeight()>9)
			   {
				   mar.display();
			   }
		   }
	}

}
