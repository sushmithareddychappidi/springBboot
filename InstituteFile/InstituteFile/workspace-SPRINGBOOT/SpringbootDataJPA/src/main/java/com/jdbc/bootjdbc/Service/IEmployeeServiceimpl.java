package com.jdbc.bootjdbc.Service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.bootjdbc.Model.Employee;
import com.jdbc.bootjdbc.Repository.EmployeeRepository;

@Service
public class IEmployeeServiceimpl implements IEmployeeService
{
    private Scanner sc=new Scanner(System.in);
    @Autowired
    private EmployeeRepository erepo;
	@Override
	public void addemployee()
	{
		Employee e=new Employee();
		System.out.println("Enter Employee Name");	
		e.setEname(sc.next());
		System.out.println("Enter Employee Mail");
		e.setMail(sc.next());
		System.out.println("Enter Employee Salary");
		e.setEsal(sc.nextDouble());
		System.out.println("Enter Employee Deptno");
		e.setDeptno(sc.nextInt());
		System.out.println("Enter Employee Designation");
		e.setDesig(sc.next());
		if(erepo.save(e)!=null)
		{
			System.out.println("Employee added");
		}
		else
		{
			System.out.println("Invalid Data");
		}
		
	}

}
