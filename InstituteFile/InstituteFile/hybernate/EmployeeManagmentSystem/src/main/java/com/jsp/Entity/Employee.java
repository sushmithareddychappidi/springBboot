package com.jsp.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table(name="employee")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="e_id", unique=true, nullable=false)
	private int eId;

	@Column(name="e_deptno", nullable=false, length=45)
	private String eDeptno;

	@Column(name="e_name", nullable=false, length=45)
	private String eName;

	@Column(name="e_salary", nullable=false, length=45)
	private String eSalary;

	public Employee() {
	}

	public int getEId() {
		return this.eId;
	}

	public void setEId(int eId) {
		this.eId = eId;
	}

	public String getEDeptno() {
		return this.eDeptno;
	}

	public void setEDeptno(String eDeptno) {
		this.eDeptno = eDeptno;
	}

	public String getEName() {
		return this.eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
	}

	public String getESalary() {
		return this.eSalary;
	}

	public void setESalary(String eSalary) {
		this.eSalary = eSalary;
	}

}