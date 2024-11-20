package org.jsp.laptop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class teatLaptop 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(laptopConfig.class);	
		laptop l = context.getBean("laptop",laptop.class);
		System.out.println(l);
	}

}
