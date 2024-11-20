package com.jsp.Jdbc;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Jdbc.configuration.studentConfig;
import com.jsp.Jdbc.service.serviceImple;
import com.jsp.Jdbc.service.studentService;

public class App 
{
	static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
    	//System.out.println("Enter 1.For Addmission\n2.update\n3.select\n4.show All students");
        ApplicationContext context=new AnnotationConfigApplicationContext(studentConfig.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        studentService service = context.getBean("studentService",serviceImple.class);
        while(true)
        {
        	System.out.println("press 1 to: take Addmission");
        	System.out.println("press 2 to: Update By Id");
        	System.out.println("press 3 to: Select Student By Id");
        	System.out.println("press 4 to: Select All Students");
        	System.out.println("press 5 to: delete student by id");
        	System.out.println("press 6 to: Select Students By stream");
        	System.out.println("press 7 to: Select All Students By stream");
        	
        	int ch=sc.nextInt();
            switch(ch)
            {
            case 1: service.addmission(); break;
            case 2: service.changeName();
            case 3: service.showStudentById();break;
            case 4: service.showAllStudents();break;
            case 5: service.removeStudent();break;
            case 6:service.showStudentBasedOnStream();break;
            case 7:service.showAllStudentsBasedOnStream();break;
            default:System.out.println(">>Invalid Choice<<");
            }
            System.out.println("Do you want to  continue->\npress 'yes' or 'no'");
            String value=sc.next();
            if(value.equalsIgnoreCase("yes"))
            {
            	continue;
            }
            else if(value.equalsIgnoreCase("no"))
            {
            	System.out.println("Thank you visit again");
            	break;
            }
            else
            {
            	System.out.println("Invalid Choice");
            }
             
        }
    }
}
