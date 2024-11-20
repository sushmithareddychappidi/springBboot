package com;

public class HashBikeDriverClass 
{
	public static void main(String[] args) 
	{
		HashCodeBikeEx b1=new HashCodeBikeEx("BMW",400000,50,"black",1122);
		HashCodeBikeEx b2=new HashCodeBikeEx("Bmw",50000,70,"blue",3344);
        System.out.println(b1);	
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
	}
}
