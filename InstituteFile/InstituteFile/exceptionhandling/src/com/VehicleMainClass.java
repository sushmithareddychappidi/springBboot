package com;

public class VehicleMainClass 
{
	public void start(Vehicle v)
	{
		v.move();		
	}
	public static void main(String[] args)
	{
		VehicleMainClass m=new VehicleMainClass();
		m.start(new Bike());
		m.start(new Bus());
		m.start(null);
	}
}
