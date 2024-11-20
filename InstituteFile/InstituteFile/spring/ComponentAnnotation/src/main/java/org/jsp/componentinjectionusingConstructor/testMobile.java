package org.jsp.componentinjectionusingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMobile 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("MobileConfig.xml");		
		Mobile mb = context.getBean("mobile",Mobile.class);
		System.out.println(mb);
	}

}
