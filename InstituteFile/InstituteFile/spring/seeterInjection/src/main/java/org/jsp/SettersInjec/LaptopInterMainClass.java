package org.jsp.SettersInjec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopInterMainClass 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("org/jsp/XmlFiles/processorconfig.xml");
		LaptopInterfaceBeanClass laptop = context.getBean("lp1",LaptopInterfaceBeanClass.class);
		System.out.println(laptop);
		
		
	}

}
