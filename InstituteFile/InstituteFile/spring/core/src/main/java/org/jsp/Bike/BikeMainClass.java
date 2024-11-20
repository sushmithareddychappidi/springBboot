package org.jsp.Bike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeMainClass 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("org/jsp/XmlFiles/bikecongig.xml");
		bikeBeanClass b = context.getBean("bk",bikeBeanClass.class);
		//System.out.println(b);	
		b.details();
	}

}
