package org.jsp.ProjectAnnotation;

import java.util.Scanner;
import org.jsp.ProjectAnnotation.service.StudentService;
import org.jsp.ProjectAnnotation.service.StudentServiceImple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentManagement 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("studentConfig.xml");
//		StudentService  service = context.getBean("studentServiceImple",StudentServiceImple.class);
		StudentService  service = context.getBean("service",StudentServiceImple.class);
    	System.out.println("\n👉👉👉👉👉🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸👈👈👈👈👈\n");
        System.out.println( "------------------------------------------------------" );
        System.out.print("        ");
        String welcome = "💐💐WELCOME TO STUDENT MANAGEMENT💐💐\n";
        for(int i=0; i<welcome.length(); i++)
        {
        	System.out.print(welcome.charAt(i));
        	Thread.sleep(20);
        }
        System.out.println( "------------------------------------------------------\n" );
		while(true)
		{
			System.out.println("👉👉👉 Press 1 to : Take Admission->>>");
	        System.out.println("👉👉👉 Press 2 to : Display Admissions->>>");
	        System.out.println("👉👉👉 Press 3 to : Update Student By Id->>>");
	        System.out.println("👉👉👉 Press 4 to : Delete Student By Id->>>");
//	        System.out.println("👉👉👉 Press 5 to Display Student Details->>>>");
//	        System.out.println("👉👉👉 Press 6 to : Alter studentmail by id->>>");
//	        System.out.println("👉👉👉 Press 7 to : Alter student branch by mail and id->>>");
//	        
	        int choice = sc.nextInt();
	        switch(choice)
	        {
	            case 1 : service.admission();break;
	            case 2 : service.dispalyadmission();break;
	            case 3 :service.updateNameById();break;
	            case 4: service.deleteById();break;
	        }
	        System.out.println("--> DO YOU WANT TO CONTINUE <--");
	        System.out.println("@@@ Say 'yes' (OR) 'no' @@@");
	        String choice1 = sc.next();
	        if(choice1.equalsIgnoreCase("yes")) continue;
	        else if(choice1.equalsIgnoreCase("no")) 
	        {
	        	System.out.println("🙏🙏🙏 THANK YOU VISIT AGAIN 🙏🙏🙏");
	        	break;
	        }
	        else
	        {
	        	System.out.println("GET LOST👍");
	        	break;
	        }
		}
		
	}

}
