package com.jsp.JPAData.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.JPAData.entity.Usertable;
import com.jsp.JPAData.repository.userRepository;

@Repository("userdao")
public class userDaoImpl implements userDao {

	@Autowired
	userRepository repo;
	@Override
	public void add(Usertable u) 
	{
		repo.save(u);
		System.out.println("----------------------------------------------------------");
		System.out.println("User Registered Successfully");
		System.out.println("------------------------------------------------------------");
	}
	@Override
	public List<Usertable> fetchAll() 
	{
		List<Usertable> all=repo.findAll();
		return all;
	}
	@Override
	public Usertable updateLastNameById(String mb, String lname) 
	{
		Optional<Usertable> opt = repo.findById(mb);
		if(opt.isPresent())
		{
			Usertable user = opt.get();
			user.setLastname(lname);
			return repo.save(user);
		}
		return null;
	}
	@Override
	public boolean removeById(String mb) 
	{
		if(repo.findById(mb).isPresent())
		{
			repo.deleteById(mb);
			return true;
		}
		return false;
	}
	@Override
	public Usertable fetchByFirstName(String fname)
	{
		return repo.findByfirstname(fname);		
	}
	@Override
	public List fetchByDOB(String d,String d1) 
	{
		return repo.findBydobBetween(d, d1);
	}
	@Override
	public Usertable fetchByMailandpassword(String mail, String p) 
	{
		return repo.findBymailidandpassword(mail, p);
	}

	

}
