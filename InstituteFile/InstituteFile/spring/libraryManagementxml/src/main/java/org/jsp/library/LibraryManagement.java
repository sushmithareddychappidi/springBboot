package org.jsp.library;

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.Context;

import org.jsp.library.config.libConfiguration;
import org.jsp.library.service.libService;
import org.jsp.library.service.libServiceImple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagement {

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new AnnotationConfigApplicationContext(libConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		libService  service = context.getBean("libservice",libServiceImple.class);
    	System.out.println("\n👉👉👉👉👉🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸👈👈👈👈👈\n");
        System.out.println( "------------------------------------------------------" );
        System.out.print("        ");
        String welcome = "💐💐WELCOME TO Library MANAGEMENT💐💐\n";
        for(int i=0; i<welcome.length(); i++)
        {
        	System.out.print(welcome.charAt(i));
        	Thread.sleep(20);
        }
        System.out.println( "------------------------------------------------------\n" );
		while(true)
		{
			System.out.println("👉👉👉 Press 1 to : Registration->>>");
//	        System.out.println("👉👉👉 Press 2 to : Display All users->>>");
//	        System.out.println("👉👉👉 Press 3 to : update  Last Name By Id->>>");
//	        System.out.println("👉👉👉 Press 4 to : Delete User By Id users->>>");
//	        System.out.println("👉👉👉 Press 5 to : Display User By First Name->>>");
//	        System.out.println("👉👉👉 Press 6 to : Display Users between given Date Of Births->>>");
//	        System.out.println("👉👉👉 Press 7 to : Delete User By Mail and Password->>>");
	        	        
	        int choice = sc.nextInt();
	        switch(choice)
	        {
	            case 1 : service.registration();break;
	
	            default:System.out.println("Invalid Choice");
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
