package com.jdbc.bootjdbc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jdbc.bootjdbc.Service.IEmployeeService;

@SpringBootApplication
public class SpringbootDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootDataJpaApplication.class, args);
		IEmployeeService service = context.getBean(IEmployeeService.class);
		System.out.println("Spring Boot Data JPA");
		
		System.out.println("Enter ur choice 1.to add employee");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:service.addemployee();break;
		}
	}

}
