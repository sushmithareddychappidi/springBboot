package com.jsp.runtimepoly;

import java.util.Scanner;

public class mobile 
{
	private simcard sim;
	private battery bat;
	public  void getSim()
	{
		sim=new airtel();
		sim.siminfo();
	}
	public void getBattery()
	{
		bat=new samsung();
		bat.batteryinfo();
	}
}
