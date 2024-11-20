package org.jsp.Date;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testMain 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("org/jsp/XmlFiles/msgconfig.xml");
		messageCreator message = context.getBean("mg",messageCreator.class);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.next();
		message.create(name);
		
		
	}

}
