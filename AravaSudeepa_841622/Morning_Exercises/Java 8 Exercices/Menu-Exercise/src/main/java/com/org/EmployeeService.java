package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {

	List<Employee> employeelist=new ArrayList<Employee>();
	public void addEmployee(Employee emp)
	{
	    employeelist.add(emp);
	}
	public Employee findEmployee(int id)
	{
		for(Employee emp:employeelist)
		{
			if(emp.getId()== id)
				return emp;
		}
		return null;
	}
	public List<Employee> getEmployees()
	{
		return employeelist;
	}
	public List<Employee> getSortedEmployeesById()
	{
		Collections.sort(employeelist, (e1,e2) -> e1.getId() -e2.getId());
		return employeelist; 

	}
	public List<Employee> getSortedEmployeesByName()
	{
		Collections.sort(employeelist, (e1,e2) -> e1.getName().compareTo(e2.getName()));
		return employeelist; 
	}
	public List<Employee> getSortedEmployeesBySalary()
	{
		
		Collections.sort(employeelist, (e1,e2) -> Double .compare(e1.getSalary(), e2.getSalary()));
		return employeelist; 
	}
	public List<Employee> getEmployeesByDob() {
		
		Collections.sort(employeelist, (e1,e2) -> e1.getDob().compareTo(e2.getDob()));
		return employeelist;
	}


}
