package org.jsp.ProjectAnnotation.Dao;

import java.io.EOFException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.jsp.ProjectAnnotation.Entity.Student;
import org.springframework.stereotype.Component;

//@Component
@Component("dao")
@SuppressWarnings("unchecked")
public class StudentDaoImple implements StudentDao
{
	public List<Student> takeOld() throws Exception
	{
		File f=new File("C:/Users/susmitha/eclipse-workspace/spring/ProjectAnnotation/objectfile.txt");
		//f.seetReadable(true);
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		List<Student> old=(List<Student>) ois.readObject();
		return old;		
	}
    
	public void addToFile(Student std) throws Exception
	{
		List<Student> prs;
		try
		{
			prs=takeOld();
		}
		catch(EOFException e)
		{
			prs=new ArrayList<Student>();
		}
		prs.add(std);
		storeListToFile(prs);
		System.out.println("______---------------");
		System.out.println("Student Took Admission");
		System.out.println("----------++++---------------------");
	}
	public List<Student> getFromFile() throws Exception
	{
		try
		{
		
		File f=new File("C:/Users/susmitha/eclipse-workspace/spring/ProjectAnnotation/objectfile.txt");
		//f.setReadable(true);
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		List<Student> ls=(List<Student>) ois.readObject();
		ois.close();
		fis.close();
		return ls;
		}
		catch(EOFException e)
		{
			System.out.println("==========-------------===========");
			System.out.println("No Admissions Have been taken");
			return null;
		}
	}

	@Override
	public Student fetchStudent(String id) throws Exception
	{
		ListIterator<Student> li=getFromFile().listIterator();
		while(li.hasNext())
		{
			Student s=li.next();
			if(s.getStd_id().equals(id))
			{
				return s;
			}
		}	
		return null;
	}

	@Override
	public void updateName(String std_id, String name) throws Exception
	{
		ListIterator<Student> li=getFromFile().listIterator();
		while(li.hasNext())
		{
			Student s=li.next();
			if(s.getStd_id().equals(std_id))
			{
				s.setStd_name(name);
				li.set(s);
				System.out.println("---*** Name Updated ✌️✌️");
			}
		}
		
	}

	@Override
	public boolean removeStudent(String id) throws Exception
	{
		List<Student> list=getFromFile();
		ListIterator<Student> li=list.listIterator();
		boolean isPresent=false;
		while(li.hasNext())
		{
			Student s=li.next();
			if(s.getStd_id().equalsIgnoreCase(id))
			{
				li.remove();
				isPresent=true;
			}
		}
		if(isPresent)
		{
			storeListToFile(list);
		}
		return isPresent;
	}

	@Override
	public void storeListToFile(List<Student> ls) throws Exception 
	{
		File f=new File("C:/Users/susmitha/eclipse-workspace/spring/ProjectAnnotation/objectfile.txt");
		//f.setWritable(true);
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ls);
		oos.flush();
		oos.close();
		fos.close();	
	}
	

	

}
