package com.jsp.Jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jsp.Jdbc.entity.Student;
@Repository("studentDao")
public class DaoImple implements studentDao
{
	@Autowired
	private JdbcTemplate template;
	//user defined Imple
	//@Autowired
	//private RowMapper<Student> rm;
	private RowMapper<Student> rm=new BeanPropertyRowMapper<Student>(Student.class);

	@Override
	public void insertStudent(Student s) 
	{
		String query="insert into student(std_id, std_name, std_mail, std_mobile, std_dob, std_stream, std_per) values (?,?,?,?,?,?,?)";
	    template.update(query,s.getStd_id(),s.getStd_name(),s.getStd_mail(),s.getStd_mobile(),s.getStd_dob(),s.getStd_stream(),s.getStd_per());
	    System.out.println("%% Student Took Addmission %%");
	}
	@Override
	public void updateNameById(int id,String name) 
	{
		String query="update student set std_name=? where std_id=?";
		int update = template.update(query,name,id);
		if(update>0)
		{
			System.out.println("Name Updated");
		}
		else
		{
			System.out.println("Student Not Found");
		}
	}
	@Override
	public void fetchStudentToDisplay(int id) 
	{
		String query="select * from student where std_id=?";
		try
		{
			Student student = template.queryForObject(query,rm,id );
			System.out.println(student);
			System.out.println("___________________-");
		}
		catch(Exception e)
		{
			System.out.println("Student not found");
		}
	}
	@Override
	public void fetchAllStudents() 
	{
		String query="select * from student";
		List<Student> list = template.query(query, rm);
		list.forEach(System.out::println);
		System.out.println("__________________-");
	}
	@Override
	public void deleteStudentById(int id) 
	{
		String query="delete from student where std_id=?";
		int delete = template.update(query,id);
		if(delete>0)
		{
			System.out.println("Student Removed Successfully");
		}
		else
		{
			System.out.println("Student not found");
		}
	}
	@Override
	public void selectStudentBasedOnStream(String stream) 
	{
		String query="select * from student where std_stream=?";
		List<Student> list = template.query(query,rm,stream);
		list.forEach(System.out::println);
	    System.out.println("-------------------------");
	}
	@Override
	public void fetchAllStudentBasedOnStream(String stream) 
	{
		String query="select * from student where std_stream=?";
		List<Student> list = template.query(query,rm,stream);
		System.out.println(list.getClass().getName());
		if(!list.isEmpty())
		{
			list.forEach(System.out::println);
		}
		else
		{
			System.out.println("Student with the Stream Not found");
			System.out.println("**********************");
		}
	}

}
