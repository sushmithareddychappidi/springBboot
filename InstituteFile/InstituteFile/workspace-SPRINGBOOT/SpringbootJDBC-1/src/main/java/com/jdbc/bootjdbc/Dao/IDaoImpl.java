package com.jdbc.bootjdbc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.bootjdbc.Model.User;

@Repository
public class IDaoImpl implements Idao {
    @Autowired
	private JdbcTemplate template;
	@Override
	public int insertuser(User u)
	{
		String query="insert into usertable(firstname,lastname,mailid,mobile,dob,username,password) values(?,?,?,?,?,?,?)";	
		return template.update(query,u.getFirstname(),u.getLastname(),u.getMailid(),u.getMobile(),u.getDob(),u.getUsername(),u.getPassword());
	}

}
