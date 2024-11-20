package org.jsp.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class bankMainClass 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("org/jsp/XmlFiles/bankconfig.xml");
		bankBeanClass b = context.getBean("account",bankBeanClass.class);
		System.out.println(b);
		
	}
}
