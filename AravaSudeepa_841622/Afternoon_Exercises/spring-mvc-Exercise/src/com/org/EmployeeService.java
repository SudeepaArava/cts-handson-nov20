package com.org;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public String fetchDateTimeService() {
		return dao.fetchDateTime();
	}
	List<Employee> list=new ArrayList<Employee>();
	
	public List<Employee> getAllEmployeeNamesInDescOrder()
    {
		list=dao.fetchAllEmployees().stream()
				.sorted((e1,e2) -> e2.getName().compareTo(e1.getName()))
				.collect(Collectors.toList());
		return list;
    }
	public List<Employee> getAllEmployeeNamesInAscOrder()
    {
		list=dao.fetchAllEmployees().stream()
				.sorted((e1,e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		return list;
    }
	public List<Employee> getAllEmployeeIdInAscOrder()
    {
		list=dao.fetchAllEmployees().stream()
				.sorted((e1,e2) -> e1.getId()-e2.getId())
				.collect(Collectors.toList());
		return list;
    }
	public List<Employee> getAllEmployeeIdInDescOrder()
    {
		list=dao.fetchAllEmployees().stream()
				.sorted((e1,e2) -> e2.getId()-e1.getId())
				.collect(Collectors.toList());
		return list;
    }
	public List<Employee> getAllEmployeeSalaryInAscOrder()
    {
		list=dao.fetchAllEmployees().stream()
				.sorted((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.collect(Collectors.toList());
		return list;
    }
	public List<Employee> getAllEmployeeSalaryInDescOrder()
    {
		list=dao.fetchAllEmployees().stream()
				.sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
				.collect(Collectors.toList());
		return list;
    }
	public Employee fetchEmployeeById(int id)
	{
		return dao.fetchEmployeeById(id);
	}
	public String addEmployees(int id,String name,Double salary)
	{
		dao.addEmployee(id, name, salary);
		return "Employee details added succesfully";
	}
	public String deleteEmployees(int id) {

		dao.deleteEmployee(id);
		return "Employee details deleted succesfully";
	}
	
	
}
