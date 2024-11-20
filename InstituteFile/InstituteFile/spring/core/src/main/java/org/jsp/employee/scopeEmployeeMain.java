package org.jsp.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scopeEmployeeMain
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("employeeconfig.xml");
		System.out.println("object Created");
		employee e=context.getBean("emp",employee.class);
		System.out.println(e);
		employee e1=context.getBean("emp",employee.class);
		System.out.println(e1);
		employee e2=context.getBean("emp",employee.class);
		System.out.println(e2);
	}

}
