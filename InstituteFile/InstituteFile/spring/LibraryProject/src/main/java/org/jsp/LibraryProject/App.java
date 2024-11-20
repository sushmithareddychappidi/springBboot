package org.jsp.LibraryProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("libraryconfig.xml");
		  LibraryBeanClass l = context.getBean("lib",LibraryBeanClass.class);
		System.out.println(l);
    }
}
