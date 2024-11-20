package org.jsp.library.service;

import java.util.Scanner;

import org.jsp.library.dao.libDao;
import org.jsp.library.entity.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("libservice")
public class libServiceImple implements libService{

	static Scanner sc=new Scanner(System.in);
	@Autowired
	private libDao dao;
	@Override
	public void registration() 
	{
		Library lib=new Library();
		System.out.println("Enter Book id");
		lib.setBookid(sc.next());
		System.out.println("Enter Book Name");
		lib.setBookname(sc.next());
		System.out.println("Enter Book Author");
		lib.setBookauthor(sc.next());
		System.out.println("Enter Book Published Date");
		lib.setPublisheddate(sc.next());
		System.out.println("Enter No Of Books");
		lib.setNoofbooks(sc.nextInt());
		System.out.println("Enter Library Name");
		lib.setLibraryname(sc.next());
		dao.insert(lib);
	}

}
