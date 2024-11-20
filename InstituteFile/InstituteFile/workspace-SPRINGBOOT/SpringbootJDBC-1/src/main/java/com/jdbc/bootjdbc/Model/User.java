package com.jdbc.bootjdbc.Model;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User
{
	private String firstname;
	private String lastname;
	private String mailid;
	private String mobile;
	private Date dob;
	private String username;
	private String password;
	

}
