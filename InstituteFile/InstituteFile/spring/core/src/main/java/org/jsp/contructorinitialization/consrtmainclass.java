package org.jsp.contructorinitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class consrtmainclass 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("construntorinjeconfig.xml");
		constructorInjection std1 = context.getBean("std",constructorInjection.class);
		System.out.println(std1);
		constructorInjection std2 = context.getBean("std1",constructorInjection.class);
		System.out.println(std2);
	}
}

//create a bean tag for car attributes name ,color,prize,milaze
//create an xml file to create  3 different values with 3 different objects for car classby performing constructor injection
//create main class and access all the objects from ioc container