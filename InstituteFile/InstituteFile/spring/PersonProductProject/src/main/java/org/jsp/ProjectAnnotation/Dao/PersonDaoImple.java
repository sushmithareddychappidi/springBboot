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

import org.jsp.ProjectAnnotation.Entity.Person;
import org.springframework.stereotype.Component;

//@Component
@Component("dao")
@SuppressWarnings("unchecked")
public class PersonDaoImple implements PersonDao
{
	public List<Person> takeOld() throws Exception
	{
		File f=new File("C:\\Users\\susmitha\\eclipse-workspace\\spring\\PersonProductProject\\person");
		//f.seetReadable(true);
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		List<Person> old=(List<Person>) ois.readObject();
		return old;		
	}
    
	public void addToFile(Person person) throws Exception
	{
		List<Person> prs;
		try
		{
			prs=takeOld();
		}
		catch(EOFException e)
		{
			prs=new ArrayList<Person>();
		}
		prs.add(person);
		storeListToFile(prs);
		System.out.println("______---------------");
		System.out.println("Person Details Taken");
		System.out.println("----------++++---------------------");
	}
	public List<Person> getFromFile() throws Exception
	{
		try
		{
		
		File f=new File("C:\\Users\\susmitha\\eclipse-workspace\\spring\\PersonProductProject\\person");
		//f.setReadable(true);
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		List<Person> ls=(List<Person>) ois.readObject();
		ois.close();
		fis.close();
		return ls;
		}
		catch(EOFException e)
		{
			System.out.println("==========-------------===========");
			System.out.println("No Person Data Have been taken");
			return null;
		}
	}

	@Override
	public Person fetchPerson(String name) throws Exception
	{
		ListIterator<Person> li=getFromFile().listIterator();
		while(li.hasNext())
		{
			Person s=li.next();
			if(s.getName().equalsIgnoreCase(name))
			{
				return s;
			}
		}	
		return null;
	}

	@Override
	public void updateAddress(String name, String address) throws Exception
	{
		ListIterator<Person> li=getFromFile().listIterator();
		while(li.hasNext())
		{
			Person s=li.next();
			if(s.getName().equalsIgnoreCase(name))
			{
				s.setAddress(address);
				li.set(s);
				System.out.println("---*** Address Updated ✌️✌️");
			}
		}
		
	}

	@Override
	public boolean removePerson(String name) throws Exception
	{
		List<Person> list=getFromFile();
		ListIterator<Person> li=list.listIterator();
		boolean isPresent=false;
		while(li.hasNext())
		{
			Person s=li.next();
			if(s.getName().equalsIgnoreCase(name))
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
	public void storeListToFile(List<Person> ls) throws Exception 
	{
		File f=new File("C:\\Users\\susmitha\\eclipse-workspace\\spring\\PersonProductProject\\person");
		//f.setWritable(true);
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ls);
		oos.flush();
		oos.close();
		fos.close();	
	}
	

	

}
