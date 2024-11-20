package com.jdbc.bootjdbc.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee 
{
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	@Column(nullable=false)
	private String ename;
	@Column(nullable=false,unique=true)
	private String mail;
	@Column(nullable=false)
	private Double esal;
	@Column(nullable=false)
	private Integer deptno;
	@Column(nullable=false)
	private String desig;

}
