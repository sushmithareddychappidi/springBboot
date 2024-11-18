package com.emp.EmployeeManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.emp.EmployeeManagement.Repository.EmployeeRepositoryInterface;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EmployeeManagementApplication.class, args);
		EmployeeRepositoryInterface employeeRepositoryInterface = context.getBean(EmployeeRepositoryInterface.class);
		System.out.println("table created");
		
	}

}
