package org.jsp.employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class employeeMain 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("employeeconfig.xml");
		System.out.println("Object Created");
		
		//by using class
//		employee emp =  context.getBean(employee.class);
//		emp.details();
//		System.out.println("----------------------");
//		employee emp1 =  context.getBean(employee.class);
//		emp1.details();
		
		
		//by using both id and class
		employee emp = context.getBean("emp",employee.class);
		emp.details();
		System.out.println("-------------");
		employee emp1 = context.getBean("emp1",employee.class);
		emp1.details();
		System.out.println(emp);
		System.out.println(emp1);
		
    }

}
