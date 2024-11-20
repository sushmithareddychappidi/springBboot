package com.jsp.Jdbc.service;

import java.sql.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Jdbc.dao.studentDao;
import com.jsp.Jdbc.entity.Student;

@Service("studentService")
public class serviceImple implements studentService
{

	Scanner sc=new Scanner(System.in);
	@Autowired
	private studentDao dao;
	@Override
	public void addmission() 
	{
		Student std=new Student();
		System.out.println("Enter the student id");
		std.setStd_id(sc.nextInt());
		System.out.println("Enter the student Name");
		std.setStd_name(sc.next());
		System.out.println("Enter the student Mail");
		std.setStd_mail(sc.next());
		System.out.println("Enter the student Mobile");
		std.setStd_mobile(sc.next());
		System.out.println("Enter the student Dob(yyyy-mm-dd");
		std.setStd_dob(Date.valueOf(sc.next()));
		System.out.println("Enter the student Stream");
		std.setStd_stream(sc.next());
		System.out.println("Enter the student Percentage");
		std.setStd_per(sc.nextDouble());
		dao.insertStudent(std);
	}
	@Override
	public void changeName() 
	{
		System.out.println("Enter the Student id");
		int id=sc.nextInt();
		System.out.println("Entyer the Student name");
		String name=sc.next();
		dao.updateNameById(id, name);
	}
	@Override
	public void showStudentById() 
	{
		System.out.println("Enter the student id");
		int id=sc.nextInt();
		dao.fetchStudentToDisplay(id);
	}
	@Override
	public void showAllStudents() 
	{
		dao.fetchAllStudents();
	}
	@Override
	public void removeStudent() 
	{
		System.out.println("Enter The student id");
		int id=sc.nextInt();
		dao.deleteStudentById(id);
	}
	@Override
	public void showStudentBasedOnStream() 
	{
		System.out.println("Enter the stream");
		String stream=sc.next();
		dao.selectStudentBasedOnStream(stream);
	}
	@Override
	public void showAllStudentsBasedOnStream()
	{
		System.out.println("Enter the stream");
		String stream=sc.next();
		dao.fetchAllStudentBasedOnStream(stream);
	}

}
