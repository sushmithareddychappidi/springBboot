package com;

public class InvalidNoOfCompartments extends RuntimeException{
	public String toString()
	{
		return "Compartments Should Be In Between 1 to 5";
	}              
}
