package com.jdbc.bootjdbc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbc.bootjdbc.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
