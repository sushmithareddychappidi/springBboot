package org.jsp.library.dao;

import org.jsp.library.entity.Library;
import org.jsp.library.repository.libRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("libdao")
public class libDaoImple implements libDao
{
    @Autowired
    libRepository repo;
	@Override
	public void insert(Library lib) 
	{
		repo.save(lib);
		System.out.println("Registration SuccessFul");
	}

}
