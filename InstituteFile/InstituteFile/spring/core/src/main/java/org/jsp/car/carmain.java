package org.jsp.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class carmain 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("org/jsp/XmlFiles/CarConfig.xml");
		carbeanclass car1 = context.getBean("car",carbeanclass.class);
		System.out.println(car1);
		carbeanclass car2 = context.getBean("car",carbeanclass.class);
		System.out.println(car2);
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
	    
		
	}

}//write a program to print the msg to the user
//create a messagegcreator class to wish the user based on time(by using local date class)
//print the msg in user class along with user name
