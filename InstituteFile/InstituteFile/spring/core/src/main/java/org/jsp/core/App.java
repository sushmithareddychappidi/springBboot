package org.jsp.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "main Started" );
        //from developer
        //student s=new student();
        //s.info();
        
        //from ioc container 
        ApplicationContext context=new ClassPathXmlApplicationContext("studentconfig.xml");
        System.out.println("Object is created");
        student s = (student) context.getBean("std");
        s.info();
        student s1 = (student) context.getBean("std1");
        s1.info();
    }
}
