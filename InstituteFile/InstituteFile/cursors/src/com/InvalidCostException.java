package com;

public class InvalidCostException extends RuntimeException{
	public String toString()
	{
		return "Cost Should Be In Between 400 to 1500";
	}
}
