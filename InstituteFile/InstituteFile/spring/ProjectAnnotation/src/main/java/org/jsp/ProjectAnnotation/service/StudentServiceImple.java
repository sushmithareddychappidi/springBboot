package org.jsp.ProjectAnnotation.service;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import org.jsp.ProjectAnnotation.Dao.StudentDao;

import org.jsp.ProjectAnnotation.Dao.StudentDaoImple;
import org.jsp.ProjectAnnotation.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
@Component("service")
public class StudentServiceImple implements StudentService
{
	Scanner sc=new Scanner(System.in);
	@Autowired
	StudentDao dao;
	@Override
	public void admission() throws Exception
	{
		System.out.println("Enter the Student Id :");
		String id=sc.next();
		System.out.println("Enter the Student Name :");
		String name=sc.next();
		System.out.println("Enter the Student Mail :");
		String mail=sc.next();
		System.out.println("Enter the Student Phone number :");
		String ph=sc.next();
		System.out.println("Enter the Student Marks :");
		int marks=sc.nextInt();
		System.out.println("Enter the Student Branch :");
		String branch=sc.next();
		
		Student student=new Student();
		student.setStd_id(id);
		student.setStd_name(name);
		student.setStd_mail(mail);
		student.setStd_phno(ph);
		student.setStd_marks(marks);
		student.setStd_branch(branch);
		dao.addToFile(student);
	}

	@Override
	public void dispalyadmission() throws Exception
	{
		List<Student> ls = dao.getFromFile();
		if(ls!=null)
		{
			System.out.println("*** All Admissions");
			System.out.println("--------------------------------");
			System.out.println("| StudentId  | StudentName |  StudentMail | StudentPhoneNo | StudentMarks | StudentBranch |");
			System.out.println("__________________________________");
			ListIterator<Student> it=ls.listIterator();
			while(it.hasNext())
			{
				Student s=it.next();
				System.out.println(s.getStd_id()+"|" +s.getStd_name()+"|"+ s.getStd_mail()+"|"+s.getStd_phno()+"|"+s.getStd_marks()+"|"+s.getStd_branch());
			}
			System.out.println("___________________________________");
		}
	}

	@Override
	public void updateNameById() throws Exception
	{
		Student std=getStudent();
		if(std!=null)
		{
			System.out.println("Enter The Student Name");
			String name=sc.next();
			dao.updateName(std.getStd_id(),name);
		}
		else
		{
			System.out.println("*\n😩😩 Student Not Found 😩😩\n");
		}
	}

	@Override
	public Student getStudent() throws Exception
	{
		System.out.println("Enter the student Id");
		String id=sc.next();
		Student std=dao.fetchStudent(id);
		return std;
	}

	@Override
	public void deleteById() throws Exception
	{
		System.out.println("Enter the student Id");
		String id=sc.next();
		if(dao.removeStudent(id))
		{
			System.out.println("_________________________");
			System.out.println("Student Removed From College");
		}
		else
		{
			System.out.println("-===========------------==");
			System.out.println("Student Not Found");
		}
	}

}
