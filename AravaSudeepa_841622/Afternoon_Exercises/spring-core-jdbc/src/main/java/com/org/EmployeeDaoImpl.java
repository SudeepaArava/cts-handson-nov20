package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void store(Employee emp) {

		String query = "insert into employee values(?,?,?)"; 
		jdbc.update(query,emp.getId(),emp.getName(),emp.getSalary());
	}
	
	
}
