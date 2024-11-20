package com.jdbc.bootjdbc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jdbc.bootjdbc.Service.IserviceImpl;

@SpringBootApplication
public class SpringbootJdbc1Application {
    
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootJdbc1Application.class, args);
	    System.out.println("spring boot application");
	    IserviceImpl service = context.getBean(IserviceImpl.class);
	    System.out.println("Enter 1.to add user");
	    int choice=sc.nextInt();
	    switch(choice)
	    {
	    case 1:service.adduser();
	    break;
	    default:System.out.println("Invalid Input");
	    }
	    
	}

}
