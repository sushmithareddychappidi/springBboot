package org.jsp.SettersInjec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopMainClass
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("org/jsp/XmlFiles/setter.xml");
		LaptopSetterInjection l = context.getBean("lp",LaptopSetterInjection.class);
		System.out.println(l);
		
		
	}

}
