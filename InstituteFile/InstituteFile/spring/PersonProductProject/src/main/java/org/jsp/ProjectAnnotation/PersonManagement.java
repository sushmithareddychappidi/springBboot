package org.jsp.ProjectAnnotation;

import java.util.Scanner;
import org.jsp.ProjectAnnotation.service.PersonService;
import org.jsp.ProjectAnnotation.service.PersonServiceImple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonManagement 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("productConfig.xml");
//		StudentService  service = context.getBean("studentServiceImple",StudentServiceImple.class);
		PersonService  service = context.getBean("person",PersonServiceImple.class);
    	System.out.println("\n👉👉👉👉👉🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸👈👈👈👈👈\n");
        System.out.println( "------------------------------------------------------" );
        System.out.print("        ");
        String welcome = "💐💐WELCOME TO Person💐💐\n";
        for(int i=0; i<welcome.length(); i++)
        {
        	System.out.print(welcome.charAt(i));
        	Thread.sleep(20);
        }
        System.out.println( "------------------------------------------------------\n" );
		while(true)
		{
			System.out.println("👉👉👉 Press 1 to : Take Person->>>");
	        System.out.println("👉👉👉 Press 2 to : Display Person->>>");
	        System.out.println("👉👉👉 Press 3 to : Update Address By name->>>");
	        System.out.println("👉👉👉 Press 4 to : Delete Person By Name->>>");  
	        System.out.println("👉👉👉 Press 5 to : Take Product->>>");
	        int choice = sc.nextInt();
	        switch(choice)
	        {
	            case 1 : service.admission();break;
	            case 2 : service.dispalyadmission();break;
	            case 3 :service.updateAddressByName();break;
	            case 4: service.deleteByName();break;
	            case 5 :s
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
